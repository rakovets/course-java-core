package com.rakovets.course.java.core.practice.concurrency;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        Container container = new Container();
        Thread producer = new Thread(new Producer(container), "Producer");
        Thread consumer1 = new Thread(new Consumer(container), "Thread1");
        Thread consumer2 = new Thread(new Consumer(container), "Thread2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
