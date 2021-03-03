package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.LinkedList;
import java.util.Random;

public class Factory {
    LinkedList<RoboParts> storage = new LinkedList<>();

    public synchronized void produceParts() {
        Random random = new Random();

        int quantity = random.nextInt(11);

        for (int i = 0; i < quantity; i++) {
            int parts = random.nextInt(4);
            switch (parts) {
                case 0:
                    storage.add(RoboParts.HEAD);
                    break;
                case 1:
                    storage.add(RoboParts.TORSO);
                    break;
                case 2:
                    storage.add(RoboParts.HAND);
                    break;
                case 3:
                    storage.add(RoboParts.FEET);
                    break;
            }
        }
    }

    public synchronized LinkedList<RoboParts> consumeParts() {
        LinkedList<RoboParts> listOfParts = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            if (!storage.isEmpty()) {
                listOfParts.add(storage.removeFirst());
                try {
                    wait(2);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return listOfParts;
    }

    public LinkedList<RoboParts> getStorage() {
        return storage;
    }
}
