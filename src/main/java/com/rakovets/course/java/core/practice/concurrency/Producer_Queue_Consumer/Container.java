package com.rakovets.course.java.core.practice.concurrency.Producer_Queue_Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Container {
    private final Queue<Integer> numbers = new LinkedList<>();

    public Queue<Integer> getNumbers() {
        return numbers;
    }
}
