package org.csf.scheme.lang.analyzer.function;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.analyzer.Function;
import org.csf.scheme.lang.analyzer.PredefinedFunction;
import org.csf.scheme.lang.util.ParserTypes;

/**
 * Created by agpopikov on 12/10/14.
 */
public class DefineFunction extends Function {

    private static String[] FUNCTION_ALIASES = new String[] {"define"};
    private static PredefinedFunction FUNCTION_TYPE = PredefinedFunction.DEFINE;

    public DefineFunction() {
        super(FUNCTION_ALIASES, FUNCTION_TYPE);
    }

    @Override
    public String validate(Tree tree) {
        if (tree.getChildCount() != 2) {
            return formatError("Ill-formed special form: define", tree.getLine(), tree.getTokenStartIndex());
        }
        if (tree.getChild(0).getType() != ParserTypes.getParserTypesValues().get("ID")) {
            return formatError("Operator isn't procedure", tree.getLine(), tree.getTokenStartIndex());
        }
        if (tree.getChild(1).getText().equals("define")) {
            return formatError("Ill-placed define", tree.getLine(), tree.getTokenStartIndex());
        }
        return null;
    }

}
