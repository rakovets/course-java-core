package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DemoTask06 {
    public static void main(String[] args) throws DemoTask04.MyException {
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
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
                            try {
                                Thread.currentThread().getThreadGroup().interrupt();
                            } catch (SecurityException e) {
                                //System.out.println("Потоки в группе в статусе прерваны");
                            }
                            System.out.println("Потоки в группе в статусе прерваны");
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
        };
        Runnable consumerRun = () -> {
            System.out.println("Thread Consumer started");
            while (true) {
                if (queue.peekFirst() != null) {
                    int i = queue.pollFirst();
                    System.out.println(Thread.currentThread().getName() + " получил из очереди цифру " + i);
                    try {
                        Thread.sleep(i * 5000);
                        System.out.println(Thread.currentThread().getName() + " спал " + i + " секунд.");
                    } catch (InterruptedException e) {
                        System.out.println("Сон потока Consumer прерван.");
                        Thread.currentThread().interrupt();
                        if (Thread.currentThread().isInterrupted()) {
                            System.out.println("Thread Consumer finished");
                            break;
                        }
                    }
                }
                if (Thread.currentThread().isInterrupted()) {
                System.out.println("Thread Consumer finished");
                break;
                }
            }
        };
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        Thread producer = new Thread(threadGroup, producerRun, "Producer");
        Thread consumer = new Thread(threadGroup, consumerRun, "Consumer");
        producer.start();
        consumer.start();
        System.out.println("Main is finished.");
    }
}
