package com.rakovets.course.java.core.practice.concurrency;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        QueueOfIntegerNumbers queueOfIntegerNumbers = new QueueOfIntegerNumbers();
        Thread producer = new Thread(new Producer(queueOfIntegerNumbers), "Producer");
        Thread consumer1 = new Thread(new Consumer(queueOfIntegerNumbers), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(queueOfIntegerNumbers), "Consumer2");
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
