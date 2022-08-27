package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ProducerConsumer producerConsumer = new ProducerConsumer();
        executorService.submit(() -> producerConsumer.produce(5));
        executorService.submit(producerConsumer::consume);
        executorService.submit(producerConsumer::consume);
    }
}
