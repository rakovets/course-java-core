package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class FileCollector implements Callable<List<File>> {
    private final String directoryForSearch;
    private final String searchWord;


    public FileCollector(String filepath, String searchWord) {
        this.directoryForSearch = filepath;
        this.searchWord = searchWord;
    }

    @Override
    public List<File> call() {
        File directory = new File(directoryForSearch);
        List<File> chosenFiles = new ArrayList<>();
        ReentrantLock lock = new ReentrantLock();

        if (directory.isDirectory()) {
            List<File> directoryFiles = Arrays.stream(Objects.requireNonNull(directory.listFiles())).collect(Collectors.toList());

                Callable<Boolean> fileCollectorUnit = () -> {
                    while (!directoryFiles.isEmpty()) {
                        lock.lock();
                        if (!directoryFiles.isEmpty()) {
                            File fileForCheck = directoryFiles.remove(0);
                            lock.unlock();

                            try (BufferedReader reader = new BufferedReader(new FileReader(fileForCheck))) {
                                String string;
                                while ((string = reader.readLine()) != null) {
                                    if (string.contains(searchWord)) {
                                        chosenFiles.add(fileForCheck);
                                        break;
                                    }
                                }
                            } catch (Exception ex) {
                                try {
                                    throw new CensorException("Collector: Some files in this directory contains no text");
                                } catch (CensorException exception) {
                                    System.out.println(exception.getMessage());
                                }
                            }
                        } else {
                            lock.unlock();
                        }
                    }
                    return true;
                };

            int numberOfThreads = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
            Collection<Callable<Boolean>> tasks = new ArrayList<>();
            for (int x = 1; x <= numberOfThreads; x++) {
                tasks.add(fileCollectorUnit);
            }

            try {
                List<Future<Boolean>> doneTasks = executor.invokeAll(tasks);
                for (Future<Boolean> check : doneTasks) {
                    check.get();
                }
            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }

            executor.shutdown();
            System.out.println("Files were found - " + chosenFiles.size());
        } else {
            try {
                throw new CensorException("Collector: Invalid directory address");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return chosenFiles;
    }
}
