package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzerDemo {
    public static void main(String[] args) {

        Path task2 = Paths.get("src", "main", "resources", "task2");
        Path task3 = Paths.get("src", "main", "resources", "task3");
        Path task4 = Paths.get("src", "main", "resources", "task4");
        System.out.println(FileAnalyzerUtil.getListOfStrings(task2));
        System.out.println(FileAnalyzerUtil.getWordStartsWithVowel(task3));
        System.out.println(FileAnalyzerUtil.getListOfWordsWithSameLastAndFirstLetters(task4));
    }
}
