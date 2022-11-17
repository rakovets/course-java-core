package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class Container {
    private final Queue<Integer> queue = new LinkedList<>();

    public void addItem(Integer item) {
        queue.add(item);
    }

    public Integer getItem() {
        return queue.poll();
    }
}
