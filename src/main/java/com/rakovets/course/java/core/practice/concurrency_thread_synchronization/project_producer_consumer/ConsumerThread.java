package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer;

import java.util.logging.Logger;

public class ConsumerThread extends Thread {
    private final Logger logger = Logger.getLogger(ConsumerThread.class.getName());
    private final Store store;
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
