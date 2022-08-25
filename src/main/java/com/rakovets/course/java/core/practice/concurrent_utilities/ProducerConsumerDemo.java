package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        ProducerConsumer common=new ProducerConsumer();
        executorService.submit(common::produce);
        executorService.submit(common::consume);
        executorService.submit(common::consume);
    }
}
