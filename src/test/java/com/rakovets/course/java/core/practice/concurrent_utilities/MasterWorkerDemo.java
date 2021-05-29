package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.SharedResource;
import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.threads.Master;
import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.threads.Worker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ReentrantLock reentrantLock = new ReentrantLock();
        ExecutorService master = Executors.newSingleThreadExecutor();
        ExecutorService worker = Executors.newSingleThreadExecutor();
        master.execute(new Master(sharedResource, reentrantLock));
        worker.execute(new Worker(sharedResource));
        master.shutdown();
        worker.shutdown();
    }
}
