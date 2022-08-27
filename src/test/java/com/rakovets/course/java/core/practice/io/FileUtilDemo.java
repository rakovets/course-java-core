package com.rakovets.course.java.core.practice.io;

import java.nio.file.Paths;

public class FileUtilDemo {
    public static void main(String[] args) {
        var fileUtil = new FileUtil();

        var first = Paths.get("src", "main", "resources", "text", "input.txt");
        var second = Paths.get("src", "main", "resources", "text", "output.txt");

        fileUtil.toUpperCase(first, second);
        System.out.println(fileUtil.getListStrings(first) + "\n");
        System.out.println(fileUtil.getListWordsStartWithVowel(first) + "\n");
        System.out.println(fileUtil.getListLastEqualsFirstLetters(first) + "\n");
    }
}
