package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Producer extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> x = new LinkedList<>();
        while (true) {

            int l = sc.nextInt();
            if (l == -1) {
                break;
            }
             x.add(l);
            System.out.println(l);
        }
    }
}
