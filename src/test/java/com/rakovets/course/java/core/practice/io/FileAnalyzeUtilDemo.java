package com.rakovets.course.java.core.practice.io;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        // The path of the file to be used is set through the properties
        String filePath = "";
        Path userPropertiesPath = Paths.get( "src", "test", "resources", "practice.io", "account.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(userPropertiesPath.toFile())) {
            p.load(reader);
            filePath = p.getProperty("filePathToWriting");
        } catch (IOException ex) {
            System.out.println("There is a problem with writing path for properties");
        }

        // Strings are written to the file for further use in different tasks
        String str1 = "Hello world";
        String str2 = "This is Java";
        String str3 = "Minsk 2021";
        String str4 = "Java IO";
        String str5 = "Ararat, Tibet";

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
    }


    static void printList (List<String> list) {
        list.stream().forEach(x -> System.out.println(x));
    }
}
