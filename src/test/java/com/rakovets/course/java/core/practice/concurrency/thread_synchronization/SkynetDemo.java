package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.FactoryStore;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.SmartTeam;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.Team;

public class SkynetDemo {
    public static void main(String[] args) {
        FactoryStore store = new FactoryStore(100);
        Factory factory = new Factory(store);
        Team world = new Team(store);
        Team wednesday = new Team(store);

        Thread producer = new Thread(factory);
        Thread loki = new Thread(world);
        Thread odin = new Thread(wednesday);

        producer.start();
        loki.start();
        odin.start();

        try {
            producer.join();
            odin.join();
            loki.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        if (wednesday.getNumberOfRobots() > world.getNumberOfRobots()) {
            System.out.printf("Odin won! Praise the Great God!\nScore %d : %d\n", wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        } else if (wednesday.getNumberOfRobots() < world.getNumberOfRobots()) {
            System.out.printf("Loki won! Praise the Great God!\nScore %d : %d\n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        } else {
            System.out.printf("It's a draw!\nScore %d : %d\n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        }

        FactoryStore storeSmart = new FactoryStore(100);
        Factory smartFactory = new Factory(storeSmart);
        SmartTeam smartWednesday = new SmartTeam(storeSmart);
        SmartTeam smartWorld = new SmartTeam(storeSmart);

        Thread producerSmart = new Thread(smartFactory);
        Thread lokiSmart = new Thread(smartWorld);
        Thread odinSmart = new Thread(smartWednesday);

        producerSmart.start();
        lokiSmart.start();
        odinSmart.start();

        try {
            producerSmart.join();
            odinSmart.join();
            lokiSmart.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        if (smartWednesday.getNumberOfRobots() > smartWorld.getNumberOfRobots()) {
            System.out.printf("Odin won! Praise the Great God!\nScore %d : %d\n", smartWednesday.getNumberOfRobots(), smartWorld.getNumberOfRobots());
        } else if (smartWednesday.getNumberOfRobots() < smartWorld.getNumberOfRobots()) {
            System.out.printf("Loki won! Praise the Great God!\nScore %d : %d\n", smartWorld.getNumberOfRobots(), smartWednesday.getNumberOfRobots());
        } else {
            System.out.printf("It's a draw!\nScore %d : %d\n", smartWorld.getNumberOfRobots(), smartWednesday.getNumberOfRobots());
        }
    }
}
