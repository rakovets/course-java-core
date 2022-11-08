package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class Container {
    private Queue<Integer> numbers = new LinkedList<>();

    public Queue<Integer> getNumbers() {
        return numbers;
    }
}
