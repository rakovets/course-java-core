package com.rakovets.course.java.core.practice.concurrent_utilities.producer_cosumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        ExecutorService oneExecutorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Producer(Container.getTerminalCollector()));
        oneExecutorService.execute(new Consumer());
        executorService.shutdown();
        oneExecutorService.shutdown();

    }
}
