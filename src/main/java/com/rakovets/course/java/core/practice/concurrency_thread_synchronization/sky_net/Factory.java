package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Factory implements Runnable {
    private final GameController gameController;
    private final int maxSizeOfPartsStorage = 10;
    private final List<String> partsList = new ArrayList<>(Arrays.asList("head", "torso", "hand", "feet"));
    private final Queue<String> partsStorage = new LinkedList<>();

    public Factory(GameController gameController) {
        this.gameController = gameController;
    }

    private void produce() {
        int dailyPartsPlan = new Random().nextInt(maxSizeOfPartsStorage + 1);
        for (int i = 0; i < dailyPartsPlan; i++) {
            int randomIndexOfPartsList = new Random().nextInt(partsList.size());
            partsStorage.add(partsList.get(randomIndexOfPartsList));
        }
    }

    public synchronized String getPart() {
        return partsStorage.poll();
    }

    @Override
    public void run() {
        while (gameController.isGameRunning()) {
            if (gameController.getTimesOfDay().equals("day")) {
                produce();
                gameController.changeTimesOfDay();
            } else if (partsStorage.isEmpty()) {
                gameController.changeTimesOfDay();
            }
        }
    }
}
