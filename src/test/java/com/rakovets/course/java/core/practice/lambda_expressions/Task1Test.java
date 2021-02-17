package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Task1Test {
    @Test
    void generateMap() {
        // GIVEN
        String[] example = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

        // WHEN
        String actualString = Task1.generateMap(example).toString();

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
        List<String> actualList = Task1.transformMapToList(Task1.generateMap(example));

        // THEN
        Assertions.assertEquals(expectedList, actualList);
    }
}
