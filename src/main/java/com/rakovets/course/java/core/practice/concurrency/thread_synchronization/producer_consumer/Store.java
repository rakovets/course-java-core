package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private final LinkedList<Integer> list = new LinkedList<>();
    protected final int SIZE = 10;

    public synchronized void produce() {
        while (list.size() == SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (list.size() < SIZE) {
            list.add(new Random().nextInt());
            StandardOutputUtil.printlnWithTimeAndThread("Producer added 1 product to the Store.",
                    AnsiColorCode.FG_GREEN_BOLD);
            StandardOutputUtil.printlnWithTimeAndThread("Total products in the Store: " + list.size(),
                    AnsiColorCode.FG_BLUE_BOLD);
        }
        notify();
    }

    public synchronized void consume() {
        while (list.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.removeFirst();
        StandardOutputUtil.printlnWithTimeAndThread("Consumer got 1 product from the Store.",
                AnsiColorCode.FG_RED_BOLD);
        StandardOutputUtil.printlnWithTimeAndThread("Total products in the Store: " + list.size(),
                AnsiColorCode.FG_BLUE_BOLD);
        notify();
    }
}
