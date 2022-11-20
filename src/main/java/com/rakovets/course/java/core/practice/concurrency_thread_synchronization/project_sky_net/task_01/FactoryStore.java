package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class FactoryStore {
    private final static Logger logger = Logger.getLogger(FactoryStore.class.getName());
    private final int SECONDS_IN_MINUTE = 60;
    private final int MILLIS_IN_SECOND = 1000;
    private final int[] arrayOfSpears = new int[4];
    private final int timeOfWorkInDays;
    private final int maxNumberOfSpearsAllowedToProduceFactoryPerDay;
    private final Map<String, Integer> namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay;
    private final Map<String, Integer> namesOfRobotsThreadAndNumberOfSpearsTakenPerDay = new HashMap<>();
    private int numbersOfSpearsProducedByOneDay;
    private int numbersOfSpearsTakenByOneNight;
    private boolean factoryIsAwaiting;
    private boolean timeIsOver;

    {
        factoryIsAwaiting = true;
    }

    public FactoryStore(int timeOfWorkInDays, int maxNumberOfSpearsAllowedToProduceFactoryPerDay, Map<String, Integer> namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay) {
        this.timeOfWorkInDays = timeOfWorkInDays;
        this.maxNumberOfSpearsAllowedToProduceFactoryPerDay = maxNumberOfSpearsAllowedToProduceFactoryPerDay;
        this.namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay = namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay;
        for (Map.Entry<String, Integer> item : namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay.entrySet()) {
            namesOfRobotsThreadAndNumberOfSpearsTakenPerDay.put(item.getKey(), 0);
        }
    }

    public Map<String, Integer> getNamesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay() {
        return this.namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay;
    }

    public void setTimeIsOver(boolean timeIsOver) {
        this.timeIsOver = timeIsOver;
    }

    public synchronized int[] getArrayOfSpears() {
        return arrayOfSpears;
    }

    public synchronized void finishWork() {
        notifyAll();
    }

    public int getTimeOfWorkInDays() {
        return timeOfWorkInDays;
    }

    public boolean isNightTime() {
        return (System.currentTimeMillis() % (SECONDS_IN_MINUTE * MILLIS_IN_SECOND)) > (SECONDS_IN_MINUTE * MILLIS_IN_SECOND / 2);
    }

    public long restOfDayToSleep() {
        return (SECONDS_IN_MINUTE * MILLIS_IN_SECOND) / 2 - System.currentTimeMillis() % (SECONDS_IN_MINUTE * MILLIS_IN_SECOND);
    }

    public long restOfNightToSleep() {
        return (SECONDS_IN_MINUTE * MILLIS_IN_SECOND - System.currentTimeMillis() % (SECONDS_IN_MINUTE * MILLIS_IN_SECOND));
    }

    public synchronized void produceOneSpearPartToFactoryStore() {
        logger.info("Фабрика хочет сделать деталь");
        while (this.isNightTime()) {
            numbersOfSpearsProducedByOneDay = 0;
            if (timeIsOver) {
                logger.info("Время работы вышло, поток прекращает работу");
                notifyAll();
                break;
            }
            factoryIsAwaiting = true;
            notifyAll();
            logger.info("Фабрика после дня пытается разбудить роботов и лечь спать, т.к. сейчас ночь");
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
            if (timeIsOver) {
                logger.info("Время работы вышло, поток прекращает работу");
                notifyAll();
                break;
            }
            logger.info("Фабрику разбудили, т.к. наступил день");
        }
        logger.info("Сейчас день");
        if (numbersOfSpearsProducedByOneDay < maxNumberOfSpearsAllowedToProduceFactoryPerDay) {
            int i = (int) (Math.random() * arrayOfSpears.length);
            if (!timeIsOver) {
                arrayOfSpears[i]++;
                numbersOfSpearsProducedByOneDay++;
                logger.info("Фабрика сделала деталь, позиция: " + i);
            }
            logger.info("Количество произведенных за день деталей к настоящему моменту ВСЕГО: " + numbersOfSpearsProducedByOneDay);
        } else {
            try {
                logger.info("Фабрика досрочно выполнила работу и решила прилечь отдохнуть до конца дня");
                sleep(this.restOfDayToSleep());
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
            if (timeIsOver) {
                logger.info("Время работы вышло, поток Фабрика прекращает работу");
                notifyAll();
            }
            factoryIsAwaiting = true;
            notifyAll();
            logger.info("Фабрика проснулась после дневного сна и пытается разбудить роботов");
        }
    }

    public synchronized int getOneSpearPartFromFactoryStore() {
        logger.info(Thread.currentThread().getName() + " хочет получить деталь");
        while (!this.isNightTime()) {
            numbersOfSpearsTakenByOneNight = 0;
            namesOfRobotsThreadAndNumberOfSpearsTakenPerDay.put(Thread.currentThread().getName(), 0);
            logger.info("Сейчас день, роботы должны спать");
            if (timeIsOver) {
                logger.info("Время работы вышло, поток прекращает работу");
                notifyAll();
                return -1;
            }
            if (factoryIsAwaiting) {
                logger.info("Робот после ночи пытается разбудить фабрику и лечь спать т.к. наступил день");
                notify();
                factoryIsAwaiting = false;
            }
            try {
                logger.info("Робот засыпает");
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
            if (timeIsOver) {
                logger.info("Время работы вышло, поток " + Thread.currentThread().getName() + " прекращает работу");
                notifyAll();
                return -1;
            }
            logger.info("Роботов разбудили, т.к. наступила ночь");
        }
        logger.info("Сейчас ночь");
        if (timeIsOver) {
            logger.info("Время работы вышло, поток прекращает работу");
            notifyAll();
            return -1;
        }
        int typeOfSpears = 0;
        int j = namesOfRobotsThreadAndNumberOfSpearsTakenPerDay.get(Thread.currentThread().getName());
        if (namesOfRobotsThreadAndNumberOfSpearsTakenPerDay.get(Thread.currentThread().getName()) < namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay.get(Thread.currentThread().getName()) && IntStream.of(arrayOfSpears).sum() > 0) {
            boolean spearIsNotChosen = true;
            while (spearIsNotChosen) {
                int i = (int) (Math.random() * arrayOfSpears.length);
                if (arrayOfSpears[i] > 0) {
                    arrayOfSpears[i]--;
                    spearIsNotChosen = false;
                    typeOfSpears = i;
                    j++;
                    namesOfRobotsThreadAndNumberOfSpearsTakenPerDay.put(Thread.currentThread().getName(), j);
                    numbersOfSpearsTakenByOneNight++;
                    logger.info(Thread.currentThread().getName() + " забрал деталь, позиция: " + i);
                    logger.info("Роботы забрали за ночь деталей ВСЕГО, данные из переменной-счетчика: " + numbersOfSpearsTakenByOneNight);
                    int sum = namesOfRobotsThreadAndNumberOfSpearsTakenPerDay.entrySet().stream()
                            .map(x -> x.getValue())
                            .reduce(0, (x, y) -> x + y);
                    logger.info("Роботы забрали за ночь деталей ВСЕГО, данные из мапы: " + sum);
                }
            }
        } else {
            if (IntStream.of(arrayOfSpears).sum() == 0) {
                logger.info("Склад пуст, забирать нечего. Роботы ждут, пока на складе появятся детали");
            }
            try {
                logger.info(Thread.currentThread().getName() + " заснул до конца ночи");
                sleep(this.restOfNightToSleep());
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
            if (timeIsOver) {
                logger.info("Время работы вышло, поток прекращает работу");
                notifyAll();
                return -1;
            }
            if (factoryIsAwaiting) {
                logger.info("Робот после ночи пытается разбудить фабрику и лечь спать т.к. наступил день");
                notify();
                factoryIsAwaiting = false;
            }
        }
        return typeOfSpears;
    }
}
