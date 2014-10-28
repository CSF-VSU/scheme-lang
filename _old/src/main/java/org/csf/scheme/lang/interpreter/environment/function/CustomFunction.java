package org.csf.scheme.lang.interpreter.environment.function;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.interpreter.InterpretException;
import org.csf.scheme.lang.interpreter.environment.Environment;
import org.csf.scheme.lang.interpreter.environment.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by agpopikov on 20/10/14.
 */
public class CustomFunction extends Function {

    private String name;
    private Double value;

    public CustomFunction(Environment environment) {
        super(environment);
    }

    public CustomFunction(Environment environment, String name, Double value) {
        super(environment);
        this.name = name;
        this.value = value;
    }

    @Override
    public Collection<String> getFunctionAliases() {
        return Arrays.asList(name);
    }

    @Override
    public Double interpret(Tree tree) throws InterpretException {
        return value;
    }

}
