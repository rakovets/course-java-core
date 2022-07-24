package com.rakovets.course.java.core.practice.jcf_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TextMonitoringTest {
    private final TextMonitoring textMonitoring = new TextMonitoring();
    private final String text = "Java Java java is language... language Java";

    @Test
    public void testResearch() {
        Map<String, Integer> expected = new HashMap<>(Map.of("Java", 3, "is", 1, "language", 2, "java", 1));
        Assertions.assertEquals(expected, textMonitoring.researchText(text));
    }

    @Test
    public void testGetCountUniqueWords() {
        Assertions.assertEquals(2, textMonitoring.getCountUniqueWords(text));
    }

    @Test
    public void testGetUniqueWords() {
        Set<String> expected = Set.of("java", "is");
        Assertions.assertEquals(expected, textMonitoring.getUniqueWords(text));
    }

    @Test
    public void testGetFrequencyWord() {
        Assertions.assertEquals(3, textMonitoring.getFrequencyWord(text, "Java"));
    }

    @Test
    public void testGetFrequencyWordNotExist() {
        Assertions.assertEquals(0, textMonitoring.getFrequencyWord(text, "Git"));
    }

    @Test
    public void testGetFrequencyWordsFalse() {
        Map<String, Integer> actual = textMonitoring.getFrequencyWords(text, false);
        List<Integer> valuesExpected = Arrays.asList(3, 2, 1, 1);
        List<String> keysExpected = Arrays.asList("Java", "language", "java", "is");
        Assertions.assertEquals(keysExpected, new ArrayList<>(actual.keySet()));
        Assertions.assertEquals(valuesExpected, new ArrayList<>(actual.values()));
    }

    @Test
    public void testGetFrequencyWordsTrue() {
        Map<String, Integer> actual = textMonitoring.getFrequencyWords(text, true);
        List<Integer> valuesExpected = Arrays.asList(1, 1, 2, 3);
        List<String> keysExpected = Arrays.asList("is", "java", "language", "Java");
        Assertions.assertEquals(keysExpected, new ArrayList<>(actual.keySet()));
        Assertions.assertEquals(valuesExpected, new ArrayList<>(actual.values()));
    }

    @Test
    public void testGetFrequencyWordsNegative() {
        Map<String, Integer> actual = textMonitoring.getFrequencyWords(text, true);
        List<Integer> valuesExpected = Arrays.asList(2, 1, 1, 3);
        List<String> keysExpected = Arrays.asList("java", "is", "language", "Java");
        Assertions.assertNotEquals(keysExpected, new ArrayList<>(actual.keySet()));
        Assertions.assertNotEquals(valuesExpected, new ArrayList<>(actual.values()));
    }
}
