package org.csf.scheme.lang.analyzer.function;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.analyzer.Function;
import org.csf.scheme.lang.analyzer.PredefinedFunction;
import org.csf.scheme.lang.util.ParserTypes;

/**
 * Created by agpopikov on 12/10/14.
 */
public class MathFunction extends Function {

    private static String[] FUNCTION_ALIASES = new String[] {"+", "-", "*", "/"};
    private static PredefinedFunction FUNCTION_TYPE = PredefinedFunction.SUM;

    public MathFunction() {
        super(FUNCTION_ALIASES, FUNCTION_TYPE);
    }

    @Override
    public String validate(Tree tree) {
        if (tree.getChildCount() == 0){
            return formatError("Wrong number of arguments passed to procedure", tree.getLine(), tree.getTokenStartIndex());
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            if ((child.getType() != ParserTypes.getParserTypesValues().get("NUMBER")) ||
                    (child.getType() != ParserTypes.getParserTypesValues().get("ID"))) {
                return formatError("Wrong type of arguments passed to procedure", tree.getLine(), tree.getTokenStartIndex());
            }
        }
        return null;
    }
}
