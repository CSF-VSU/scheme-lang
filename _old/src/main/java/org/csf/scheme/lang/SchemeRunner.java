package org.csf.scheme.lang;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.antlr.SchemeLexer;
import org.csf.scheme.lang.antlr.SchemeParser;
import org.csf.scheme.lang.interpreter.SchemeInterpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by agpopikov on 12/10/14.
 */
public class SchemeRunner {

    private String source;
    private SchemeParser schemeParser;
    private SchemeInterpreter schemeInterpreter;

    public SchemeRunner(String source) {
        this.source = source;
    }

    public SchemeRunner(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        this.source = new String(data, "UTF-8");
    }

    public void parse() {
        CharStream input = new ANTLRStringStream(this.source);
        SchemeLexer lexer = new SchemeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        this.schemeParser = new SchemeParser(tokens);
    }

    public void interpret() throws RecognitionException {
        schemeInterpreter = new SchemeInterpreter(getSyntaxTree());
        schemeInterpreter.interpret();
    }

    public String getSource() {
        return source;
    }

    public SchemeParser getSchemeParser() {
        return schemeParser;
    }

    public Tree getSyntaxTree() throws RecognitionException {
        return (Tree) this.schemeParser.program().getTree();
    }

}
