package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.nio.file.Paths;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class DemoImprovedProducerQueueConsumer {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        String filePath = Paths.get("src", "test", "resources", "concurrent_utilities", "file.txt").toString();
        Semaphore semaphore = new Semaphore(4);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue, filePath, semaphore);
        Consumer consumer1 = new Consumer(queue, filePath, semaphore);
        Consumer consumer2 = new Consumer(queue, filePath, semaphore);
        Consumer consumer3 = new Consumer(queue, filePath, semaphore);

        producer.start();
        consumer.start();
        consumer1.start();
        //consumer2.start();
        //consumer3.start();

        producer.join();
        consumer.join();
        consumer1.join();
        //consumer2.join();
        //consumer3.join();

        //System.out.println(queue);
    }
}
