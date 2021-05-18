package com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem.service.impl;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem.service.Counter;

public class CounterSimple implements Counter {
    private long count = 0;

    public void increment() {
        count++;
    }

    public long get() {
        return count;
    }
}
