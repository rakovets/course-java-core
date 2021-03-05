package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.LinkedList;
import java.util.Random;

public class CustomerQueue {
    private final LinkedList <Customer> queue;
    private boolean isWorkingTime;
    private int servingTime = 2;

    public CustomerQueue() {
        this.queue = new LinkedList<>();
        this.isWorkingTime = true;
    }

    public synchronized void serveCustomer() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        while (isWorkingTime) {
            if (!queue.isEmpty()) {
                Customer actual = queue.remove(0);
                if (!actual.getPurchases().isEmpty()) {
                    StandardOutputUtil.println(actual.getPurchases() + " " + Thread.currentThread().getName(), randomColor);
                }
            }
            try {
                wait(servingTime);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public synchronized void addToQueueRandom() {
        Random random = new Random();
        while (isWorkingTime) {
            queue.add(Customer.generate(random.nextInt(10)));
            try {
                wait(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public LinkedList<Customer> getQueue() {
        return queue;
    }

    public void setWorkingTime(boolean workingTime) {
        isWorkingTime = workingTime;
    }

    public void setServingTime(int servingTime) {
        this.servingTime = servingTime;
    }
}
