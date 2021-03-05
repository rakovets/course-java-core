package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

public class StoreDemo {
    public static void main(String[] args) {

        int numberOfCustomers = 10;

        CustomerThread[] customerThread = new CustomerThread[numberOfCustomers];
        Store store = new Store();

        for (int i = 0; i < numberOfCustomers; i++) {
            customerThread[i] = new CustomerThread(store);
            new Thread(customerThread[i]).start();
        }
    }
}
