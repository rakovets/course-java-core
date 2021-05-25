package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<RoboPart> list = new LinkedList<>();
        FactoryStore store = new FactoryStore(list, 100);
        Factory factory = new Factory(store);
        Team world = new Team(store);
        Team wednesday = new Team(store);

        Thread producer = new Thread(factory);
        Thread t1000 = new Thread(world);
        Thread t500 = new Thread(wednesday);

        producer.start();
        t1000.start();
        t500.start();

        try {
            t500.join();
            t1000.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        if (wednesday.getNumberOfRobots() > world.getNumberOfRobots()) {
            System.out.printf("T500 won!\nScore %d : %d\n", wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        } else if (wednesday.getNumberOfRobots() < world.getNumberOfRobots()) {
            System.out.printf("T1000 won!\nScore %d : %d\n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        } else {
            System.out.printf("It's a draw!\nScore %d : %d\n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        }

        List<RoboPart> smartList = new ArrayList<>();
        FactoryStore storeSmart = new FactoryStore(smartList,100);
        Factory smartFactory = new Factory(storeSmart);
        SmartTeam smartWednesday = new SmartTeam(storeSmart);
        SmartTeam smartWorld = new SmartTeam(storeSmart);

        Thread producerSmart = new Thread(smartFactory);
        Thread t500Smart = new Thread(smartWorld);
        Thread t1000Smart = new Thread(smartWednesday);

        producerSmart.start();
        t500Smart.start();
        t1000Smart.start();

        try {
            t1000Smart.join();
            t500Smart.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        if (smartWednesday.getNumberOfRobots() > smartWorld.getNumberOfRobots()) {
            System.out.printf("T500 won!\nScore %d : %d\n", smartWednesday.getNumberOfRobots(), smartWorld.getNumberOfRobots());
        } else if (smartWednesday.getNumberOfRobots() < smartWorld.getNumberOfRobots()) {
            System.out.printf("T1000 won!\nScore %d : %d\n", smartWorld.getNumberOfRobots(), smartWednesday.getNumberOfRobots());
        } else {
            System.out.printf("It's a draw!\nScore %d : %d\n", smartWorld.getNumberOfRobots(), smartWednesday.getNumberOfRobots());
        }
    }
}
