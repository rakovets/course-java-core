package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzeUtilTest {

    @Test
    void Task1() {
        List<String> list = Arrays.asList("Honcharuk", "Roman", "Viktorovich");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "String";
        Assertions.assertEquals(list, FileAnalyzeUtil.getStringsLine(pathFile));
    }

    @Test
    void Task2() {
        List<String> list = Arrays.asList("Adam", "inspector");
        String sep = File.separator;
        String pathFile = "src" + sep + "test" + sep + "io" + sep + "Vowel";
        Assertions.assertEquals(list, FileAnalyzeUtil.getStringsVowel(pathFile));
    }
}


