package org.csf.scheme.lang.interpret.environment.function;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.interpret.InterpretException;
import org.csf.scheme.lang.interpret.environment.Environment;
import org.csf.scheme.lang.interpret.environment.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by agpopikov on 20/10/14.
 */
public class MathFunction extends Function<Double> {

    public MathFunction(Environment environment) {
        super(environment);
    }

    @Override
    public Collection<String> getFunctionAliases() {
        return Arrays.asList("+", "-", "*", "/");
    }

    @Override
    public Double interpret(Tree tree) throws InterpretException {
        if (validate(tree)) {
            String operation = tree.getText();
            //
            List<Double> params = new ArrayList<>();
            for (int i = 0; i < tree.getChildCount(); i++) {
                Tree child = tree.getChild(i);
                try {
                    double value = Double.parseDouble(child.getText());
                    params.add(value);
                } catch (RuntimeException e) {
                    throw new InterpretException();
                }
            }
            //
            Double result = 0.0d;
            //
            switch (operation) {
                case "+":
                    for (Double param : params) {
                        result += param;
                    }
                    break;
                case "-":
                    for (Double param : params) {
                        result -= param;
                    }
                    break;
                case "*":
                    for (Double param : params) {
                        result *= param;
                    }
                    break;
                case "/":
                    if (params.size() == 1) {
                        result = 1 / params.get(0);
                    } else {
                        result = params.get(0);
                        for (int i = 1; i < params.size(); i++) {
                            result /= params.get(i);
                        }
                    }
                    break;
            }
            return result;
        } else {
            throw new InterpretException();
        }
    }

    private boolean validate(Tree tree) {
        if (tree.getChildCount() > 1) {
            // todo
            return true;
        }
        return false;
    }

}
