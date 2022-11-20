package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Factory implements Runnable {
    private static final Integer COUNT_OF_DETAILS = 10;
    private static final List<PathOfBody> data = new ArrayList<>();
    private final AtomicBoolean isDay = new AtomicBoolean(true);
    Lock lock = new ReentrantLock(true);

    private Factory() {

    }

    @Override
    public void run() {
        int countDetails = new Random().nextInt(COUNT_OF_DETAILS);
        for (int i = 0; i < countDetails; i++) {
            PathOfBody pathOfBody = PathOfBody.values()[new Random().nextInt(4)];
            data.add(pathOfBody);
        }
        isDay.set(false);
    }

    public PathOfBody getPathOfBody() {
        lock.lock();
        try {
            if (data.size() != 0) {
                PathOfBody pathOfBody = data.get(data.size() - 1);
                data.remove(pathOfBody);
                return pathOfBody;
            }
        } finally {
            lock.unlock();
        }

        return null;
    }

    public AtomicBoolean getIsDay() {
        return isDay;
    }

    public static Factory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final Factory INSTANCE = new Factory();
    }
}
