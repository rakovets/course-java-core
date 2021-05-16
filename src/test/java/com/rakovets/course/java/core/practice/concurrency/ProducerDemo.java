package com.rakovets.course.java.core.practice.concurrency;

import java.io.IOException;

public class ProducerDemo {
    public static void main(String[] args) throws IOException, UserInputException {
        QueueDelay queueDelay = new QueueDelay();
        Producer producer = new Producer(queueDelay);
        Thread threadProducer = new Thread(producer, "Producer");
        threadProducer.start();
        Consumer consumer = new Consumer(queueDelay);
        Thread threadConsumer = new Thread(consumer, "ConsumerOne");
        threadConsumer.start();
        Thread threadConsumerTwo = new Thread(consumer, "ConsumerTwo");
        threadConsumerTwo.start();
    }
}
