package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<Details> detailStorage = new LinkedList<>();
        Map<Details, Integer> detailWorld = new HashMap<>();
        Map<Details, Integer> detailWednersday = new HashMap<>();
        Storage storage = new Storage(detailStorage);
        Factory factory = new Factory(storage);
        World world = new World(detailWorld, storage);
        Wednesday wednesday = new Wednesday(detailWednersday, storage);

        world.start();
        wednesday.start();
        factory.start();


    }
}
