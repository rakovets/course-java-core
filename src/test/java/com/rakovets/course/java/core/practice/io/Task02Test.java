package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task02Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void testFileTextToUpperCase() {
        String pathToFile = "C:\\MyDir\\task02.txt";

        List<String> stringList = fileUtil.getStringListFromFile(pathToFile);
        String[] array = new String[stringList.size()];
        stringList.toArray(array);
        String actual = String.join("", array);
        String expected = "Text 1." + "Text 2." + "Text 3.";

        Assertions.assertEquals(expected, actual);
    }
}
