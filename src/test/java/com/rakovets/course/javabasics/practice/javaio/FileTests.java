package com.rakovets.course.javabasics.practice.javaio;

import com.rakovets.course.javabasics.practice.javaio.fileutil.FileAnalyzeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class FileTests {
    final String path1 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\test\\Test1.txt";
    final String path2 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\test\\Test2.txt";
    final String path3 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\test\\Test3";

    @Test
    void getRowsFromFileToStringTest() throws IOException {
        LinkedList<String> expcetedResult = new LinkedList<>();
        expcetedResult.add("Test One");
        expcetedResult.add("Row 2");
        expcetedResult.add("Row 3");
        expcetedResult.add("Row 4");
        LinkedList<String> actualResult = FileAnalyzeUtil.getRowsFromFileToString(path1);
        Assertions.assertEquals(expcetedResult, actualResult);
    }

    @Test
    void getWordsStartWithVowelsTest() throws IOException {
        LinkedList<String> expcetedResult = new LinkedList<>();
        expcetedResult.add("up");
        expcetedResult.add("on");
        expcetedResult.add("and");
        expcetedResult.add("your");
        expcetedResult.add("It");
        expcetedResult.add("and");
        LinkedList<String> actualResult = FileAnalyzeUtil.getWordsStartWithVowels(path2);
        Assertions.assertEquals(expcetedResult, actualResult);
    }

    @Test
    void getWordsLastFirstEqualsTest() throws IOException {
        LinkedList<String> expcetedResult = new LinkedList<>();
        expcetedResult.add("to");
        expcetedResult.add("open");
        expcetedResult.add("and");
        expcetedResult.add("walk");
        LinkedList<String> actualResult = FileAnalyzeUtil.getWordsLastFirstEquals(path3);
        Assertions.assertEquals(expcetedResult, actualResult);
    }

    @Test
    void getCountOfSimbolsTest() throws IOException {
        HashMap<String, Integer> expcetedResult = new HashMap<>();
        expcetedResult.put("r", 3);
        expcetedResult.put("s", 1);
        expcetedResult.put("t", 2);
        expcetedResult.put("e", 2);
        expcetedResult.put("w", 3);
        expcetedResult.put("n", 1);
        expcetedResult.put("o", 4);
        HashMap<String, Integer> actualResult = FileAnalyzeUtil.getCountOfSimbols(path1);
        Assertions.assertEquals(expcetedResult, actualResult);
    }
}
