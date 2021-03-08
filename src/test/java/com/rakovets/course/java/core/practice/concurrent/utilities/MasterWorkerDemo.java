package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.Master;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.Worker;

import java.util.concurrent.CopyOnWriteArrayList;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> task = new CopyOnWriteArrayList<>();
        Thread master = new Thread(new Master(task));
        Thread worker = new Thread(new Worker(task, "src/main/resources/worker_result"));
        master.start();
        worker.start();
    }
}
