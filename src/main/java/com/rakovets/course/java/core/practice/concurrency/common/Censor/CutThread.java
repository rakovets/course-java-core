package com.rakovets.course.java.core.practice.concurrency.common.Censor;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CutThread extends Thread {
    private final SearchThread searchThread;

    public CutThread(SearchThread searchThread) {
        this.searchThread = searchThread;
    }

    Path pathToMergedFile = Paths.get("src", "main", "resources", "TextFiles", "MergedFile.txt");
    Path pathToForbiddenWords = Paths.get("src", "main", "resources", "ForbiddenWords.txt");

    public void run() {
        try {
            searchThread.join();
            if (!searchThread.isInterrupted()) {
                String str;
                StringBuilder text = new StringBuilder();
                BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(pathToMergedFile)));
                while ((str = reader.readLine()) != null) {
                    text.append(str).append("\n");
                }
                reader.close();
                reader = new BufferedReader(new FileReader(String.valueOf(pathToForbiddenWords)));
                List<String> forbiddenWords = new ArrayList<>();
                while ((str = reader.readLine()) != null) {
                    forbiddenWords.add(str);
                }
                reader.close();
                str = text.toString();
                for (String forbiddenWord : forbiddenWords) {
                    str = str.replaceAll(forbiddenWord, "*");
                }
                FileWriter writer = new FileWriter(String.valueOf(pathToMergedFile));
                writer.write(str);
                writer.close();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
