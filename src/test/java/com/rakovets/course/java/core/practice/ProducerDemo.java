package com.rakovets.course.java.core.practice;

public class ProducerDemo {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Thread threadProducer = new Thread(producer, "Producer");
        threadProducer.start();

        Thread threadConsumer = new Thread(new Consumer(), "ConsumerOne");
        threadConsumer.start();

        Thread threadConsumerTwo = new Thread(new Consumer(), "ConsumerTwo");
        threadConsumerTwo.start();
    }
}
