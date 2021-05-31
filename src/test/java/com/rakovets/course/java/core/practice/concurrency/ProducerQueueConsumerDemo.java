package com.rakovets.course.java.core.practice.concurrency;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(new Producer(), "Producer");
        Thread consumer = new Thread(new Consumer(), "Consumer");
        Thread consumer2 = new Thread(new Consumer(), "Consumer2");

        producer.start();
        consumer.start();
        consumer2.start();
    }
}
