package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_04;

import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.DemoTask04;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private Queue<Integer> queue;
    public Producer(String name, Queue<Integer> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(Producer.class.getName());
        Scanner scanner = new Scanner(System.in);
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
                    throw new MyException("Исключение. Неправильный ввод данных. Ввведите целочисленное значение");
                }
            } catch (MyException e) {
                logger.info(e.getMessage());
            logger.info(queue.toString());
            }
            logger.info("Values in queue: " + queue.toString());
        }
    }
}
