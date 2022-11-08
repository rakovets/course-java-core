package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInput {
    private Queue<Integer> queueInput = new LinkedList<>();

    public synchronized Queue<Integer> getQueue() {
        return queueInput;
    }

    public synchronized void addQueue(Integer integer) {
        queueInput.add(integer);
    }
}
