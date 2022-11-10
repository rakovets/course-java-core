package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task09Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void testGetNameAndAverageMarksFromFile() {
        String pathToFile = "C:\\MyDir\\task09.txt";

        List<String> stringList = fileUtil.getNameAndAverageMarksFromFile(pathToFile);
        String[] arrayActual = new String[stringList.size()];
        stringList.toArray(arrayActual);
        String[] arrayExpected = new String[3];
        arrayExpected[0] = "Ivanov, average mark: 4.5\n";
        arrayExpected[1] = "Petrov, average mark: 5.5\n";
        arrayExpected[2] = "Sidorov, average mark: 6.5\n";
        String actual = String.join(" ", arrayActual);
        String expected = String.join(" ", arrayExpected);

        Assertions.assertEquals(expected, actual);
    }
}
