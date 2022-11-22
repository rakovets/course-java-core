package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilDemo {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        Path filePath = Paths.get("src", "test", "resources", "practice.io");
        Path inputFilePath = Paths.get(filePath.toString(), "text.txt");
        Path outputFilePath = Paths.get(filePath.toString(), "textcopy.txt");
        Path numbersFilePath = Paths.get(filePath.toString(), "numbers.txt");
        Path numbers5FilePath = Paths.get(filePath.toString(), "numbers5.txt");
        Path studentsFilePath = Paths.get(filePath.toString(), "studentsProgress.txt");
        Path codeFilePath = Paths.get(filePath.toString(), "javacode.txt");
        System.out.println("Task 1");
        fileUtil.rewriteOneFileToAnother(inputFilePath, outputFilePath);
        System.out.println("\n Task 2");
        System.out.println(fileUtil.getListOfStrings(inputFilePath));
        System.out.println("\n Task 3");
        System.out.println(fileUtil.getWordsStartsWithVowel(inputFilePath));
        System.out.println("\n Task 4");
        System.out.println(fileUtil.getWordsFirstCharEqualLastCharNextWord(inputFilePath));
        System.out.println("\n Task 5");
        System.out.println(fileUtil.getListOfLargestNumberCombination(numbers5FilePath));
        System.out.println("\n Task 6");
        System.out.println(fileUtil.getAllLettersFrequency(inputFilePath));
        System.out.println("\n Task 7");
        System.out.println(fileUtil.getAscendingSortedWordsFrequency(codeFilePath));
        System.out.println("\n Task 8");
        fileUtil.writeAscendingSortedNumbers(numbersFilePath, "_");
        System.out.println("\n Task 9");
        System.out.println(fileUtil.getStudentProgress(studentsFilePath));
        System.out.println("\n Task 10");
        fileUtil.changeAccess(codeFilePath, "public", "private");
    }
}
