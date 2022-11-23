package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;

public class FileUtilDemo {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        String path = args[0];
        Path file1 = Path.of(path, "textIN.txt");
        Path file2 = Path.of(path, "textOut.txt");
        Path numbers = Path.of(path, "numbers.txt");
        Path studentsMarks = Path.of(path, "studentsMarks.txt");
        Path fileJava = Path.of(path, "File.java");
        fileUtil.makeUpperCase(file1, file2);
        System.out.println(fileUtil.getListLines(file1));
        System.out.println(fileUtil.getWordsStartingWithVowel(file1));
        System.out.println(fileUtil.getWordsLastLetterMatchesFirst(file1));
        System.out.println(fileUtil.getListLargestCombinationOfDigitsInAscendingOrder(numbers));
        System.out.println(fileUtil.getAllLettersInTextIgnoreCase(file1));
        System.out.println(fileUtil.getAllWordsInText(file1));
        fileUtil.getSortedNumbers(numbers);
        System.out.println(fileUtil.getStudentsMarks(studentsMarks));
        fileUtil.replace(fileJava, "public", "private");
    }
}
