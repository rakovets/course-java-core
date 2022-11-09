package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task04Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void testGetStringListOfWordsEndsWithLetterNextWordStatsFromFile() {
        String pathToFile = "C:\\MyDir\\task04.txt";

        List<String> stringList = fileUtil.getStringListOfWordsEndsWithLetterNextWordStatsFromFile(pathToFile);
        String[] array = new String[stringList.size()];
        stringList.toArray(array);
        String actual = String.join("", array);
        String expected = "Any" + "ust" + "ako";

        Assertions.assertEquals(expected, actual);
    }
}
