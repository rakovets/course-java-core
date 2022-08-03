package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FileUtilTest {
    private final static String DIRECTORY_PATH = "files" + File.separator;
    private final FileUtil fileUtil = new FileUtil();

    @AfterEach
    public void setUp() {
        overwriteTextInFile(DIRECTORY_PATH + "text", "Java\nGit\nJava\nArray");
        overwriteTextInFile(DIRECTORY_PATH + "numbers", "0 -15 -15\n5 25 6");
        overwriteTextInFile(DIRECTORY_PATH + "filewithjavacode",
                "public class Tv {\n" +
                        "private final String manufacturer;" +
                        "\nprivate final String model;\n}");
        File file1 = new File(DIRECTORY_PATH + "numbers_");
        file1.delete();
        File file2 = new File(DIRECTORY_PATH + "filewithjavacode_");
        file2.delete();
        File file3 = new File(DIRECTORY_PATH + "filetochange");
        file3.delete();
    }

    @Test
    void testOverwriteFileContentUpperCase() {
        List<String> expected = List.of("GIT");

        fileUtil.overwriteFileContentInUpperCase
                (DIRECTORY_PATH + "text", DIRECTORY_PATH + "fortextreplacement");
        List<String> actual = fileUtil.getListOfString(DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverwriteFileContentUpperCaseNotExistInputFile() {
        Assertions.assertThrows(FileNotExistException.class,
                () -> fileUtil.overwriteFileContentInUpperCase(DIRECTORY_PATH + "text",
                        DIRECTORY_PATH + "r"));
    }

    @Test
    void testOverwriteFileContentUpperCaseNotExistFileToChange() {
        List<String> expected = List.of("GIT");

        fileUtil.overwriteFileContentInUpperCase(DIRECTORY_PATH + "filetochange",
                DIRECTORY_PATH + "fortextreplacement");
        List<String> actual = fileUtil.getListOfString(DIRECTORY_PATH + "filetochange");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetListOfString() {
        List<String> expected = List.of("Java", "Git", "Java", "Array");

        List<String> actual = fileUtil.getListOfString(DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetListOfStringFileNotExist() {
        Assertions.assertThrows(FileNotExistException.class,
                () -> fileUtil.getListOfString(DIRECTORY_PATH + "r"));
    }

    @Test
    void testGetListOfWordsStartsWithVowelInLowerCase() {
        List<String> expected = List.of("array");

        List<String> actual = fileUtil.getListOfWordsStartsWithVowelInLowerCase(DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetListOfWordsStartsWithVowelDifferentPunctuation() {
        overwriteTextInFile(DIRECTORY_PATH + "text", "Java,!!!\nGit,&\nJava^^^\nArray");
        List<String> expected = List.of("array");

        List<String> actual = fileUtil.getListOfWordsStartsWithVowelInLowerCase(DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetListOfWordsStartsWithVowelNoWord() {
        overwriteTextInFile(DIRECTORY_PATH + "text", "Git");
        List<String> expected = Collections.emptyList();

        List<String> actual = fileUtil.getListOfWordsStartsWithVowelInLowerCase(DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetListWordLastLetterEqualsFirstLetterNextWordCaseIgnore() {
        List<String> expected = List.of("java");

        List<String> actual = fileUtil.getListWordLastLetterEqualsFirstLetterNextWordCaseIgnore
                (DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetListWordLastLetterEqualsFirstLetterNextWordCaseIgnoreNoWord() {
        overwriteTextInFile(DIRECTORY_PATH + "text", "Git\ngit");
        List<String> expected = Collections.emptyList();

        List<String> actual = fileUtil.getListWordLastLetterEqualsFirstLetterNextWordCaseIgnore
                (DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumbersInTextAscending() {
        List<String> expected = Arrays.asList("-15 -15 0", "5 6 25");

        List<String> actual = fileUtil.getNumbersInTextAscendingInEveryString(DIRECTORY_PATH + "numbers");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumbersInTextAscendingWithPunctuation() {
        overwriteTextInFile(DIRECTORY_PATH + "numbers", "-4,3,2\n-5!10");
        List<String> expected = Arrays.asList("-4 2 3", "-5 10");

        List<String> actual = fileUtil.getNumbersInTextAscendingInEveryString(DIRECTORY_PATH + "numbers");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetWordsFrequencyIgnoreCase() {
        Map<String, Long> expected = Map.of("java", 2L, "git", 1L, "array", 1L);

        Map<String, Long> actual = fileUtil.getWordsFrequencyIgnoreCase(DIRECTORY_PATH + "text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRewriteSortedNumbersFromFileTo() {
        List<String> expected = List.of("-15", "-15", "0", "5", "6", "25");

        fileUtil.rewriteSortedNumbersFromFileTo(DIRECTORY_PATH + "numbers", DIRECTORY_PATH + "numbers_");
        List<String> actual = fileUtil.getListOfString(DIRECTORY_PATH + "numbers_");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetStudentAchievement() {
        Map<String, Double> expected = Map.of("Ivanov", 4.5, "Petrov", 4.75, "Sidorov", 7.75);

        Map<String, Double> actual = fileUtil.getStudentAchievement(DIRECTORY_PATH + "students");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testChangeAccessModifierSaveResultToFile() {
        List<String> expected = List.of("public class Tv {", "protected final String manufacturer;",
                "protected final String model;", "}");

        fileUtil.changeAccessModifierSaveToFile(DIRECTORY_PATH + "filewithjavacode", "private",
                "protected", DIRECTORY_PATH + "filewithjavacode_");
        List<String> actual = fileUtil.getListOfString(DIRECTORY_PATH + "filewithjavacode_");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testChangeAccessModifierSaveResultToFileNotChangeClassModifier() {
        overwriteTextInFile(DIRECTORY_PATH + "filewithjavacode",
                "public class Tv {\n" +
                        "public final String manufacturer;" +
                        "\npublic final String model;\n}");

        List<String> expected = List.of("public class Tv {", "private final String manufacturer;",
                "private final String model;", "}");

        fileUtil.changeAccessModifierSaveToFile(DIRECTORY_PATH + "filewithjavacode", "public",
                "private", DIRECTORY_PATH + "filewithjavacode_");
        List<String> actual = fileUtil.getListOfString(DIRECTORY_PATH + "filewithjavacode_");

        Assertions.assertEquals(expected, actual);
    }

    private void overwriteTextInFile(String inputPath, String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputPath))) {
            bufferedWriter.write(text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
