package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;

import java.util.Random;

public class Factions {
    private final Random random = new Random();
    private final Factory factory;
    private int head = 0;
    private int torso = 0;
    private int hand = 0;
    private int feet = 0;

    public Factions(Factory factory) {
        this.factory = factory;
    }

    public synchronized void getPartsFromFactory() {
        if (!factory.isDay()) {
            final int MAX_GETTING_PARTS_EACH_DAYS = 5;
            for (int i = 0; i < MAX_GETTING_PARTS_EACH_DAYS; i++) {
                switch (random.nextInt(4)) {
                    case 0:
                        if (factory.pickUpHead()) {
                            head++;
                        }
                        break;
                    case 1:
                        if (factory.pickUpTorso()) {
                            torso++;
                        }
                        break;
                    case 2:
                        if (factory.pickUpHand()) {
                            hand++;
                        }
                        break;
                    case 3:
                        if (factory.pickUpFeet()) {
                            feet++;
                        }
                        break;
                }
            }
            notifyAll();
            factory.setDay(true);
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printAmountsPart() {
        System.out.println("---" + Thread.currentThread().getName() + "---\n Amount heads: " + head
                + " Amount torso: " + torso
                + " Amount hands: " + hand
                + " Amount feet: " + feet);
    }
}
