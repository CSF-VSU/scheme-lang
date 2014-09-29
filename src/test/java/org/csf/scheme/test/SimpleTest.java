package org.csf.scheme.test;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.SchemeLexer;
import org.csf.scheme.lang.SchemeParser;
import org.csf.scheme.lang.SchemeTreeWriter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by agpopikov on 24/09/14.
 */
public class SimpleTest {

    @Test
    public void simple_test() throws RecognitionException, IOException, IllegalAccessException {
        Tree tree = sampleTree();
        SchemeTreeWriter schemeTreeWriter = new SchemeTreeWriter();
        schemeTreeWriter.writeTreeToDot(tree, "test.dot");
    }

    private Tree sampleTree() throws RecognitionException {
        CharStream input = new ANTLRStringStream("(define b (lambda (x) (lambda (y) (sum x y)))) (define a 1) (sum 1 2 3)"); // (' 1 2 3)
        SchemeLexer lexer = new SchemeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        SchemeParser parser = new SchemeParser(tokens);
        return (Tree) parser.program().getTree();
    }



}
