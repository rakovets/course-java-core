package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

public class Demo {
    public static void main(String[] args) {
        final int TIME_OF_WORK_IN_MINUTES = 10;

        FactoryStore factoryStore = new FactoryStore(TIME_OF_WORK_IN_MINUTES);
        Thread factoryStarter = new FactoryStarter("FactoryStarter", factoryStore);
        Thread fractionOfRobotsStarter = new FractionOfRobotsStarter("FractionOfRobotsStarter", factoryStore);
        factoryStarter.start();
        fractionOfRobotsStarter.start();
    }
}
