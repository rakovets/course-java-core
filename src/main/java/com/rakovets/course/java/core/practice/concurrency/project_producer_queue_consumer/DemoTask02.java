package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DemoTask02 {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            System.out.println("Thread Producer started");
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    queue.offer(scanner.nextInt());
                    System.out.println("Entered value to queue: " + queue.peek());
                    System.out.println("Removed from queue: " + queue.poll());
                } else {
                    scanner.next();
                }
            }
            System.out.println("Thread Producer finished");
        };
        Thread producer = new Thread(producerRun, "Producer");
        producer.start();
    }
}
