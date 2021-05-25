package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Storage;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions.Factions;

public class FactionsThread implements Runnable {
    private final Factions factions;
    private final Storage storage;

    public FactionsThread(Factions factions, Storage storage) {
        this.factions = factions;
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            factions.getPartsFromStorage();
            factions.createRobots();
            factions.printAmountsPart();
        }
    }
}
