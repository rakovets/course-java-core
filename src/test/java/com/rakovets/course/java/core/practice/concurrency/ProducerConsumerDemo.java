package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("ConsumerThreads"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Queue <Integer> queue = new ConcurrentLinkedQueue();
        Producer producer = new Producer(queue);
        Consumer consumer1 = new Consumer("Consumer1", queue, writer);
        Consumer consumer2 = new Consumer("Consumer2", queue, writer);
        consumer1.start();
        consumer2.start();
        producer.start();
    }
}

