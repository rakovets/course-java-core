package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private static final Logger logger = Logger.getLogger(Producer.class.getName());

    private QueueNumbersFromStream queue;

    public Producer(String name, QueueNumbersFromStream queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("-1")) {
            try {
                input = scanner.nextLine();
                if (input.matches("\\d+")) {
                    queue.addQueueNumbers(Integer.valueOf(input));
                } else {
                    throw new UserInputException("Incorrect data entry!");
                }
            } catch (UserInputException e) {
                logger.severe(e.getMessage());
            }
        }
    }
}
