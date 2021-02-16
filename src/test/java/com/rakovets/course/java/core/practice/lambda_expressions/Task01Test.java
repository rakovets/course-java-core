package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task01Test {

    @Test
    void getMap() {
        String[] keyValue = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        String expected = "{-o=out.txt, -d=1, -i=in.txt, --limit=40}";

        String actual = Task01.getMap(keyValue).toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getArray() {
        Map<String, String> myMap = new LinkedHashMap<>();
        myMap.put("-i", "in.txt");
        myMap.put("--limit", "40");
        myMap.put("-d", "1");
        myMap.put("-o", "out.txt");
        String[] expected = {"-i : in.txt", "--limit : 40", "-d : 1", "-o : out.txt"};

        String[] actual = Task01.getArray(myMap);

        Assertions.assertArrayEquals(expected, actual);
    }
}
