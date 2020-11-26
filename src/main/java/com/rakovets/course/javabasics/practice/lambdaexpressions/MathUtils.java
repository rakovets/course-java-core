package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.LinkedList;
import java.util.List;

public class MathUtils {


    public static LinkedList<Integer> getRandomList(int lenght) {
        LinkedList<Integer> resultList = new LinkedList<>();
        resultList.add(0,0);

        for (int i = 1; i < lenght; i++) {
            int element = (int)((Math.random() * 6) + i);
            resultList.add(element);

        }
        resultList.add(resultList.size(), 0);
        return resultList;

    }


}



