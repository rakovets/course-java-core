package com.rakovets.course.javabasics.producerconsumer;

import java.util.LinkedList;

public class Store {

    // Create a list shared by producer and consumer
    // Size of list is 2.
    LinkedList<Integer> list = new LinkedList<>();
    private static final int CAPACITY = 10;

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    // Function called by producer thread
    public void produce() throws InterruptedException {

        //сделать генерацию случайного числа и подставить вместо value++ в List.add(value++)


        int value = rnd(0,10);
        while (true) {
            synchronized (this) {
                // producer thread waits while list
                // is full
                while (list.size() == CAPACITY) {
                    wait();
                }

                System.out.println("Producer produced-" + value + "; Current size of list = " + list.size());

                // to insert the jobs in the list
                list.add(value);

                // notifies the consumer thread that
                // now it can start consuming
                notify();

                //удалить
                Thread.sleep(rnd(0,10));

            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // consumer thread waits while list
                // is empty
                while (list.size() == 0) {
                    wait();
                }

                // to retrive the ifrst job in the list
                int val = list.removeFirst();

                System.out.println("Consumer consumed-" + val + "; Current size of list = " + list.size());

                // Wake up producer thread
                notify();

                // and sleep
                //изменить харкод 1000мс на случайное от 0 до 10мс
                Thread.sleep(rnd(0,10));
            }
        }
    }
}

