package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Factory extends Thread {
    Logger logger = Logger.getLogger(Factory.class.getName());
    private final FactoryStore factoryStore;
    public Factory(String name, FactoryStore factoryStore) {
        super(name);
        this.factoryStore = factoryStore;
    }

    @Override
    public void run() {
        final int SECONDS_IN_MINUTE = 60;
        final int MILLIS_IN_SECOND = 1000;
        final int MAX_SPEARS_PRODUCE_BY_PERIOD = 10;

        int timeOfWorkInMinutes = factoryStore.getTimeOfWorkInMinutes();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime <= timeOfWorkInMinutes * SECONDS_IN_MINUTE * MILLIS_IN_SECOND) {
            while ((int) System.currentTimeMillis() % (SECONDS_IN_MINUTE * MILLIS_IN_SECOND) < (SECONDS_IN_MINUTE * MILLIS_IN_SECOND / 2)) {
                synchronized (factoryStore) {
                    factoryStore.produceOneSpearPartToFactoryStore();
                }
                logger.info(Thread.currentThread().getName() + " произвел деталь");
                try {
                    sleep(MILLIS_IN_SECOND * 3);
                } catch (InterruptedException e) {
                    logger.info(e.getMessage());
                }
            }
            logger.info(Thread.currentThread().getName() + " заснул на вечернее время");
            while ((int) System.currentTimeMillis() % (SECONDS_IN_MINUTE * MILLIS_IN_SECOND) > (SECONDS_IN_MINUTE * MILLIS_IN_SECOND / 2)) {
                try {
                    sleep(MILLIS_IN_SECOND * 10);
                } catch (InterruptedException e) {
                    logger.info(e.getMessage());
                }
            }
        }
        //factoryStore.finishWork();
        int sum = IntStream.of(factoryStore.getArrayOfSpears()).sum();
        logger.info("На заводском складе осталось " + sum + " деталей для роботов");
        logger.info(Thread.currentThread().getName() + " закончил свою работу");
    }
}
