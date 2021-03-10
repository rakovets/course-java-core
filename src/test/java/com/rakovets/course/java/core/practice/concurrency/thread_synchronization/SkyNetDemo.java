package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.Faction;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.RoboPart;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.Storage;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.Factory;

import java.util.LinkedList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<RoboPart> list = new LinkedList<>();
        Storage storage = new Storage(list,100);

        Factory factory = new Factory(storage);
        Faction world = new Faction(storage);
        Faction wednesday = new Faction(storage);

       Thread produceParts = new Thread(factory);
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
