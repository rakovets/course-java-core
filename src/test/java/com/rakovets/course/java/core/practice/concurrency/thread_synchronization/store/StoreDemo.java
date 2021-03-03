package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

public class StoreDemo {
    public static void main(String[] args) {

        int numberOfBuyers = 10;

        CustomerThread[] customerThread = new CustomerThread[numberOfBuyers];
        Store store = new Store();

        for (int i = 0; i < numberOfBuyers; i++) {
            customerThread[i] = new CustomerThread(store);
            new Thread(customerThread[i]).start();
        }
    }
}
