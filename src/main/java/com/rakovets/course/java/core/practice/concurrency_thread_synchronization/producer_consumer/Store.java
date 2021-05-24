package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Store {
    private  Deque<Integer> numbersStorage = new LinkedList<>();
    private  Random rnd = new Random();

    public synchronized void produce (){
        if (numbersStorage.size() > 9) {
            try {
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int addedNumber = rnd.nextInt(100);
        numbersStorage.add(addedNumber);
        System.out.println(Thread.currentThread().getName() + " number " + addedNumber + " was added.");
        System.out.println("Store size is " + numbersStorage.size());
        notify();
    }

    public synchronized void consume() {
        if (numbersStorage.size() < 1) {
            try {
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int removedNumber = numbersStorage.removeFirst();
        System.out.println(Thread.currentThread().getName() + " used number " + removedNumber);
        System.out.println("Store size is " + numbersStorage.size());
        try {
            Thread.sleep(rnd.nextInt(11));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}
