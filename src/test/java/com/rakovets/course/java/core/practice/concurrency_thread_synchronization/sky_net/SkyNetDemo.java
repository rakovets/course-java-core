package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SkyNetDemo {
//    private static final int sizeOfPartsStorage = 10;
//    private static List<String> partsList = new ArrayList<>(Arrays.asList("head", "torso", "hand", "feet"));
//    private static List<String> partsStorage = new ArrayList<>();

    public static void main(String[] args) {

//        for (int i = 0; i < sizeOfPartsStorage; i++) {
//            partsStorage.add(partsList.get(new Random().nextInt(partsList.size())));
//        }
//        System.out.println(partsStorage);

        GameProcess gameProcess = new GameProcess(2);
//        Thread game = new Thread(gameProcess, "Game process");
        Thread factory = new Thread(new Factory(gameProcess), "Factory");

//        game.start();
        factory.start();
    }


}

