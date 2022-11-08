package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Producer;

public class DemoProducerConsumer {
    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread consumer1 = new Thread(new Consumer());
        Thread consumer2 = new Thread(new Consumer());
        Thread consumer3 = new Thread(new Consumer());
        producer.start();

        try {
            producer.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
