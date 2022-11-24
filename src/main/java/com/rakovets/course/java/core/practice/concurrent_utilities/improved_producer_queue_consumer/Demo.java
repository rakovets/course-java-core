package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        final int NUMBERS_OF_CONSUMERS_THREAD = 3;
        final String fileDirName = ".." + File.separator + "course-java-core" + File.separator + "src" + File.separator + "test" + File.separator + "resources";
        final String threadGroupName = "Thread group 1";
        Semaphore semaphore = new Semaphore(1);
        final Queue<Integer> queue = new ArrayDeque<>();
        final CommonQueue commonQueue = new CommonQueue(queue);
        final ThreadGroup threadGroup = new ThreadGroup(threadGroupName);

        new Producer(threadGroup, "Producer", commonQueue).start();
        for (int i = 1; i <= NUMBERS_OF_CONSUMERS_THREAD; i++) {
            new Consumer(threadGroup, "Consumer " + i, commonQueue, fileDirName, semaphore).start();
        }
    }
}
