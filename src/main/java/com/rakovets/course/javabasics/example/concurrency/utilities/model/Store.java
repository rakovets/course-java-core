package com.rakovets.course.javabasics.example.concurrency.utilities.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class Store {
    private int product = 0;
    private final ReentrantLock lock;
    private final Condition condition;

    public Store() {
        this.lock = new ReentrantLock();
        this.condition = this.lock.newCondition();
    }

    public void get() {
        this.lock.lock();
        try {
            while (this.product <= 0) {
                this.condition.await();
            }
            this.product--;
            printlnWithTimeAndThread("Consumer got 1 product from the Store.", AnsiColorCode.FG_RED_BOLD);
            printlnWithTimeAndThread("Total products in the Store: " + product, AnsiColorCode.FG_BLUE_BOLD);
            this.condition.signalAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            this.lock.unlock();
        }
    }

    public void put() {
        this.lock.lock();
        try {
            while (this.product >= 3) {
                condition.await();
            }
            this.product++;
            printlnWithTimeAndThread("Producer added 1 product to the Store.", AnsiColorCode.FG_GREEN_BOLD);
            printlnWithTimeAndThread("Total products in the Store: " + product, AnsiColorCode.FG_BLUE_BOLD);
            this.condition.signalAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            this.lock.unlock();
        }
    }
}
