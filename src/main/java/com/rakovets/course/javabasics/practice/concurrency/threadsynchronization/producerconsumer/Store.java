package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    LinkedList<Integer> products= new LinkedList<>();

    public synchronized void consume()  {
        while (products.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.removeFirst();
        StandardOutputUtil.printlnWithTimeAndThread("Customer bought 1 product", AnsiColorCode.FG_RED_BOLD);
        StandardOutputUtil.printlnWithTimeAndThread("Availability of products " + products.size(),AnsiColorCode.FG_RED_BOLD);
        notify();
    }

    public synchronized void produce() {
        while (products.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Random r = new Random();
        products.offer(r.nextInt(10));
        StandardOutputUtil.printlnWithTimeAndThread("Producer added 1 product to the Store.", AnsiColorCode.FG_WHITE_BOLD);
        StandardOutputUtil.printlnWithTimeAndThread("Total products in the Store: " + products.size(), AnsiColorCode.FG_WHITE_BOLD);
        notify();
    }
}
