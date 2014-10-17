package org.csf.scheme.lang.util;

import org.csf.scheme.lang.antlr.SchemeParser;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by agpopikov on 13/10/14.
 */
public class ParserTypes {

    public static Map<Integer, String> getParserValuesTypes() throws IllegalAccessException {
        Map<Integer, String> result = new HashMap<>();
        try {
            SchemeParser schemeParser = new SchemeParser(null);
            Field[] fields = schemeParser.getClass().getFields();
            for (Field field : fields) {
                if (field.getType() == int.class) {
                    result.put(field.getInt(schemeParser), field.getName());
                }
            }
        } catch (IllegalAccessException e) {
            // stub
        }
        return result;
    }

    public static Map<String, Integer> getParserTypesValues() {
        Map<String, Integer> result = new HashMap<>();
        try {
            SchemeParser schemeParser = new SchemeParser(null);
            Field[] fields = schemeParser.getClass().getFields();
            for (Field field : fields) {
                if (field.getType() == int.class) {
                    result.put(field.getName(), field.getInt(schemeParser));
                }
            }
        } catch (IllegalAccessException e) {
            // stub
        }
        return result;
    }

}
