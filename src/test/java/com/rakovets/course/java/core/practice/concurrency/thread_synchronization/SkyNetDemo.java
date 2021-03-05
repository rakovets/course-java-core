package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.FactionThread;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.Factory;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.FactoryThread;

public class SkyNetDemo {
    public static void main(String[] args) {
        Factory factory = new Factory(100);

        FactoryThread factoryThread = new FactoryThread(factory);
        FactionThread world = new FactionThread(factory);
        FactionThread wednesday = new FactionThread(factory);

       Thread produceParts = new Thread(factoryThread);
       Thread worldLoki = new Thread(world);
       Thread wednesdayOdin = new Thread(wednesday);

        produceParts.start();
        worldLoki.start();
        wednesdayOdin.start();
       try {
           worldLoki.join();
           wednesdayOdin.join();
       } catch (InterruptedException ex) {
           ex.printStackTrace();
       }

        if (world.getNumberOfRobots() > wednesday.getNumberOfRobots()) {
            System.out.printf("Loki outsmarted Odin! \nScore %d vs %d \n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        } else if (wednesday.getNumberOfRobots() > world.getNumberOfRobots()) {
            System.out.printf("Odin smashed Loki! \nScore %d vs %d \n",wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        } else {
            System.out.printf("It is a draw...continue fighting! \nScore %d vs %d \n",wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        }
    }
}
