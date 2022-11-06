package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class DemoTask08 {
    public static void main(String[] args) throws DemoTask04.MyException {
        final int NUMBERS_OF_CONSUMERS_THREAD = 3;
        Logger logger = Logger.getLogger(DemoTask08.class.getName());
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
        };
        Runnable consumerRun = () -> {
            logger.info("Thread Consumer started");
            while (!Thread.currentThread().isInterrupted()) {
                if (queue.peek() != null) {
                    int i = queue.poll();
                    logger.info(Thread.currentThread().getName() + " получил из очереди цифру " + i);
                    logger.info("В очереди сейчас следующие цифры: " + queue.toString());
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\MyDir\\" + Thread.currentThread().getName(), true))) {
                        Thread.sleep(Math.abs(i) * 1000);
                        String textToFile = new Timestamp(System.currentTimeMillis()).toString() + " - " + Thread.currentThread().getName() + " - " + "I slept " + Math.abs(i) + " seconds\n";
                        logger.info(textToFile);
                        bw.write(textToFile);
                    } catch (InterruptedException e) {
                        logger.info("В очереди остались следующие цифры: " + queue.toString());
                        Thread.currentThread().interrupt();
                    } catch (IOException ex) {
                        logger.info(ex.getMessage());
                    }
                } else {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\MyDir\\" + Thread.currentThread().getName(), true))) {
                        Thread.sleep(5000);
                        String textToFile = new Timestamp(System.currentTimeMillis()).toString() + " - " + Thread.currentThread().getName() + " - " + "...\n";
                        logger.info(textToFile);
                        bw.write(textToFile);
                    } catch (InterruptedException e) {
                        logger.info("В очереди остались следующие цифры: " + queue.toString());
                        Thread.currentThread().interrupt();
                    } catch (IOException ex) {
                        logger.info(ex.getMessage());
                    }
                }
            }
        };
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        new Thread(threadGroup, producerRun, "Producer").start();
        for (int i = 1; i <= NUMBERS_OF_CONSUMERS_THREAD; i++) {
            new Thread(threadGroup, consumerRun, "Consumer " + i).start();
        }
    }
}
