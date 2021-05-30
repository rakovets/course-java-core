package com.rakovets.course.java.core.practice.concurrency;

public class ProducerDemo {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Producer producer = new Producer(repository.queue);

        Thread threadProducer = new Thread(producer, "Producer");
        threadProducer.start();

        Thread threadConsumer = new Thread(new Consumer(repository.queue), "ConsumerOne");
        threadConsumer.start();

        Thread threadConsumerTwo = new Thread(new Consumer(repository.queue), "ConsumerTwo");
        threadConsumerTwo.start();
    }
}
