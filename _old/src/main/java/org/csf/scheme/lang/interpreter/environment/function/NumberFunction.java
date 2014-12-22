package org.csf.scheme.lang.interpret.environment.function;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.interpret.InterpretException;
import org.csf.scheme.lang.interpret.environment.Environment;
import org.csf.scheme.lang.interpret.environment.Function;

import java.util.Collection;

/**
 * Created by agpopikov on 20/10/14.
 */
public class NumberFunction extends Function<Double> {

    public NumberFunction(Environment environment) {
        super(environment);
    }

    @Override
    public Collection<String> getFunctionAliases() {
        return null;
    }

    @Override
    public Double interpret(Tree tree) throws InterpretException {
        return null;
    }

}
