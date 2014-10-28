package org.csf.scheme.lang.test;

import org.antlr.runtime.RecognitionException;
import org.csf.scheme.lang.SchemeRunner;
import org.junit.Test;

/**
 * Created by agpopikov on 20/10/14.
 */
public class InterpretTests {

    @Test
    public void simple_test() throws RecognitionException {
        SchemeRunner schemeRunner = new SchemeRunner("(define a 1) (+ a  2)");
        schemeRunner.parse();
        schemeRunner.interpret();
    }

}
