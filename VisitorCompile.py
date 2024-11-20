from antlr4 import *
from mrlangParser import mrlangParser
from mrlangVisitor import mrlangVisitor


class VisitorCompile(mrlangVisitor):
    def __init__(self):
        self.code = []
        self.variables = {}
        self.current_address = 0
        self.label_counter = 0
        self.free_regs = [1,1,1,1,1,1,1]

    def free_reg(self, idx):
        self.free_regs[idx] = 1

    def get_free_reg(self):
        for i in range(len(self.free_regs)):
            if self.free_regs[i]:
                self.free_regs[i] = 0
                return i
        self.free_regs = [1,1,1,1,1,1,1]
        return 0

    def new_label(self, prefix="L"):
        self.label_counter += 1
        return f"{prefix}{self.label_counter}"

    def emit(self, instruction):
        self.code.append(instruction)

    def visitProgram(self, ctx: mrlangParser.ProgramContext):
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
        return "".join(self.code)

    def visitVarDecl(self, ctx: mrlangParser.VarDeclContext):
        if isinstance(ctx.getChild(0), mrlangParser.RawVarDeclContext):
            self.visitRawVarDecl(ctx.getChild(0))
        elif isinstance(ctx.getChild(0), mrlangParser.FilledVarDeclContext):
            self.visitFilledVarDecl(ctx.getChild(0))

    def visitRawVarDecl(self, ctx: mrlangParser.RawVarDeclContext):
        typename = ctx.getChild(0).getText()
        name = ctx.getChild(1).getText()
        self.variables[name] = self.current_address
        self.emit(f"# Объявление переменной {name} типа {typename}\n")
        self.current_address += 4

    def visitFilledVarDecl(self, ctx: mrlangParser.FilledVarDeclContext):
        typename = ctx.getChild(0).getText()
        name = ctx.getChild(1).getText()
        self.variables[name] = self.current_address
        value = self.visit(ctx.getChild(3))
        self.emit(f"# Объявление и инициализация переменной {name} типа {typename}\n")
        self.emit(f"sw {value}, {self.current_address}(zero)\n")
        self.current_address += 4
        self.free_reg(int(value[1]))

    def visitAssignment(self, ctx: mrlangParser.AssignmentContext):
        self.visitRawAssigment(ctx.getChild(0))

    def visitRawAssigment(self, ctx: mrlangParser.RawAssigmentContext):
        name = ctx.getChild(0).getText()
        if name not in self.variables:
            raise ValueError(f"Переменная {name} не объявлена\n")
        address = self.variables[name]
        value = self.visit(ctx.getChild(2))
        self.emit(f"# Присваивание переменной {name}\n")
        self.emit(f"sw {value}, {address}(zero)\n")
        self.free_reg(int(value[1]))

    def visitExpr(self, ctx: mrlangParser.ExprContext):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.getChild(0))
        elif ctx.getChildCount() == 3:
            left = self.visit(ctx.getChild(0))
            right = self.visit(ctx.getChild(2))
            operator = ctx.getChild(1).getText()
            temp_reg = f"t{self.get_free_reg()}"
            if operator == "+":
                self.emit(f"add {temp_reg}, {left}, {right}\n")
            elif operator == "-":
                self.emit(f"sub {temp_reg}, {left}, {right}\n")
            elif operator == "*":
                self.emit(f"mul {temp_reg}, {left}, {right}\n")
            elif operator == "/":
                self.emit(f"div {temp_reg}, {left}, {right}\n")
            elif operator == ">":
                self.emit(f"sgt {temp_reg}, {left}, {right}\n")
            elif operator == "<":
                self.emit(f"slt {temp_reg}, {left}, {right}\n")
            elif operator == "==":
                self.emit(f"xor {temp_reg}, {left}, {right}\n")
                self.emit(f"seqz {temp_reg}, {temp_reg}\n")
            self.free_reg(int(left[1]))
            self.free_reg(int(right[1]))
            return temp_reg
        return self.visit(ctx.getChild(1)) if (ctx.getChildCount() == 2) else self.visit(ctx.getChild(0))

    def visitNumParsed(self, ctx: mrlangParser.NumParsedContext):
        value = ctx.getText()
        temp_reg = f"t{self.get_free_reg()}"
        self.emit(f"li {temp_reg}, {value}\n")
        return temp_reg
    
    def visitBoolParsed(self, ctx: mrlangParser.NumParsedContext):
        value = 1 if ctx.getText() == "dobro" else 0
        temp_reg = f"t{self.get_free_reg()}" 
        self.emit(f"li {temp_reg}, {value}\n")
        return temp_reg

    def visitIdName(self, ctx: mrlangParser.IdNameContext):
        name = ctx.getText()
        if name not in self.variables:
            raise ValueError(f"Переменная {name} не объявлена\n")
        address = self.variables[name]
        temp_reg = f"t{self.get_free_reg()}"
        self.emit(f"lw {temp_reg}, {address}(zero)\n")
        return temp_reg

    def visitPrint(self, ctx: mrlangParser.PrintContext):
        value = self.visit(ctx.getChild(2))
        self.emit(f"# Вывод значения {value}\n")
        self.emit(f"mv a0, {value}\n")  # Передаём значение в регистр a0
        self.emit("li a7, 1\n")  # Код системного вызова для печати
        self.emit("ecall\n")  # Вызов системного вызова


    def visitWhilestmt(self, ctx: mrlangParser.WhilestmtContext):
        loop_label = self.new_label("WHILE_LOOP")
        end_label = self.new_label("WHILE_END")

        self.emit(f"{loop_label}: # Начало while\n")
        condition = self.visit(ctx.getChild(2))  # Условие
        self.emit(f"beqz {condition}, {end_label}\n")

        self.visit(ctx.getChild(4))  # Тело цикла
        self.emit(f"j {loop_label}\n")
        self.emit(f"{end_label}: # Конец while\n")

    def visitForstmt(self, ctx: mrlangParser.ForstmtContext):
        init_label = self.new_label("FOR_INIT")
        loop_label = self.new_label("FOR_LOOP")
        end_label = self.new_label("FOR_END")

        # Инициализация
        self.visit(ctx.getChild(2))  # Объявление переменной
        self.emit(f"{init_label}: # Начало for\n")
        condition = self.visit(ctx.getChild(4)) 
        self.emit(f"beqz {condition}, {end_label}\n")

        # Тело цикла
        self.visit(ctx.getChild(8))
        
        # Инкремент
        self.visit(ctx.getChild(6))
        self.emit(f"j {init_label}\n")
        self.emit(f"{end_label}: # Конец for\n")

    def visitIfstmt(self, ctx: mrlangParser.IfstmtContext):
        cond_label = self.new_label("IF_COND")
        end_label = self.new_label("IF_END")

        condition = self.visit(ctx.getChild(2))
        self.emit(f"# Условие if\n")
        self.emit(f"beqz {condition}, {cond_label}\n")

        self.visit(ctx.getChild(4))
        self.emit(f"j {end_label}\n")

        self.emit(f"{cond_label}:\n")
        for i in range(5, ctx.getChildCount()):
            elif_label = self.visit(ctx.getChild(i))
            if (isinstance(ctx.getChild(i), mrlangParser.ElifstmtContext)):
                self.emit(f"j {end_label}\n")
                self.emit(f"{elif_label}:\n")

        self.emit(f"{end_label}:\n")

    def visitElifstmt(self, ctx: mrlangParser.ElifstmtContext):
        next_label = self.new_label("ELIF_NEXT")

        # Условие elif
        condition = self.visit(ctx.getChild(2))
        self.emit(f"# Условие elif\n")
        self.emit(f"beqz {condition}, {next_label}\n")

        # Тело elif
        self.visit(ctx.getChild(4))
        return next_label

    def visitElsestmt(self, ctx: mrlangParser.ElsestmtContext):
        self.emit(f"# Тело else\n")
        self.visit(ctx.getChild(1))
