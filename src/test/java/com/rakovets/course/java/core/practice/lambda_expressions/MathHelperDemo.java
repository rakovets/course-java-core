package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;

public class MathHelperDemo {

    public static void main(String[] args) {
        //Generating random list through lamda and Function interface, as option
        /*Function<Integer, List<Integer>> func = (elements) -> {
            List<Integer> list = new ArrayList<>(elements);
            for (int i = 0; i < elements; i++) {
                list.add(new Random().nextInt(100));
            }
            return list;
        };
        List<Integer> list = func.apply(40);*/

        List<Integer> list = MathHelper.generateArray(40);
        System.out.println(list);
        MathHelper.someNumber = 55;

        System.out.println("Even: " + calculateOccurrences(list, MathHelper::isEven));
        System.out.println("Odd: " + calculateOccurrences(list, MathHelper::isOdd));
        System.out.println("Zero: " + calculateOccurrences(list, MathHelper::isZero));
        System.out.println("SomeNumber: " + calculateOccurrences(list, MathHelper::isIdentical));
    }


    public static int calculateOccurrences(List<Integer> list, MathOperation action) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(action.isEqual(list.get(i))) {
                count++;
            }
        }
        return count;
    }
}
