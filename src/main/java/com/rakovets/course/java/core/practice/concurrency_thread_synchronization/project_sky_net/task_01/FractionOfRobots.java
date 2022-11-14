package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.OptionalInt;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class FractionOfRobots extends Thread {
    Logger logger = Logger.getLogger(FractionOfRobots.class.getName());
    private final int[] arrayOfSpears = new int[4];
    private FactoryStore factoryStore;
    public FractionOfRobots(String name, FactoryStore factoryStore) {
        super(name);
        this.factoryStore = factoryStore;
    }

    @Override
    public void run() {
        final int SECONDS_IN_MINUTE = 60;
        final int MILLIS_IN_SECOND = 1000;
        final int MAX_NUMBERS_OF_SPEARS_TAKEN_PER_DAY = 5;

        int timeOfWorkInMinutes = factoryStore.getTimeOfWorkInMinutes();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime <= timeOfWorkInMinutes * SECONDS_IN_MINUTE * MILLIS_IN_SECOND) {
            int numberOfTakenSpearsPerDay = 0;
            while ((int) System.currentTimeMillis() % (SECONDS_IN_MINUTE * MILLIS_IN_SECOND) >= (SECONDS_IN_MINUTE * MILLIS_IN_SECOND / 2)) {
                if (numberOfTakenSpearsPerDay < MAX_NUMBERS_OF_SPEARS_TAKEN_PER_DAY) {
                    int i = 0;
                    synchronized (factoryStore) {
                        i = factoryStore.getOneSpearPartFromFactoryStore();
                    }
                    logger.info(Thread.currentThread().getName() + " получил деталь деталь позиция номер " + i);
                    this.arrayOfSpears[i]++;
                    numberOfTakenSpearsPerDay++;
                }
                try {
                    sleep(MILLIS_IN_SECOND * 3);
                } catch (InterruptedException e) {
                    logger.info(e.getMessage());
                }
            }
            logger.info(Thread.currentThread().getName() + " заснул на дневное время");
            while ((int) System.currentTimeMillis() % (SECONDS_IN_MINUTE * MILLIS_IN_SECOND) < (SECONDS_IN_MINUTE * MILLIS_IN_SECOND / 2)) {
                try {
                    sleep(MILLIS_IN_SECOND * 10);
                } catch (InterruptedException e) {
                    logger.info(e.getMessage());
                }
            }
        }
        //factoryStore.finishWork();
        OptionalInt min = IntStream.of(this.arrayOfSpears).min();
        logger.info(Thread.currentThread().getName() + " закончил свою работу");
        logger.info("Фракцией " + Thread.currentThread().getName() + " всего укомплектовано: " + min.getAsInt() + " роботов");
        logger.info(Thread.currentThread().getName() + " раздобыл голов: " + arrayOfSpears[0] + ", торсов: " + arrayOfSpears[1] + ", рук: " + arrayOfSpears[2] + ", ног: " + arrayOfSpears[3]);
    }
}
