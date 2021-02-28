package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.masterAndWorker.ThreadMaster;
import com.rakovets.course.java.core.practice.concurrency.common.masterAndWorker.ThreadWorker;

import java.util.LinkedList;
import java.util.List;

public class MasterAndWorkerDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ThreadWorker threadWorker = new ThreadWorker(list);
        threadWorker.start();
        ThreadMaster threadMaster = new ThreadMaster(list);
        threadMaster.start();
    }
}
