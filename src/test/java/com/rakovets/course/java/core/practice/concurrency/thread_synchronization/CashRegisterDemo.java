package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.CashRegister;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.CustomerQueue;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.CustomerThread;

public class CashRegisterDemo {
    public static void main(String[] args) {
        CustomerQueue todayQueue = new CustomerQueue();

        System.out.println("Store is open");
        Thread customers = new Thread(new CustomerThread(todayQueue));
        customers.start();
        Thread cashRegister1 = new Thread(new CashRegister(todayQueue));
        Thread cashRegister2 = new Thread(new CashRegister(todayQueue));
        Thread cashRegister3 = new Thread(new CashRegister(todayQueue));
        cashRegister1.start();
        cashRegister2.start();
        cashRegister3.start();
        try {
            Thread.sleep(1000);
            todayQueue.setWorkingTime(false);
            cashRegister1.join();
            cashRegister2.join();
            cashRegister3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Store is closed");
    }
}
