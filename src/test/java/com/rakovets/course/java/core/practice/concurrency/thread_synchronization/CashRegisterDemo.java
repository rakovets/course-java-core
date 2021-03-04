package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.CashRegister;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.Customer;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.CustomerQueue;

import java.util.Random;

public class CashRegisterDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int quantityOfCustomerToday = random.nextInt(15);
        CustomerQueue todayQueue = new CustomerQueue();

        for (int x = 0; x < quantityOfCustomerToday; x++) {
            todayQueue.getQueue().add(Customer.generate((random.nextInt(6) + 1)));
        }

        System.out.println("Store is open");
        Thread cashRegister1 = new Thread(new CashRegister(todayQueue));
        Thread cashRegister2 = new Thread(new CashRegister(todayQueue));
        Thread cashRegister3 = new Thread(new CashRegister(todayQueue));
        cashRegister1.start();
        cashRegister2.start();
        cashRegister3.start();
        try {
            cashRegister1.join();
            cashRegister2.join();
            cashRegister3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Store is closed");
    }
}
