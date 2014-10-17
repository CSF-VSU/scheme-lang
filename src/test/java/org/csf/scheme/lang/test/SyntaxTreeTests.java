package org.csf.scheme.lang.test;

import org.antlr.runtime.RecognitionException;
import org.csf.scheme.lang.SchemeRunner;
import org.csf.scheme.lang.util.SchemeTreeWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by agpopikov on 13/10/14.
 */
public class SyntaxTreeTests {

    private final String RESOURCES_PATH = "src/test/resources/syntax_tree_test/";
    private SchemeTreeWriter schemeTreeWriter;

    @Before
    public void initialize_tree_writer() {
        this.schemeTreeWriter = new SchemeTreeWriter();
    }

    @Test
    public void simple_program_test() throws IOException, RecognitionException, IllegalAccessException, InterruptedException {
        SchemeRunner schemeRunner = new SchemeRunner(
                new File(format_path("simple_program.scm")));
        schemeRunner.parse();
        Assert.assertEquals(schemeRunner.getSchemeParser().getNumberOfSyntaxErrors(), 0);
        schemeTreeWriter.writeTreeToPNG(schemeRunner.getSyntaxTree(), format_path("result/simple_program.png"));
    }

    @Test
    public void multi_program_test() throws IOException, RecognitionException, IllegalAccessException, InterruptedException {
        SchemeRunner schemeRunner = new SchemeRunner(
                new File(format_path("multi_program.scm")));
        schemeRunner.parse();
        Assert.assertEquals(schemeRunner.getSchemeParser().getNumberOfSyntaxErrors(), 0);
        schemeTreeWriter.writeTreeToPNG(schemeRunner.getSyntaxTree(), format_path("result/multi_program.png"));
    }

    @Test
    public void lambda_definition_test() throws IOException, RecognitionException, IllegalAccessException, InterruptedException {
        SchemeRunner schemeRunner = new SchemeRunner(
                new File(format_path("lambda_definition.scm")));
        schemeRunner.parse();
        Assert.assertEquals(schemeRunner.getSchemeParser().getNumberOfSyntaxErrors(), 0);
        schemeTreeWriter.writeTreeToPNG(schemeRunner.getSyntaxTree(), format_path("result/lambda_definition.png"));
    }

    @Test
    public void integer_definition_test() throws IOException, RecognitionException, IllegalAccessException, InterruptedException {
        SchemeRunner schemeRunner = new SchemeRunner(
                new File(format_path("integer_definition.scm")));
        schemeRunner.parse();
        Assert.assertEquals(schemeRunner.getSchemeParser().getNumberOfSyntaxErrors(), 0);
        schemeTreeWriter.writeTreeToPNG(schemeRunner.getSyntaxTree(), format_path("result/integer_definition.png"));
    }

    @Test
    public void build_and_check_all_programs() throws IOException, RecognitionException, InterruptedException, IllegalAccessException {
        File directory = new File(RESOURCES_PATH);
        for (String fileName : directory.list()) {
            if (!fileName.equals("result")) {
                File file = new File(format_path(fileName));
                SchemeRunner schemeRunner = new SchemeRunner(file);
                schemeRunner.parse();
                Assert.assertEquals(schemeRunner.getSchemeParser().getNumberOfSyntaxErrors(), 0);
                schemeTreeWriter.writeTreeToPNG(schemeRunner.getSyntaxTree(), format_path(String.format("result/%s.png", file.getName())));
            }
        }
    }

    public String format_path(String path) {
        return String.format("%s%s", RESOURCES_PATH, path);
    }

}
