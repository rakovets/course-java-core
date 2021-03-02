package com.rakovets.course.java.core.example.concurrent.utilities;

import com.rakovets.course.java.core.example.concurrent.utilities.model.AsynchronousThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example5SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new AsynchronousThread());
        executorService.shutdown();
    }
}
