package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import com.rakovets.course.java.core.practice.concurrent_utilities.producer_queue_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_queue_consumer.Producer;

import java.awt.*;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        String outputFileName = Paths.get("src", "test", "resources", "concurrent_utilities", "TestFile.txt").toString();
        Container numbers = new Container();
        ExecutorService poolTreads = Executors.newFixedThreadPool(4);
        Thread producerThread = new Thread(new Producer(numbers), "Producer");
        poolTreads.submit(producerThread);
        Thread.sleep(10000);

        Thread consumer1 = new Thread(new Consumer(numbers, outputFileName), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(numbers, outputFileName), "Consumer2");
        Thread consumer3 = new Thread(new Consumer(numbers, outputFileName), "Consumer3");
        poolTreads.submit(consumer1);
        poolTreads.submit(consumer2);
        poolTreads.submit(consumer3);
        poolTreads.shutdown();
    }
}
