package com.rakovets.course.java.core.practice.lambda_expressions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskOneDemo {
    public static void main(String[] args) {
        String[] strings = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        System.out.println(Arrays.toString(strings));
        System.out.println(TaskOne.getArrayToMap(strings).toString());
        System.out.println(TaskOne.getString(Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")).toString());

    }
}
