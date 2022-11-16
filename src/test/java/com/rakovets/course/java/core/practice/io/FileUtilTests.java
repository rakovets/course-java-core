package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtilTests {
    private static FileUtil fileUtil;

    @BeforeAll
    static void initAll() {
        fileUtil = new FileUtil();
    }

    @Test
    public void testFileTextToUpperCase() throws IOException {
        String sourceFilename = Paths.get("src", "test", "resources", "practice.io", "task01.txt").toString();
        Path targetFilename = Paths.get("src", "test", "resources", "practice.io", "task01.txt_");
        String expected = "TEXT 1 TO TEST.";

        fileUtil.copyInUpperCase(sourceFilename, targetFilename.toString());
        String actual = String.join(" ", Files.readAllLines(targetFilename));

        Assertions.assertEquals(expected, actual);
    }
}
