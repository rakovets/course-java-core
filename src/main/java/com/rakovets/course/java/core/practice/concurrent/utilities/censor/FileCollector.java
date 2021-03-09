package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class FileCollector implements Callable<List<File>> {
    private final String directoryForSearch;
    private final String searchWord;


    public FileCollector(String filepath, String searchWord) {
        this.directoryForSearch = filepath;
        this.searchWord = searchWord;
    }

    @Override
    public List<File> call() {
        File directory = new File(directoryForSearch);
        List<File> chosenFiles = new ArrayList<>();

        if (directory.isDirectory()) {
            File[] directoryFiles = directory.listFiles();

            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String string;
                        while ((string = reader.readLine()) != null) {
                            if (string.contains(searchWord)) {
                                chosenFiles.add(file);
                                break;
                            }
                        }
                    } catch (Exception ex) {
                        try {
                            throw new CensorException("Collector: Some files in this directory contains no text");
                        } catch (CensorException exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                }
            }
            System.out.println("Files were found - " + chosenFiles.size());
        } else {
            try {
                throw new CensorException("Collector: Invalid directory address");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return chosenFiles;
    }
}
