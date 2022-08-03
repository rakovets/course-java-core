package com.rakovets.course.java.core.practice.io;

import java.io.IOException;
import java.nio.file.Path;

public class FileUtilDemo {
    public static void main(String[] args) throws IOException {
        var fileUtil = new FileUtil();

        System.out.println("Task 1.");
        fileUtil.toUpperCase(
                Path.of("resources", "text", "poem.txt"),
                Path.of("resources", "text", "poem2.txt"));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Task 8");
        fileUtil.test(Path.of("resources", "text", "numbers.txt"));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Task 10");
        fileUtil.replace(
                Path.of("resources", "text", "FileUtil.java"),
                Path.of("resources", "text", "FileUtil.txt"), "public", "private");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
