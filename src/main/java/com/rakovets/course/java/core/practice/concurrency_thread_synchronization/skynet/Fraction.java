package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Fraction {
    private final Logger logger = Logger.getLogger(Fraction.class.getName());
    private final Map<String, Integer> robotDetails = new HashMap<>();
    private final String fractionName;
    private int robotsAry;

    public Fraction(String fractionName) {
        this.fractionName = fractionName;
        robotsAry = 0;
        robotDetails.put("head", 0);
        robotDetails.put("torso", 0);
        robotDetails.put("hand", 0);
        robotDetails.put("feet", 0);
    }

    public void obtainDetails(Factory factory) {
        for (int i = 1; i <= 5; i++) {
            String detail = factory.getDetails();
            robotDetails.put(detail, robotDetails.get(detail) + 1);
            logger.info(Thread.currentThread().getName() + " fraction obtained " + detail);
        }
    }

    public void createRobots() {
        Collection<Integer> allDetails = robotDetails.values();
        int min = Integer.MAX_VALUE;
        for (int numberOfDetail : allDetails) {
            if (numberOfDetail < min) {
                min = numberOfDetail;
            }
        }
        robotsAry = min;
        logger.info(getFractionName() + " has " + robotsAry + " robots.");
    }

    public int getRobotsAry() {
        return robotsAry;
    }

    public String getFractionName() {
        return fractionName;
    }
}
