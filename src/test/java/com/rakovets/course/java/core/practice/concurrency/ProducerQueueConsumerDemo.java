package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Producer;
import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.QueueNumbersFromStream;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) {
        QueueNumbersFromStream queue = new QueueNumbersFromStream();

        Producer producer = new Producer("Producer", queue);
        Consumer consumer1 = new Consumer("Consumer 1", queue);
        Consumer consumer2 = new Consumer("Consumer 2", queue);
        Consumer consumer3 = new Consumer("Consumer 3", queue);

        producer.start();

        try {
            producer.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
