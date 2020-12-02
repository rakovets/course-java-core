package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzeUtilTest {

    @Test
    void Task2() {
        List<String> list = Arrays.asList("Honcharuk", "Roman", "Viktorovich");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "String";
        Assertions.assertEquals(list, FileAnalyzeUtil.getStringsLine(pathFile));
    }

    @Test
    void Task3() {
        List<String> list = Arrays.asList("Adam", "inspector");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "Vowel";
        Assertions.assertEquals(list, FileAnalyzeUtil.getStringsVowel(pathFile));
    }

    @Test
    void Task4() {
        List<String> list = Arrays.asList("aca");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "Trace";
        Assertions.assertEquals(list, FileAnalyzeUtil.getStringsTrace(pathFile));
    }

    @Test
    void Task5() {
        List<String> list = Arrays.asList("7 9 23", "1 4", "1 2 3 5");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "Numbers";
        Assertions.assertEquals(list, FileAnalyzeUtil.getStringsNum(pathFile));
    }

    @Test
    void Task6() {
        List<String> list = Arrays.asList("a-4", "d-1", "e-3", "h-1", "i-2", "j-1", "k-1", "l-4", "m-3", "n-2", "o-3", "r-2", "v-1", "w-1", "y-1");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "Letters";
        Assertions.assertEquals(list, FileAnalyzeUtil.getRepeatLetters(pathFile));
    }

    @Test
    void Task7() {
        List<String> list = Arrays.asList("1-Hello", "1-I", "1-Java", "1-My", "1-Roman", "1-like", "1-name", "1-world");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "Letters";
        Assertions.assertEquals(list, FileAnalyzeUtil.getRepeatWord(pathFile));
    }

    @Test
    void Task8() {
        List<String> list = Arrays.asList("1", "2", "3");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "NumWrite";
        Assertions.assertEquals(list, FileAnalyzeUtil.getSortNum(pathFile));
    }
}


