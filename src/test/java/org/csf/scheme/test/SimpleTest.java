package org.csf.scheme.test;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.csf.scheme.lang.SchemeLexer;
import org.csf.scheme.lang.SchemeParser;
import org.csf.scheme.lang.SchemeTreeWriter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by agpopikov on 24/09/14.
 */
public class SimpleTest {

    @Test
    public void simple_test() throws RecognitionException, IOException {
        Tree multiTree = multiTree();
        Tree simpleTree = simpleTree();
        SchemeTreeWriter schemeTreeWriter = new SchemeTreeWriter();
        schemeTreeWriter.writeTreeToDot(simpleTree, "test.dot");
        multiTree = null;
    }

    private Tree multiTree() throws RecognitionException {
        CharStream input = new ANTLRStringStream("(define a (lambda (x y z) (sum 1 x y z))) (define b 1)"); // (' 1 2 3)
        SchemeLexer lexer = new SchemeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        SchemeParser parser = new SchemeParser(tokens);
        return (Tree) parser.program().getTree();
    }

    private Tree simpleTree() throws RecognitionException {
        CharStream input = new ANTLRStringStream("(define a (lambda (x y z) (sum 1 2 3 4 '(5 6 7))))"); // (' 1 2 3)
        SchemeLexer lexer = new SchemeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        SchemeParser parser = new SchemeParser(tokens);
        return (Tree) parser.program().getTree();
    }



}
