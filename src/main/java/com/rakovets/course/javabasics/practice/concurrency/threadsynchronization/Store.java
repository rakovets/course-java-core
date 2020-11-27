package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.LinkedList;

public class Store {
    public synchronized void put() {
        LinkedList list = new LinkedList();
        while (list.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(0); //?
    }


}
