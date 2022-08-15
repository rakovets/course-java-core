package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.Random;
import java.util.function.Predicate;

public class ProducerThread extends Thread {
    private final Store store;

    Predicate<Integer> isSimple = (number) -> {
        boolean isSimple = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    };

    public ProducerThread(Store store) {
        this.store = store;
    }

    private Integer generateSimpleNumber() {
        return new Random()
                .ints(25, 1, 100)
                .boxed()
                .filter(isSimple)
                .findFirst()
                .orElse(3);
    }

    @Override
    public void run() {
        while (true) {
            store.produce(generateSimpleNumber());
        }
    }
}
