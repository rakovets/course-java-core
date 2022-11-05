package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

public class Task1Test {
    Task1 task1 = new Task1();

    @Test
    public void convertArrayToMap() {
        String[] lines = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> expected = Map.of(
                "-i", "in.txt",
                "--limit", "40",
                "-d", "1",
                "-o", "out.txt");

        Map<String, String> actual = task1.convertArrayToMap(lines);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void convertMapToArray() {
        Map<String, String> map = Map.of(
                "-i", "in.txt",
                "--limit", "40",
                "-d", "1",
                "-o", "out.txt");
        String[] expected = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Arrays.sort(expected);

        String[] actual = task1.convertMapToArray(map);
        Arrays.sort(actual);

        Assertions.assertArrayEquals(expected, actual);
    }
}
