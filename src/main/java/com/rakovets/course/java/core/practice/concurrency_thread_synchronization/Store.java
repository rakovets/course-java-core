package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Store {
    private Deque<Integer> numbers;
    private boolean isAlive = true;

    public Store() {
        this.numbers = new LinkedList<>();
    }

    public synchronized void produce() {
        while (isAlive) {
            while (numbers.size() >= 9) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int newNumber = new Random().nextInt();
            numbers.addLast(newNumber);
            StandardOutputUtil.printlnWithTimeAndThread("Add number : " + newNumber
                    + " to Store numbers " + Thread.currentThread().getName(), AnsiColorCode.FG_BLUE);
            StandardOutputUtil.printlnWithTimeAndThread("Store size : " + numbers.size(), AnsiColorCode.FG_GREEN);
            notifyAll();
        }
    }

    public synchronized void consumer() {
        while (isAlive) {
            while (numbers.size() < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int removedNumber = numbers.removeFirst();
            StandardOutputUtil.printlnWithTimeAndThread("Removed number : " + removedNumber
                    + " from Store numbers " + Thread.currentThread().getName(), AnsiColorCode.FG_RED);
            StandardOutputUtil.printlnWithTimeAndThread("Store size : " + numbers.size(), AnsiColorCode.FG_GREEN);
            notifyAll();
        }
    }

    public void endOfRun() {
        isAlive = false;
    }
}
