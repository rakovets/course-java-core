package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class FileUtilTest {
    FileUtil fileUtil = new FileUtil();

    @AfterEach
    public void setUp() {
        try (FileWriter fileWriter = new FileWriter("file1");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Java\nGit\nJava\nArray");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    @Test
    public void testOverwriteFileContentUpperCase() {
        List <String> expected = List.of("GIT");

        fileUtil.overwriteFileContentUpperCase("file1", "file2");
        List <String> actual = fileUtil.getListOfString("file1");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfString() {
        List<String> expected = List.of("Java", "Git", "Java");

        List<String> actual = fileUtil.getListOfString("file1");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfWordsStartsWithVowelInLowerCase() {
        List<String> expected = List.of("array");

        List<String> actual = fileUtil.getListOfWordsStartsWithVowelInLowerCase("file1");

        Assertions.assertEquals(expected, actual);
    }
}
