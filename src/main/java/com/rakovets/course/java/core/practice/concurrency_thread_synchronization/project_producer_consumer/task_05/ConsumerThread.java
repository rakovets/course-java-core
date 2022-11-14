package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_05;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_03.Store;

import java.util.logging.Logger;

public class ConsumerThread extends Thread {
    Logger logger = Logger.getLogger(ConsumerThread.class.getName());
    private Store store;
    public ConsumerThread(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int i = store.consume();
            logger.info(Thread.currentThread().getName() + " взял из очереди цифру " + i);
            try {
                Thread.sleep(300 * (11 - store.getDeque().size()));
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
    }
}
