package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

@DisplayName("Testing the method of converting an array to a map and vice versa.")
class MapToArrayTest {
    MapToArray mapToArray = new MapToArray();

    @Test
    @DisplayName("Converting an array of strings to a map.")
    void mapToArray() {
        String[] strings = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> expected =
                Map.of("-o", "out.txt", "-d", "1", "-i", "in.txt", "--limit", "40");

        Map<String, String> actual = mapToArray.generateMap(strings);

        Assertions.assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        MapToArray mapToArray = new MapToArray();

        Map<String, String> strings =
                Map.of("-o", "out.txt", "-d", "1", "-i", "in.txt", "--limit", "40");

        String[] actual = mapToArray.mapToArray(strings);
        System.out.println("Converting the map to an array of strings. " + Arrays.toString(actual));
    }
}
