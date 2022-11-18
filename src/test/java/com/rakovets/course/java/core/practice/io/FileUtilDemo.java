package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilDemo {
    public static Path fileInput = Paths.get("src", "test", "resources", "practice.io", "testInput.txt");
    public static Path fileWithNumbers = Paths.get("src", "test", "resources", "practice.io", "numbers.txt");
    public static Path fileOutput = Paths.get("src", "test", "resources", "practice.io", "testOutput.txt");
    public static Path fileStudents = Paths.get("src", "test", "resources", "practice.io", "testStudents.txt");
    public static Path fileJavaCode = Paths.get("src", "test", "resources", "practice.io", "fileJavaCode.txt");
    public static String modifier = "public";
    public static String changeModifier = "private";

    public static void main(String[] args) {
        FileUtil testFile = new FileUtil();
        testFile.copyToUpperCase(fileInput, fileOutput);
        System.out.println(testFile.getLinesFromFile(fileInput));
        System.out.println(testFile.getWordsStartsWithVowel(fileInput));
        System.out.println(testFile.getWordsEndWithSameLetterNextWordStartWith(fileInput));
        System.out.println(testFile.getNumberCombination(fileWithNumbers));
        System.out.println(testFile.getLetterFrequency(fileInput));
        System.out.println(testFile.getSortedWordFrequency(fileInput));
        testFile.sortAndCopy(fileWithNumbers, fileOutput);
        System.out.println(testFile.getAverageMark(fileStudents));
        testFile.changeAccessModifier(fileJavaCode, fileOutput, modifier, changeModifier);
    }
}
