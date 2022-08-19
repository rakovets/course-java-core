package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Logger;

public class Fraction implements Runnable {
    private static final Logger LOGGER = Logger.getLogger("Fraction");
    public static final int MAX_DETAIL_COUNT = 5;
    @lombok.Getter
    private final String name;
    private final Queue<Detail> details;
    private final Map<DetailType, Queue<Detail>> fractionDetail = new LinkedHashMap<>();
    @lombok.Getter
    private final List<List<Detail>> army = new ArrayList<>();

    private int day;

    public Fraction(Factory factory, String name) {
        this.details = factory.getDetails();
        this.day = factory.getDay();
        this.name = name;
    }

    /**
     * The factions go to the factory in order to get parts for the robots.
     * <p />Each faction can carry no more than 5 parts.
     */
    @Override
    public void run() {
        try {
            while (day > 0) {
                synchronized (details) {
                    if (details.isEmpty()) {
                        LOGGER.info("Fraction sleep");
                        details.notifyAll();
                        details.wait(200L);
                    }
                    for (int i = 0; i < MAX_DETAIL_COUNT; i++) {
                        Detail poolDetail = details.poll();
                        if (poolDetail != null) {
                            Queue<Detail> queue;
                            queue = fractionDetail.computeIfAbsent(poolDetail.getDetailType(), k -> new LinkedList<>());
                            queue.add(poolDetail);
                        }
                    }
                    day--;
                    print(fractionDetail);
                    makeArmy(fractionDetail);
                    String info = "Army size" + army.size();
                    LOGGER.info(info);
                    details.notifyAll();
                    details.wait(2000L);
                }
            }
        } catch (InterruptedException e) {
            LOGGER.info(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Prints information.
     *
     * @param fractionDetail collection of details.
     */
    public void print(Map<DetailType, Queue<Detail>> fractionDetail) {
        String info = "Fraction" + name;
        LOGGER.info(info);
        fractionDetail.keySet().stream()
                .map(detailType -> detailType + " size:" + fractionDetail.get(detailType).size())
                .forEachOrdered(LOGGER::info);
    }

    /**
     * Creation of robots.
     *
     * @param fractionDetail collection of details.
     */
    public void makeArmy(Map<DetailType, Queue<Detail>> fractionDetail) {
        List<Detail> object = new ArrayList<>();
        if (fractionDetail.size() == DetailType.values().length) {
            if (fractionDetail.get(DetailType.FEET).size() <= 1
                    || fractionDetail.get(DetailType.HAND).size() <= 1
                    || fractionDetail.get(DetailType.TORSO).isEmpty()
                    || fractionDetail.get(DetailType.HEAD).isEmpty()) {
                return;
            }
            object.add(fractionDetail.get(DetailType.HEAD).poll());
            object.add(fractionDetail.get(DetailType.TORSO).poll());
            object.add(fractionDetail.get(DetailType.FEET).poll());
            object.add(fractionDetail.get(DetailType.FEET).poll());
            object.add(fractionDetail.get(DetailType.HAND).poll());
            object.add(fractionDetail.get(DetailType.HAND).poll());
            army.add(object);
        }
    }
}
