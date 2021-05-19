package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.threads.Consumer;
import com.rakovets.course.java.core.practice.concurrency.threads.Producer;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Producer()); thread.setName("Producer"); thread.start();
        Thread thread1 = new Thread(new Consumer()); thread1.setName("Consumer");
        Thread thread2 = new Thread(new Consumer()); thread2.setName("Second Consumer");
        Thread thread3 = new Thread(new Consumer()); thread3.setName("Third Consumer");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
