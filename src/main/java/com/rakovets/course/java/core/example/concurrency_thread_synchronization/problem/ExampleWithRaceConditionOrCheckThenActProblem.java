package com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem;

import java.util.HashMap;
import java.util.Map;

public class ExampleWithRaceConditionOrCheckThenActProblem {
    public static void main(String[] args) {
        Map<String, String> sharedMap = new HashMap<>();

        Thread thread1 = new Thread(getRunnable(sharedMap, "Tread-1"));
        Thread thread2 = new Thread(getRunnable(sharedMap, "Tread-2"));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Map<String, String> sharedMap, String value) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                if (sharedMap.containsKey("switcher")) {
                    String currentValue = sharedMap.remove("switcher");
                    if (currentValue == null) {
                        System.out.printf("%s, iteration %d\n", value, i);
                    }
                } else {
                    sharedMap.put("switcher", value);
                }
            }
            System.out.println();
        };
    }
}
