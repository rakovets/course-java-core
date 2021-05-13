package com.rakovets.course.java.core.practice.io;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        Path task02 = Paths.get("src", "main", "resources", "practice", "task02");
        Path task03 = Paths.get("src","main", "resources", "practice", "task03");
        Path task04 = Paths.get("src","main", "resources", "practice", "task04");
        Path task06 = Paths.get("src","main", "resources", "practice", "task06");
        Path task07 = Paths.get("src","main", "resources", "practice", "task07");
        Path task08 = Paths.get("src","main", "resources", "practice", "task08");
        Path task09 = Paths.get("src","main", "resources", "practice", "task09");
        Path task10 = Paths.get("src","main", "resources", "practice", "task10");


        System.out.println(FileAnalyzeUtil.getFileWithStringsLine(task02));
        System.out.println(FileAnalyzeUtil.getFileWithWordsStartVowelLetter(task03));
        System.out.println(FileAnalyzeUtil.getFileWithMatchingLettersInWords(task04));
        System.out.println(FileAnalyzeUtil.getNumberOfAllRepeatedLettersInFile(task06));
        System.out.println(FileAnalyzeUtil.getNumberOfAllRepeatedWordsInFile(task07));
        FileAnalyzeUtil.getSortedNumbersInFile(task08);
        System.out.println(FileAnalyzeUtil.getProgressOfStudents(task09));
        FileAnalyzeUtil.getReplaceModifier(task10.toString(),"public","private");

    }
}
