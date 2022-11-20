package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Factory extends Thread {
    private final static Logger logger = Logger.getLogger(Factory.class.getName());
    private final FactoryStore factoryStore;
    public Factory(String name, FactoryStore factoryStore) {
        super(name);
        this.factoryStore = factoryStore;
    }

    @Override
    public void run() {
        final int SECONDS_IN_MINUTE = 60;
        final int MILLIS_IN_SECOND = 1000;
        long START_TIME = System.currentTimeMillis();
        while (System.currentTimeMillis() - START_TIME <= factoryStore.getTimeOfWorkInDays() * SECONDS_IN_MINUTE * MILLIS_IN_SECOND) {
            factoryStore.produceOneSpearPartToFactoryStore();
            try {
                sleep(MILLIS_IN_SECOND * 1);
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        logger.info("На заводском складе осталось " + IntStream.of(factoryStore.getArrayOfSpears()).sum() + " деталей для роботов");
        logger.info(Thread.currentThread().getName() + " закончил свою работу");
        factoryStore.setTimeIsOver(true);
        factoryStore.finishWork();
    }
}
