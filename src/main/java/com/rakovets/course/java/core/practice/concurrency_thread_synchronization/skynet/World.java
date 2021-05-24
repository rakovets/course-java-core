package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.HashMap;
import java.util.Map;

public class World {
    private Map<String, Integer> robotParts = new HashMap<>();
    private Factory factory;
    private int armyCounter;

    public World(Factory factory){
        this.factory = factory;
        armyCounter = 0;
        robotParts.put("head", 0);
        robotParts.put("torso", 0);
        robotParts.put("hand", 0);
        robotParts.put("feet", 0);
    }

    public void getParts(){
        synchronized (factory) {
            String currentPart = factory.getPart();
            robotParts.replace(currentPart, robotParts.get(currentPart) + 1);
            makeRobot();
        }
    }

    public void makeRobot(){
        if(robotParts.get("head") == 1 && robotParts.get("torso") == 1 && robotParts.get("hand") == 2 && robotParts.get("feet") == 2){
            armyCounter++;
            robotParts.replace("head", robotParts.get("head") - 1);
            robotParts.replace("torso", robotParts.get("torso") - 1);
            robotParts.replace("hand", robotParts.get("hand") - 2);
            robotParts.replace("feet", robotParts.get("feet") - 2);
            System.out.println("Word day army " + armyCounter);
        }
    }

    public int getArmyCounter() {
        return armyCounter;
    }

    public Factory getFactory() {
        return factory;
    }
}
