package com.rakovets.course.java.core.practice.io;

import java.io.IOException;
import java.nio.file.Path;

public class FileUtilDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 1.");
        var fileUtil = new FileUtil();
        var firsts = Path.of("resources", "text", "poem.txt");
        var second = Path.of("resources", "text", "poem2.txt");
        fileUtil.toUpperCase(firsts, second);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Task 10");
        Path firstPath = Path.of("resources", "text", "FileUtil.java");
        Path secondPath = Path.of("resources", "text", "FileUtil.txt");
        fileUtil.replace(firstPath, secondPath, "public", "private");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
