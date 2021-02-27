package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileAnalyzeUtilTest {

    @Test
    void getListOfStrings() {
        String expectedList = "[Aux test out time enum, compile under Inbox, Aux test out time enum, Aux test]";

        String actualList = FileAnalyzeUtil.getListOfStrings("src/test/java/com/rakovets/course/java/core/practice/io/text.txt").toString();

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getStartFromVowels() {

        String  actualList = FileAnalyzeUtil.getStartFromVowels("src/test/java/com/rakovets/course/java/core/practice/io/text.txt").toString();

        Assertions.assertEquals("[Aux test out time enum, compile under Inbox, Aux test out time enum, Aux test]", actualList);
    }

    @Test
    void getWordsMatchesByFirstLastChar() {

        List<String> actualList = FileAnalyzeUtil.getWordsMatchesByFirstLastChar("src/test/java/com/rakovets/course/java/core/practice/io/text.txt");

        Assertions.assertEquals("[out, time, enum, out, time, enum]", actualList.toString());
    }

    @Test
    void getLongestCombo() {

        List<String> actualList = FileAnalyzeUtil.getLongestCombo("src/test/java/com/rakovets/course/java/core/practice/io/numbers.txt");

        Assertions.assertEquals("[1 65 135]", actualList.toString());
    }

    @Test
    void getCharsFrequency() {

        String expectedString = "{ =14, A=3, B=1, C=1, D=1, E=9, I=4, ,=3, L=1, M=5, N=4, O=4, P=1, R=1, S=3, T=10, U=8, X=4, [=1, ]=1}";

        String actualString = FileAnalyzeUtil.getCharsFrequency("src/test/java/com/rakovets/course/java/core/practice/io/text.txt").toString();

        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void getWordsFrequency() {

        String expectedString = "['compile' - 1, 'under' - 1, 'Inbox' - 1, 'time' - 2, 'enum' - 2, 'out' - 2, 'test' - 3, 'Aux' - 3, '' - 4]";

        String actualString = FileAnalyzeUtil.getWordsFrequency("src/test/java/com/rakovets/course/java/core/practice/io/text.txt").toString();

        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void storeResultToFile() {

        boolean actualBoolean = FileAnalyzeUtil.storeResultToFile("src/test/java/com/rakovets/course/java/core/practice/io/numbers.txt");

        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void getStudentsMarks() {

        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "Guilliman 6.5",
                "Johnson 7.333333333333333",
                "Sanguinius 7.166666666666667",
                "Dorn 6.333333333333333",
                "Kerz 6.333333333333333");

        List<String> actualList = FileAnalyzeUtil.getStudentsMarks("src/test/java/com/rakovets/course/java/core/practice/io/StudentsMarks.txt");

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void replaceModifiers() {

        boolean actualBoolean = FileAnalyzeUtil.replaceModifiers("src/test/java/com/rakovets/course/java/core/practice/io/Student.java",
                "private", "public");

        Assertions.assertTrue(actualBoolean);
    }
}
