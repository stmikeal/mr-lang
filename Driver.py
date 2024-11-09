import sys
from antlr4 import *
from mrlangLexer import mrlangLexer
from mrlangParser import mrlangParser
from mrlangListener import mrlangListener
from mrlangVisitor import mrlangVisitor

def main(argv):
    # input_stream = FileStream(argv[1])
    input_stream = FileStream("example.mr")
    lexer = mrlangLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = mrlangParser(stream)
    tree = parser.program()
    if parser.getNumberOfSyntaxErrors() > 0:
        print("syntax errors")
    else:
        vinterp = mrlangVisitor()
        vinterp.visit(tree)
        linterp = mrlangListener()
        walker = ParseTreeWalker()
        walker.walk(linterp, tree)

if __name__ == '__main__':
    main(sys.argv)