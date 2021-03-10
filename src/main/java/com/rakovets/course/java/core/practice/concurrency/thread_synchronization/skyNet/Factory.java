package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.Random;

public class Factory implements Runnable {
    private final Storage storage;

    public Factory(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (storage.getCurrentWorkingDay() <= storage.getWorkingDaysLimit()) {
            synchronized (storage) {
                if (storage.isStorageEmpty()) {
                    int batch = random.nextInt(11);
                    for (int i = 0; i < batch; i++) {
                        int parts = random.nextInt(4);
                        switch (parts) {
                            case 0:
                                storage.addToStorage(RoboPart.HEAD);
                                break;
                            case 1:
                                storage.addToStorage(RoboPart.TORSO);
                                break;
                            case 2:
                                storage.addToStorage(RoboPart.HAND);
                                break;
                            case 3:
                                storage.addToStorage(RoboPart.FEET);
                                break;
                        }
                    }
                    storage.goToNextDay();
                }
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
