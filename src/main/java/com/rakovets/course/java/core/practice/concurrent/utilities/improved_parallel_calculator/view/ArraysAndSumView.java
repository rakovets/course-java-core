package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.view;

import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.model.ArrayAndSum;

import java.util.List;

public class ArraysAndSumView {

    public void arraysAndSumView(List<ArrayAndSum> list) {
        for(ArrayAndSum arrayAndSum : list) {
            System.out.println("Array: ");
            for(int number : arrayAndSum.getArray()) {
                System.out.print(number + " ");
            }
            System.out.println("\nSum of array elements is " + arrayAndSum.getSum() + "\n");
        }
    }
}
