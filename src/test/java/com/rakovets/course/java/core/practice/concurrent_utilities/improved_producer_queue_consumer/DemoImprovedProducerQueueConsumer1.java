package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class DemoImprovedProducerQueueConsumer1 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        Semaphore semaphore = new Semaphore(1);
        Producer producer = new Producer(queue);
        Consumer1 consumer = new Consumer1(queue, semaphore);
        Consumer1 consumer1 = new Consumer1(queue, semaphore);
        Consumer1 consumer11 = new Consumer1(queue, semaphore);

        producer.start();
        consumer.start();
        consumer1.start();
        consumer11.start();

        producer.join();
        consumer.disable();
        consumer1.disable();
        consumer11.disable();
        //consumer.join();
        //consumer1.join();
        //consumer11.join();
    }
}
