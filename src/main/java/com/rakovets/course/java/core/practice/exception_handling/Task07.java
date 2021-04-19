package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task07 {
    public static String getDecision() throws Exception {
        Random random = new Random();
        int roulette = random.nextInt(3);

        if (roulette <= 1) {
            throw new Exception("Red");
        }
        return "Black";
    }
}
