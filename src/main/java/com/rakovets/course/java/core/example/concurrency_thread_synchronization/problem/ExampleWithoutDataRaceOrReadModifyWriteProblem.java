package com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem.service.Counter;
import com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem.service.impl.CounterWithSynchronization;

public class ExampleWithoutDataRaceOrReadModifyWriteProblem {
    public static void main(String[] args) {
        Counter sharedCounter = new CounterWithSynchronization();

        Thread thread1 = new Thread(getRunnable(sharedCounter, "Tread-1 final count:"));
        Thread thread2 = new Thread(getRunnable(sharedCounter, "Tread-2 final count:"));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Counter counter, String message) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
            System.out.printf("%s %d\n", message, counter.get());
        };
    }
}
