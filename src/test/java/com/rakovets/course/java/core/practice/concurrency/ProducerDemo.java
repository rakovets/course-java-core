package com.rakovets.course.java.core.practice.concurrency;
import java.io.IOException;

public class ProducerDemo {
    public static void main(String[] args) throws InterruptedException, IOException, UserInputException {
        Thread thread = new Thread(new Producer(), "Producer");
        thread.start();
        Thread thread1 = new Thread(new Consumer(), "Consumer1");
        thread1.start();
        Thread thread2 = new Thread(new Consumer(), "Consumer2");
        thread2.start();
        Thread thread3 = new Thread(new Consumer(), "Consumer3");
        thread3.start();
    }
}
