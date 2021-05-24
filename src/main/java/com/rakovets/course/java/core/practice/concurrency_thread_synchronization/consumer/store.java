package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.consumer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class store {

    private boolean isAlive = true;
    private final int capacity = 10;
    private Deque<Integer>storage = new LinkedList<>();
    Random random = new Random();

    public void End(){
        isAlive = false;
    }


    public synchronized int getPrimeNumber(){ // костыли для простых чисел//
        int randomValue = random.nextInt(10);
        switch (randomValue){
            case 0: {
                randomValue = 2;
                return randomValue;
            }
            case 1:{
                randomValue = 3;
                return randomValue;
            }
            case 2:{
                randomValue = 5;
                return randomValue;
            }
            case 3:{
                randomValue = 7;
                return randomValue;
            }
            case 4:{
                randomValue = 11;
              return randomValue;
            }
            case 5:{
                randomValue = 13;
                return randomValue;
            }
            case  6:{
                randomValue = 17;
                return randomValue;
            }
            case 7:{
                randomValue = 19;
                return randomValue;
            }
            case 8:{
                randomValue = 23;
                return randomValue;
            }
            case 9:{
                randomValue = 29;
                return randomValue;
            }
            case 10:{
                randomValue = 31;
                return randomValue;
            }

        }
        return randomValue;
    }

    public synchronized void produce() throws InterruptedException{
        while (isAlive){
            if (storage.size() >= capacity) {
                notifyAll();
                wait();
            }
        int value = getPrimeNumber();
        storage.add(value);
        System.out.println(Thread.currentThread().getName() + "add number " + value);
        System.out.println("Size of store is " + storage.size());

        }
    }

    public synchronized void consume() throws InterruptedException{
        while (isAlive){
            if (storage.size() < 1) {
                wait();
            }
        int drop = storage.removeFirst();
            notifyAll();
        System.out.println(Thread.currentThread().getName() + "drop number " + drop);

        }
    }




}
