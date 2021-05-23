package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.Random;

public class Factory {
    private boolean isDay = true;
    private static final Random random = new Random();
    private int head = 0;
    private int torso = 0;
    private int hand = 0;
    private int feet = 0;

    public synchronized void produceParts() {
        if (isDay) {
            final int PARTS_EACH_DAY = 10;
            for (int i = 0; i < PARTS_EACH_DAY; i++) {
                switch (random.nextInt(4)) {
                    case 0:
                        head++;
                        break;
                    case 1:
                        torso++;
                        break;
                    case 2:
                        hand++;
                        break;
                    case 3:
                        feet++;
                        break;
                }
            }
            setDay(false);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printFactoryDayResult() {
        System.out.println("---Factory producing day result---\n Heads: " + head
                + " Torso: " + torso
                + " Hands: " + hand
                + " Feet: " + feet);
    }

    public boolean pickUpHead() {
        if (head > 0) {
            head--;
            return true;
        }
        return false;
    }

    public boolean pickUpTorso() {
        if (torso > 0) {
            torso--;
            return true;
        }
        return false;
    }

    public boolean pickUpHand() {
        if (hand > 0) {
            hand--;
            return true;
        }
        return false;
    }

    public boolean pickUpFeet() {
        if (feet > 0) {
            feet--;
            return true;
        }
        return false;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    public boolean isDay() {
        return isDay;
    }
}
