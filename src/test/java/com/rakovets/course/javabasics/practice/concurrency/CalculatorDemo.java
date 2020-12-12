package com.rakovets.course.javabasics.practice.concurrency;

import com.rakovets.course.javabasics.practice.concurrency.parallelcalculator.Concurrency;

import java.util.LinkedList;


public class CalculatorDemo {
    public static void main(String[] args) {
        LinkedList<int[]> arrayList = Concurrency.getArraysList();
        Concurrency.getMaxElementFromArrayWithThreads(5,arrayList);
    }
}
