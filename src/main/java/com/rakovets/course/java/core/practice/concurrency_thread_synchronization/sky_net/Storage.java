package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.List;

public class Storage {
    private final List<RoboPart> storage;
    private final int preparatoryPeriodDays;
    private int currentWorkingDay = 0;

    public Storage(List<RoboPart> list, int preparatoryPeriodDays) {
        this.storage = list;
        this.preparatoryPeriodDays = preparatoryPeriodDays;
    }

    public void goToNextDay() {
        this.currentWorkingDay++;
    }

    public int getPreparatoryPeriodDays() {
        return preparatoryPeriodDays;
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
