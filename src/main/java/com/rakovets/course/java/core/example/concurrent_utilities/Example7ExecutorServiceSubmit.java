package com.rakovets.course.java.core.example.concurrent_utilities;

import com.rakovets.course.java.core.example.concurrent_utilities.model.AsynchronousThread;
import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static com.rakovets.course.java.core.util.StandardOutputUtil.printlnWithTimeAndThread;

public class Example7ExecutorServiceSubmit {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        List<Future<?>> allFeature = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<?> future = executorService.submit(new AsynchronousThread());
            allFeature.add(future);
        }

        Thread.sleep(5_000);
        for (int i = 0; i < 10; i++) {
            printlnWithTimeAndThread(allFeature.get(i), AnsiColorCode.FG_RED_BOLD);
        }

        executorService.shutdown();
    }
}
