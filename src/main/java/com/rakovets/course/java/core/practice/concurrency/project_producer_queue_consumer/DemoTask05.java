package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class DemoTask05 {

    public static void main(String[] args) throws DemoTask04.MyException {
        Logger logger = Logger.getLogger(DemoTask05.class.getName());
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            synchronized (queue) {
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
                                Thread.currentThread().getThreadGroup().interrupt();
                                logger.info("Все потоки в группе переведены в состояние interrupt.");
                                break;
                            }
                        } else {
                            scanner.next();
                            throw new DemoTask04.MyException("Неправильный ввод данных. Ввведите целочисленное значение");
                        }
                    } catch (DemoTask04.MyException e) {
                        logger.info(e.getMessage());
                    }
                    logger.info("В очереди сейчас следующие цифры: " + queue.toString());
                }
            }
        };
        Runnable consumerRun = () -> {
            logger.info("Thread Consumer started");
            while (!Thread.currentThread().isInterrupted()) {
                if (queue.peek() != null) {
                    int i = queue.poll();
                    logger.info(Thread.currentThread().getName() + " получил из очереди цифру " + i);
                    try {
                        Thread.sleep(i * 1000);
                        logger.info("Consumer slept: " + i + " millis");
                    } catch (InterruptedException e) {
                        logger.info("В очереди остались следующие цифры: " + queue.toString());
                    }
                }
            }
            logger.info("Thread Consumer also finished");
        };
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        Thread producer = new Thread(threadGroup, producerRun, "Producer");
        Thread consumer = new Thread(threadGroup, consumerRun, "Consumer");
        producer.start();
        consumer.start();
        logger.info("Main is finished.");
    }
}
