package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_03;

import java.util.Deque;
import java.util.logging.Logger;

public class Store {
    Logger logger = Logger.getLogger(Store.class.getName());
    private Deque<Integer> deque;
    private int lastNumberInDeque;
    public Store(Deque<Integer> deque) {
        this.deque = deque;
    }

    public void produce(int i) {
        deque.addLast(i);
        lastNumberInDeque = i;
        notifyAll();
    }

    public synchronized int consume() {
        while (deque.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info("Очередь пуста");
            }
        }
        int i = deque.pollFirst();
        notifyAll();
        return i;
    }

    public synchronized Deque<Integer> getDeque() {
        return deque;
    }

    public synchronized int getLastNumberInDeque() {
        return lastNumberInDeque;
    }
}
