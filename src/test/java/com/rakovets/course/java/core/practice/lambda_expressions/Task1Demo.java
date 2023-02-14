package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.Map;

public class Task1Demo {
    public static void main(String[] args) {
        List<String> stringList = List.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt");
        Map<String, String> map = Task1.createMapFromList(stringList);

        System.out.println(Task1.createMapFromList(stringList));
        System.out.println(Task1.createListFromMap(map));
    }
}
