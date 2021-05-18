package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_analyzer.FileAnalyzeUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main (String[] args) {
        Path task5 = Paths.get("src", "main", "resources", "practice", "task5");
        Path task7 = Paths.get("src", "main", "resources", "practice", "task7");
        Path task9 = Paths.get("src", "main", "resources", "practice", "task9");
        Path task4 = Paths.get("src", "main", "resources", "practice", "task4");
        Path task6 = Paths.get("src", "main", "resources", "practice", "task6");
        Path task3 = Paths.get("src", "main", "resources", "practice", "task3");
        Path task8 = Paths.get("src", "main", "resources", "practice", "task8");
        Path task8_ = Paths.get("src", "main", "resources", "practice", "task8v1");
        Path task10 = Paths.get("src", "main", "resources", "practice", "task10");
        System.out.println(FileAnalyzeUtil.getListOfFile(task5));
        System.out.println((FileAnalyzeUtil.getMaxCombination(task5)));
        System.out.println(FileAnalyzeUtil.getListWithVowelOfFile(task3));
        System.out.println(FileAnalyzeUtil.getWordFrequency(task7));
        System.out.println(FileAnalyzeUtil.getStudentPerfomance(task9));
        System.out.println(FileAnalyzeUtil.getListOfPolindromeLetter(task4));
        System.out.println(FileAnalyzeUtil.getCountLetter(task6));
        FileAnalyzeUtil.getIntFile(task8);
        System.out.println(FileAnalyzeUtil.getListOfFile(task8_));
        FileAnalyzeUtil.changeJavaFileModifier(task10,"public","private");
    }
}
