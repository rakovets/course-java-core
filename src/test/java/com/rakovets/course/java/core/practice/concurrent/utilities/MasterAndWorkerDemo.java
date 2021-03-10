package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker.ThreadMaster;
import com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker.ThreadWorker;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MasterAndWorkerDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ReentrantLock locker = new ReentrantLock();
        ThreadWorker threadWorker = new ThreadWorker(list, locker);
        threadWorker.start();
        ThreadWorker threadWorker2 = new ThreadWorker(list, locker);
        threadWorker2.start();
        ThreadWorker threadWorker3 = new ThreadWorker(list, locker);
        threadWorker3.start();
        ThreadMaster threadMaster = new ThreadMaster(list);
        threadMaster.start();
    }
}
