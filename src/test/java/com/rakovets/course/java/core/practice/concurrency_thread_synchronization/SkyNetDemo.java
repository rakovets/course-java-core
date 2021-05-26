package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Fraction;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.RoboPart;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Storage;

import java.util.LinkedList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<RoboPart> list = new LinkedList<>();
        Storage storage = new Storage(list,300);

        Factory factory = new Factory(storage);
        Fraction world = new Fraction(storage);
        Fraction wednesday = new Fraction(storage);

        Thread produceParts = new Thread(factory);
        Thread worldFraction = new Thread(world);
        Thread wednesdayOdin = new Thread(wednesday);

        produceParts.start();
        worldFraction.start();
        wednesdayOdin.start();
        try {
            worldFraction.join();
            wednesdayOdin.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        if (world.getNumberOfRobots() > wednesday.getNumberOfRobots()) {
            System.out.printf("The army of World fraction is stronger then Wednesday fraction! \nArmy World fraction %d robots, Army Wednesday fraction %d robots \n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        } else if (wednesday.getNumberOfRobots() > world.getNumberOfRobots()) {
            System.out.printf("The army of Wednesday fraction is stronger then World fraction! \nArmy Wednesday fraction %d robots, Army World fraction %d robots\n",wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        } else {
            System.out.printf("The army of Wednesday fraction and World fraction the same by power! \nArmy Wednesday fraction %d robots, Army World fraction %d robots \n",wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        }
    }
}
