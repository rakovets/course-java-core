package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();
        ReentrantLock lock = new ReentrantLock();
        Path filePath = Paths.get("src", "main", "resources", "masterWorker.txt");

        Thread master = new Thread(new Master(arrayList));
        Thread worker1 = new Thread(new Worker(arrayList, filePath.toString(), "Thread1", lock));
        Thread worker2 = new Thread(new Worker(arrayList, filePath.toString(), "Thread2", lock));
        Thread worker3 = new Thread(new Worker(arrayList, filePath.toString(), "Thread3", lock));
        Thread worker4 = new Thread(new Worker(arrayList, filePath.toString(), "Thread4", lock));
        Thread worker5 = new Thread(new Worker(arrayList, filePath.toString(), "Thread5", lock));

        master.start();
        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();
    }
}
