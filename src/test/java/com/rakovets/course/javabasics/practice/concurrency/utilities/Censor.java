package com.rakovets.course.javabasics.practice.concurrency.utilities;

import com.rakovets.course.javabasics.practice.concurrency.utilities.censor.Cutter;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Censor {
    private static final String sep = File.separator;
    private static String pathOfDataFiles;
    private static String pathOfTempDir;
    private static final List<String> censoredFiles = new ArrayList<>();

    public static void main(String[] args) {
        String pathOfForbiddenWords = "src" + sep + "main" + sep + "resources" + sep + "forbidden.txt";
        File fileOfForbiddenWords = new File(pathOfForbiddenWords);
        if (fileOfForbiddenWords.exists()) {
            getBadWords(pathOfForbiddenWords);
            getData();
            String pathOfResultFile = "src" + sep + "main" + sep + "resources" + sep + "result.txt";
            pathOfTempDir = "src" + sep + "main" + sep + "resources" + sep + "temp";
            Cutter.setPathOfTempDir(pathOfTempDir);
            File dataDir = new File(pathOfDataFiles);
            if (dataDir.exists()) {
                String[] dataFiles = dataDir.list();
                File tempDir = new File(pathOfTempDir);
                if (!tempDir.exists())
                    tempDir.mkdir();
                censorFiles(dataFiles);
                int amountOfFiles = Cutter.getAmountOfFiles().get();
                System.out.println("Found " + amountOfFiles + " files and " + (dataFiles.length - amountOfFiles) + " directories.");
                System.out.println(censoredFiles.size() + " files censored.");
                mergeFiles(pathOfResultFile);
                tempDir.delete();
                System.out.println("Job is done! Checkout result.txt");
            } else System.out.println("Directory not found!");
        }
        else System.out.println("File of forbidden words is not found!");

    }

    private static void mergeFiles(String pathOfResultFile) {
        File resultFile = new File(pathOfResultFile);
        StringBuilder data = new StringBuilder();
        StringBuffer result = new StringBuffer();
        String line;
        try {
            for (String fileName : censoredFiles) {
                File file = new File(pathOfTempDir + sep + fileName);
                if (file.isFile()) {
                    data.append("========== FILE: " + fileName + "\n");
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    while ((line = reader.readLine()) != null)
                        data.append(line).append("\n");
                    reader.close();
                    result.append(data);
                    data.delete(0, data.length());
                    file.delete();
                }
            }
            if (!resultFile.exists())
                resultFile.createNewFile();
            FileWriter writer = new FileWriter(resultFile);
            writer.write(String.valueOf(result));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void censorFiles(String[] fileNames) {
        int amountOfFiles = fileNames.length;
        ExecutorService executorService = Executors.newFixedThreadPool(amountOfFiles);
        List<Future<String>> futureList = new ArrayList<>();
        for(String fileName : fileNames) {
            futureList.add(executorService.submit(new Cutter(fileName)));
        }
        for (Future<String> future : futureList) {
            String fileName = null;
            try {
                fileName = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            if (fileName != null)
                censoredFiles.add(fileName);
        }
        executorService.shutdown();
    }

    private static void getBadWords(String forbiddenPath) {
        BufferedReader reader;
        String string;
        Set<String> badWords = new HashSet<>();
        try {
            reader = new BufferedReader(new FileReader(forbiddenPath));
            while ((string = reader.readLine()) != null) {
                badWords.add(string);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Cutter.setBadWords(badWords);
    }

    private static void getData() {
        Scanner in = new Scanner(System.in);
        String defaulPath = "src" + sep + "main" + sep + "java" + sep + "com" + sep + "rakovets" + sep + "course" + sep + "javabasics" + sep + "example" + sep + "concurrency" + sep + "utilities";
        System.out.print("Enter the path to the directory (default: " + defaulPath + ")");
        pathOfDataFiles = in.nextLine();
        if (pathOfDataFiles.isEmpty())
            pathOfDataFiles = defaulPath;
        Cutter.setPath(pathOfDataFiles);
        String defaultWord = "Executor";
        System.out.print("Enter the word to find (default: " + defaultWord + ")");
        String word = in.nextLine();
        if (word.isEmpty())
            word = defaultWord;
        Cutter.setWord(word);
    }
}
