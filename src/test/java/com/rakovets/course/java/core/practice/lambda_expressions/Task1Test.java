package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    void getMap() {
        String[] array = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task1 example = new Task1(array);

        String expectedResult = "{-i=in.txt, --limit=40, -d=1, -o=out.txt}";

        Assertions.assertEquals(expectedResult, example.getMap().toString());
    }

        @Test
        void mapToList() {
            String[] array = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
            Task1 example2 = new Task1(array);

            String expectedResult = "[-i: in.txt, --limit: 40, -d: 1, -o: out.txt]";

            String actualResult = example2.mapToList(example2.getMap()).toString();

            Assertions.assertEquals(expectedResult, actualResult);
    }
}
