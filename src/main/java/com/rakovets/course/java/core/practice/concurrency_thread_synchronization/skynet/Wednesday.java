package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Wednesday implements Runnable {
    private static final Integer COUNT_OF_DETAILS = 5;
    private final Logger logger = Logger.getLogger(Wednesday.class.getName());
    List<PathOfBody> data = new ArrayList<>();
    private final Factory factory = Factory.getInstance();

    private Wednesday() {

    }

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

    public static Wednesday getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final Wednesday INSTANCE = new Wednesday();
    }
}
