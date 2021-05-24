package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.consumer.Producer;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.consumer.store;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args)throws InterruptedException{
    store store = new store();
        Producer producer = new Producer("producer",store);
        Producer producer2 = new Producer("producer2",store);
        Consumer consumer = new Consumer("Consumer",store);
        Consumer consumer2 = new Consumer("Consumer2",store);
        Consumer consumer3 = new Consumer("Consumer3",store);
        Thread threadProducer = new Thread(producer);
        Thread threadProducer2 = new Thread(producer2);
        Thread threadConsumer = new Thread(consumer);
        Thread threadConsumer2 = new Thread(consumer2);
        Thread threadConsumer3 = new Thread(consumer3);
        threadProducer.start();
        threadConsumer.start();
        threadConsumer2.start();
        threadConsumer3.start();
        Thread.sleep(400);
        store.End();



    }
}
