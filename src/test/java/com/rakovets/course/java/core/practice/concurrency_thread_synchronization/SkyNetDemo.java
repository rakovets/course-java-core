package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions.BlueFaction;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions.RedFaction;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads.FactionsThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads.FactoryProduceThread;

public class SkyNetDemo {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BlueFaction blueFaction = new BlueFaction(factory);
        RedFaction redFaction = new RedFaction(factory);
        Thread factoryProduce = new Thread(new FactoryProduceThread(factory));
        Thread red = new Thread(new FactionsThread(redFaction), "Red team");
        Thread blue = new Thread(new FactionsThread(blueFaction), "Blue team");
        factoryProduce.start();
        red.start();
        blue.start();
    }
}
