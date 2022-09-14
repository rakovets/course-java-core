package com.rakovets.course.java.core.example.concurrent_utilities;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.rakovets.course.java.core.util.StandardOutputUtil.printlnWithTimeAndThread;

public class Example8ExecutorServiceInvokeAny {
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
                return "Task 3";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });

        Thread.sleep(1000);
        String result = executorService.invokeAny(callables);
        printlnWithTimeAndThread("result = " + result, AnsiColorCode.FG_RED_BOLD);

        executorService.shutdown();
    }
}
