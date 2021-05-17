package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.threads.ReadQueueAndWriteAtFile;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new ReadQueueAndWriteAtFile());
        thread.start();
    }
}
