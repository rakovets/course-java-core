package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Wednesday;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.World;

public class DemoProjectSkyNet {
    private static final Integer DAY_OF_HARD_WORK = 5;

    public static void main(String[] args) throws InterruptedException {
        Factory factory = Factory.getInstance();
        Wednesday wednesday = Wednesday.getInstance();
        World world = World.getInstance();

        for (int i = 0; i < DAY_OF_HARD_WORK; i++) {
            Thread factoryThread = new Thread(factory);
            Thread wednesdayThread = new Thread(wednesday);
            Thread worldThread = new Thread(world);
            factoryThread.start();
            factoryThread.join();
            wednesdayThread.start();
            worldThread.start();
            wednesdayThread.join();
            worldThread.join();
            factory.getIsDay().set(true);
        }
        System.out.println(wednesday.getCacheSize());
        System.out.println(world.getCacheSize());
    }
}
