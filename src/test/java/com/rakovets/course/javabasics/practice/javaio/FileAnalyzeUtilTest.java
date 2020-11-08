package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FileAnalyzeUtilTest {

    @Test
    void Task1() {
//        String sep = File.separator;
//        String pathFile = "src" + sep + "test" + sep + "io" + sep + "String.txt";
        String pathFile = "C/home/git/course-java-basics/scr/test/io/String.txt";
        Assertions.assertEquals("123", FileAnalyzeUtil.getStrings(pathFile));
    }

}
