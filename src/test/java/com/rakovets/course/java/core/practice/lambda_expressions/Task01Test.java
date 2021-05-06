package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Task01Test {
    @Test
    void generateMap() {
        // GIVEN
        String[] example = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

        // WHEN
        String actualString = Task01.createMap(example).toString();

        // THEN
        Assertions.assertEquals("{-o=out.txt, -d=1, -i=in.txt, --limit=40}", actualString);
    }

    @Test
    void transformMapToList() {
        // GIVEN
        String[] example = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "-o: out.txt", "-d: 1", "-i: in.txt", "--limit: 40");

        // WHEN
        List<String> actualList = Task01.convertMapToList(Task01.createMap(example));

        // THEN
        Assertions.assertEquals(expectedList, actualList);
    }
}
