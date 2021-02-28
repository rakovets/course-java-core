package com.rakovets.course.java.core.practice.concurrency.common.censor;

import com.rakovets.course.java.core.util.AnsiColorCode;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SearchAndMergeFilesThread extends Thread{
    private String pathForSearch;
    private String wordForSearch;
    private String mergedFilesPath;

    public SearchAndMergeFilesThread(String pathForSearch, String wordForSearch, String mergedFilesPath) {
        this.pathForSearch = pathForSearch;
        this.wordForSearch = wordForSearch;
        this.mergedFilesPath = mergedFilesPath;
    }

    @Override
    public void run() {
        System.out.println(AnsiColorCode.FG_BLUE_BOLD_BRIGHT + "Start search and merge files..." + AnsiColorCode.RESET);
        try {
            Files.walk(Paths.get(pathForSearch)).filter(Files::isRegularFile)
                    .forEach(e -> {
                        try (BufferedReader br = new BufferedReader(new FileReader(e.toString()));
                             BufferedReader br2 = new BufferedReader(new FileReader(e.toString()));
                             BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFilesPath, true))) {
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
        System.out.println(AnsiColorCode.FG_BLUE_BOLD_BRIGHT + "Finished search and merge files..." + AnsiColorCode.RESET);
    }
}
