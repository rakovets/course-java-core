package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Factory implements Runnable {
    private final GameProcess gameProcess;
    private final int maxSizeOfPartsStorage = 10;
    private List<String> partsList = new ArrayList<>(Arrays.asList("head", "torso", "hand", "feet"));
    private List<String> partsStorage = new ArrayList<>();

    public Factory(GameProcess gameProcess) {
        this.gameProcess = gameProcess;
    }

    private void produce() {
        int dailyPartsPlan = new Random().nextInt(maxSizeOfPartsStorage + 1);
        for (int i = 0; i < dailyPartsPlan; i++) {
            int randomIndexOfPartsList = new Random().nextInt(partsList.size());
            partsStorage.add(partsList.get(randomIndexOfPartsList));
        }
    }

    @Override
    public void run() {
        while (gameProcess.isGameRunning()) {
            if (gameProcess.getTimesOfDay().equals("day")) {
                produce();
                gameProcess.changeTimesOfDay();
            }
        }
        System.out.println(partsStorage);
    }
}
