package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Store store = new Store();

        Thread producer = new Producer(store);
        Thread consumer1 = new Consumer(store);
        Thread consumer2 = new Consumer(store);
        Thread consumer3 = new Consumer(store);
        Thread consumer4 = new Consumer(store);
        Thread consumer5 = new Consumer(store);

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        store.setInterruption(false);
    }
}
