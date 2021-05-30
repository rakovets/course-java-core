package com.rakovets.course.java.core.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerDemo {
    public static void main(String[] args) {
        Repository list = new Repository();
        ReentrantLock lock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new Producer(list.queue,lock));
        executorService.submit(new Consumer(list.queue, lock));
        executorService.submit(new Consumer(list.queue, lock));
        executorService.shutdown();
    }
}
