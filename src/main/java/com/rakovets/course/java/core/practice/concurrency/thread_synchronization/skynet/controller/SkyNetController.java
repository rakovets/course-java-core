package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.controller;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWednesday;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWorld;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FactoryService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.view.SkyNetViewConsole;

import java.util.Random;

public class SkyNetController {
    private static final FactoryService factory;
    private static final FractionWednesday fractionWednesday;
    private static final FractionWorld fractionWorld;
    public static Thread factoryThread;
    public static Thread wednesdayThread;
    public static Thread worldThread;
    private static final SkyNetViewConsole skyNetViewConsole;
    public static int daysOfArmiesComparison;

    static {

        factory = new FactoryService();
        fractionWednesday = new FractionWednesday(factory);
        fractionWorld = new FractionWorld(factory);
        skyNetViewConsole = new SkyNetViewConsole();
        daysOfArmiesComparison = 100;

    }

    public void start() {
        for (int i = 1; i <= daysOfArmiesComparison; i++) {
            factoryThread = new Thread(factory);
            factoryThread.start();
            try {
                factoryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            worldThread = new Thread(fractionWorld);
            wednesdayThread = new Thread(fractionWednesday);
            if (new Random().nextInt(2) == 0) {
                worldThread.start();
                wednesdayThread.start();
            } else {
                wednesdayThread.start();
                worldThread.start();
            }
            try {
                worldThread.join();
                wednesdayThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        skyNetViewConsole.skyNetView();
    }
}
