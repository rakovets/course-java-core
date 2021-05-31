package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.ThreadMaster;
import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.ThreadWorker;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkersDemo {
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
