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
    private final FileUtil fileUtil = new FileUtil();

    @AfterEach
    public void setUp() {
        overwriteTextInFile("./text","Java\nGit\nJava\nArray");
        overwriteTextInFile("./numbers","5 15 25\n6 24 75");

        File file1 = new File("./numbers_");
        if (file1.exists()) {
            file1.delete();
        }

        File file2 = new File("./filewithjavacode_");
        if (file2.exists()) {
            file2.delete();
        }

    }

    @Test
    public void testOverwriteFileContentUpperCase() {
        List<String> expected = List.of("GIT");

        fileUtil.overwriteFileContentInUpperCase("./text", "./fortextreplacement");
        List<String> actual = fileUtil.getListOfString("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOverwriteFileContentUpperCaseNotExistInputFile() {
        Assertions.assertThrows(FileNotExistException.class,
                () -> fileUtil.overwriteFileContentInUpperCase("./text", "./r"));
    }

    @Test
    public void testGetListOfString() {
        List<String> expected = List.of("Java", "Git", "Java", "Array");

        List<String> actual = fileUtil.getListOfString("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfStringFileNotExist() {
        Assertions.assertThrows(FileNotExistException.class,
                () -> fileUtil.getListOfString("./r"));
    }

    @Test
    public void testGetListOfWordsStartsWithVowelInLowerCase() {
        List<String> expected = List.of("array");

        List<String> actual = fileUtil.getListOfWordsStartsWithVowelInLowerCase("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfWordsStartsWithVowelDifferentPunctuation() {
        overwriteTextInFile("./text","Java,!!!\nGit,&\nJava^^^\nArray");
        List<String> expected = List.of("array");

        List<String> actual = fileUtil.getListOfWordsStartsWithVowelInLowerCase("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfWordsStartsWithVowelNoWord() {
        overwriteTextInFile("./text","Git");
        List<String> expected = Collections.emptyList();

        List<String> actual = fileUtil.getListOfWordsStartsWithVowelInLowerCase("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetListWordLastLetterEqualsFirstLetterNextCaseIgnore() {
        List<String> expected = List.of("java");

        List<String> actual = fileUtil.getListWordLastLetterEqualsFirstLetterNextCaseIgnore("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetListWordLastLetterEqualsFirstLetterNextCaseIgnoreNoWord() {
        overwriteTextInFile("./text","Git\ngit");
        List<String> expected = Collections.emptyList();

        List<String> actual = fileUtil.getListWordLastLetterEqualsFirstLetterNextCaseIgnore("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumbersInTextAscending() {
        List<String> expected = Arrays.asList("5 15 25","6 24 75");

        List<String> actual = fileUtil.getNumbersInTextAscendingInEveryString("./numbers");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumbersInTextAscendingWithPunctuation() {
        overwriteTextInFile("./numbers","4,3,2\n5!10");
        List<String> expected = Arrays.asList("2 3 4","5 10");

        List<String> actual = fileUtil.getNumbersInTextAscendingInEveryString("./numbers");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetWordsFrequencyIgnoreCase() {
        Map<String, Long> expected = Map.of("java", 2L, "git", 1L, "array", 1L);

        Map<String, Long> actual = fileUtil.getWordsFrequencyIgnoreCase("./text");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRewriteSortedNumbersFromFileTo() {
        List<String> expected = List.of("5", "6", "15", "24", "25", "75");

        fileUtil.rewriteSortedNumbersFromFileTo("./numbers", "./numbers_");
        List<String> actual = fileUtil.getListOfString("./numbers_");

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testRewriteSortedNumbersFromFileToFileExist() {
//        Assertions.assertThrows(FileExistsException.class,
//                ()->fileUtil.rewriteSortedNumbersFromFileTo("./numbers", "./text"));
//    }
    @Test
    public void testGetStudentAchievement() {
        Map<String, Double> expected = Map.of("Ivanov", 4.5, "Petrov", 4.75, "Sidorov", 7.75);

        Map<String, Double> actual = fileUtil.getStudentAchievement("./students");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeAccessModifierSaveResultToFil() {

        List<String> expected = List.of("public class Tv {", "protected final String manufacturer;",
                "protected final String model;", "}");

        fileUtil.changeAccessModifierSaveResultToFile("./filewithjavacode", "private",
                "protected", "./filewithjavacode_");
        List<String> actual = fileUtil.getListOfString("./filewithjavacode_");

        Assertions.assertEquals(expected, actual);
    }

    private void overwriteTextInFile(String fileNamePath, String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNamePath))) {
            bufferedWriter.write(text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
