package com.rakovets.course.java.core.practice.concurrent.utilities.censor.service;

import com.rakovets.course.java.core.practice.concurrent.utilities.censor.repository.TextRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CutFilesService {
    private static final List<Future<String>> futureList;

    static {

        futureList = new ArrayList<>();

    }

    public static void cutFiles(String[] fileNames) {
        int numberOfFiles = fileNames.length;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfFiles);
        for(String fileName : fileNames) {
            futureList.add(executorService.submit(new CutterService(fileName)));
        }
        for (Future<String> future : futureList) {
            String fileName = null;
            try {
                fileName = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            if (fileName != null)
                TextRepository.text.add(fileName);
        }
        executorService.shutdown();
    }
}
