package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        Path task02_03_06_07 = Paths.get("src", "main", "resources", "practice", "Task02_03_06_07");
        Path task04 = Paths.get("src", "main", "resources", "practice", "Task04");
        Path task08 = Paths.get("src", "main", "resources", "practice", "Task08");
        Path task09 = Paths.get("src", "main", "resources", "practice", "Task09");
        Path task10 = Paths.get("src", "main", "resources", "practice", "Task10");

        //test02
        System.out.println("List from file (task02) " +  FileAnalyzeUtil.getListFromFile(task02_03_06_07));
        //test03
        System.out.println("vowel words list (task03):" + FileAnalyzeUtil.getWordStarVowelLetter(task02_03_06_07));
        //test04
        System.out.println("Words ends and starts with one letter (task04): " + FileAnalyzeUtil.getWordStartWithAndEndWithOneLetter(task04));
        //test06
        System.out.println("Letters repetition count (task06): " + FileAnalyzeUtil.getCountRepitingLetters(task02_03_06_07));
        //test07
        System.out.println("Words repetition count (task07): " + FileAnalyzeUtil.getCountRepitingWords(task02_03_06_07));
        //test08
        FileAnalyzeUtil.getSortedNumbersInFile(task08);
        //test09
        System.out.println(FileAnalyzeUtil.getStudentsProgress(task09));
        //test10
        FileAnalyzeUtil.getChangeModifier(task10.toString() ,"public","private");



    }
}
