package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Wednesday extends BountyHunter implements Runnable {
    @Override
    public void run() {
        getDetails();
    }
}

