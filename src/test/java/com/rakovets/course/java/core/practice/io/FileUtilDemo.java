package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_util.FileUtil;

import java.nio.file.Path;

public class FileUtilDemo {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        Path inputFilePath = Path.of("D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.io", "text.txt");
        Path outputFilePath = Path.of("D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.io", "textcopy.txt");
        Path numbersFilePath = Path.of("D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.io", "numbers.txt");
        Path numbers5FilePath = Path.of("D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.io", "numbers5.txt");
        Path studentsFilePath = Path.of("D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.io", "studentsProgress.txt");
        Path codeFilePath = Path.of("D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.io", "javacode.txt");
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
        System.out.println(fileUtil.getWordsFrequency(inputFilePath));
        System.out.println("\n Task 8");
        fileUtil.writeSortedNumbers(numbersFilePath);
        System.out.println("\n Task 9");
        System.out.println(fileUtil.getStudentProgress(studentsFilePath));
        System.out.println("\n Task 10");
        fileUtil.changeAccess(codeFilePath, "public", "private");
    }
}
