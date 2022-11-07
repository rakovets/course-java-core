package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task01Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void testFileTextToUpperCase() {
        String fileNameFirst = "C:\\MyDir\\task01.txt";
        String fileNameSecond = "C:\\MyDir\\task01_UpperCase.txt";
        String textInFirstFile = "Text 1 To Test.";
        String textExpected = "TEXT 1 TO TEST.";
        List<String> stringList = new ArrayList<>();

        fileUtil.fileTextToUpperCase(fileNameFirst, fileNameSecond);
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\MyDir\\task01_UpperCase.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка операции ввода-вывода");
        }
        String[] array = new String[stringList.size()];
        stringList.toArray(array);
        String actual = String.join("", array);

        Assertions.assertEquals(textExpected, actual);
    }
}
