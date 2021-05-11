package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        Path task02 = Paths.get("src", "main", "resources", "task02");
        Path task03 = Paths.get("src", "main", "resources", "task03");
        Path task04 = Paths.get("src", "main", "resources", "task04");
        Path task05 = Paths.get("src", "main", "resources", "task05");
        Path task06 = Paths.get("src", "main", "resources", "task06");
        Path task07 = Paths.get("src", "main", "resources", "task07");
        Path task08 = Paths.get("src", "main", "resources", "task08");
        Path task09 = Paths.get("src", "main", "resources", "task09");
        Path task10 = Paths.get("src", "main", "resources", "task10");
        System.out.println(FileAnalyzeUtil.getListOfStringFromFile(task02));
        System.out.println(FileAnalyzeUtil.getListOfWordsStartWithVowelLetterFromFile(task03));
        System.out.println(FileAnalyzeUtil.getListOfWordsEndsWithTheFirstLetterOfTheNextWord(task04));
        System.out.println(FileAnalyzeUtil.getLargestAscendingNumbersOrder(task05));
        System.out.println(FileAnalyzeUtil.getQuantityOfCharsRepeating(task06));
        System.out.println(FileAnalyzeUtil.getQuantityOfWordsRepeating(task07));
        FileAnalyzeUtil.getSortedNubersOrder(task08);
        System.out.println(FileAnalyzeUtil.getStudentsRate(task09));
        FileAnalyzeUtil.changeModificator(task10, "public", "private");
    }
}
