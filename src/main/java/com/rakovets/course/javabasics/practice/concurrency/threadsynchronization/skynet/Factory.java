package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class Factory {
    private int amountDetails;

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void produce(int days) {
        int counterDay = 1;
        while (counterDay < days) {
            int value = rnd(1, 10);
            synchronized (this) {
                amountDetails += value;
                counterDay++;
            }
        }
    }

    public void consume(int days, Fraction fraction) {
        int counterDay = 1;
        while (counterDay < days) {
            int value = rnd(1, 5);
            synchronized (this) {
                if (amountDetails < value && amountDetails > 0) {
                    fraction.sortDetails(amountDetails);
                    amountDetails = 0;
                } else if (amountDetails > value) {
                    fraction.sortDetails(value);
                    amountDetails -= value;
                }
                counterDay++;
            }
        }
    }

}
