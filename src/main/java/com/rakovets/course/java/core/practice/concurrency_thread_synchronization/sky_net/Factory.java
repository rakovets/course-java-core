package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.Random;

public class Factory implements Runnable {
    private final Storage storage;
    private int hourWorkFactory = 10;

    public Factory(Storage storage) {
        this.storage = storage;
    }

    public void setHourWorkFactory(int hourWorkFactory) {
        this.hourWorkFactory = hourWorkFactory;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (storage.getCurrentDay() <= storage.getDateLimit()) {
            synchronized (storage) {
                if (storage.isStorageAmpty()) {
                    for (int i = 0; i <= 10; i++) {
                        int parts = random.nextInt(4);
                        switch (parts) {
                            case 0:
                                storage.addPartsToStorage(RoboParts.FEET);
                                break;
                            case 1:
                                storage.addPartsToStorage(RoboParts.HAND);
                                break;
                            case 2:
                                storage.addPartsToStorage(RoboParts.HEAD);
                                break;
                            case 3:
                                storage.addPartsToStorage(RoboParts.TORSO);
                                break;
                        }
                    }
                    storage.goNextDay();
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
