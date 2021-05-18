package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileAnalyzeUtilTest {
    @Test
    void getList() {
        // GIVEN
        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "There is no emotion: there is peace.",
                "There is no ignorance: there is knowledge.",
                "There is no passion: there is serenity.",
                "There is no chaos: there is harmony.",
                "There is no death: there is Great Force");

        // WHEN
        List<String> actualList = FileAnalyzeUtil.getList("src/main/java/com/rakovets/course/java/core/practice/io/Test.txt");

        // THEN
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getListStartsWithVowels() {
        // GIVEN

        // WHEN
        List<String> actualList = FileAnalyzeUtil.getListStartsWithVowels("src/main/java/com/rakovets/course/java/core/practice/io/Test.txt");

        // THEN
        Assertions.assertEquals("[is, emotion, is, is, ignorance, is, is, is, is, is, is, is]", actualList.toString());
    }

    @Test
    void getListLastLetterEqualsFirstLetter() {
        // GIVEN

        // WHEN
        List<String> actualList = FileAnalyzeUtil.getListLastLetterEqualsFirstLetter("src/main/java/com/rakovets/course/java/core/practice/io/Test.txt");

        // THEN
        Assertions.assertEquals("[is, serenity]", actualList.toString());
    }

    @Test
    void getLongestAscendingCombination() {
        // GIVEN

        // WHEN
        List<String> actualList = FileAnalyzeUtil.getLongestAscendingCombination("src/main/java/com/rakovets/course/java/core/practice/io/NumbersTest.txt");

        // THEN
        Assertions.assertEquals("[1 2 3, 67 68 69, 23, 6 7 8 9]", actualList.toString());
    }

    @Test
    void getLettersFrequency() {
        // GIVEN
        String expectedString = "{a=7, c=4, d=2, e=31, f=1, g=3, h=13, i=14, k=1, l=1, " +
                "m=2, n=12, o=13, p=2, r=15, s=14, t=14, w=1, y=2}";

        // WHEN
        String actualString = FileAnalyzeUtil.getLettersFrequency("src/main/java/com/rakovets/course/java/core/practice/io/Test.txt").toString();

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void getAscendingWordFrequency() {
        // GIVEN
        String expectedString = "['harmony' - 1, 'serenity' - 1, 'chaos' - 1, 'death' - 1, 'great' - 1," +
                " 'emotion' - 1, 'ignorance' - 1, 'peace' - 1, 'force' - 1, 'passion' - 1, 'knowledge' - 1," +
                " 'no' - 5, 'is' - 10, 'there' - 10]";

        // WHEN
        String actualString = FileAnalyzeUtil.getAscendingWordFrequency("src/main/java/com/rakovets/course/java/core/practice/io/Test.txt").toString();

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void sortAndWriteNumbers() {
        // GIVEN

        // WHEN
        boolean actualBoolean = FileAnalyzeUtil.sortAndWriteNumbers("src/main/java/com/rakovets/course/java/core/practice/io/NumbersTest.txt");

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void getStudentAverageMark() {
        // GIVEN
        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "Wilson - average mark: 6,50",
                "Jackson - average mark: 4,50",
                "Skywalker - average mark: 7,17",
                "Zimmer - average mark: 6,33",
                "Sanders - average mark: 8,50");

        // WHEN
        List<String> actualList = FileAnalyzeUtil.getStudentAverageMark("src/main/java/com/rakovets/course/java/core/practice/io/Students.txt");

        // THEN
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void replaceModifiers() {
        // GIVEN

        // WHEN
        boolean actualBoolean = FileAnalyzeUtil.replaceModifiers("src/main/java/com/rakovets/course/java/core/practice/io/Task10.java",
                "private", "public");

        // THEN
        Assertions.assertTrue(actualBoolean);
    }
}
