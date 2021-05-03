package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.math_statistics.MathUtil;

import java.util.ArrayList;
import java.util.List;

public class MathUtilDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(MathUtil.generateRandomNumbers(10));
        System.out.println(list);
        System.out.println(MathUtil.findOddNumbers(List.of(3, 5, 8, 10)));
        System.out.println(MathUtil.findNoOddNumbers(List.of(3, 5, 8, 10)));
        System.out.println(MathUtil.findZero(List.of(2, 3, 0, 0, 11, 201)));
        System.out.println(MathUtil.findNumberEqualsParameter(List.of(2, 4, 71 ,5), 71));
    }
}
