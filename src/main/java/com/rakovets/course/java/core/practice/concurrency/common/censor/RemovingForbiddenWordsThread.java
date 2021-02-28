package com.rakovets.course.java.core.practice.concurrency.common.censor;

import com.rakovets.course.java.core.util.AnsiColorCode;
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
        System.out.println(AnsiColorCode.FG_GREEN_BOLD_BRIGHT + "Start removing forbidden words..." + AnsiColorCode.RESET);
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
        System.out.println(AnsiColorCode.FG_GREEN_BOLD_BRIGHT + "Finished removing forbidden words..." + AnsiColorCode.RESET);
    }
}
