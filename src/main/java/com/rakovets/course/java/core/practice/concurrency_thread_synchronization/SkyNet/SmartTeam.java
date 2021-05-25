package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

import java.util.LinkedList;
import java.util.List;

public class SmartTeam extends Team {
    public SmartTeam(FactoryStore store) {
        super(store);
    }

    @Override
    public void run() {
        List<RoboPart> looted = new LinkedList<>();
        while (store.getCurrentWorkDay() <= store.getMaxWorkDays()) {
            synchronized (store) {
                if (!store.isEmpty()) {
                    for (RoboPart part : RoboPart.values()) {
                        if (!looted.contains(part)) {
                            if (store.isInStock(part)) {
                                looted.add(store.pickUpFromStore(part));
                            }
                        }
                    }
                    if (!store.isEmpty()) {
                        looted.add(store.pickUpFromStore());
                    }
                    this.numberOfRobots += assembleRobots(looted);
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
