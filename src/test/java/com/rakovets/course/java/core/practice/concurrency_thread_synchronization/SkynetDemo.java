package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.*;

public class SkynetDemo {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory(100);
        World world = new World(factory);
        Wednesday wednesday = new Wednesday(factory);
        FactoryAction factoryAction = new FactoryAction("Factory Action", factory);
        WednesdayAction wednesdayAction = new WednesdayAction("Wednesday Action", wednesday);
        WorldAction worldAction = new WorldAction("World Action", world);
        Thread factoryActionThread = new Thread(factoryAction);
        Thread wednesdayActionThread = new Thread(wednesdayAction);
        Thread worldActionThread = new Thread(worldAction);
        factoryActionThread.start();
        wednesdayActionThread.start();
        worldActionThread.start();
        try {
            factoryActionThread.join();
            wednesdayActionThread.join();
            wednesdayActionThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if (wednesday.getArmyCounter() > world.getArmyCounter()){
            System.out.println("Wednesday army is stronger");
        } else {
            System.out.println("World army is stronger");
        }
    }
}
