package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class QueueNumbersFromStream {
    private final Queue<Integer> queueNumbers = new ArrayDeque<>();
    private final ReentrantLock lock = new ReentrantLock();

    public void addQueueNumbers(int number) {
        this.queueNumbers.add(number);
    }

    public Queue<Integer> getQueueNumbers() {
        return queueNumbers;
    }

    public int getQueueNumber() {
        lock.lock();
        int number = queueNumbers.poll();
        lock.unlock();
        return number;
    }
}
