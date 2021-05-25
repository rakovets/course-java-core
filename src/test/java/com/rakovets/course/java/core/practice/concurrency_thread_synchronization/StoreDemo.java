package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.CustomerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Store;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        Thread producer = new CustomerThread(store);
        Thread customer1 = new CustomerThread(store);
        Thread customer2 = new CustomerThread(store);
        Thread customer3 = new CustomerThread(store);
        producer.start();
        customer1.start();
        customer2.start();
        customer3.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        store.setWorking(false);
    }
}
