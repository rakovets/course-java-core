package com.rakovets.course.java.core.practice.concurrency.common.censor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SearchAndMergeFilesThread extends Thread{
    private String path;
    private String wordForSearch;

    public SearchAndMergeFilesThread(String path, String wordForSearch) {
        this.path = path;
        this.wordForSearch = wordForSearch;
    }

    @Override
    public void run() {
        try {
            Files.walk(Paths.get(path)).filter(Files::isRegularFile)
                    .forEach(e -> {
                        try (BufferedReader br = new BufferedReader(new FileReader(e.toString()));
                             BufferedReader br2 = new BufferedReader(new FileReader(e.toString()));
                             BufferedWriter bw = new BufferedWriter(new FileWriter("src/test/resources/practice/concurrency/mergedFiles.txt", true))) {
                            String text;
                            int counter = 0;
                            while ((text = br.readLine()) != null) {
                                if (text.contains(wordForSearch)) {
                                    counter++;
                                }
                            }
                            if (counter > 0) {
                                while ((text = br2.readLine()) != null) {
                                    bw.write(text + "\n");
                                }
                            }
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
