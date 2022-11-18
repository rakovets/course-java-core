package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer;

public class ProduceThread implements Runnable {
    private final Store store;
    private final int threadsAmount;
    int randomBound;

    public ProduceThread(Store store, int threadsAmount, int randomBound) {
        this.store = store;
        this.threadsAmount = threadsAmount;
        this.randomBound = randomBound;
    }

    public void run() {
        for (int i = 1; i < threadsAmount; i++) {
            store.produce(randomBound);
        }
    }
}
