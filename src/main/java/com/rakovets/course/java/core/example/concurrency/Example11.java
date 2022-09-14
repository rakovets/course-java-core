package com.rakovets.course.java.core.example.concurrency;

/**
 * Demonstration of how to calculate the execution time for "useful work"
 */
public class Example11 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        // start useful work
        Thread.sleep(1234);
        // finish useful work
        long finish = System.currentTimeMillis();
        System.out.println((finish - start) / 1000);
    }
}
