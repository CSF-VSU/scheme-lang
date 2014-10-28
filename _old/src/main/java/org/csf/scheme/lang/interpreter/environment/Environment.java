package org.csf.scheme.lang.interpreter.environment;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.interpreter.InterpretException;
import org.csf.scheme.lang.interpreter.environment.function.DefineFunction;
import org.csf.scheme.lang.interpreter.environment.function.MathFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agpopikov on 20/10/14.
 */
public class Environment {

    private List<Function> functions;

    public Environment() {
        this.functions = new ArrayList<Function>();
        this.functions.add(new MathFunction(this));
        this.functions.add(new DefineFunction(this));
    }

    public void interpret(Tree tree) {
        for (Function function : functions) {
            if (function.getFunctionAliases().contains(tree.getText())) {
                try {
                    Object output = function.interpret(tree);
                    System.out.println(output);
                } catch (InterpretException e) {
                    System.out.println("Interpret error.");
                }
            }
        }
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }
}
