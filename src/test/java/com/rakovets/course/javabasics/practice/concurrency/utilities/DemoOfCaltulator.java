package com.rakovets.course.javabasics.practice.concurrency.utilities;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.ImprovedParallelCalculator;

import java.util.ArrayList;

public class DemoOfCaltulator {
    public static void main(String[] args) {
        ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();

        ArrayList<Integer[]> listOfArray = calculator.generateListOfArrays(5);
        try {
           calculator.runInParallel(5,listOfArray);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
