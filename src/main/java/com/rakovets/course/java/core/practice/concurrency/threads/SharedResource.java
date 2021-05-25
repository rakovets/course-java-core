package com.rakovets.course.java.core.practice.concurrency.threads;

import java.util.Deque;
import java.util.LinkedList;

public class SharedResource {
    public static Deque<Integer> listOfNumbers = new LinkedList<>();

    public static Deque<Integer> getListOfNumbers() {
        return listOfNumbers;
    }
}
