package com.rakovets.course.java.core.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        Integer[] array2 = new Integer[]{-1, -2, -3, 4, 5};
        Integer[] array3 = new Integer[]{2, 3, 5};
        List<Integer[]> list = new ArrayList<>();
        list.add(array);
        list.add(array2);
        list.add(array3);

        Map<Integer[], Integer> map = ParallelCalculator.getArraySum(list);

        for (Map.Entry<Integer[], Integer> map2 : map.entrySet()) {
            Integer[] arrayS = map2.getKey();
            System.out.println(Arrays.toString(arrayS) + " sum = " + map2.getValue());
        }
    }
}
