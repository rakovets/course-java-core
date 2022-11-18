package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumerThread implements Runnable {
    private static final int MAX_NUMBER = 10;
    private final Logger logger = Logger.getLogger(ConsumerThread.class.getName());
    private final Store store;
    private final String name;

    public ConsumerThread(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        int numberOfIterations = 0;
        while (numberOfIterations < MAX_NUMBER){
            try {
                logger.log(Level.INFO, name + " " + store.consumer());
                numberOfIterations++;
            } catch (UserInputException e){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
