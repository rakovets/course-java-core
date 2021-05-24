package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.*;

public class Factory {
    private boolean dayTime;
    private int daysOfWork;
    private Deque<String> robotParts = new LinkedList<>();
    private Random random = new Random(1);

    public  Factory(int days) {
        this.daysOfWork = 1 + days;
        dayTime = true;
    }

    public synchronized void put() {
        while(!dayTime) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int partNumber =random.nextInt(5);
        switch (partNumber) {
            case 1:
                robotParts.add("head");
                break;
            case 2:
                robotParts.add("torso");
                break;
            case 3:
                robotParts.add("hand");
                break;
            case 4:
                robotParts.add("feet");
                break;
        }
        if (robotParts.size() == 10) {
            dayTime = false;
            daysOfWork--;
            notifyAll();

        }
    }

    public synchronized String getPart() {
        while (dayTime) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String robotPart ="dust";
        if (!robotParts.isEmpty()) {
            robotPart = robotParts.removeFirst();
        }
        if (robotParts.isEmpty()) {
            dayTime = true;
            notifyAll();
        }
        return robotPart;
    }

    public int getDays() {
        return daysOfWork;
    }
}
