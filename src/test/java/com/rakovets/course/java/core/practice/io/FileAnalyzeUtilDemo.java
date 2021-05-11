package com.rakovets.course.java.core.practice.io;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {

        Path userPropertiesPath = Paths.get( "src", "test", "resources", "practice.io", "account.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(userPropertiesPath.toFile())) {
            p.load(reader);
        } catch (IOException ex) {
            System.out.println("There is a problem with writing path for properties");
        }

        String filePath = p.getProperty("filePathToWriting");
        String filePathWithSequenceOfNumbers = p.getProperty("filePathWithSequenceOfNumbers");
        String filePathWithSequenceOfWords = p.getProperty("filePathWithSequenceOfWords");
        String filePathToReadNumbers = p.getProperty("filePathToReadingNumbers");
        String filePathToWriteNumbers = p.getProperty("filePathToWritingNumbers");
        String fileWithMarksOfStudents  = p.getProperty("fileWithMarksOfStudents");

        System.out.println("This is a list of strings:");
        List<String> listWithStrings = FileAnalyzeUtil.getListOfFileStrings(filePath);
        printList(listWithStrings);

        System.out.println("\nThis is a list of words starting with vowels:");
        List<String> listWithWordsStartingWithVowels = FileAnalyzeUtil.getWordsStartingWithVowels(filePath);
        printList(listWithWordsStartingWithVowels);

        System.out.println("\nThis is a list of words that end with the letter the next word begins with:");
        List<String> list = FileAnalyzeUtil.getListOfWordsLastLitterSameWithFirstLitterNextWord(filePath);
        printList(list);

        System.out.println("\nThis is a list of a sequence of numbers:");
        List<String> listWithSequenceOfNumbers = FileAnalyzeUtil.getListWithSequenceOfNumbers(filePathWithSequenceOfNumbers);
        printList(listWithSequenceOfNumbers);

        System.out.println("\nThis is a list of frequency of using litters in the text:");
        Map<String, Integer> mapLitters = FileAnalyzeUtil.getFrequencyOfUsingLitters(filePath);
        printMap(mapLitters);

        System.out.println("\nThis is a list of frequency of using words in the text:");
        Map<String, Integer> mapWords = FileAnalyzeUtil.getFrequencyOfUsingWords(filePathWithSequenceOfWords);
        printMap(mapWords);

        System.out.println("\nThis is a list with sorted numbers:");
        FileAnalyzeUtil.sortNumbers(filePathToReadNumbers, filePathToWriteNumbers);

        System.out.println("\nThis is a list with students progress:");
        List<String> studentsProgress = FileAnalyzeUtil.getStudentProgress(fileWithMarksOfStudents);
        printList(studentsProgress);

    }

    static void printList (List<String> list) {
        list.stream().forEach(x -> System.out.println(x));
    }

    static void printMap (Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        set.stream().forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));
    }
}

