package com.rakovets.java.practice.multithreading;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UserScannerTasksDemo {
    public static void main(String[] args) throws InterruptedException {
        int userInput = 0;
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        Thread executor = new Thread(new TaskExecutor(queue));
        executor.setDaemon(true);
        executor.start();
        // First Scan user's input
        while (userInput != -1) {
            Thread.sleep(2000);
            queue.add(userInput++);
            System.out.println("Add to queue: " + userInput);

            // task finish
            // Scan user's input
        }
    }
}
