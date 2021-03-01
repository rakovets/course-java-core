package com.rakovets.course.java.core.practice.concurrency.common.MasterWorker;

class MasterWorkerDemo {
    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();
        ThreadMaster threadMaster = new ThreadMaster(commonResource);
        ThreadWorker threadWorker = new ThreadWorker(commonResource);

        Thread thread1 = new Thread(threadMaster);
        Thread thread2 = new Thread(threadWorker);
        thread1.start();
        thread2.setDaemon(true);
        thread2.start();
    }
}
