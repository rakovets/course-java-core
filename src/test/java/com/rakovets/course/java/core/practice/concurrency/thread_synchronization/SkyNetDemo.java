package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet.*;

import java.util.LinkedList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<Details> detailStorage = new LinkedList<>();
        List<Details> detailWorld = new LinkedList<>();
        List<Details> detailWednersday = new LinkedList<>();
        Storage storage = new Storage(detailStorage);
        Factory factory = new Factory(storage);
        World world = new World(detailWorld, storage);
        Wednesday wednesday = new Wednesday(detailWednersday, storage);
        factory.start();
        world.start();
        wednesday.start();


    }
}
