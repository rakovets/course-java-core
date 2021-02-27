package com.rakovets.course.java.core.practice.concurrency.common.censor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RemovingForbiddenWordsThread extends Thread {
    private String forbiddenWordsPath;
    private String mergedFilesPath;

    public RemovingForbiddenWordsThread(String forbiddenWordsPath, String mergedFilesPath) {
        this.forbiddenWordsPath = forbiddenWordsPath;
        this.mergedFilesPath = mergedFilesPath;
    }

    @Override
    public void run() {
        try {
            System.out.println("sleep...");
            Thread.sleep(5000);
            System.out.println("start...");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(forbiddenWordsPath));
             BufferedReader br2 = new BufferedReader(new FileReader(mergedFilesPath))) {
            File tmp = File.createTempFile("tmp", null);
            String s;
            List<String> listOfForbiddenWords = new ArrayList<>();
            while ((s = br.readLine()) != null) {
                String[] arrayWords = s.split(" ");
                for (String word : arrayWords) {
                    listOfForbiddenWords.add(word);
                }
            }

            BufferedWriter bwTmp = new BufferedWriter(new FileWriter(tmp.getPath(), true));

            while ((s = br2.readLine()) != null) {
                String[] arrayWords = s.split(" ");
                for (String word : arrayWords) {
                    if (listOfForbiddenWords.contains(word)) {
                        bwTmp.write("");
                    } else {
                        bwTmp.write(word + " ");
                    }
                }
                bwTmp.write("\n");
            }
            br2.close();
            bwTmp.close();
            File oldFile = new File(mergedFilesPath);
            if (oldFile.delete()) {
                tmp.renameTo(new File(mergedFilesPath));
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
