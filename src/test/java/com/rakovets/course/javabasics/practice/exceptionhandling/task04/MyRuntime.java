package com.rakovets.course.javabasics.practice.exceptionhandling.task04;

public class MyRuntime {

    public static double getResultofDevision(int nums) throws DevisionException {

        if (nums == 0) {
            throw new DevisionException("Can't use zero", nums);
        }
        return 45.0 / nums;
    }
}
