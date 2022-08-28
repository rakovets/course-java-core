package com.rakovets.course.java.core.practice.concurrency;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        QueueOfInteger queueOfInteger = new QueueOfInteger();

        Thread producer = new Thread(new Producer(queueOfInteger), "Dima");
        Thread firstConsumer = new Thread(new Consumer(queueOfInteger), "Yegor");

        producer.start();
        firstConsumer.start();
    }
}
