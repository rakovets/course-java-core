package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions.Factions;

public class FactionsThread implements Runnable {
    private final Factions factions;

    public FactionsThread(Factions factions) {
        this.factions = factions;
    }

    @Override
    public void run() {
        factions.getPartsFromFactory();
        factions.printAmountsPart();
    }
}
