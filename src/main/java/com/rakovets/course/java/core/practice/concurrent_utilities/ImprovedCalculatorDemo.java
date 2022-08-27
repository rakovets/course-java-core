package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.io.IOException;

public class ImprovedCalculatorDemo {
    private static ImprovedParallelCalculator calculator=new ImprovedParallelCalculator();


    public static void main(String[] args) throws InterruptedException, IOException {
        calculator.calculate(10,10);
    }
}
