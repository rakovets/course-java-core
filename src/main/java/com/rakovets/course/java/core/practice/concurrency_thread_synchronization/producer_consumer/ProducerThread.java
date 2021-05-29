package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

public class ProducerThread implements Runnable {
    private Store store;
    private int numberOfNumbersProduced;

    public ProducerThread(Store store, int numberOfNumbersProduced) {
        this.store = store;
        this.numberOfNumbersProduced = numberOfNumbersProduced;
    }

    @Override
    public void run() {
        for (int i = 1; i <= numberOfNumbersProduced; i++) {
            int number = (int) (Math.random() * 100);
            store.produce(number);
        }
    }
}
