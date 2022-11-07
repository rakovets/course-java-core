package com.rakovets.course.java.core.practice.concurrency;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Queue;

public class Producer extends Thread {
    private final Logger logger = Logger.getLogger(Producer.class.getName());
    private final Queue<Integer> numbers;
    public Producer(Container queue) {
        this.numbers = queue.getQueue();
    }
        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            int number = 0;
            try {
                while ((number = sc.nextInt()) != -1) {
                    numbers.add(number);
                }
            } catch (UserInputException e) {
                logger.info(e.getMessage());
            }
        }
}
