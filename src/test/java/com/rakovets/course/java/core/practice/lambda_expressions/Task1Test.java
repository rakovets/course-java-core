package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void map() {
        String[] arr = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task1 task1 = new Task1(arr);
        assertEquals("{-o=out.txt, -d=1, --i=in.txt, --limit=40}", task1.map().toString());
    }

    @Test
    void array() {
        String[] arr = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task1 task1 = new Task1(arr);
        Map<String, String> map = Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o",
                "out.txt");
        arr = task1.list(map).toArray(new String[0]);
        Arrays.sort(arr);
        assertEquals("[--limit : 40, -d : 1, -i : in.txt, -o : out.txt]", Arrays.toString(arr));
    }
}
