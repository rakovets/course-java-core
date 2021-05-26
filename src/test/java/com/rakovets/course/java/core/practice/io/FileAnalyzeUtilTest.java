package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    void getFrequencyUsedLetterTest() {
        Path filePath = Paths.get("src", "main", "resources", "getText.txt");
        String expectedResult = "{a=10, b=1, c=3, d=6, e=7, f=4, h=2, i=5, l=4, m=8, n=7, o=7, r=10, s=2, t=4, u=2, v=1}";

        String actualResult = FileAnalyzeUtil.getFrequencyUsedLetter(filePath).toString();

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getFrequencyUsedWorldTest() {
        Path filePath = Paths.get("src", "main", "resources", "getText.txt");
        String expectedResult = "[arsenal - 1, atletico - 1, bavaria - 1, london - 1, manchester - 1, munchen - 1, real - 1, united - 1, madrid - 2, from - 4]";

        String actualResult = FileAnalyzeUtil.getFrequencyUsedWorld(filePath).toString();

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void sortedAndWritterNumbersTest() throws Exception {
        FileAnalyzeUtil.sortedAndWriteNumbers(Path.of("src", "main", "resources", "numbers.txt"));

        Path filePath = Paths.get("src", "main", "resources", "numbers.txt_");
        String actualResult = Files.readString(filePath).toString();

        Assertions.assertEquals("[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]", actualResult);
    }

    @Test
    void getStudentAverageMarkTest() {
        Path filePath = Paths.get("src", "main", "resources", "getStudents.txt");
        String expectedResult = "{Kuznetsov=9.0, Levchuk=8.4, Lukoshko=1.6, Aleksandrov=5.8, Ivanov=4.0}";

        String actualResult = FileAnalyzeUtil.getStudentAverageMark(filePath).toString();

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void replaceAccessModifiersTest() {
        FileAnalyzeUtil.replaceAccessModifiers
                (Path.of("src", "main", "java", "com", "rakovets", "course", "java", "core", "practice", "io", "Task10ExampleProgram"), "public", "private");
    }
}
