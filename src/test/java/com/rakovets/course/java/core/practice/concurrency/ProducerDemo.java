package com.rakovets.course.java.core.practice.concurrency;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerDemo {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);
        Thread threadConsumer2 = new Thread(consumer2);

        threadProducer.start();
        threadConsumer.start();
        threadConsumer2.start();

        threadProducer.join();
        threadConsumer.join();
        threadConsumer2.join();
    }
}
