package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.master_worker.Master;
import com.rakovets.course.java.core.practice.concurrency.common.master_worker.Worker;

import java.util.LinkedList;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        LinkedList<Integer> task = new LinkedList<>();
        Thread master = new Master(task);
        Thread worker = new Worker(task, "src/main/resources/worker_result");
        master.start();
        worker.start();
    }
}
