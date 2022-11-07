package com.rakovets.course.java.core.practice.concurrency;

public class ProducerTest {
    public static void main(String[] args) {
        Container queue1 = new Container();
        Thread producer = new Producer(queue1);
        Thread consumer = new Consumer(queue1);
        Thread consumer1 = new Consumer(queue1);
        Thread consumer2 = new Consumer(queue1);
        producer.start();
        try {
            producer.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        consumer.start();
        consumer1.start();
        consumer2.start();
    }
}
