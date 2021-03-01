package com.rakovets.course.java.core.practice.concurrency.common.Censor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFiles {
    public static void main(String[] args) throws IOException {

        Path directoryPath = Paths.get("src", "main", "resources", "TextFiles");
        Files.createDirectories(directoryPath);

        Path textPath1 = Paths.get("src", "main", "resources", "TextFiles", "Text1.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(textPath1)))) {
            writer.write("The edition of the Java platform that enables development, deployment, \n" +
                    "and management of cross-platform, general-purpose applications.");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path textPath2 = Paths.get("src", "main", "resources", "TextFiles", "Text2.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(textPath2)))) {
            writer.write("A distributed object model for Java program to Java program, \n" +
                    "in which the methods of remote objects written in the Java programming \n" +
                    "language can be invoked from other Java virtual machines, possibly on different hosts.");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path forbiddenWordsPath = Paths.get("src", "main", "resources", "ForbiddenWords.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(forbiddenWordsPath)))) {
            writer.write("Java");
            writer.newLine();
            writer.write("program");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
