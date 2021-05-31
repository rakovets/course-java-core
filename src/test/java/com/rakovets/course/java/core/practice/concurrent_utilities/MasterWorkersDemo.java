package com.rakovets.course.java.core.practice.concurrent_utilities;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkersDemo {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        ExecutorService master = Executors.newSingleThreadExecutor();
        ExecutorService workers = Executors.newSingleThreadExecutor();

        master.execute(new Master(commonResource,locker));
        workers.execute(new Workers(commonResource, locker));
        workers.execute(new Workers(commonResource, locker));
        master.shutdown();
        workers.shutdown();
        workers.shutdown();
    }
}
