package com.rakovets.course.javabasics.practice.lambdaexpressions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

public class Task1Test {

    @Test
    public void test() {
        String[] array = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Util util = new Util(array);
        assertEquals("{-o=out.txt, -d=1, --i=in.txt, --limit=40}", util.toMap().toString());

        Map<String, String> map = Map.of("1", "one", "2,", "two", "3", "three");
        array = Util.mapToArray(map);
        Arrays.sort(array);
        assertEquals("[1=one, 2,=two, 3=three]", Arrays.toString(array));
    }
}
