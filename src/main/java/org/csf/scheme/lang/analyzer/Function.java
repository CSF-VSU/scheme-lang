package org.csf.scheme.lang.analyzer;

import org.antlr.runtime.tree.Tree;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by agpopikov on 12/10/14.
 */
public abstract class Function {

    private String[] aliases;
    private PredefinedFunction type;

    public Function(String[] aliases, PredefinedFunction type) {
        this.aliases = aliases;
        this.type = type;
    }

    public Collection<String> getAliases() {
        return Arrays.asList(aliases);
    }

    public PredefinedFunction getType() {
        return this.type;
    }

    public abstract String validate(Tree tree);

    public String formatError(String error, Integer line, Integer startSymbol) {
        return String.format("Error. %s at line %d:%d", error, line, startSymbol);
    }
}
