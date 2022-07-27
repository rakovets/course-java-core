package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class ConversionMapArrayTest {
    private ConversionMapArray conversionMapArray;
    private String[] text;
    private Map<String, String> map;


    @BeforeEach
    public void setUp() {
        conversionMapArray = new ConversionMapArray();
        text = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        map = Map.of(
                "-i", "in.txt",
                "--limit", "40",
                "-d", "1",
                "-o", "out.txt");
    }

    @Test
    public void testGetMapFromStringArray() {
        Map<String, String> expected = map;

        Map<String, String> actual = conversionMapArray.getMapFromStringArray(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetStringArrayFromMap() {
        Set<Map.Entry<String, String>> expected = Set.of(
                Map.entry("-d", "1"),
                Map.entry("-i", "in.txt"),
                Map.entry("-o", "out.txt"),
                Map.entry("--limit", "40"));

        String[] actualString = conversionMapArray.getStringArrayFromMap(map);
        Set<Map.Entry<String, String>> actual = new HashSet<>();
        IntStream.range(0, actualString.length / 2)
                .boxed()
                .forEach(i -> actual.add(Map.entry(actualString[i * 2], actualString[i * 2 + 1])));

        Assertions.assertEquals(expected, actual);
    }
}
