package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.io.File;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Censor {
    private final String forbiddenWordsSource;
    private final String censoredDataPath;

    public Censor(String forbiddenWordsSource, String censoredDataPath) {
        this.forbiddenWordsSource = forbiddenWordsSource;
        this.censoredDataPath = censoredDataPath;
    }

    public void check(int cleanerNumber) {
        ExecutorService executor = Executors.newFixedThreadPool(cleanerNumber);
        try {
            Future<List<String>> forbiddenWordsReceiving = executor.submit(new ForbiddenWordsSupplier(forbiddenWordsSource));

            String[] targetData = CensorTargetInput.inputTargetData();
            String filepath = targetData[0];
            String searchWord = targetData [1];

            List<String> forbiddenWords = forbiddenWordsReceiving.get();
            Future<List<File>> future = executor.submit(new FileCollector(filepath, searchWord));
            List<File> chosenFiles = future.get();

            CopyOnWriteArrayList<File> listForProcessing = new CopyOnWriteArrayList<>(chosenFiles);
            ReentrantLock lockForList = new ReentrantLock();
            ReentrantLock lockForWriting = new ReentrantLock();

            for (int x = 1; x <= cleanerNumber; x++) {
                executor.execute(new Cleaner(listForProcessing, lockForList, lockForWriting, forbiddenWords, censoredDataPath));
            }
            executor.shutdown();
        } catch (InterruptedException | ExecutionException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Your data has been censored");
    }
}
