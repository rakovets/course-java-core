package com.rakovets.course.java.core.practice.io;

import java.io.IOException;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        String textFilePackage = "C:\\Users\\worce\\General\\home\\dev\\course-java-core" +
                "\\src\\main\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\files\\fileAnalyzeUtil-text";
        String nonSortedNumbersFilePackage = "C:\\Users\\worce\\General\\home\\dev\\course-java-core" +
                "\\src\\main\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\files\\" +
                "fileAnalyzeUtil-task-08-nonSortedNumbers";
        String sortedNumbersFilePackage = "C:\\Users\\worce\\General\\home\\dev\\course-java-core" +
                "\\src\\main\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\files\\" +
                "fileAnalyzeUtil-task-08-SortedNumbers";

        try {
            System.out.println(FileAnalyzeUtil.getTextListFromFile(textFilePackage));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getWordsListStartingWithVowelFromFile(textFilePackage));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getWordsListEndingWithLetterEqualFirstLetterOfNextWord(textFilePackage));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getLetterFrequency(textFilePackage));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getWordsFrequency(textFilePackage));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            FileAnalyzeUtil.sortNumbersFromFile(nonSortedNumbersFilePackage, sortedNumbersFilePackage);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
