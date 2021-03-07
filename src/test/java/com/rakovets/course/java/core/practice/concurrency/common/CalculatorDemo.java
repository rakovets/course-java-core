package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator.ArraySum;
import com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator.GenerateRandomArray;
import com.rakovets.course.java.core.practice.concurrency.common.parallel_calculator.TimeMeasure;

import java.util.List;

public class CalculatorDemo {
    public static void main(String[] args) throws InterruptedException {
        List<int[]> arrayList = GenerateRandomArray.getListOfRandomArray();
        System.out.println("GetArraySum: ");
        System.out.println(ArraySum.getArraySum(arrayList));

        System.out.println(TimeMeasure.measureExecuteTime(arrayList, 1));
        System.out.println(TimeMeasure.measureExecuteTime(arrayList, 2));
        System.out.println(TimeMeasure.measureExecuteTime(arrayList, 5));
        System.out.println(TimeMeasure.measureExecuteTime(arrayList, 10));

    }
}
