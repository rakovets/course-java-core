package com.rakovets.course.java.core.example.concurrency;

import com.rakovets.course.java.core.example.concurrency.model.InfinityRunnable;

public class Example13ThreadGroups {
    public static void main(String[] args) {
        ThreadGroup gr = new ThreadGroup("Thread group 1");

        Thread t1 = new Thread(gr, new InfinityRunnable(), "Thread 1");
        Thread t2 = new Thread(gr, new InfinityRunnable(),"Thread 2");
        t1.start();
        t2.start();

        Thread[] threads = new Thread[gr.activeCount()];
        gr.enumerate(threads);
        for (Thread t : threads) {
            System.out.println(t);
        }

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gr.interrupt();
    }
}
