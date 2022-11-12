package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.*;

public class SkyNetDemo {
    public static void main(String[] args) {
        Factory factory = new Factory(100);
        FactoryThread factoryThread = new FactoryThread(factory);
        World world = new World(factory);
        Wednesday wednesday = new Wednesday(factory); // надо надобавлять везде логгеров и просмотреть в каком месте ошибка
        new Thread(factoryThread).start();
        try {
            new Thread(world).join();
            new Thread(wednesday).join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if (wednesday.getRobotsAry() > world.getRobotsAry()){
            System.out.println("Wednesday army is stronger");
            System.out.println(wednesday.getRobotsAry());
        } else {
            System.out.println("World army is stronger");
            System.out.println(world.getRobotsAry());
        }
    }
}
