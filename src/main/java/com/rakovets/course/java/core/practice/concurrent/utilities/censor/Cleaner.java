package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Cleaner implements Runnable {
    private final CopyOnWriteArrayList<File> chosenFiles;
    private final ReentrantLock lockForChosenFiles;
    private final ReentrantLock lockForCensoredData;
    private final List<String> forbiddenWords;
    private final String censoredDataPath;

    public Cleaner(CopyOnWriteArrayList<File> chosenFiles, ReentrantLock lockForChosenFiles, ReentrantLock lockForCensoredData, List<String> forbiddenWords, String censoredDataPath) {
        this.chosenFiles = chosenFiles;
        this.lockForChosenFiles = lockForChosenFiles;
        this.lockForCensoredData = lockForCensoredData;
        this.forbiddenWords = forbiddenWords;
        this.censoredDataPath = censoredDataPath;
    }

    @Override
    public void run() {
        List<String> cleaningObject = new ArrayList<>();
        List<String> purifiedText = new ArrayList<>();

        while (!chosenFiles.isEmpty()) {
            lockForChosenFiles.lock();
            if (!chosenFiles.isEmpty()) {
                File fileForCleaning = chosenFiles.remove(0);
                lockForChosenFiles.unlock();
                long start = System.nanoTime();

                try (BufferedReader reader = new BufferedReader(new FileReader(fileForCleaning))) {
                    String string;
                    while ((string = reader.readLine()) != null) {
                        cleaningObject.add(string);
                    }
                } catch (IOException ex) {
                    try {
                        throw new CensorException("Cleaner: Exception during reading object for cleaning");
                    } catch (CensorException exception) {
                        System.out.println(exception.getMessage());
                    }
                }

                for (String stringForCleaning : cleaningObject) {
                    String purified = stringForCleaning;
                    for (String word : forbiddenWords) {
                        purified = purified.replaceAll(word, "");
                        purified = purified.replaceAll(word.toLowerCase(Locale.ROOT), "");
                    }
                    purifiedText.add(purified);
                }

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileForCleaning))) {
                    for (String data : purifiedText) {
                        bw.write(data + "\n");
                    }
                    bw.flush();
                } catch (IOException ex) {
                    try {
                        throw new CensorException("Cleaner: Mistakes of writing have occurred");
                    } catch (CensorException exception) {
                        System.out.println(exception.getMessage());
                    }
                }

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(censoredDataPath, true))) {
                    lockForCensoredData.lock();
                    for (String data : purifiedText) {
                        bw.write(data + "\n");
                    }
                    bw.flush();
                } catch (IOException ex) {
                    try {
                        throw new CensorException("Cleaner: Mistakes of writing have occurred");
                    } catch (CensorException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                lockForCensoredData.unlock();

                cleaningObject.clear();
                purifiedText.clear();
                System.out.printf("Cleaner %s have censored %s in %d nanos\n",
                        Thread.currentThread().getName(), fileForCleaning.getName(), (System.nanoTime() - start));
            } else {
                lockForChosenFiles.unlock();
            }
        }
    }
}
