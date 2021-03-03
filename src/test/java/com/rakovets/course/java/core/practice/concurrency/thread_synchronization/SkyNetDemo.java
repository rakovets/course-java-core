package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.FactionThread;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.Factory;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.FactoryThread;

public class SkyNetDemo {
    public static void main(String[] args) {
        Factory factory = new Factory();

        FactoryThread factoryThread = new FactoryThread(factory);
        FactionThread world = new FactionThread(factory);
        FactionThread wednesday = new FactionThread(factory);

        for (int x = 0; x < 100; x++) {
            Thread produceParts = new Thread(factoryThread);
            Thread worldLoki = new Thread(world);
            Thread wednesdayOdin = new Thread(wednesday);

            try {
                produceParts.start();
                produceParts.join();
                worldLoki.start();
                wednesdayOdin.start();
                worldLoki.join();
                wednesdayOdin.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        world.getRobot();
        wednesday.getRobot();

        if (world.getNumberOfRobots() > wednesday.getNumberOfRobots()) {
            System.out.printf("Loki outsmarted Odin! \n Score %d vs %d \n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        } else if (wednesday.getNumberOfRobots() > world.getNumberOfRobots()) {
            System.out.printf("Odin smashed Loki! \n Score %d vs %d \n",wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        } else {
            System.out.printf("It is a draw...continue fighting! \n Score %d vs %d \n",wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        }
    }
}
