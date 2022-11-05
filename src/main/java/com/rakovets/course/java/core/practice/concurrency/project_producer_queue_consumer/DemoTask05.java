package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class DemoTask05 {
    public static void main(String[] args) throws DemoTask04.MyException {
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            synchronized (queue) {
                System.out.println("Thread Producer started");
                while (scanner.hasNext()) {
                    try {
                        if (scanner.hasNextInt()) {
                            int i = scanner.nextInt();
                            if (i != -1) {
                                if (queue.offerLast(i)) {
                                    System.out.println(Thread.currentThread().getName() + " entered to queue: " + i);
                                }
                            } else {
                                System.out.println("Entering is ended.");
                                Thread.currentThread().getThreadGroup().interrupt();
                                System.out.println("Все потоки в группе остановлены.");
                                break;
                            }
                        } else {
                            scanner.next();
                            throw new DemoTask04.MyException("Неправильный ввод данных. Ввведите целочисленное значение");
                        }
                    } catch (DemoTask04.MyException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Thread Producer finished");
            }
        };
        Runnable consumerRun = () -> {
            System.out.println("Thread Consumer started");
            while (!Thread.currentThread().getThreadGroup().isDestroyed()) {
                if (queue.peekFirst() != null) {
                    int i = queue.pollFirst();
                    System.out.println(Thread.currentThread().getName() + " получил из очереди цифру " + i);
                    try {
                        Thread.sleep(i * 1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println("Thread Consumer finished");
        };
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        Thread producer = new Thread(threadGroup, producerRun, "Producer");
        Thread consumer = new Thread(threadGroup, consumerRun, "Consumer");
        producer.start();
        consumer.start();
        System.out.println("Main is finished.");
    }
}
