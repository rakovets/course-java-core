package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.Random;

public class FactoryThread extends Thread {
    protected int NUMBER_OF_PRODUCED_DETAILS = 10;
    private final FactoryStorage factoryStorage = new FactoryStorage();

    public void run() {
        for (int i = 0; i < NUMBER_OF_PRODUCED_DETAILS; i++) {
            switch (new Random().nextInt(4)) {
                case 1:
                    factoryStorage.changeDetailQuantity(Detail.HEAD,
                            factoryStorage.getDetailQuantity(Detail.HEAD) + 1);
                    break;
                case 2:
                    factoryStorage.changeDetailQuantity(Detail.TORSO,
                            factoryStorage.getDetailQuantity(Detail.TORSO) + 1);
                    break;
                case 3:
                    factoryStorage.changeDetailQuantity(Detail.HAND,
                            factoryStorage.getDetailQuantity(Detail.HAND) + 1);
                    break;
                default:
                    factoryStorage.changeDetailQuantity(Detail.FEET,
                            factoryStorage.getDetailQuantity(Detail.FEET) + 1);
                    break;
            }
        }
    }

    public synchronized Detail consume() {
        switch (new Random().nextInt(4)) {
            case 1:
                if (factoryStorage.getDetailQuantity(Detail.HEAD) >= 1) {
                    factoryStorage.changeDetailQuantity(Detail.HEAD,
                            factoryStorage.getDetailQuantity(Detail.HEAD) - 1);
                    return Detail.HEAD;
                }
                break;
            case 2:
                if (factoryStorage.getDetailQuantity(Detail.TORSO) >= 1) {
                    factoryStorage.changeDetailQuantity(Detail.TORSO,
                            factoryStorage.getDetailQuantity(Detail.TORSO) - 1);
                    return Detail.TORSO;
                }
                break;
            case 3:
                if (factoryStorage.getDetailQuantity(Detail.HAND) >= 1) {
                    factoryStorage.changeDetailQuantity(Detail.HAND,
                            factoryStorage.getDetailQuantity(Detail.HAND) - 1);
                    return Detail.HAND;
                }
                break;
            default:
                if (factoryStorage.getDetailQuantity(Detail.FEET) >= 1) {
                    factoryStorage.changeDetailQuantity(Detail.FEET,
                            factoryStorage.getDetailQuantity(Detail.FEET) - 1);
                    return Detail.FEET;
                }
                break;
        }
        return null;
    }
}
