package org.csf.scheme.lang.analyzer;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.analyzer.function.DefineFunction;
import org.csf.scheme.lang.analyzer.function.MathFunction;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by agpopikov on 12/10/14.
 */
public class SchemeAnalyzer {

    private Tree tree;
    private Collection<String> errors;
    private Collection<Function> functions;

    public SchemeAnalyzer(Tree tree) {
        this.tree = tree;
        this.functions = new HashSet<>();
        this.errors = new HashSet<>();
        initializePredefinedFunctions();
    }

    public void initializePredefinedFunctions() {
        this.functions.add(new DefineFunction());
        this.functions.add(new MathFunction());
    }

    public void validate() {
        traverseTree(tree);
    }

    private void traverseTree(Tree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            for (Function function : this.functions) {
                if (function.getAliases().contains(child.getText())) {
                    String error = function.validate(child);
                    if (error != null) {
                        errors.add(error);
                    }
                }
            }
            traverseTree(child);
        }
    }

    public Collection<String> getErrors() {
        return errors;
    }
}
