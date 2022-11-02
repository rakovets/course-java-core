package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.Queue;

public class Consumer extends Thread {
    private Queue<Integer> numbers;

    public Consumer(Queue<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int seconds = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            seconds = numbers.peek();
            numbers.remove();
            try {
                Thread.sleep(seconds * 1000);
                System.out.println(getName() +" - I slept " + seconds + " seconds");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
