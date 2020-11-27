package com.rakovets.course.javabasics.practice.lambdaexpressions;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.MathUtil.mathUtil;
import static com.rakovets.course.javabasics.practice.lambdaexpressions.MathUtil.randomizer;

public class MathUtilDemo {
    public static void main(String[] args) {
        mathUtil(randomizer());
    }
}
