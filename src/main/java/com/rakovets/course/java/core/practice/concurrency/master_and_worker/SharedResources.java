package com.rakovets.course.java.core.practice.concurrency.master_and_worker;

import java.util.LinkedList;
import java.util.List;

public class SharedResources {
    public static List<Integer> integerList = new LinkedList<>();

    public static List<Integer> getListOfNumbers() {
        return integerList;
    }
}
