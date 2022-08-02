package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class ArgumentValueHelperTest {
    private  ArgumentValueHelper argumentValueHelper;

    @BeforeEach
    public void setUp(){
        argumentValueHelper = new ArgumentValueHelper();
    }

    @Test
    public void testGetMapFromStringArray() {
        String [] text = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> expected = Map.of(
                "-i", "in.txt",
                "--limit", "40",
                "-d", "1",
                "-o", "out.txt");

        Map<String, String> actual = argumentValueHelper.getMapFromStringArray(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMapFromStringArrayEmptyLastArgumentValue() {
        String [] text =  new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt", "-r"};
        Map<String, String> expected = Map.of("-i", "in.txt",
                "--limit", "40",
                "-d", "1",
                "-o", "out.txt",
                "-r", "");

        Map<String, String> actual = argumentValueHelper.getMapFromStringArray(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetStringArrayFromMap() {
        Map<String, String> input = Map.of(
                "-i", "in.txt",
                "--limit", "40",
                "-d", "1",
                "-o", "out.txt");
        Set<Map.Entry<String, String>> expected = Set.of(
                Map.entry("-d", "1"),
                Map.entry("-i", "in.txt"),
                Map.entry("-o", "out.txt"),
                Map.entry("--limit", "40"));

        String[] actualString = argumentValueHelper.getStringArrayFromMap(input);
        Set<Map.Entry<String, String>> actual = new HashSet<>();
        IntStream.range(0, actualString.length / 2)
                .boxed()
                .forEach(i -> actual.add(Map.entry(actualString[i * 2], actualString[i * 2 + 1])));

        Assertions.assertEquals(expected, actual);
    }
}
