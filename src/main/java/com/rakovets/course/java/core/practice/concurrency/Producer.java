package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {
    private final static Logger logger = Logger.getLogger(Producer.class.getName());
    private Queue<Integer> queue = new LinkedList<>();

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }


    public synchronized boolean addItem(Integer item) {
        return queue.add(item);
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        logger.log(Level.INFO, "Enter integer number: ");

        while (true) {
            try {
                int number = sc.nextInt();
                try {
                    if (number != -1) {
                        addItem(Math.abs(number));
                    } else {
                        logger.log(Level.INFO, "Producer was closed ");
                        sc.close();
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw new UserInputException("Warning! Enter only integer numbers!");
                }
            } catch (UserInputException e) {
                logger.log(Level.SEVERE, "ERROR " + e.getMessage());
            }
        }
    }
}
