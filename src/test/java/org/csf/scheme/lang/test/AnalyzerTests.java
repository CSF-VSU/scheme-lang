package org.csf.scheme.lang.test;

import org.antlr.runtime.RecognitionException;
import org.csf.scheme.lang.SchemeRunner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

/**
 * Created by agpopikov on 13/10/14.
 */
public class AnalyzerTests {

    @Test
    public void simple_analyzer_test() throws RecognitionException {
        SchemeRunner schemeRunner = new SchemeRunner("(define a 1)");
        schemeRunner.parse();
        schemeRunner.validate();
        Collection<String> errors = schemeRunner.getAnalyzeErrors();
        Assert.assertEquals(errors.size(), 0);
    }

    @Test
    public void simple_analyzer_error_test() throws RecognitionException {
        SchemeRunner schemeRunner = new SchemeRunner("(define 1 1)\n\n(define a (define b 1))");
        schemeRunner.parse();
        schemeRunner.validate();
        Collection<String> errors = schemeRunner.getAnalyzeErrors();
        System.out.println("Errors:");
        for (String error : errors) {
            System.out.println(String.format("\t%s", error));
        }
        Assert.assertEquals(errors.size(), 2);
    }

    @Test
    public void math_function_analyzer_test() throws RecognitionException {
        SchemeRunner schemeRunner = new SchemeRunner("(+ 1 1 1)");
        schemeRunner.parse();
        schemeRunner.validate();
        Assert.assertEquals(schemeRunner.getSchemeParser().getNumberOfSyntaxErrors(), 0);
    }

    @Test
    public void math_function_analyzer_error_test() throws RecognitionException {
        SchemeRunner schemeRunner = new SchemeRunner("(+ 1 1 \"hello\")");
        schemeRunner.parse();
        schemeRunner.validate();
        System.out.println("Errors:");
        for (String error : schemeRunner.getAnalyzeErrors()) {
            System.out.println(String.format("\t%s", error));
        }
        Assert.assertEquals(schemeRunner.getAnalyzeErrors().size(), 1);
    }

}
