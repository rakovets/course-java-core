package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.controller;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWednesday;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWorld;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FactoryThreadService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.view.SkyNetViewConsole;

import java.util.Random;

public class SkyNetStarterController {
    private final FactoryThreadService factory = new FactoryThreadService();
    private final FractionWednesday fractionWednesday = new FractionWednesday(factory);
    private final FractionWorld fractionWorld = new FractionWorld(factory);
    public static Thread factoryThread;
    public static Thread wednesdayThread;
    public static Thread worldThread;
    SkyNetViewConsole skyNetViewConsole = new SkyNetViewConsole();

    public void start() {
        int days = 100;
        for (int i = 1; i <= days; i++) {
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
