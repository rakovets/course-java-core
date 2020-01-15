package com.rakovets.java.multithreading.skynet;

import java.util.LinkedList;
import java.util.Random;

public class Warehouse {
    int worldRobotHead = 0;
    int worldRobotTorso = 0;
    int worldRobotHand = 0;
    int worldRobotFeet = 0;

    int wednesdayRobotHead = 0;
    int wednesdayRobotTorso = 0;
    int wednesdayRobotHand = 0;
    int wednesdayRobotFeet = 0;

    LinkedList<String> listOfDetails = new LinkedList<>();

    Random random = new Random();

    int countOfDays = 0;

    public synchronized void makeDetails() {
        countOfDays++;
        System.out.printf("Day %d.\n", countOfDays);
        while (listOfDetails.size() > 9) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Warehouse is full.");
            }
        }
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    listOfDetails.add("head");
                    break;
                case 1:
                    listOfDetails.add("torso");
                case 2:
                    listOfDetails.add("hand");
                case 3:
                    listOfDetails.add("feet");
                    break;
            }
            notify();
        }
        System.out.printf("Factory make details\n");
    }

    public synchronized void worldGetDetails() {
        while (listOfDetails.size() < 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Warehouse is empty! Wait while he was loaded.");
            }
        }
        for (int i = 0; i < 5; i++) {
            switch (listOfDetails.getFirst()) {
                case "head" :
                    worldRobotHead++;
                    listOfDetails.removeFirst();
                    break;
                case "torso" :
                    worldRobotTorso++;
                    listOfDetails.removeFirst();
                    break;
                case "hand" :
                    worldRobotHand++;
                    listOfDetails.removeFirst();
                    break;
                case  "feet" :
                    worldRobotFeet++;
                    listOfDetails.removeFirst();
                    break;
            }
        }
        notify();
    }

    public synchronized void wednesdayGetDetails() {
        while (listOfDetails.size() < 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Warehouse is empty! Wait while he will load.");
            }
        }
        for (int i = 0; i < 5; i++) {
            switch (listOfDetails.getFirst()) {
                case "head" :
                    wednesdayRobotHead++;
                    listOfDetails.removeFirst();
                    break;
                case "torso" :
                    wednesdayRobotTorso++;
                    listOfDetails.removeFirst();
                    break;
                case "hand" :
                    wednesdayRobotHand++;
                    listOfDetails.removeFirst();
                    break;
                case  "feet" :
                    wednesdayRobotFeet++;
                    listOfDetails.removeFirst();
                    break;
            }
        }
        notify();
    }

    public int countOfRobots(int heads, int torsos, int hands, int feet) {
        return Math.min(Math.min(heads, torsos), (Math.min(hands, feet) / 2));
    }
}
