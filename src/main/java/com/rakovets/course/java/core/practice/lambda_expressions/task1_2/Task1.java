package com.rakovets.course.java.core.practice.lambda_expressions.task1_2;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    // реализовать метод возвращающий `Map`, где `key` - название аргумента, `value` - значение аргумента
    public static Map<String, String> getMap(String[] text) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < text.length; i = i + 2) {
            map.put(text[i], text[i+1]);
        }
        return map;
    }
    // реализовать метод конвертирующий `Map` с аргументами и их значениями в массив строк
    public static String convertToString(Map<String, String> map) {
        return map.toString();
    }
}
