package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Task07Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void getFrequencyOfUniqueWordsFromFile() {
        String pathToFile = "C:\\MyDir\\task07.txt";

        Map uniqueWordsFrequency = fileUtil.getFrequencyOfUniqueWordsFromFile(pathToFile);
        String actual = uniqueWordsFrequency.entrySet().toString();
        String expected = "[op=1, gy=1, ako=1, yo=1, ust=1, ooy=1, ide=1, Any=1, any=2, text=3]";

        Assertions.assertEquals(expected, actual);
    }
}
