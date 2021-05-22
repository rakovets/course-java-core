package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.*;

public class Factory implements Runnable {
    private static LinkedList<Details> detail = new LinkedList<>();
    private boolean statusFactory = true;

    public synchronized static List<Details> getDetail() {
        return detail;
    }

    public synchronized static Details getDetails() {
        System.out.println("kolvo : " + detail.size());
        return detail.poll();
    }

    public void createDetails() {
        int countNewDetailsInDay = 0;

        while (!DayPeriod.isNight() && countNewDetailsInDay < 10) {
            int countNewDetails = new Random().nextInt(11 - countNewDetailsInDay);
            countNewDetailsInDay += countNewDetails;
            for (int i = 0; i < countNewDetails; i++) {
                int serialNumber = new Random().nextInt(4);
                switch (serialNumber) {
                    case (0):
                        detail.add(Details.HEAD);
                        break;
                    case (1):
                        detail.add(Details.TORSO);
                        break;
                    case (2):
                        detail.add(Details.HAND);
                        break;
                    case (3):
                        detail.add(Details.FEET);
                        break;
                }
            }
        }
        System.out.println("Today i have make " + countNewDetailsInDay);
    }


    public boolean isStatusFactory() {
        return statusFactory;
    }


    public void setStatusFactory(boolean statusFactory) {
        this.statusFactory = statusFactory;
    }


    @Override
    public void run() {
        boolean workedToday = false;

        while (isStatusFactory()) {
            if (DayPeriod.isNight()) {
                workedToday = false;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (isStatusFactory() && !DayPeriod.isNight() && !workedToday) {
                System.out.println("Day! I am working.");
                createDetails();
                workedToday = true;
            } else if (!isStatusFactory()) {
                System.out.println("I Factory Die");
                break;
            }
        }
    }
}
