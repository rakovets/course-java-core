package com.rakovets.course.javabasics.example.concurrency.utilities;


import com.rakovets.course.javabasics.example.concurrency.utilities.model.CommonResource;
import com.rakovets.course.javabasics.example.concurrency.utilities.model.CountThread;

public class Example1Problem {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
