package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private final CommonQueue commonQueue;
    public Producer(ThreadGroup threadGroup, String name, CommonQueue commonQueue) {
        super(threadGroup, name);
        this.commonQueue = commonQueue;
    }

    @Override
    public void run() {
        final Logger logger = Logger.getLogger(Producer.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Thread Producer started");
        while (scanner.hasNext()) {
            try {
                if (scanner.hasNextInt()) {
                    int i = scanner.nextInt();
                    if (i != -1) {
                        commonQueue.addIntToQueue(i);
                        logger.info(Thread.currentThread().getName() + " entered to queue: " + i);
                    } else {
                        logger.info("Thread Producer is ended by entering -1.");
                        scanner.close();
                        Thread.currentThread().getThreadGroup().interrupt();
                        logger.info("Все потоки в группе переведены в состояние interrupt.");
                        break;
                    }
                } else {
                    scanner.next();
                    throw new MyException("Исключение. Неправильный ввод данных. Ввведите целочисленное значение");
                }
            } catch (MyException e) {
                logger.info(e.getMessage());
            }
            logger.info("В очереди сейчас следующие цифры: " + commonQueue.getQueue().toString());
        }
    }
}
