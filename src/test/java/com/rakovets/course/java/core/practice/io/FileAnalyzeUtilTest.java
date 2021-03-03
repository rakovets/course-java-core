package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

class FileAnalyzeUtilTest {

    @Test
    void getFileList() {
        //Given
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Pink Floyd");
        expectedResult.add("Led Zepellin");
        expectedResult.add("Motley Crue");

        //When
        List<String> actualResult = FileAnalyzeUtil.getFileInList("src/main/resources/practice/getFile.txt");

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getFileWordStartWithVowelInList() {
        //Given
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("AMG");
        expectedResult.add("Audi");
        expectedResult.add("Alfa");
        expectedResult.add("Integrale");
        //When
        List<String> actualResult = FileAnalyzeUtil.getWordStartWithVowelInList
                ("src/main/resources/practice/getVowelWords.txt");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void getFileWordLastCharEqualFirstCharNextWord() {
        //Given
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("more");
        expectedResult.add("advantages");
        expectedResult.add("class");
        //When
        List<String> actualResult = FileAnalyzeUtil.getWordLastCharEqualFirstCharNextWord
                ("src/main/resources/practice/lastEqualFirst.txt");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getFileNumberAscend() {
        //Given
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("[1, 2, 3]");
        expectedResult.add("[67, 68, 69]");
        //When
        List<String> actualResult = FileAnalyzeUtil.getFileNumberAscend("src/main/resources/practice/number.txt");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getCharFrequency() {
        //Given
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 5);
        expectedResult.put("b", 3);
        expectedResult.put("c", 1);
        expectedResult.put("k", 4);
        expectedResult.put("f", 2);
        expectedResult.put("d", 1);
        //When
        Map<String, Integer> actualResult = FileAnalyzeUtil.getCharFrequency
                ("src/main/resources/practice/getCharFrequency.txt");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getWordFrequency() {
        //Given
        Map<String, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put("Java", 1);
        expectedResult.put("638", 1);
        expectedResult.put("634", 1);
        expectedResult.put("Jawa", 2);
        expectedResult.put("iCloud", 3);
        //When
        Map<String, Integer> actualResult = FileAnalyzeUtil.getWordFrequency
                ("src/main/resources/practice/wordFrequency.txt");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getIntFile() throws IOException {
        //Given
        String expectedResult = Files.readString(Path.of("src/main/resources/practice/expectedIntNumbersFile.txt"));
        //When
        FileAnalyzeUtil.getIntFile("src/main/resources/practice/integers.txt");
        String actualResult = Files.readString(Path.of("src/main/resources/practice/integers.txt_"));
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getStudentPerfomance() {
        //Given
        Map<String, String> expectedResult = new HashMap<>();
        expectedResult.put("Rotkevich", "7.14");
        expectedResult.put("Dunin", "7.12");
        expectedResult.put("Spit", "3.28");
        expectedResult.put("Sportsmen", "2.14");
        //When
        Map<String, String> actualResult = FileAnalyzeUtil.getStudentPerfomance
                ("src/main/resources/practice/studentsmarks.txt");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void changeJavaFileModifier() throws IOException {
        //Given
        String expectedResult = Files.readString(Path.of("src/main/resources/practice/expectedJavaModifierChanges.java_"));
        //When
        FileAnalyzeUtil.changeJavaFileModifier
                ("src/main/resources/practice/Computer.java", "public", "private");
        String actualResult = Files.readString(Path.of("src/main/resources/practice/Computer.java_"));
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
