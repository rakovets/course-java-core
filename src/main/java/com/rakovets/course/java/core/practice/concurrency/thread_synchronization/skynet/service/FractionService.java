package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository.FractionRobotRepository;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.Detail;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository.FractionDetailRepository;

public class FractionService extends Thread {
    private final FactoryService factoryService;
    public Detail detail;
    public static int NUMBER_OF_CONSUMED_DETAILS;
    private final FractionDetailRepository fractionDetailRepository = new FractionDetailRepository();
    public FractionRobotRepository fractionRobotRepository = new FractionRobotRepository();
    public String fraction;
    public int numberOfRobot;

    static {

        NUMBER_OF_CONSUMED_DETAILS = 5;

    }

    public FractionService(FactoryService factoryService) {
        this.factoryService = factoryService;
    }

    public void run() {
        for (int i = 0; i < NUMBER_OF_CONSUMED_DETAILS; i++) {
            while ((detail = factoryService.consume()) != null) {
                switch (detail) {
                    case HEAD:
                        fractionDetailRepository.changeDetailQuantity(Detail.HEAD,
                            fractionDetailRepository.getDetailQuantity(Detail.HEAD) + 1);
                        break;
                    case TORSO:
                        fractionDetailRepository.changeDetailQuantity(Detail.TORSO,
                            fractionDetailRepository.getDetailQuantity(Detail.TORSO) + 1);
                        break;
                    case HAND:
                        fractionDetailRepository.changeDetailQuantity(Detail.HAND,
                            fractionDetailRepository.getDetailQuantity(Detail.HAND) + 1);
                        break;
                    case FEET:
                        fractionDetailRepository.changeDetailQuantity(Detail.FEET,
                            fractionDetailRepository.getDetailQuantity(Detail.FEET) + 1);
                        break;
                }
            }
        }

        while (fractionDetailRepository.getDetailQuantity(Detail.HEAD) >= 1 &&
                fractionDetailRepository.getDetailQuantity(Detail.TORSO) >= 1 &&
                fractionDetailRepository.getDetailQuantity(Detail.HAND) >= 2 &&
                fractionDetailRepository.getDetailQuantity(Detail.FEET) >= 2) {
            fractionRobotRepository.robot.add(numberOfRobot);
            fractionDetailRepository.changeDetailQuantity(Detail.HEAD,
                    fractionDetailRepository.getDetailQuantity(Detail.HEAD) - 1);
            fractionDetailRepository.changeDetailQuantity(Detail.TORSO,
                    fractionDetailRepository.getDetailQuantity(Detail.TORSO) - 1);
            fractionDetailRepository.changeDetailQuantity(Detail.HAND,
                    fractionDetailRepository.getDetailQuantity(Detail.HAND) - 2);
            fractionDetailRepository.changeDetailQuantity(Detail.FEET,
                    fractionDetailRepository.getDetailQuantity(Detail.FEET) - 2);
        }
    }
}
