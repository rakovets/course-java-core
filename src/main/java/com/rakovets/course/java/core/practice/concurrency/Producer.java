package com.rakovets.course.java.core.practice.concurrency;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private final Queue<Integer> numbers;

    public Producer(Container queue) {
        this.numbers = queue.getQueue();
    }

    public static final Logger logger = Logger.getLogger(Producer.class.getName());

   @Override
   public void run() {
       Scanner sc = new Scanner(System.in);
        int number;
        try {
            while ((number = sc.nextInt()) != -1) {
             numbers.add(number);
            }
        } catch (UserInputException e) {
            logger.info(e.getMessage());
        }
    }
}
