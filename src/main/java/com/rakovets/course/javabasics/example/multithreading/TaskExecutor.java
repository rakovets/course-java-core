package com.rakovets.course.javabasics.example.multithreading;

import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskExecutor implements Runnable {
    private ConcurrentLinkedQueue<Integer> queue;


    public TaskExecutor(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (!queue.isEmpty()) {
                Integer poll = queue.poll();
                try {
                    Thread.sleep(poll * 1000);
                    System.out.println("I slept " + poll + " seconds");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
