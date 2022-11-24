package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private final Logger logger = Logger.getLogger(Producer.class.getName());
    private final Scanner scanner = new Scanner(System.in);
    private final CommonQueue commonQueue;
    public Producer(ThreadGroup threadGroup, String name, CommonQueue commonQueue) {
        super(threadGroup, name);
        this.commonQueue = commonQueue;
    }

    @Override
    public void run() {
        logger.info(Thread.currentThread().getName() + " начал свою работу");
        try {
            while (scanner.hasNext()) {
                try {
                    if (scanner.hasNextInt()) {
                        int i = scanner.nextInt();
                        if (i != -1) {
                            commonQueue.addIntToQueue(i);
                            logger.info(Thread.currentThread().getName() + " entered to queue: " + i);
                            try {
                                sleep(1000);
                            } catch (InterruptedException e) {
                                logger.info(e.getMessage());
                            }
                        } else {
                            logger.info(Thread.currentThread().getName() + " остановлен вводом -1");
                            scanner.close();
                            Thread.currentThread().getThreadGroup().interrupt();
                            logger.info("Все потоки в группе переведены в состояние interrupt. Программа завершена");
                            break;
                        }
                    } else {
                        scanner.next();
                        throw new MyException("Неправильный ввод данных. Ввведите целочисленное значение");
                    }
                } catch (MyException e) {
                    logger.info(e.getMessage());
                }
                logger.info("В очереди сейчас следующие цифры: " + commonQueue.getQueue().toString());
            }
        } catch (IllegalStateException e) {
            logger.info("Сканер не найден");
        } finally {
            scanner.close();
        }
        logger.info("После завершения работы программы в очереди остались следующие цифры: " + commonQueue.getQueue().toString());
    }
}
