package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<String> details = new ArrayList<>();
        Factory factory = new Factory(details);
        Producer producer = new Producer(factory);
        List<String> worldStock = new ArrayList<>();
        World world = new World(factory, worldStock);
        List<String> wednesdayStock = new ArrayList<>();
        Wednesday wednesday = new Wednesday(factory, wednesdayStock);
        SkyNet skyNet = new SkyNet();

        skyNet.dayInSkyNet(producer, wednesday, world, 3);
        System.out.println("The stronger army: " + skyNet.getStrongerArmy(world, wednesday));
    }
}
