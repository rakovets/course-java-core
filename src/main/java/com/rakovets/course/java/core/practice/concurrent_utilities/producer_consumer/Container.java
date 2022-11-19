package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Container {
    private Queue<Integer> queue = new LinkedList<>();

    public Queue<Integer> getQueue() {
        return queue;
    }
}
