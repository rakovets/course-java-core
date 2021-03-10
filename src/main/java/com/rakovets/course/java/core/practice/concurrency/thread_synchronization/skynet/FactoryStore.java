package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.List;

public class FactoryStore {
    private final List<RoboPart> store;
    private final int maxDaysOfWork;
    private int currentDayOfWork = 0;

    public FactoryStore(List<RoboPart> storeList, int maxDaysOfWork) {
        this.store = storeList;
        this.maxDaysOfWork = maxDaysOfWork;
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
        this.currentDayOfWork++;
    }

    public int getMaxDaysOfWork() {
        return maxDaysOfWork;
    }

    public int getCurrentDayOfWork() {
        return currentDayOfWork;
    }
}
