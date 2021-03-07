package com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator;

import java.util.List;

public class TimeMeasure {
    public static String measureExecuteTime(List<int[]> list, int thread) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArraySum.getArraySumThroughThreads(list, thread);
        long endTime = System.currentTimeMillis();
        return String.format("Execution time with %d thread: %d ms", thread, (endTime - startTime));
    }
}
