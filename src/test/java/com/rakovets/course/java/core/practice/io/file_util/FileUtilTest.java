package com.rakovets.course.java.core.practice.io.file_util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;

public class FileUtilTest {
    FileUtil fileUtil = new FileUtil();

    @Test
    public void testConvertTextToListOfString() {
        File file = new File("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task02FileDemo");
        Path path = Path.of(file.getPath());
        String actual = "[java, hello world]";
        String expected = fileUtil.convertTextToListOfString(path).toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testExtractCombinationNumbersInAscendingOrder() {
        File file = new File("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task05FileDemo");
        Path path = Path.of(file.getPath());
        String actual = "[1 2 3, 67 68 69]";
        String expected = fileUtil.extractCombinationNumbersInAscendingOrder(path).toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculationFrequencyRepetitionAllLettersIgnoringCase() {
        File file = new File("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task06FileDemo");
        Path path = Path.of(file.getPath());
        String actual = "{a=1, b=2, c=3}";
        String expected = fileUtil.calculationFrequencyRepetitionAllLettersIgnoringCase(path).toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculationFrequencyWordsAscendingOrder() {
        File file = new File("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task07FileDemo");
        Path path = Path.of(file.getPath());
        String actual = "{hello=1, Java=2, world=3}";
        String expected = fileUtil.calculationFrequencyWordsAscendingOrder(path).toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountStudentsAverageMarks() {
        File file = new File("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task09FileDemo");
        Path path = Path.of(file.getPath());
        String actual = "{Franklin=0.33, Johnson=6.0, Jefferson=9.0}";
        String expected = String.valueOf(fileUtil.countStudentsAverageMarks(path));

        Assertions.assertEquals(expected, actual);
    }
}
