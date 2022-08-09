package com.rakovets.course.java.core.example.concurrency_thread_synchronization.skynet;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Faction extends Thread {
    private final List<Details> list = new ArrayList<>();
    private final Factory factory;
    Logger logger = Logger.getLogger(Faction.class.getName());

    public Faction(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        do {
            takeDetails();
            logger.info(list.toString());
        }
        while (factory.isAlive());
    }

    public void takeDetails() {
        try {
            for (int i = 0; i < 5; i++) {
                list.add(factory.stealDetail());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
