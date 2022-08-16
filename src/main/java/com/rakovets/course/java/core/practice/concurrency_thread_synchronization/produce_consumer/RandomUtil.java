package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer;

import java.util.Random;

public final class RandomUtil {
    public static final Random RANDOM = new Random();
    private static final int DEFAULT_NUMBER = 10;

    private RandomUtil() {
    }

    /**
     * Generates random numbers up to standard range.
     *
     * @return generated number.
     */
    public static int getRandom() {
        return RANDOM.nextInt(DEFAULT_NUMBER);
    }

    /**
     * Generates random numbers up to a given range.
     *
     * @param number received range.
     * @return generated number.
     */
    public static int getRandom(int number) {
        return RANDOM.nextInt(number);
    }
}
