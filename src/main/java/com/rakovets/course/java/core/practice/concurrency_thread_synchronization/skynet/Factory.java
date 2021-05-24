package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.*;

public class Factory {
    private boolean dayTime;
    private int daysOfWork;
    private List<String> robotParts = new ArrayList();
    private Random random = new Random(1);

    public  Factory(int days){
        this.daysOfWork = days;
        dayTime = true;
    }

    public synchronized void put() {
        while (dayTime) {
            int partNumber = random.nextInt(5);
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
                notifyAll();
                daysOfWork --;
            }
        }
    }
    public boolean robotpartsIsEmpty() {
        return robotParts.isEmpty();
    }

    public void setDayTime(boolean dayTime) {
        this.dayTime = dayTime;
    }

    public synchronized  String getPart() {
        if (robotpartsIsEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return robotParts.remove(0);
    }

    public boolean isDayTime() {
        return dayTime;
    }

    public int getDays() {
        return daysOfWork;
    }
}
