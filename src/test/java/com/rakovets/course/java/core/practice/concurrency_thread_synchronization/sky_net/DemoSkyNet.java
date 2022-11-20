package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.List;

public class DemoSkyNet {
    public static void main(String[] args) {
        List<String> details = new ArrayList<>();
        Factory factory = new Factory(details);
        Producer producer = new Producer(factory);
        List<String> worldStock = new ArrayList<>();
        World world = new World(factory, worldStock);
        List<String> timerStorage = new ArrayList<>();
        Timer timer = new Timer(factory, timerStorage);
        SkyNet skyNet = new SkyNet();

        skyNet.countDaysBeforeSkyNet(producer, timer, world, 10);
        System.out.println("The stronger army: " + skyNet.getBestArmy(world, timer));
    }
}
