package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.logging.Logger;
import java.util.stream.IntStream;

public class FactoryStore {
    Logger logger = Logger.getLogger(FactoryStore.class.getName());
    private int[] arrayOfSpears = new int[4];
    private int timeOfWorkInMinutes;
    public FactoryStore(int timeOfWorkInMinutes) {
        this.timeOfWorkInMinutes = timeOfWorkInMinutes;
    }

    public void produceOneSpearPartToFactoryStore() {
        while (IntStream.of(arrayOfSpears).sum() >= 10) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        int i = (int) (Math.random() * arrayOfSpears.length);
        arrayOfSpears[i]++;
        notifyAll();
    }

    public int getOneSpearPartFromFactoryStore() {
        while (IntStream.of(arrayOfSpears).sum() < 1) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        int typeOfSpears = 0;
        boolean spearIsNotChosen = true;
        while (spearIsNotChosen) {
            int i = (int) (Math.random() * arrayOfSpears.length);
            if (arrayOfSpears[i] > 0) {
                arrayOfSpears[i] --;
                spearIsNotChosen = false;
                typeOfSpears = i;
            }
        }
        notifyAll();
        return typeOfSpears;
    }

    public int[] getArrayOfSpears() {
        return arrayOfSpears;
    }

    public void finishWork() {
        notifyAll();
    }

    public int getTimeOfWorkInMinutes() {
        return timeOfWorkInMinutes;
    }
}
