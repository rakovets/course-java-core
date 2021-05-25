package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.threads.Consumer;
import com.rakovets.course.java.core.practice.concurrency.threads.Producer;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) {
        Thread read = new Thread(new Producer());
        read.setName("Producer");
        Thread write = new Thread(new Consumer());
        write.setName("Consumer");
        read.start();
        write.start();
    }
}
