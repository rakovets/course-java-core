package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    public static final Logger logger = Logger.getLogger(Producer.class.getName());

    private final Queue<Integer> digits;

    public Producer(Container queue1) {
        this.digits = queue1.getQueue();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int digitOfUserEnter = sc.nextInt();
                digits.add(digitOfUserEnter);
                if (digitOfUserEnter == -1) {
                    break;
                }
                logger.log(Level.INFO, String.format("%d", digitOfUserEnter));
            } catch (UserInputException e) {
                logger.log(Level.SEVERE, "Error " + e);
            }
        }
    }
}
