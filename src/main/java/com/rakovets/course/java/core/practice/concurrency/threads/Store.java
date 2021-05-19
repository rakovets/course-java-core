package com.rakovets.course.java.core.practice.concurrency.threads;

import java.util.LinkedList;
import java.util.Queue;

public class Store {
    public static Queue<Integer> list = new LinkedList<>();

    public static Queue<Integer> getList() {
        return list;
    }
}
