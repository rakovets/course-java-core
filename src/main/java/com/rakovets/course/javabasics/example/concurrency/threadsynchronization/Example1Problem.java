package com.rakovets.course.javabasics.example.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.CommonResource;
import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.CountThread;

public class Example1Problem {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
