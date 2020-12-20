package com.rakovets.course.javabasics.example.concurrency.utilities;

import com.rakovets.course.javabasics.example.concurrency.utilities.model.AsynchronousThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example5SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new AsynchronousThread());
        executorService.shutdown();
    }
}
