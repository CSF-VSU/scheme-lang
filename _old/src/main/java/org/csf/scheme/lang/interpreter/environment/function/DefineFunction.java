package org.csf.scheme.lang.interpret.environment.function;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.interpret.InterpretException;
import org.csf.scheme.lang.interpret.environment.Environment;
import org.csf.scheme.lang.interpret.environment.Function;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by agpopikov on 20/10/14.
 */
public class DefineFunction extends Function<Void> {

    public DefineFunction(Environment environment) {
        super(environment);
    }

    @Override
    public Collection<String> getFunctionAliases() {
        return Arrays.asList("define");
    }

    @Override
    public Void interpret(Tree tree) throws InterpretException{
        String name = tree.getChild(0).getText();
        String value = tree.getChild(1).getText();
        try {
            environment.getFunctions().add(new CustomFunction(environment, name, Double.parseDouble(value)));
        } catch (Exception e) {
            throw new InterpretException();
        }
        return null;
    }

    private boolean check(Tree tree) {
        if (tree.getChildCount() != 2) {
            this.interpretErrors.add("Params error.");
            return false;
        }
        return true;
    }

}
