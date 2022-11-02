package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Producer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Producer producer = new Producer(queue);
        Thread producerThread = new Thread(producer, "producer");
        producerThread.start();
        Consumer consumer = new Consumer(queue);
        Thread consumerThread = new Thread(consumer, "consumer");
        consumerThread.start();
    }
}
