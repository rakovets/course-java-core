package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        String outputFileName = Paths.get("src", "test", "resources", "concurrent_utilities", "testFile.txt").toString();
        Container queueContainer = new Container();
        ExecutorService poolTreads = Executors.newFixedThreadPool(4);
        Thread producerThread = new Thread(new Producer(queueContainer), "Producer");
        poolTreads.submit(producerThread);
        Thread.sleep(10000);
        Thread consumer1 = new Thread(new Consumer(queueContainer, outputFileName), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(queueContainer, outputFileName), "Consumer2");
        Thread consumer3 = new Thread(new Consumer(queueContainer, outputFileName), "Consumer3");
        poolTreads.submit(consumer1);
        poolTreads.submit(consumer2);
        poolTreads.submit(consumer3);
        poolTreads.shutdown();
    }
}
