package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Container {
    private final Queue<Integer> queue1 = new LinkedList<>();

    public Queue<Integer> getQueue() {
        return queue1;
    }
}
