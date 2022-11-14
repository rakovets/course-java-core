package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_02;

import java.util.Deque;
import java.util.logging.Logger;

public class Store {
    Logger logger = Logger.getLogger(Store.class.getName());

    private Deque<Integer> deque;
    public Store(Deque<Integer> deque) {
        this.deque = deque;
    }

    public synchronized void produce(int i) {
        while (deque.size() >= 10 ) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info("Очередь заполнена");
            }
        }
        deque.addLast(i);
        notify();
    }
}
