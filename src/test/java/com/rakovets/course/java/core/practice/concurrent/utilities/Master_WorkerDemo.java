package com.rakovets.course.java.core.practice.concurrent.utilities;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Master_WorkerDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        ReentrantLock locker = new ReentrantLock();

        Thread master = new Thread(new ImprovedMaster(list));
        Thread worker1 = new Thread(new ImprovedWorker(list, "src/main/resources/test1.txt", "Thread_1", locker));
        Thread worker2 = new Thread(new ImprovedWorker(list, "src/main/resources/test1.txt", "Thread_2", locker));
        Thread worker3 = new Thread(new ImprovedWorker(list, "src/main/resources/test1.txt", "Thread_3", locker));

        master.start();
        worker1.start();
        worker2.start();
        worker3.start();
    }
}
