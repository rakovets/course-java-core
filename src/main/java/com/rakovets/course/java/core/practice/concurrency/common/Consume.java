package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.LinkedList;

public class Consume extends Thread{
    private LinkedList consume;
    private Store store;

    public Consume() {
    }

    @Override
    public void run() {
        store.consume();
   }
}
