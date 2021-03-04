package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.LinkedList;

public class CustomerQueue {
    private LinkedList <Customer> queue;

    public CustomerQueue() {
        this.queue = new LinkedList<>();
    }

    public synchronized void serveCustomer() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        while (!queue.isEmpty()) {
            try {
                Customer actual = queue.remove(0);
                if (!actual.getPurchases().isEmpty()) {
                    StandardOutputUtil.println(actual.getPurchases() + " " + Thread.currentThread().getName(), randomColor);
                    wait(2);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void addToQueue(Customer customer) {
        queue.add(customer);
    }

    public LinkedList<Customer> getQueue() {
        return queue;
    }

    public void setQueue(LinkedList<Customer> queue) {
        this.queue = queue;
    }
}
