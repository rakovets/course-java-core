package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.Queue;
import java.util.Scanner;

public class Producer extends Thread {
    private final Queue<Integer> queue;

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int l = sc.nextInt();
            queue.add(l);
            if (l == -1) {
                break;
            }
            System.out.println(l);
        }
    }
}
