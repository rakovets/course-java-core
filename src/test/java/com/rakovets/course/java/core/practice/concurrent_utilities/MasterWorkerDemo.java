package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.example.concurrent_utilities.model.Producer;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkerDemo {
        public static void main(String[] args) {
            LinkedList<Integer> commonResource = new LinkedList<>();
            ReentrantLock lock = new ReentrantLock();
            ExecutorService executorService = Executors.newFixedThreadPool(3);

            executorService.submit(new Master(commonResource, lock));
            executorService.submit(new Worker(commonResource, lock));
            executorService.submit(new Worker(commonResource, lock));
            executorService.shutdown();
        }
}
