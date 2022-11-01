package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

public class DemoProducer {
    public static void main(String[] args) {
        Producer producer = new Producer();
         producer.start();
    }
}
