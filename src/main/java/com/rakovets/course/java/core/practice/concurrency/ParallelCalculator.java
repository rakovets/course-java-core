package com.rakovets.course.java.core.practice.concurrency;

import java.util.*;

public class ParallelCalculator  {
    public static Map<Integer[], Integer> getArraySum(List<Integer[]> list) {
        Map<Integer[], Integer> mapWithSum = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            for (Integer value : list.get(i)) {
                sum += value;
            }
            mapWithSum.put(list.get(i), sum);
            sum = 0;
        }
        return mapWithSum;
    }
}
