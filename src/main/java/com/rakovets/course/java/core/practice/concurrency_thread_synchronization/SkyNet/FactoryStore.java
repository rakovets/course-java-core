package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

import java.util.List;

public class FactoryStore {
    private final List<RoboPart> store;
    private final int maxWorkDays;
    private int currentWorkDay = 0;

    public FactoryStore(List<RoboPart> storeList, int maxWorkDays) {
        this.store = storeList;
        this.maxWorkDays = maxWorkDays;
    }

    public void addToStore(RoboPart roboPart) {
        store.add(roboPart);
    }

    public RoboPart pickUpFromStore() {
        return store.remove(0);
    }

    public RoboPart pickUpFromStore(RoboPart roboPart) {
        if (store.remove(roboPart)) {
            return roboPart;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return this.store.isEmpty();
    }

    public boolean isInStock(RoboPart roboPart) {
        return store.contains(roboPart);
    }

    public void updateCurrentDay() {
        this.currentWorkDay++;
    }

    public int getMaxWorkDays() {
        return maxWorkDays;
    }

    public int getCurrentWorkDay() {
        return currentWorkDay;
    }
}
