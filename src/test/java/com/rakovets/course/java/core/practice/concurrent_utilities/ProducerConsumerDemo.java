package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.FileHelper;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Producer;
import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.QueueContainer;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Path pathToFile = Paths.get("src","test","resources","producerConsumer.txt");
        FileHelper fileHelper = new FileHelper();
        fileHelper.setFilename(String.valueOf(pathToFile));

        QueueContainer queueContainer = new QueueContainer();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(new Producer(queueContainer));
        for (int x = 0; x < 3; x++) {
            executorService.submit(new Consumer(queueContainer, fileHelper));
        }
    }
}