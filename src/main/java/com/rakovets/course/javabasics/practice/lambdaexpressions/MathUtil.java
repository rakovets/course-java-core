package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathUtil {
   public static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> randomizer() {
        while(list.size() < (int) (Math.random() * 10000)) {
            int a = (int) (Math.random() * 1000000);
            list.add(a);
        }
        return list;
    }

public static void mathUtil(ArrayList<Integer> list) {
       long even = list.stream()
               .filter(i -> i % 2 == 0)
               .count();
       System.out.println("Quantity of even numbers is " + even);
        long odd = list.stream()
                .filter(number -> number % 2 != 0)
                .count();
       System.out.println("Quantity of odd numbers is " + odd);
       long nulls = list.stream()
               .filter(number -> number == 0)
               .count();
       System.out.println("Quantity of nulls is " + nulls);
       long ten = list.stream()
               .filter(number -> number == 10)
               .count();
       System.out.println("Quantity of dozens is " + ten);
   }
}
