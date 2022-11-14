package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_01;

import java.util.Deque;

public class Store {
    private Deque<Integer> deque;
    public Store(Deque<Integer> deque) {
        this.deque = deque;
    }
}
