package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task7 {
    public static String getDecision() throws Exception {
        Random random = new Random();
        int temperature = random.nextInt(61) - 30;

        if (temperature <= 0) {
            throw new Exception("Don't leave the room, don't make a mistake!");
        }
        return "Nice time to go out!";
    }
}
