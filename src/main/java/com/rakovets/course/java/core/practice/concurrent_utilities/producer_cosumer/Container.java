package com.rakovets.course.java.core.practice.concurrent_utilities.producer_cosumer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Container {
    private static ConcurrentLinkedQueue<Integer> terminalCollector = new ConcurrentLinkedQueue<>();

    public static Integer getFromQueue() {
        int value = terminalCollector.peek();
        if (value != -1) {
            terminalCollector.poll();
        }
        return value;
    }

    public static ConcurrentLinkedQueue<Integer> getTerminalCollector() {
        return terminalCollector;
    }
}
