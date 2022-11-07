package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task03Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void testGetStringListOfWordsStartingWithVowelsFromFile() {
        String pathToFile = "C:\\MyDir\\task03.txt";

        List<String> stringList = fileUtil.getStringListOfWordsStartingWithVowelsFromFile(pathToFile);
        String[] array = new String[stringList.size()];
        stringList.toArray(array);
        String actual = String.join("", array);
        String expected = "Any" + "any" + "ooy" + "ide" + "usw" + "ak" + "op";

        Assertions.assertEquals(expected, actual);
    }
}
