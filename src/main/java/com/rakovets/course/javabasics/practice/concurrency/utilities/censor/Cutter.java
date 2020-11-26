package com.rakovets.course.javabasics.practice.concurrency.utilities.censor;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Cutter<T> implements Callable<T> {
    private String fileName;
    private static Set<String> badWords;
    private static String path;
    private static String word;
    private static String pathOfTempDir;
    private static AtomicInteger amountOfFiles = new AtomicInteger();

    public Cutter(String fileName) {
        this.fileName = fileName;
    }

    public T call() {
        String sep = File.separator;
        String resultPath = pathOfTempDir + sep + fileName;
        File resultFile = new File(resultPath);
        StringBuilder data = new StringBuilder();
        StringBuffer result = new StringBuffer();
        String string;
        try {
            File file = new File(path + sep + fileName);
            if (file.isFile()) {
                amountOfFiles.incrementAndGet();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                while ((string = reader.readLine()) != null)
                    data.append(string).append("\n");
                reader.close();
                if (data.indexOf(word) > -1) {
                    result.append(data);
                    string = String.valueOf(data);
                    for (String badWord : badWords) {
                        string = string.replaceAll(badWord, "");
                    }
                    if (!resultFile.exists())
                        resultFile.createNewFile();
                    FileWriter writer = new FileWriter(resultFile);
                    writer.write(string);
                    writer.flush();
                    writer.close();
                    return (T) fileName;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setBadWords(Set<String> badWords) {
        Cutter.badWords = badWords;
    }

    public static void setPath(String path) {
        Cutter.path = path;
    }

    public static void setWord(String word) {
        Cutter.word = word;
    }

    public static void setPathOfTempDir(String pathOfTempDir) {
        Cutter.pathOfTempDir = pathOfTempDir;
    }

    public static AtomicInteger getAmountOfFiles() {
        return amountOfFiles;
    }
}
