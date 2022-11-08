package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueNumbersFromStream {
    private Queue queueNumbers = new ArrayDeque();

    public void addQueueNumbers(int number) {
        this.queueNumbers.add(number);
    }

    public Queue getQueueNumbers() {
        return queueNumbers;
    }
}
