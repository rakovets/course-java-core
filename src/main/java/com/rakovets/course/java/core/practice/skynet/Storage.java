package com.rakovets.course.java.core.practice.skynet;

import java.util.List;

public class Storage {
    private final List<Detail> storage;
    private final int workingDaysLimit;
    private int currentWorkingDay = 0;

    public Storage(List<Detail> list, int workingDaysLimit) {
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

    public void addToStorage(Detail detail) {
        storage.add(detail);
    }

    public boolean isStorageEmpty() {
        return storage.isEmpty();
    }

    public Detail takePart() {
        return storage.remove(0);
    }
}
