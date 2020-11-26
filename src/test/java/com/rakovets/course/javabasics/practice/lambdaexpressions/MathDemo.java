package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class MathDemo {
    public static void main(String[] args) {


        LinkedList<Integer> resultList = MathUtils.getRandomList(20);

        Stream<Integer> filterListEven = resultList.stream();
       // MathUtils math = new MathUtils();
        System.out.println(resultList);
        int countEven = (int)filterListEven.filter(number -> number % 2 == 0).count();
        System.out.println("Even = " + countEven);

        Stream<Integer> filterListNotEven = resultList.stream();
        int countNE = (int)filterListNotEven.filter(notEven -> notEven % 2 != 0).count();
        System.out.println("NotEven = " + countNE);


        int countZero = (int)resultList.stream().filter(notEven -> notEven == 0).count();
        System.out.println("Zero = " + countZero);

        int countSame = (int)resultList.stream().filter(notEven -> notEven == resultList.get(9)).count();
        System.out.println("Same = " + countZero);



       // int count1 = MathUtils.getSumOfEvenElements(resultList);
     //   System.out.println(count);



    }
}
