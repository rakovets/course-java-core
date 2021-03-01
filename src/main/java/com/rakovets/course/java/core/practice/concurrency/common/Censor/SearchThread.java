package com.rakovets.course.java.core.practice.concurrency.common.Censor;

import java.io.*;
import java.nio.file.Paths;
import java.util.Objects;

public class SearchThread extends Thread {
    private final String directoryPath;
    private final String searchWord;

    public SearchThread(String directoryPath, String searchWord) {
        this.directoryPath = directoryPath;
        this.searchWord = searchWord;
    }

    File mergedFile = new File(String.valueOf(
            Paths.get("src", "main", "resources", "TextFiles", "MergedFile.txt")));
    StringBuffer word = new StringBuffer();
    StringBuffer cutText = new StringBuffer();

    public void run() {
        File directory = new File(directoryPath);
        if (directory.exists()) {
            String[] files = Objects.requireNonNull(directory.list());
            for (String fileName : files) {
                try {
                    File file = new File(directoryPath + File.separator + fileName);
                    if (file.isFile()) {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String str;
                        while ((str = reader.readLine()) != null)
                            word.append(str).append("\n");
                            reader.close();
                        if (word.indexOf(searchWord) != -1) {
                            cutText.append(word);
                        }
                        word.delete(0, word.length());
                    }
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                FileWriter writer = new FileWriter(mergedFile);
                writer.write((cutText.toString()));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            try {
                throw new UserDirectoryException(directory);
            } catch (UserDirectoryException e) {
                e.printStackTrace();
                interrupt();
        }
    }
}
