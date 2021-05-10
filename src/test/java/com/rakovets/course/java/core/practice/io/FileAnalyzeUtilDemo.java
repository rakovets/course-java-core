package com.rakovets.course.java.core.practice.io;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        // The path of the file to be used is set through the properties
        String filePath = "";
        String filePathWithSequenceOfNumbers = "";
        Path userPropertiesPath = Paths.get( "src", "test", "resources", "practice.io", "account.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(userPropertiesPath.toFile())) {
            p.load(reader);
            filePath = p.getProperty("filePathToWriting");
            filePathWithSequenceOfNumbers = p.getProperty("filePathWithSequenceOfNumbers");
        } catch (IOException ex) {
            System.out.println("There is a problem with writing path for properties");
        }

        // Strings are written to the file for further use in different tasks
        String str1 = "Hello world";
        String str2 = "This is Java";
        String str3 = "Minsk Krakow";
        String str4 = "Java IO";
        String str5 = "Ararat,  Tibet";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(str1 + "\n");
            writer.write(str2 + "\n");
            writer.write(str3 + "\n");
            writer.write(str4 + "\n");
            writer.write(str5 + "\n");
        } catch (IOException ex) {
            System.out.println("There is a problem with writing strings");
        }

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
        Map<Character, Integer> map = FileAnalyzeUtil.getFrequencyOfUsingLitters(filePath);


    }
    static void printList (List<String> list) {
        list.stream().forEach(x -> System.out.println(x));
    }
}
