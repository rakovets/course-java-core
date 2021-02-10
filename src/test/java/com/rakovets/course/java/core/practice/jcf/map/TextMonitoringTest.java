package com.rakovets.course.java.core.practice.jcf.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TextMonitoringTest {

    @Test
    void researchText() {
        String str = "is this is";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("is", 2);
        expected.put("this", 1);

        Map<String, Integer> actual = new HashMap<>(TextMonitoring.researchText(str));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getCountUniqueWords() {
        String str = "is this is";
        int expected = 1;

        int actual = TextMonitoring.getCountUniqueWords(str);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getUniqueWords() {
        String str = "is this is";
        List<String> expected = new ArrayList<>();
        expected.add("this");

        List<String> actual = TextMonitoring.getUniqueWords(str);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getFrequencyWord() {
        String str = "is this is";
        int expected = 2;

        int actual = TextMonitoring.getFrequencyWord(str,"is");

        Assertions.assertEquals(expected, actual);
    }
}
