package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.Queue;

public class CommonQueue {
    private final Queue<Integer> queue;
    public CommonQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void addIntToQueue(int i) {
        queue.offer(i);
    }

    public int removeIntFromQueue() throws NullPointerException {
        return queue.poll();
    }
}
