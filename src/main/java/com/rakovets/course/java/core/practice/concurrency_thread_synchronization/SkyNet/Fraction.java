package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Fraction {
    private final Logger logger = Logger.getLogger(Fraction.class.getName());
    private final Map<String, Integer> map = new HashMap<>();
    private final String fractionType;
    private int robotsAmount;

    public Fraction(String fractionType) {
        this.fractionType = fractionType;
        robotsAmount = 0;
        map.put("head", 0);
        map.put("torso", 0);
        map.put("hand", 0);
        map.put("feet", 0);
    }

    public void receiveDetails(Factory factory) {
        for (int i = 1; i <= 5; i++) {
            String detail = factory.getDetails();
            map.put(detail, map.get(detail) + 1);
            logger.info(Thread.currentThread().getName() + " " + detail + "has been received by fraction");
        }
    }

    public void makeRobots() {
        Collection<Integer> detailsCollection = map.values();
        int min = Integer.MAX_VALUE;
        for (int detailNo : detailsCollection) {
            if (detailNo < min) {
                min = detailNo;
            }
        }
        robotsAmount = min;
        logger.info(getFractionType() + " has made " + robotsAmount + " robots");
    }

    public int getRobotsAmount() {
        return robotsAmount;
    }

    public String getFractionType() {
        return fractionType;
    }
}
