
package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Queue;

public class ConcurrencyDemo {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new ArrayDeque<>();
        Producer producer = new Producer(queue);
        File file = Path.of("src","test","resources", "test.txt").toFile();
        Consumer consumer = new Consumer(queue, file.toPath());
        Consumer consumer2 = new Consumer(queue, file.toPath());
        Consumer consumer3 = new Consumer(queue, file.toPath());

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);
        Thread threadConsumer2 = new Thread(consumer2);
        Thread threadConsumer3 = new Thread(consumer3);

        threadProducer.start();
        threadConsumer.start();
        threadConsumer2.start();
        threadConsumer3.start();

        threadProducer.join();
        threadConsumer.join();
        threadConsumer2.join();
        threadConsumer3.join();
    }
}
