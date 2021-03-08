package com.rakovets.course.java.core.practice.concurrent.utilities.censor.service;

import java.io.*;
import java.nio.file.Path;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class CutterService implements Callable<String> {
    private final String fileName;
    private static Set<String> forbiddenWords;
    private static Path path;
    private static String word;
    private static Path pathOfDirectory;
    private static final AtomicInteger numberOfFiles = new AtomicInteger();
    private final StringBuffer data = new StringBuffer();
    public String str;

    public CutterService(String fileName) {
        this.fileName = fileName;
    }

    public String call() {
        String mergedFilesPath = pathOfDirectory + File.separator + fileName;
        File mergedFile = new File(mergedFilesPath);
        try {
            File file = new File(path + File.separator + fileName);
            if (file.isFile()) {
                numberOfFiles.incrementAndGet();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                while ((str = reader.readLine()) != null) {
                    data.append(str).append("\n");
                }
                reader.close();
                if (data.indexOf(word) != -1) {
                    str = String.valueOf(data);
                    for (String forbiddenWord : forbiddenWords) {
                        str = str.replaceAll(forbiddenWord, "*");
                    }
                    FileWriter writer = new FileWriter(mergedFile);
                    writer.write(str);
                    writer.flush();
                    writer.close();
                    return fileName;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setForbiddenWords(Set<String> forbiddenWords) {
        CutterService.forbiddenWords = forbiddenWords;
    }

    public static void setPath(Path path) {
        CutterService.path = path;
    }

    public static void setWord(String word) {
        CutterService.word = word;
    }

    public static void setPathOfDirectory(Path pathOfDirectory) {
        CutterService.pathOfDirectory = pathOfDirectory;
    }
}
