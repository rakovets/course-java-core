package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.master_and_worker.Master;
import com.rakovets.course.java.core.practice.concurrency.master_and_worker.Worker;

import java.util.LinkedList;
import java.util.List;

public class MasterAndWorkerDemo {
    public static void main(String[] args) {
        Thread master = new Thread(new Master(),"MasterThread");
        Thread worker0 = new Thread(new Worker(),"FirstWorkerThread");
        Thread worker1 = new Thread(new Worker(),"SecondWorkerThread");
        Thread worker2 = new Thread(new Worker(),"ThirdWorkerThread");
        master.start();
        worker0.start();
        worker1.start();
        worker2.start();
    }
}
