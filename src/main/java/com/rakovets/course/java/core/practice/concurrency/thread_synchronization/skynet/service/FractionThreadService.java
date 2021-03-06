package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository.FractionRobotRepository;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.Detail;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository.FractionDetailStorageRepository;

public class FractionThreadService extends Thread {
    private final FactoryThreadService factoryThreadService;
    public Detail detail;
    protected int NUMBER_OF_CONSUMED_DETAILS = 5;
    private final FractionDetailStorageRepository fractionDetailStorageRepository = new FractionDetailStorageRepository();
    public FractionRobotRepository fractionRobotRepository = new FractionRobotRepository();
    public String fraction;
    public int numberOfRobot;

    public FractionThreadService(FactoryThreadService factoryThreadService) {
        this.factoryThreadService = factoryThreadService;
    }

    public void run() {
        for (int i = 0; i < NUMBER_OF_CONSUMED_DETAILS; i++) {
            while ((detail = factoryThreadService.consume()) != null) {
                switch (detail) {
                    case HEAD:
                        fractionDetailStorageRepository.changeDetailQuantity(Detail.HEAD,
                            fractionDetailStorageRepository.getDetailQuantity(Detail.HEAD) + 1);
                        break;
                    case TORSO:
                        fractionDetailStorageRepository.changeDetailQuantity(Detail.TORSO,
                            fractionDetailStorageRepository.getDetailQuantity(Detail.TORSO) + 1);
                        break;
                    case HAND:
                        fractionDetailStorageRepository.changeDetailQuantity(Detail.HAND,
                            fractionDetailStorageRepository.getDetailQuantity(Detail.HAND) + 1);
                        break;
                    case FEET:
                        fractionDetailStorageRepository.changeDetailQuantity(Detail.FEET,
                            fractionDetailStorageRepository.getDetailQuantity(Detail.FEET) + 1);
                        break;
                }
            }
        }

        while (fractionDetailStorageRepository.getDetailQuantity(Detail.HEAD) >= 1 &&
                fractionDetailStorageRepository.getDetailQuantity(Detail.TORSO) >= 1 &&
                fractionDetailStorageRepository.getDetailQuantity(Detail.HAND) >= 2 &&
                fractionDetailStorageRepository.getDetailQuantity(Detail.FEET) >= 2) {
            fractionRobotRepository.robot.add(numberOfRobot);
            fractionDetailStorageRepository.changeDetailQuantity(Detail.HEAD,
                    fractionDetailStorageRepository.getDetailQuantity(Detail.HEAD) - 1);
            fractionDetailStorageRepository.changeDetailQuantity(Detail.TORSO,
                    fractionDetailStorageRepository.getDetailQuantity(Detail.TORSO) - 1);
            fractionDetailStorageRepository.changeDetailQuantity(Detail.HAND,
                    fractionDetailStorageRepository.getDetailQuantity(Detail.HAND) - 2);
            fractionDetailStorageRepository.changeDetailQuantity(Detail.FEET,
                    fractionDetailStorageRepository.getDetailQuantity(Detail.FEET) - 2);
        }
    }
}
