package com.rakovets.course.java.core.practice.concurrency;

import java.util.ArrayDeque;
import java.util.Deque;

public class Container {
    private static Deque<Integer> terminalCollector = new ArrayDeque<>();

    public static synchronized Integer getFromQueue() {
        int value = terminalCollector.peek();
            if (value != -1) {
                terminalCollector.poll();
            }
        return value;
    }

    public static Deque<Integer> getTerminalCollector() {
        return terminalCollector;
    }
}
