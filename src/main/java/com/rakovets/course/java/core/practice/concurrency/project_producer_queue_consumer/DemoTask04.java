package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class DemoTask04 {
    public static void main(String[] args) throws MyException {
        Logger logger = Logger.getLogger(DemoTask04.class.getName());
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            logger.info("Thread Producer started");
            while (scanner.hasNext()) {
                try {
                    if (scanner.hasNextInt()) {
                        int i = scanner.nextInt();
                        if (i != -1) {
                            queue.offer(i);
                            logger.info(Thread.currentThread().getName() + " entered to queue: " + i);
                        } else {
                            logger.info("Thread Producer is ended by entering -1.");
                            break;
                        }
                    } else {
                        scanner.next();
                        throw new MyException("Неправильный ввод данных. Ввведите целочисленное значение");
                    }
                } catch (MyException e) {
                    logger.info(e.getMessage());
                }
                logger.info(queue.toString());
            }
        };
        Thread producer = new Thread(producerRun, "Producer");
        producer.start();
    }

    public static class MyException extends Exception {
        private String message;

        public MyException(String message) {
            super(message);
        }
    }
}
