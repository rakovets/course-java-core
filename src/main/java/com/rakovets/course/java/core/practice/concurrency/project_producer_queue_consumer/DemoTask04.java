package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DemoTask04 {
    public static void main(String[] args) throws MyException {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            System.out.println("Thread Producer started");
            while (scanner.hasNext()) {
                try {
                    if (scanner.hasNextInt()) {
                        int i = scanner.nextInt();
                        if (i != -1) {
                            queue.offer(i);
                            System.out.println(Thread.currentThread().getName() + " entered to queue: " + queue.peek());
                            System.out.println(Thread.currentThread().getName() + " removed from queue: " + queue.poll());
                        } else {
                            System.out.println("Entering is ended.");
                            break;
                        }
                    } else {
                        scanner.next();
                        throw new MyException("Неправильный ввод данных. Ввведите целочисленное значение");
                    }
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Thread Producer finished");
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
