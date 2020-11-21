package com.rakovets.course.javabasics.example.concurrency.utilities;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class Example9ExecutorServiceInvokeAll {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        Thread.sleep(1000);
        List<Future<String>> result = executorService.invokeAll(callables);

        for (Future<String> future : result) {
            printlnWithTimeAndThread("future.get = " + future.get(), AnsiColorCode.FG_RED_BOLD);
        }

        executorService.shutdown();
    }
}
