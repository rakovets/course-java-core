package com.rakovets.course.javabasics.practice.concurrency.utilities.masterworkers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Worker implements Callable {

    private final Queue<Integer> queue;

    public Worker() {
        queue = new ArrayDeque<>();
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    @Override
    public Object call() throws InterruptedException, ExecutionException {
        int amountOfThreads = 3;
        ExecutorService executor = Executors.newFixedThreadPool(amountOfThreads);
        List<Future<?>> futures = new ArrayList<>();
        boolean work = true;
        while(work) {
            while (!queue.isEmpty()) {
                int num = queue.poll();
                if (num == - 1) {
                    executor.shutdownNow();
                    work = false;
                    break;
                }
                futures.add(executor.submit(new Task(num)));
            }
            for(Future<?> future : futures)
                future.get();
            System.out.print("...");
            sleep(1000);
        }
        return null;
    }
}
