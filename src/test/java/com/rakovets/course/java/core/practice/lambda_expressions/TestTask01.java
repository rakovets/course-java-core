package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1.Task01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

public class TestTask01 {
    Task01 task01 = new Task01();

    String[] text = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
    Map<String, String> map = Map.of("-o", "out.txt", "-d", "1", "-i", "in.txt", "--limit", "40");

    @Test
    public void testForMethodGetMapFromStringArray() {
        Map<String, String> expected = Map.of("-o", "out.txt", "-d", "1", "-i", "in.txt", "--limit", "40");

        Map<String, String> actual = task01.getMapFromStringArray(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForMethodGetStringArrayFromMap() {
        String[] expected = {"--limit", "-d", "-i", "-o", "1", "40", "in.txt", "out.txt"};
        Arrays.sort(expected);

        String[] actual = task01.getStringArrayFromMap(map);
        Arrays.sort(actual);

        Assertions.assertArrayEquals(expected, actual);
    }
}
