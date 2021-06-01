package com.rakovets.course.java.core.practice.skynet;

import java.util.LinkedList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<Detail> list = new LinkedList<>();
        Storage storage = new Storage(list,30);
        Factory factory = new Factory(storage);
        Fraction world = new Fraction(storage);
        Fraction wednesday = new Fraction(storage);
        Thread produceParts = new Thread(factory);
        Thread worldThread = new Thread(world);
        Thread wednesdayThread = new Thread(wednesday);

        produceParts.start();
        worldThread.start();
        wednesdayThread.start();
        try {
            worldThread.join();
            wednesdayThread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println(world.getNumberOfRobots());
        System.out.println(wednesday.getNumberOfRobots());

        if (world.getNumberOfRobots() > wednesday.getNumberOfRobots()) {
            System.out.println("World win");
        } else if (wednesday.getNumberOfRobots() > world.getNumberOfRobots()) {
            System.out.println("Wednesday win");
        } else {
            System.out.println("Everyone is dead");
        }
    }
}
