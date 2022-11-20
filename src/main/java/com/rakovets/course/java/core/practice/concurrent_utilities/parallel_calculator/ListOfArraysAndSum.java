package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.util.Map;

public class ListOfArraysAndSum {
    private final Map<Integer[], Integer> finalList;

    public ListOfArraysAndSum(Map<Integer[], Integer> finalList) {
        this.finalList = finalList;
    }

    public Map<Integer[], Integer> getFinalList() {
        return finalList;
    }
}
