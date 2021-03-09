package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker.ThreadMaster;
import com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker.ThreadWorker;

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
