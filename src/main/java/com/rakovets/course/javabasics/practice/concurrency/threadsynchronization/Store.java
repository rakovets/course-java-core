package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce() {
        while (list.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; list.size() < 10; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            list.add(num);
            System.out.println(num+  "numbers." + list.size());
        }
        notify();
    }

    public void consume() {
        while (list.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer got 1 number. The store contains " + list.size() + "numbers.");
        notify();
    }
}
