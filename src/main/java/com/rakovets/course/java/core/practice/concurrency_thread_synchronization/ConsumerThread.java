package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumerThread implements Runnable {
    private final Logger logger = Logger.getLogger(ConsumerThread.class.getName());
    private final Store store;
    private final String name;

    public ConsumerThread(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        int g = 0;
        while (g < 10){
            try {
                logger.log(Level.INFO, name + " " + store.consumer());
                g++;
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
