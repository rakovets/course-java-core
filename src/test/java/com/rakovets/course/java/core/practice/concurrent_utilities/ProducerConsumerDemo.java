package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Container;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Container queueOfNumbers = new Container();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Thread producer = new Thread(new Producer(queueOfNumbers), "Producer");
        executorService.submit(producer);
        Thread.sleep(10000);
        Thread consumer1 = new Thread(new Consumer(queueOfNumbers), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(queueOfNumbers), "Consumer2");
        Thread consumer3 = new Thread(new Consumer(queueOfNumbers), "Consumer3");
        executorService.submit(consumer1);
        executorService.submit(consumer2);
        executorService.submit(consumer3);
        executorService.shutdown();
    }
}
