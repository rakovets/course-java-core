package com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem.service.impl;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem.service.Counter;

public class CounterDetail implements Counter {
    private long count = 0;

    public void increment() {
        long tmp = count; // read
        tmp = tmp + 1; // modify
        count = tmp; // write
    }

    public long get() {
        return count;
    }
}
