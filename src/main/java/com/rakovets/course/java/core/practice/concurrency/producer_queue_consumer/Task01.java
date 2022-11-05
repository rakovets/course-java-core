package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.Scanner;

public class Task01 extends Thread {
    public Task01(String name) {
        super(name);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a);
        }
    }
}
