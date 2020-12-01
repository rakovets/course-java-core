package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String[] array = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Util util = new Util(array);
        System.out.println(util.toMap());
        Map<String, String> map = Map.of("1", "one", "2,", "two", "3", "three");
        System.out.println(Arrays.toString(Util.mapToArray(map)));
    }
}
