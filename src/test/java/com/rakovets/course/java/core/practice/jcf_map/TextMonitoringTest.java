package com.rakovets.course.java.core.practice.jcf_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TextMonitoringTest {
    private static TextMonitoring textMonitoring;
    private static String text;

    @BeforeAll
    static void setUp() {
        textMonitoring = new TextMonitoring();
        text = "Java Java java is language... language Java";
        textMonitoring.researchText(text);
    }

    @Test
    public void testResearch() {
        Map<String, Integer> expected = new HashMap<>(Map.of("Java", 3, "is", 1, "language", 2, "java", 1));

        Map<String, Integer> actual = textMonitoring.getMapFrequencyWords();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCountUniqueWords() {
        int expected = 2;

        int actual = textMonitoring.getCountUniqueWords();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetUniqueWords() {
        Set<String> expected = Set.of("java", "is");

        Set<String> actual = textMonitoring.getUniqueWords();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFrequencyWord() {
        int expected = 3;

        int actual = textMonitoring.getFrequencyWord("Java");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFrequencyWordNotExist() {
        int expected = 0;

        int actual = textMonitoring.getFrequencyWord("Git");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFrequencyWordsFalse() {
        List<Integer> expectedValues = Arrays.asList(3, 2, 1, 1);
        List<String> expectedKeys = Arrays.asList("Java", "language", "java", "is");

        Map<String, Integer> actual = textMonitoring.getFrequencyWords(false);
        List<Integer> actualValues = new ArrayList<>(actual.values());
        List<String> actualKeys = new ArrayList<>(actual.keySet());

        Assertions.assertEquals(expectedValues, actualValues);
        Assertions.assertEquals(expectedKeys, actualKeys);
    }

    @Test
    public void testGetFrequencyWordsTrue() {
        List<Integer> expectedValues = Arrays.asList(1, 1, 2, 3);
        List<String> expectedKeys = Arrays.asList("is", "java", "language", "Java");

        Map<String, Integer> actual = textMonitoring.getFrequencyWords(true);
        List<Integer> actualValues = new ArrayList<>(actual.values());
        List<String> actualKeys = new ArrayList<>(actual.keySet());

        Assertions.assertEquals(expectedValues, actualValues);
        Assertions.assertEquals(expectedKeys, actualKeys);
    }

    @Test
    public void testGetFrequencyWordsNegative() {
        List<Integer> expectedValues = Arrays.asList(2, 1, 1, 3);
        List<String> expectedKeys = Arrays.asList("java", "is", "language", "Java");

        Map<String, Integer> actual = textMonitoring.getFrequencyWords(true);
        List<Integer> actualValues = new ArrayList<>(actual.values());
        List<String> actualKeys = new ArrayList<>(actual.keySet());

        Assertions.assertNotEquals(expectedValues, actualValues);
        Assertions.assertNotEquals(expectedKeys, actualKeys);
    }
}
