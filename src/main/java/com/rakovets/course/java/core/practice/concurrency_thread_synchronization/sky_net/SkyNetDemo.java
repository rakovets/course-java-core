package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.logging.Logger;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger("Robots");
        Factory factory = new Factory(2);
        factory.setName("Factory");
        Faction world = new Faction(factory);
        world.setName("World");
        Faction wednesday = new Faction(factory);
        wednesday.setName("Wednesday");
        factory.start();
        world.start();
        wednesday.start();
        factory.join();
        world.join();
        wednesday.join();
        logger.info(compareFactions(wednesday, world));
    }

    private static String compareFactions(Faction faction1, Faction faction2) {
        if (faction1.makeRobots() > faction2.makeRobots()) {
            return faction1.getName() + " is a winner";
        } else {
            return faction2.getName() + " is a winner";
        }
    }
}
