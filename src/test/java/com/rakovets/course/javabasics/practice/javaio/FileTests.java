package com.rakovets.course.javabasics.practice.javaio;

import com.rakovets.course.javabasics.practice.javaio.fileutil.FileAnalyzeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedList;

public class FileTests {
    final String path1 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\test\\Test1.txt";
    final String path2 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\test\\Test2.txt";

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
}
