package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task05Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void testGetOnlyIncreasingValuesfromFile() {
        String pathToFile = "C:\\MyDir\\task05.txt";

        List<String> stringList = fileUtil.getOnlyIncreasingValuesfromFile(pathToFile);
        String[] array = new String[stringList.size()];
        stringList.toArray(array);
        String actual = String.join(" ", array);
        String expected = "1" + " " + "2" + " " + "66" + " " + "67" + " " + "68" + " " + "69" + " " + "101";

        Assertions.assertEquals(expected, actual);
    }
}
