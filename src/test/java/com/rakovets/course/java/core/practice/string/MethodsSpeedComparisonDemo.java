package com.rakovets.course.java.core.practice.string;

public class MethodsSpeedComparisonDemo {
    public static void main(String[] args) {
        System.out.println(StringUtil.getMethodsSpeedComparison(1));
        System.out.println(StringUtil.getMethodsSpeedComparison(10));
        System.out.println(StringUtil.getMethodsSpeedComparison(100));
        System.out.println(StringUtil.getMethodsSpeedComparison(1000));
        System.out.println(StringUtil.getMethodsSpeedComparison(10000));
        System.out.println(StringUtil.getMethodsSpeedComparison(100000));
    }
}
