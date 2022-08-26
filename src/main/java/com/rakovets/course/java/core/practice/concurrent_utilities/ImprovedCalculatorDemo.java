package com.rakovets.course.java.core.practice.concurrent_utilities;

public class ImprovedCalculatorDemo {
    private static ImprovedParallelCalculator calculator=new ImprovedParallelCalculator();


    public static void main(String[] args) throws InterruptedException {
        calculator.calculate(10,10);
    }


}
