package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedProducerQueueConsumer.Consumer;
import com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedProducerQueueConsumer.Container;
import com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedProducerQueueConsumer.Producer;

import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumeDemo {
    public static void main(String[] args) throws InterruptedException {
        String filePath = Paths.get("src", "test", "resources", "concurrent_utilities", "check.txt").toString();
        Container container = new Container();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Thread producer = new Thread(new Producer(container), "Producer");
        executorService.submit(producer);
        Thread.sleep(1000);

        Thread consumer1 = new Thread(new Consumer(container, filePath), "Consumer 1");
        Thread consumer2 = new Thread(new Consumer(container, filePath), "Consumer 2");

        executorService.submit(consumer1);
        executorService.submit(consumer2);
        executorService.shutdown();
    }
}
