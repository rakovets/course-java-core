package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.Detail;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository.FactoryDetailRepository;

import java.util.Random;

public class FactoryService extends Thread {
    public static int NUMBER_OF_PRODUCED_DETAILS;
    private final FactoryDetailRepository factoryDetailRepository = new FactoryDetailRepository();

    static {

        NUMBER_OF_PRODUCED_DETAILS = 10;

    }

    public void run() {
        for (int i = 0; i < NUMBER_OF_PRODUCED_DETAILS; i++) {
            switch (new Random().nextInt(4)) {
                case 1:
                    factoryDetailRepository.changeDetailQuantity(Detail.HEAD,
                            factoryDetailRepository.getDetailQuantity(Detail.HEAD) + 1);
                    break;
                case 2:
                    factoryDetailRepository.changeDetailQuantity(Detail.TORSO,
                            factoryDetailRepository.getDetailQuantity(Detail.TORSO) + 1);
                    break;
                case 3:
                    factoryDetailRepository.changeDetailQuantity(Detail.HAND,
                            factoryDetailRepository.getDetailQuantity(Detail.HAND) + 1);
                    break;
                default:
                    factoryDetailRepository.changeDetailQuantity(Detail.FEET,
                            factoryDetailRepository.getDetailQuantity(Detail.FEET) + 1);
                    break;
            }
        }
    }

    public synchronized Detail consume() {
        switch (new Random().nextInt(4)) {
            case 1:
                if (factoryDetailRepository.getDetailQuantity(Detail.HEAD) >= 1) {
                    factoryDetailRepository.changeDetailQuantity(Detail.HEAD,
                            factoryDetailRepository.getDetailQuantity(Detail.HEAD) - 1);
                    return Detail.HEAD;
                }
                break;
            case 2:
                if (factoryDetailRepository.getDetailQuantity(Detail.TORSO) >= 1) {
                    factoryDetailRepository.changeDetailQuantity(Detail.TORSO,
                            factoryDetailRepository.getDetailQuantity(Detail.TORSO) - 1);
                    return Detail.TORSO;
                }
                break;
            case 3:
                if (factoryDetailRepository.getDetailQuantity(Detail.HAND) >= 1) {
                    factoryDetailRepository.changeDetailQuantity(Detail.HAND,
                            factoryDetailRepository.getDetailQuantity(Detail.HAND) - 1);
                    return Detail.HAND;
                }
                break;
            default:
                if (factoryDetailRepository.getDetailQuantity(Detail.FEET) >= 1) {
                    factoryDetailRepository.changeDetailQuantity(Detail.FEET,
                            factoryDetailRepository.getDetailQuantity(Detail.FEET) - 1);
                    return Detail.FEET;
                }
                break;
        }
        return null;
    }
}
