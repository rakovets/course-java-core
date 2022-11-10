package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Container;
import com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer.Producer;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Container queueOfNumbers = new Container();
        String filePath = "D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.concurrency/ProducerConsumer.txt";
        Thread producer = new Thread(new Producer(queueOfNumbers), "Producer");
        producer.start();
        Thread.sleep(10000);
        Thread consumer1 = new Thread(new Consumer(queueOfNumbers, filePath), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(queueOfNumbers, filePath), "Consumer2");
        Thread consumer3 = new Thread(new Consumer(queueOfNumbers, filePath), "Consumer3");
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
