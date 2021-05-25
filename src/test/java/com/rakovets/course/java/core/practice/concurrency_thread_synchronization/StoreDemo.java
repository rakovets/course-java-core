package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class StoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();

        Thread thread = new Thread(new Producer(store), "Producer1");
        thread.start();
        Thread thread1 = new Thread(new Producer(store), "Producer2");
        thread1.start();
        Thread thread2 = new Thread(new Consumer(store), "Consumer1");
        thread2.start();
        Thread thread3 = new Thread(new Consumer(store), "Consumer2");
        thread3.start();

        Thread.sleep(300);
        store.isIsRun();
    }
}
