package com.rakovets.course.java.core.practice.io;

import java.nio.file.Paths;

public class FileUtilDemo {
    public static void main(String[] args) {
        var fileUtil = new FileUtil();
        var fileUtilN = new FileUtil();

        var firsts = Paths.get("src", "main", "resources", "text", "original.txt");
        var second = Paths.get("src", "main", "resources", "text", "redoneFile.txt");
        var filePath = Paths.get("src", "main", "resources", "text", "originalnumbers.txt");

        fileUtil.toUpperCase(firsts, second);
        System.out.println(fileUtil.getListStringsOfFilePath(firsts) + "\n");
        System.out.println(fileUtil.getListWordsStartWithVowel(firsts) + "\n");
        System.out.println(fileUtil.getListLastEqualsFirstLetters(firsts) + "\n");
        System.out.println(fileUtil.getFrequencyUsedLetter(firsts) + "\n");
        System.out.println(fileUtil.getFrequencyUsedWorld(firsts) + "\n");
        System.out.println(fileUtilN.getListNumbers(filePath) + "\n");
        fileUtilN.sortedAndWriteNumbers(filePath);
    }
}
