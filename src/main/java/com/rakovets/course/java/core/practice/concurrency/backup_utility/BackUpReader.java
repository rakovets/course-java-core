package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;

public class BackUpReader implements Runnable {
    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src/main/resources/practice/fileInNeedOfBackUp"))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(
                        new FileWriter("src/main/resources/practice/backUpFile"))) {
                    bufferedWriter.write(string);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
