package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker.ThreadMaster;
import com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker.ThreadWorker;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MasterAndWorkerDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ReentrantLock locker = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int x = 0; x < 3; x++) {
            executorService.submit(new ThreadWorker(list, locker));
        }
        ThreadMaster threadMaster = new ThreadMaster(list);
        threadMaster.start();
        executorService.shutdown();
    }
}
