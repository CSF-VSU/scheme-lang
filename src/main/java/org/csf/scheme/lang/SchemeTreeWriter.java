package org.csf.scheme.lang;

import org.antlr.runtime.tree.Tree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
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
            if (getParserTypesValues().get("STRING") == currentVertex.getType()) {
                String text = currentVertex.getText();
                text = text.substring(1, text.length() - 1);
                result += String.format("vertex%d [label=\"%s: %s\"];", i, text,
                        getParserValuesTypes().get(currentVertex.getType()));
            } else if (getParserTypesValues().get("CHAR") == currentVertex.getType()) {
                result += String.format("vertex%d [label=\"%s: %s\"];", i, currentVertex.getText().charAt(1),
                        getParserValuesTypes().get(currentVertex.getType()));
            } else {
                result += String.format("vertex%d [label=\"%s: %s\"];", i, currentVertex.getText(),
                        getParserValuesTypes().get(currentVertex.getType()));
            }
        }
        return result;
    }

    private Map<Integer, String> getParserValuesTypes() throws IllegalAccessException {
        Map<Integer, String> result = new HashMap<>();
        SchemeParser schemeParser = new SchemeParser(null);
        Field[] fields = schemeParser.getClass().getFields();
        for (Field field : fields) {
            if (field.getType() == int.class) {
                result.put(field.getInt(schemeParser), field.getName());
            }
        }
        return result;
    }

    private Map<String, Integer> getParserTypesValues() throws IllegalAccessException {
        Map<String, Integer> result = new HashMap<>();
        SchemeParser schemeParser = new SchemeParser(null);
        Field[] fields = schemeParser.getClass().getFields();
        for (Field field : fields) {
            if (field.getType() == int.class) {
                result.put(field.getName(), field.getInt(schemeParser));
            }
        }
        return result;
    }

}
