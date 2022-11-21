package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class QueueNumbersFromStream {
    private Queue<Integer> queueNumbers = new ArrayDeque();
    private ReentrantLock lock = new ReentrantLock();

    public void addQueueNumbers(int number) {
        try {
            lock.lock();
            this.queueNumbers.add(number);
        } finally {
            lock.unlock();
        }
    }

    public Queue getQueueNumbers() {
        return queueNumbers;
    }

    public int getQueueNumber() {
        int number;
        try {
            lock.lock();
            number = queueNumbers.poll();
        } finally {
            lock.unlock();
        }
        return number;
    }
}
