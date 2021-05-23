package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.LinkedList;
import java.util.List;

public class Storage {
    private final List<RoboParts> storageList;
    private final int dateLimit;
    private int currentDay =1;

    public Storage(List<RoboParts> storageList, int dateLimit) {
        this.storageList = storageList;
        this.dateLimit = dateLimit;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getDateLimit() {
        return dateLimit;
    }

    public RoboParts takeRoboParts() {
        return storageList.remove(0);
    }

    public void addPartsToStorage(RoboParts roboParts) {
        storageList.add(roboParts);
    }

    public boolean isStorageAmpty() {
        return storageList.isEmpty();
    }

    public void goNextDay() {
        currentDay++;
    }
}
