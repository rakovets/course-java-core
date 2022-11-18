package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Container;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Producer;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Container container = new Container();
        ReentrantLock lock = new ReentrantLock();
        Thread producer = new Thread(new Producer(container.container,lock));
        Thread consumer1 = new Thread(new Consumer(container.container, lock));
        Thread consumer2 = new Thread(new Consumer(container.container, lock));
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(producer);
        executorService.submit(consumer1);
        executorService.submit(consumer2);
    }
}
