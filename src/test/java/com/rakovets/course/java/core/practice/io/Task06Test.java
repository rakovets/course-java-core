package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Task06Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void testGetUniqueLettersFromFileAndCountThem() {
        String pathToFile = "C:\\MyDir\\task06.txt";

        Map<Character, Integer> uniqueLetters = fileUtil.getUniqueLettersFromFileAndCountThem(pathToFile);
        String actual = uniqueLetters.entrySet().toString();
        String expected = "[a=3, d=1, e=4, g=1, i=1, k=1, n=2, o=5, p=1, s=1, t=7, u=1, x=3, y=5]";

        Assertions.assertEquals(expected, actual);
    }
}
