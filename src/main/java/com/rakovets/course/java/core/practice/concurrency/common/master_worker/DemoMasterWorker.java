package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

public class DemoMasterWorker {
    public static void main(String[] args) {
        CommonResource comRes = new CommonResource();

        new Thread(new MasterThread(comRes)).start();
        new Thread(new WorkThread(comRes)).start();
    }
}
