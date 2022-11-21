package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.ArrayList;
import java.util.List;

public class World implements Runnable {
    private static final Integer COUNT_OF_DETAILS = 5;
    List<PathOfBody> data = new ArrayList<>();
    private final Factory factory = Factory.getInstance();

    @Override
    public void run() {
        for (int i = 0; i < COUNT_OF_DETAILS; i++) {
            if (!factory.getIsDay().get()) {
                PathOfBody pathOfBody = factory.getPathOfBody();
                if (pathOfBody != null) {
                    data.add(pathOfBody);
                }
            }
        }
    }

    public int getCacheSize() {
        return data.size();
    }

    public static World getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final World INSTANCE = new World();
    }
}
