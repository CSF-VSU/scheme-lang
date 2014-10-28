package org.csf.scheme.lang.interpreter;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.interpreter.environment.Environment;

/**
 * Created by agpopikov on 20/10/14.
 */
public class SchemeInterpreter {

    private Tree tree;
    private Environment environment;

    public SchemeInterpreter(Tree tree) {
        this.tree = tree;
        this.environment = new Environment();
    }

    public void interpret() {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            environment.interpret(child);
        }
    }

}
