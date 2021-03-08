package com.rakovets.course.java.core.practice.concurrent.utilities.censor.service;

import com.rakovets.course.java.core.practice.concurrent.utilities.censor.controller.CensorController;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.repository.TextRepository;

import java.io.*;
import java.nio.file.Path;

public class MergeFilesService {
    private static final StringBuilder data;
    private static final StringBuffer mergedText;
    public static String line;

    static {

        data = new StringBuilder();
        mergedText = new StringBuffer();

    }

    public static void mergeFiles(Path pathOfMergedFile) {
        File mergedFile = new File(String.valueOf(pathOfMergedFile));
        try {
            for (String fileName : TextRepository.text) {
                File file = new File(CensorController.directoryPath + File.separator + fileName);
                if (file.isFile()) {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    while ((line = reader.readLine()) != null) {
                        data.append(line).append("\n");
                    }
                    reader.close();
                    mergedText.append(data);
                    data.delete(0, data.length());
                }
            }
            FileWriter writer = new FileWriter(mergedFile);
            writer.write(String.valueOf(mergedText));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
