package com.rakovets.course.java.core.practice.concurrent.utilities.censor.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFilesController {
    private static final Path directoryPath;
    private static final Path textPath1;
    private static final Path textPath2;
    private static final Path forbiddenWordsPath;

    static {

        directoryPath = Paths.get("src", "main", "resources", "text_files");
        textPath1 = Paths.get("src", "main", "resources", "text_files", "Text1.txt");
        textPath2 = Paths.get("src", "main", "resources", "text_files", "Text2.txt");
        forbiddenWordsPath = Paths.get("src", "main", "resources", "ForbiddenWords.txt");

    }

    public void createDirectory() throws IOException {
        Files.createDirectories(directoryPath);
    }

    public void createText1() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(textPath1)))) {
            writer.write("The edition of the Java platform that enables development, deployment, \n" +
                    "and management of cross-platform, general-purpose applications.");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createText2() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(textPath2)))) {
            writer.write("A distributed object model for Java program to Java program, \n" +
                    "in which the methods of remote objects written in the Java programming \n" +
                    "language can be invoked from other Java virtual machines, possibly on different hosts.");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFileWithForbiddenWords() {
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
