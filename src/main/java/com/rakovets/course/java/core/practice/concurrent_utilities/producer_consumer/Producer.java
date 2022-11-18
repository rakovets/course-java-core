package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    public static final Logger logger = Logger.getLogger(Producer.class.getName());
    private final ConcurrentLinkedQueue<Integer> container;
    private final ReentrantLock locker;

    public Producer(ConcurrentLinkedQueue<Integer> container, ReentrantLock locker) {
        this.container = container;
        this.locker = locker;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter a lot of numbers");
        int number = 0;
        while (number != -1) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < -1) {
                    throw new UserInputException();
                } else {
                    locker.lock();
                    container.add(number);
                    locker.unlock();
                }
            } catch (UserInputException | IllegalArgumentException e) {
                locker.unlock();
                logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
                number = 0;
            }
            locker.unlock();
        }
        sc.close();
    }
}
