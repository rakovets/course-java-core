package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Task1Test {

    @Test
    void getMap() {
        //Given
        String[] strings = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        String expectedResult = "{-o=out.txt, -d=1, --i=in.txt, --limit=40}";
        //When
        String actualResult = Task1.getMap(strings).toString();
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getArray() {
        //Given
        String[] strings = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("-o=out.txt");
        expectedResult.add("-d=1");
        expectedResult.add("--i=in.txt");
        expectedResult.add("--limit=40");
        //When
        List<String> actualResult = Task1.getArray(Task1.getMap(strings));
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
