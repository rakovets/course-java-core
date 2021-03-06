package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.Detail;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository.FactoryStorageRepository;

import java.util.Random;

public class FactoryThreadService extends Thread {
    protected int NUMBER_OF_PRODUCED_DETAILS = 10;
    private final FactoryStorageRepository factoryStorageRepository = new FactoryStorageRepository();

    public void run() {
        for (int i = 0; i < NUMBER_OF_PRODUCED_DETAILS; i++) {
            switch (new Random().nextInt(4)) {
                case 1:
                    factoryStorageRepository.changeDetailQuantity(Detail.HEAD,
                            factoryStorageRepository.getDetailQuantity(Detail.HEAD) + 1);
                    break;
                case 2:
                    factoryStorageRepository.changeDetailQuantity(Detail.TORSO,
                            factoryStorageRepository.getDetailQuantity(Detail.TORSO) + 1);
                    break;
                case 3:
                    factoryStorageRepository.changeDetailQuantity(Detail.HAND,
                            factoryStorageRepository.getDetailQuantity(Detail.HAND) + 1);
                    break;
                default:
                    factoryStorageRepository.changeDetailQuantity(Detail.FEET,
                            factoryStorageRepository.getDetailQuantity(Detail.FEET) + 1);
                    break;
            }
        }
    }

    public synchronized Detail consume() {
        switch (new Random().nextInt(4)) {
            case 1:
                if (factoryStorageRepository.getDetailQuantity(Detail.HEAD) >= 1) {
                    factoryStorageRepository.changeDetailQuantity(Detail.HEAD,
                            factoryStorageRepository.getDetailQuantity(Detail.HEAD) - 1);
                    return Detail.HEAD;
                }
                break;
            case 2:
                if (factoryStorageRepository.getDetailQuantity(Detail.TORSO) >= 1) {
                    factoryStorageRepository.changeDetailQuantity(Detail.TORSO,
                            factoryStorageRepository.getDetailQuantity(Detail.TORSO) - 1);
                    return Detail.TORSO;
                }
                break;
            case 3:
                if (factoryStorageRepository.getDetailQuantity(Detail.HAND) >= 1) {
                    factoryStorageRepository.changeDetailQuantity(Detail.HAND,
                            factoryStorageRepository.getDetailQuantity(Detail.HAND) - 1);
                    return Detail.HAND;
                }
                break;
            default:
                if (factoryStorageRepository.getDetailQuantity(Detail.FEET) >= 1) {
                    factoryStorageRepository.changeDetailQuantity(Detail.FEET,
                            factoryStorageRepository.getDetailQuantity(Detail.FEET) - 1);
                    return Detail.FEET;
                }
                break;
        }
        return null;
    }
}
