package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileAnalyzeUtilTest {
    @Test
    void getListStringsOfFilePathTest() {
        Path filePath = Paths.get("src", "main", "resources", "getText.txt");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Real from Madrid");
        expectedResult.add("Manchester United");
        expectedResult.add("Bavaria from Munchen");
        expectedResult.add("Arsenal from London");
        expectedResult.add("Atletico from Madrid");

        List<String> actualResult = FileAnalyzeUtil.getListStringsOfFilePath(filePath);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getListWordsStartWithVowelTest() {
        Path filePath = Paths.get("src", "main", "resources", "getText.txt");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("United");
        expectedResult.add("Arsenal");
        expectedResult.add("Atletico");

        List<String> actualResult = FileAnalyzeUtil.getListWordsStartWithVowel(filePath);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getListLastEqualsFirstLettersTest() {
        Path filePath = Paths.get("src", "main", "resources", "getText.txt");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("from");
        expectedResult.add("from");
        expectedResult.add("from");

        List<String> actualResult = FileAnalyzeUtil.getListLastEqualsFirstLetters(filePath);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getListNumbersTest() {
        Path filePath = Paths.get("src", "main", "resources", "getNumbers.txt");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1 2 3");
        expectedResult.add("67 68 69");
        expectedResult.add("24 25 26");

        List<String> actualResult = FileAnalyzeUtil.getListNumbers(filePath);

        Assertions.assertEquals(expectedResult, actualResult);
    }






}
