package com.rakovets.course.java.core.example.concurrency_thread_synchronization.problem.service;

public class Resolver {
    private static boolean isResolve = false;

    public boolean isResolve() {
        boolean result;
        synchronized (this) {
            result = isResolve;
            isResolve = !isResolve;
        }
        return result;
    }
}
