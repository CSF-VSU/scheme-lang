package org.csf.scheme.lang.util;

import org.antlr.runtime.tree.Tree;
import org.csf.scheme.lang.antlr.SchemeParser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * Created by agpopikov on 29/09/14.
 */
public class SchemeTreeWriter {

    private StringBuffer currentDotPath;
    private List<Tree> currentVertexes;
    private String treePath;

    public void writeTreeToDot(Tree tree, String fileName) throws IOException, IllegalAccessException {
        this.currentDotPath = new StringBuffer();
        this.currentVertexes = new ArrayList<>();
        this.treePath = "";
        traverseTree(tree, "");
        String dot = String.format("strict graph Scheme {\n %s\n %s\n }", formatVertexes(), treePath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileName));
        outputStreamWriter.write(dot);
        outputStreamWriter.close();
    }

    public void writeTreeToPNG(Tree tree, String fileName) throws IOException, IllegalAccessException, InterruptedException {
        String dotFileName = String.format("%s.dot", fileName);
        writeTreeToDot(tree, dotFileName);
        Runtime.getRuntime().exec(String.format("dot -Tpng %s -o %s", dotFileName, fileName));
        Thread.sleep(500);
        Runtime.getRuntime().exec(String.format("rm %s", dotFileName));
    }

    private void traverseTree(Tree tree, String currentPath) {
        currentVertexes.add(tree);
        int currentIndex = currentVertexes.size() - 1;
        if (tree.getChildCount() == 0) {
            String currentVertex = String.format("vertex%d;", currentIndex);
            treePath += currentPath + currentVertex;
        } else {
            String currentVertex = String.format("vertex%d -- ", currentIndex);
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseTree(tree.getChild(i), currentPath + currentVertex);
            }
        }
    }

    private String formatVertexes() throws IllegalAccessException {
        String result = "";
        for (int i = 0; i < currentVertexes.size(); i++) {
            Tree currentVertex = currentVertexes.get(i);
            if (ParserTypes.getParserTypesValues().get("STRING") == currentVertex.getType()) {
                String text = currentVertex.getText();
                text = text.substring(1, text.length() - 1);
                result += String.format("vertex%d [label=\"%s: %s\"];", i, text,
                        ParserTypes.getParserValuesTypes().get(currentVertex.getType()));
            } else if (ParserTypes.getParserTypesValues().get("CHAR") == currentVertex.getType()) {
                result += String.format("vertex%d [label=\"%s: %s\"];", i, currentVertex.getText().charAt(1),
                        ParserTypes.getParserValuesTypes().get(currentVertex.getType()));
            } else {
                result += String.format("vertex%d [label=\"%s: %s\"];", i, currentVertex.getText(),
                        ParserTypes.getParserValuesTypes().get(currentVertex.getType()));
            }
        }
        return result;
    }



}
