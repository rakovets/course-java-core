package com.rakovets.course.javabasics.example.concurrency.utilities;

import com.rakovets.course.javabasics.example.concurrency.utilities.model.AsynchronousThread;
import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class Example7ExecutorServiceSubmit {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            Future<?> future = executorService.submit(new AsynchronousThread());
            printlnWithTimeAndThread(future.get(), AnsiColorCode.FG_RED_BOLD);
        }

        executorService.shutdown();
    }
}
