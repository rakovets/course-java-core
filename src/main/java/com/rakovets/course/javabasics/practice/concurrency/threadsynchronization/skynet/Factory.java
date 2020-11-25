package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.LinkedList;

public class Factory {

    // Create a list shared by producer and consumer
    // Size of list is 2.
    private LinkedList<Integer> details = new LinkedList<>();

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    // Function called by producer thread
    public void produce(int days) throws InterruptedException {

        //сделать генерацию случайного числа и подставить вместо value++ в List.add(value++)

        int value = rnd(0, 10);
        int counterDay = 1;

        while (counterDay == days) {
            synchronized (this) {

                System.out.println("Factory produced-" + value + "; Current size of details = " + details.size());

                // to insert the jobs in the list
                details.add(value);

                // notifies the consumer thread that
                // now it can start consuming
//                    notify();

                //удалить
//                    Thread.sleep(rnd(0,10));
                counterDay++;

            }
        }
    }

    public LinkedList<Integer> getDetails() {
        return details;
    }
}
