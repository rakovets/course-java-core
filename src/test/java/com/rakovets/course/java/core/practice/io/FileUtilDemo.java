package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_util.FileUtil;

import java.nio.file.Path;

public class FileUtilDemo {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        Path inputFilePath = Path.of("text_files", "text.txt");
        Path outputFilePath = Path.of("text_files", "textcopy.txt");
        Path numbersFilePath = Path.of("text_files", "numbers.txt");
        Path studentsFilePath = Path.of("text_files", "studentsProgress.txt");
        Path codeFilePath = Path.of("text_files", "javacode.txt");
        System.out.println("Task1");
        fileUtil.rewriteOneFileToAnother(inputFilePath, outputFilePath);
        System.out.println("\n Task2");
        System.out.println(fileUtil.getListOfStrings(inputFilePath));
        System.out.println("\n Task3");
        System.out.println(fileUtil.getWordsStartsWithVowel(inputFilePath));
        System.out.println("\n Task4");
        System.out.println(fileUtil.getWordsFirstCharEqualLastCharNextWord(inputFilePath));
        System.out.println("\n Task6");
        System.out.println(fileUtil.getAllLettersFrequency(inputFilePath));
        System.out.println("\n Task7");
        System.out.println(fileUtil.getWordsFrequency(inputFilePath));
        System.out.println("\n Task8");
        fileUtil.writeSortedNumbers(numbersFilePath);
        System.out.println("\n Task9");
        System.out.println(fileUtil.getStudentProgress(studentsFilePath));
        System.out.println("\n Task10");
        fileUtil.changeAccess(codeFilePath, "public", "private");
    }
}
