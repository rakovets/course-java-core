package com.rakovets.course.java.core.practice.io;

import java.io.IOException;
import java.nio.file.Path;

import static java.lang.System.out;

public class FileUtilDemo {
    public static void main(String[] args) throws IOException {
        out.println("Task 1.");
        FileUtil fileUtil = new FileUtil();
        Path firsts = Path.of("resources", "text", "poem.txt");
        Path second = Path.of("resources", "text", "poem2.txt");
        fileUtil.toUpperCase(firsts, second);
        out.println("------------------------------------------------------------------------------------------------");
    }
}
