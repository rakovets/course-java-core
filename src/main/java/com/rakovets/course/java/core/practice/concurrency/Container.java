package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class Container {
    private Queue<Integer> queue = new LinkedList<>();

    public Queue<Integer> getQueue() {
        return queue;
    }
}
