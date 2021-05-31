package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        Path task02 = Paths.get("src", "main", "resources", "Task02");
        Path task03 = Paths.get("src", "main", "resources", "Task03");
        Path task04 = Paths.get("src", "main", "resources", "Task04");
        Path task05 = Paths.get("src", "main", "resources", "Task05");
        Path task06 = Paths.get("src", "main", "resources", "Task06");
        Path task07 = Paths.get("src", "main", "resources", "Task07");
        Path task08 = Paths.get("src", "main", "resources", "Task08");
        Path task09 = Paths.get("src", "main", "resources", "Task09");
        Path task10 = Paths.get("src", "main", "resources", "Task10");

        System.out.println(FileAnalyzeUtil.getListOfStrings(task02));
        System.out.println(FileAnalyzeUtil.getListOfWordsWithVowel(task03));
        System.out.println(FileAnalyzeUtil.getLastLetterOfPreviousWordAndFirstLetterOfNextWordMatchUp(task04));
        System.out.println(FileAnalyzeUtil.getCharFrequency(task06));
        FileAnalyzeUtil.getSortedStringFrequency(task07);
        FileAnalyzeUtil.writeSortedNumberInOriginalFile(task08);
        System.out.println(FileAnalyzeUtil.getStudentPerformance(task09));
        FileAnalyzeUtil.changeModifier(task10, "public", "privat");
    }
}
