package com.rakovets.course.java.core.example.concurrent_utilities;

import com.rakovets.course.java.core.example.concurrent_utilities.model.AsynchronousThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example6NewFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 1000; i++) {
            executorService.execute(new AsynchronousThread());
        }

        executorService.shutdown();
    }
}
