package com.rakovets.course.java.core.example.concurrency;

/**
 * Demonstration of how to calculate the execution time for "useful work"
 */
public class Example11 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // start useful work
        work();
        // finish useful work
        long finish = System.currentTimeMillis();
        System.out.println((finish - start) + " ms");
    }

    public static void work() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
