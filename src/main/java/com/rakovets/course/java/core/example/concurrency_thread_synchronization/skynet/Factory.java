package com.rakovets.course.java.core.example.concurrency_thread_synchronization.skynet;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Factory extends Thread {
    private final static Queue<Details> DETAILS = new ArrayDeque<>();
    private static final List<Details> DETAILS_LIST = List.of(Details.values());
    private final Random random = new Random();
    private int daysLeft;
    private boolean daytime = true;

    public Factory(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public void generateDetails() {
        for (int i = 0; i < 10; i++) {
            DETAILS.add(DETAILS_LIST.get(random.nextInt(DETAILS_LIST.size())));
        }
    }

    public synchronized void produceDetails() throws InterruptedException {
        while (!daytime) {
            wait();
        }
        generateDetails();
        daysLeft--;
        daytime = false;
        notifyAll();
    }

    @Override
    public void run() {
        while (daysLeft != 0) {
            try {
                produceDetails();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("gfgfghcg");
    }

    public synchronized Details stealDetail() throws InterruptedException {
        while (daytime) {
            wait();
        }
        Details detail = DETAILS.poll();
        if (DETAILS.isEmpty()) {
            daytime = true;
            notifyAll();
        }
        return detail;
    }
}
