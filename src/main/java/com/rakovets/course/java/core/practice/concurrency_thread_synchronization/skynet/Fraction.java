package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Fraction {
    private final Logger logger = Logger.getLogger(Fraction.class.getName());
    private final Map<String, Integer> robotDetails = new HashMap<>();
    private final Factory factory;
    private int robotsAry;

    public Fraction(Factory factory) {
        this.factory = factory;
        robotsAry = 0;
        robotDetails.put("head", 0);
        robotDetails.put("torso", 0);
        robotDetails.put("hand", 0);
        robotDetails.put("feet", 0);
    }

    public void obtainDetails() {
        for (int i = 1; i <= 5; i++) {
            String detail = factory.getDetails();
            if (!detail.equals("garbage")) {
                robotDetails.put(detail, robotDetails.get(detail) + 1);
                logger.info(Thread.currentThread().getName() + " fraction obtained " + detail);
            }
        }
    }

    public void createRobot() {
        if (robotDetails.get("head") >= 1 && robotDetails.get("torso") >= 1 && robotDetails.get("hand") >= 1 && robotDetails.get("feet") >= 1) {
            robotsAry++;
            robotDetails.replace("head", robotDetails.get("head") - 1);
            robotDetails.replace("torso", robotDetails.get("torso") - 1);
            robotDetails.replace("hand", robotDetails.get("hand") - 1);
            robotDetails.replace("feet", robotDetails.get("feet") - 1);
            logger.info(Thread.currentThread().getName() + " one robot was created");
        }
    }

    public Factory getFactory() {
        return factory;
    }

    public int getRobotsAry() {
        return robotsAry;
    }

    public Map<String, Integer> getRobotDetails() {
        return robotDetails;
    }
}
