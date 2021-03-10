package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.List;

public class Storage {
    private final List<RoboPart> storage;
    private final int workingDaysLimit;
    private int currentWorkingDay = 0;

    public Storage(List<RoboPart> list, int workingDaysLimit) {
        this.storage = list;
        this.workingDaysLimit = workingDaysLimit;
    }

    public void goToNextDay() {
        this.currentWorkingDay++;
    }

    public int getWorkingDaysLimit() {
        return workingDaysLimit;
    }

    public int getCurrentWorkingDay() {
        return currentWorkingDay;
    }

    public void addToStorage(RoboPart roboPart) {
        storage.add(roboPart);
    }

    public boolean isStorageEmpty() {
        return storage.isEmpty();
    }

    public RoboPart takePart() {
        return storage.remove(0);
    }
}
