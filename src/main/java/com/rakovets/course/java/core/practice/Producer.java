package com.rakovets.course.java.core.practice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {
    private LinkedList<Integer> queue;
    private ReentrantLock lock;

    public Producer(LinkedList<Integer> queue, ReentrantLock lock) {
        this.queue = queue;
        this.lock = lock;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int delay = Integer.parseInt(scanner.nextLine());
                if (delay == -1) {
                    lock.lock();
                    queue.addFirst(-1);
                    lock.unlock();
                    break;
                } else if (delay < -1) {
                    throw new UserInputException();
                } else {
                    queue.add(delay);
                }
            } catch (UserInputException | NumberFormatException exception) {
                exception.printStackTrace();
            }
        }
    }
}
