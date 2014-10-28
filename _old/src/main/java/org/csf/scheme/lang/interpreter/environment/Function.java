package org.csf.scheme.lang.interpreter.environment;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.interpreter.InterpretException;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by agpopikov on 20/10/14.
 */
public abstract class Function<T> {

    protected FunctionType functionType;
    protected Environment environment;
    protected Collection<String> interpretErrors;

    public Function(Environment environment) {
        this.environment = environment;
        this.interpretErrors = new ArrayList<String>();
    }

    public abstract Collection<String> getFunctionAliases();

    public abstract T interpret(Tree tree) throws InterpretException;

    public Collection<String> getInterpretErrors() {
        return this.interpretErrors;
    }

}
