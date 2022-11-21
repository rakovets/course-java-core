package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {
    public static void main(String[] args) {
        final int PRODUCER_THREAD_NUMBERS = 3;
        final int CONSUMER_THREAD_NUMBERS = 3;
        final int MAX_DEQUE_SIZE = 10;

        Deque<Integer> deque = new ArrayDeque<>();
        Store store = new Store(deque, MAX_DEQUE_SIZE);
        for (int i = 0; i < PRODUCER_THREAD_NUMBERS; i++) {
            Thread producerThread = new com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.ProducerThread("Producer_" + i, store);
            producerThread.start();
        }
        for (int i = 0; i < CONSUMER_THREAD_NUMBERS; i++) {
            Thread consumerThread = new com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.ConsumerThread("Consumer_" + i, store);
            consumerThread.start();
        }
    }
}
