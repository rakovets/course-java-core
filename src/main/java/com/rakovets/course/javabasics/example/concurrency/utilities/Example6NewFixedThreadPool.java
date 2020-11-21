package com.rakovets.course.javabasics.example.concurrency.utilities;

import com.rakovets.course.javabasics.example.concurrency.utilities.model.AsynchronousThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example6NewFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            executorService.execute(new AsynchronousThread());
        }

        executorService.shutdown();
    }
}
