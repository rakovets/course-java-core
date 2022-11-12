package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.util.Queue;

public class CommonStringQueue {
    private Queue<String> queue;
    public CommonStringQueue(Queue<String> queue) {
        this.queue = queue;
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public void addStringToQueue(String str) {
        queue.offer(str);
    }

    public String checkStringInQueue() throws NullPointerException {
        if (queue.peek() == null) {
            return null;
        } else {
            return queue.peek();
        }
    }

    public String removeStringFromQueue() throws NullPointerException {
        return queue.poll();
    }
}
