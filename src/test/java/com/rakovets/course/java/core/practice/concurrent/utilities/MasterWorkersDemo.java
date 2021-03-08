package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.Master;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.Worker;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkersDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> task = new CopyOnWriteArrayList<>();
        ReentrantLock locker = new ReentrantLock();
        Thread master = new Thread(new Master(task));
        Thread worker1 = new Thread(new Worker(task, "src/main/resources/workers_result.txt", "Arsenij", locker));
        Thread worker2 = new Thread(new Worker(task, "src/main/resources/workers_result.txt", "Anatolij", locker));
        Thread worker3 = new Thread(new Worker(task, "src/main/resources/workers_result.txt", "Andrey", locker));
        master.start();
        worker1.start();
        worker2.start();
        worker3.start();
    }
}
