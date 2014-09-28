package org.csf.scheme.lang;

import org.antlr.runtime.tree.Tree;

import java.io.*;

/**
 * Created by agpopikov on 29/09/14.
 */
public class SchemeTreeWriter {

    private StringBuffer currentDotPath;

    public void writeTreeToDot(Tree tree, String fileName) throws IOException {
        this.currentDotPath = new StringBuffer();
        traverseTree(tree);
        String diGraph = String.format("digraph Scheme { %s }", currentDotPath.toString());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileName));
        outputStreamWriter.write(diGraph);
        outputStreamWriter.close();
    }

    private void traverseTree(Tree tree) {
        if (!tree.isNil()) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                Tree child = tree.getChild(i);
                currentDotPath.append(String.format("%s -> %s;", tree.getText(), child.getText()));
            }
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            traverseTree(child);
        }
    }

}
