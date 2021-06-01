package com.rakovets.course.java.core.practice.concurrent_utilities.master_workers;

import com.rakovets.course.java.core.practice.master_workers.Master;
import com.rakovets.course.java.core.practice.master_workers.Worker;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ReentrantLock locker = new ReentrantLock();
        Master master = new Master(list);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executorService.submit(new Worker(list, locker));
        }
        master.start();
        executorService.shutdown();
    }
}
