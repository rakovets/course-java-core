package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.logging.Logger;
import java.util.stream.IntStream;

public class FractionOfRobots extends Thread {
    private final static Logger logger = Logger.getLogger(FractionOfRobots.class.getName());
    private final int[] arrayOfSpears = new int[4];
    private final FactoryStore factoryStore;
    public FractionOfRobots(String name, FactoryStore factoryStore) {
        super(name);
        this.factoryStore = factoryStore;
    }

    @Override
    public void run() {
        final long START_TIME = System.currentTimeMillis();
        final int SECONDS_IN_MINUTE = 60;
        final int MILLIS_IN_SECOND = 1000;

        while (System.currentTimeMillis() - START_TIME <= factoryStore.getTimeOfWorkInDays() * SECONDS_IN_MINUTE * MILLIS_IN_SECOND) {
            int i = factoryStore.getOneSpearPartFromFactoryStore();
            if (i == -1) {
                break;
            }
            arrayOfSpears[i]++;
            try {
                sleep(MILLIS_IN_SECOND * 2);
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        logger.info(Thread.currentThread().getName() + " закончил свою работу");
        logger.info("Фракцией " + Thread.currentThread().getName() + " всего укомплектовано: " + IntStream.of(this.arrayOfSpears).min().getAsInt() + " роботов");
        logger.info(Thread.currentThread().getName() + " раздобыл голов: " + arrayOfSpears[0] + ", торсов: " + arrayOfSpears[1] + ", рук: " + arrayOfSpears[2] + ", ног: " + arrayOfSpears[3]);
        factoryStore.setTimeIsOver(true);
        factoryStore.finishWork();
    }
}

