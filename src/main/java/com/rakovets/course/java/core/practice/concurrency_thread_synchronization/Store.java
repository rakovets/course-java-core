package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Store {
    private  Deque<Integer> numbersStorage = new LinkedList<>();
    private  Random rnd = new Random();

    public synchronized void produce (){
        while (numbersStorage.size() > 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int addedNumber = rnd.nextInt(100);
        numbersStorage.add(addedNumber);
        System.out.println(Thread.currentThread().getName() + " number " + addedNumber + " was added.");
        notify();
    }

    public synchronized void consume() {
        while (numbersStorage.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int removedNumber = numbersStorage.removeFirst();
        System.out.println(Thread.currentThread().getName() + " used number " + removedNumber);
        try {
            Thread.sleep(rnd.nextInt(11));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}
