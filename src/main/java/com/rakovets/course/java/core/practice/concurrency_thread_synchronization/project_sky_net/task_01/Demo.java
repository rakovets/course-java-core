package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        final int TIME_OF_WORK_IN_MINUTES = 2;
        final int NUMBER_OF_PERMISSIONS_TO_PRODUCE_SPEARS_FOR_FACTORY = 10;

        String NAME_OF_FACTORY_STARTER_THREAD = "FactoryStarter";
        String NAME_OF_FACTORY_THREAD = "Factory";
        String NAME_OF_FRACTION_OF_ROBOTS_STARTER_THREAD = "FractionOfRobotsStarter";

        Map<String, Integer> namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay = new HashMap<>();
        namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay.put("World", 5);
        namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay.put("Wednesday", 5);

        FactoryStore factoryStore = new FactoryStore(TIME_OF_WORK_IN_MINUTES, NUMBER_OF_PERMISSIONS_TO_PRODUCE_SPEARS_FOR_FACTORY, namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay);
        Thread factoryStarter = new FactoryStarter(NAME_OF_FACTORY_STARTER_THREAD, NAME_OF_FACTORY_THREAD, factoryStore, SpeedType.HIGH);
        Thread fractionOfRobotsStarter = new FractionOfRobotsStarter(NAME_OF_FRACTION_OF_ROBOTS_STARTER_THREAD, factoryStore, SpeedType.MIDDLE);
        factoryStarter.start();
        fractionOfRobotsStarter.start();
    }
}
