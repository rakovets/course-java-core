package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTask1 {
    Task1 task1 = new Task1();
    String[] array = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

    @Test
    void testGetMap() {
        Map<String, String> actual = task1.getMap(array);
        Map<String, String> expected = new TreeMap<>(Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"));

        Assertions.assertEquals(actual, expected);
    }

   @Test
    void testGetArrayString() {
        Map<String, String> map = task1.getMap(array);

        String[] actual = task1.getArrayString(map);

        Assertions.assertArrayEquals(actual, array);
    }
}
