package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.ProducerTread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.Store;

import java.util.Arrays;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store(10);

        Thread consumerThread = new Thread(new ConsumerThread(store), "consumer thread 0");
        Thread consumerThread1 = new Thread(new ConsumerThread(store), "consumer thread 1");
        Thread consumerThread2 = new Thread(new ConsumerThread(store), "consumer thread 2");

        Thread producerThread = new Thread(new ProducerTread(store), "producer thread 0");
        Thread producerThread1 = new Thread(new ProducerTread(store), "producer thread 1");
        Thread producerThread2 = new Thread(new ProducerTread(store), "producer thread 2");

        Arrays.asList(consumerThread, consumerThread1, consumerThread2,
                producerThread, producerThread1, producerThread2).forEach(Thread::start);

        for (Thread thread : Arrays.asList(consumerThread, consumerThread1, consumerThread2,
                producerThread, producerThread1, producerThread2)) {
            thread.join();
        }
    }
}
