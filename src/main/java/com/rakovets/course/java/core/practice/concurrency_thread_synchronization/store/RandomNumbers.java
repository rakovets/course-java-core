package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store;

import java.util.Random;

public final class RandomNumbers {
    public static final Random RANDOM = new Random();
    private static final int DEFAULT = 20;

    public RandomNumbers() {
    }

    public static int getRandom(int number) {
        return RANDOM.nextInt(number);
    }

    public static int getRandom() {
        return RANDOM.nextInt(DEFAULT);
    }
}
