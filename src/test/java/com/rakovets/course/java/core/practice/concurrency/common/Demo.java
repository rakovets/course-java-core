package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Thread master = new Thread(new Master(list));
        Thread worker = new Thread(new Worker(list, "src/main/resources/practice/test1.txt"));

        master.start();
        worker.start();
    }
}
