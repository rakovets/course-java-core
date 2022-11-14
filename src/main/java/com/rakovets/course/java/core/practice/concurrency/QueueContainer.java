package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class QueueContainer {

    private final Queue<Integer> queue = new LinkedList<>();

    public synchronized void addItem(Integer item) {
        queue.add(item);
    }

    public synchronized Integer getItem() {
        return queue.poll();
    }
}
