package com.rakovets.course.java.core.practice.concurrency;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerQueueConsumer {
    public static void main(String[] args) {
        Queue queue=new ArrayDeque();
        Producer producer=new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer.start();
        consumer.start();
    }
    }

