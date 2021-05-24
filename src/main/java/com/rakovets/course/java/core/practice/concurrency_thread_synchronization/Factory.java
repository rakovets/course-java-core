package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.*;

public class Factory implements Runnable {
    private static LinkedList<Details> detail = new LinkedList<>();
    private boolean statusFactory = true;

    public synchronized static Details getDetails(Details anyDetail) {
        Details getDetail = null;
        if (detail.contains(anyDetail)) {
            getDetail = detail.get(detail.indexOf(anyDetail));
            detail.remove(detail.indexOf(anyDetail));
        }
        return getDetail;
    }

    public void createDetails() {
        int countNewDetailsInDay = 0;
        while (!DayCounter.isNight() && countNewDetailsInDay < 10) {
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
            if (DayCounter.isNight()) {
                workedToday = false;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (isStatusFactory() && !DayCounter.isNight() && !workedToday) {
                createDetails();
                workedToday = true;
            } else if (!isStatusFactory()) {
                break;
            }
        }
    }
}
