package com.rakovets.course.java.core.practice.jcf_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestTextMonitoring {
    TextMonitoring textMonitoring = new TextMonitoring();
    String str = " There lived an old man and an old woman. The old man asked the old woman to bake a bun. " +
            "+  And the bun ran away.  ";

    @Test
    void TestResearchText() {
        Map<String, Double> actual = textMonitoring.researchText(str);
        Map<String, Double> expected = new HashMap<>(Map.ofEntries(Map.entry("a", 0.04), Map.entry("woman", 0.08),
                Map.entry("away", 0.04), Map.entry("old", 0.16), Map.entry("an", 0.08), Map.entry("The", 0.04),
                Map.entry("the", 0.08), Map.entry("There", 0.04), Map.entry("asked", 0.04), Map.entry("and", 0.04),
                Map.entry("And", 0.04), Map.entry("bake", 0.04), Map.entry("bun", 0.08), Map.entry("lived", 0.04),
                Map.entry("man", 0.08), Map.entry("to", 0.04), Map.entry("ran", 0.04)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TestGetCountUniqueWords() {
        int actual = textMonitoring.getCountUniqueWords(str);
        int expected = 17;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TestGetUniqueWords() {
        Set<String> actual = textMonitoring.getUniqueWords(str);
        Set<String> expected = new HashSet<>(Set.of("a", "woman", "away", "old", "an", "The", "the", "There", "asked", "and",
                "And", "bake", "bun", "lived", "man", "to", "ran"));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TestGetFrequencyWord() {
        double actual = textMonitoring.getFrequencyWord(str, "old");
        double expected = 0.16;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TestGetFrequencyWords() {
        NavigableMap<String, Double> actual = textMonitoring.getFrequencyWords(str, false);
        NavigableMap<String, Double> map = new TreeMap<>(Map.ofEntries(Map.entry("woman", 0.08), Map.entry("to", 0.04),
                Map.entry("the", 0.08), Map.entry("ran", 0.04), Map.entry("old", 0.16), Map.entry("man", 0.08),
                Map.entry("lived", 0.04), Map.entry("bun", 0.08), Map.entry("bake", 0.04), Map.entry("away", 0.04),
                Map.entry("asked", 0.04), Map.entry("and", 0.04), Map.entry("an", 0.08), Map.entry("a", 0.04),
                Map.entry("There", 0.04), Map.entry("The", 0.04), Map.entry("And", 0.04)));
        NavigableMap<String, Double> expected = map.descendingMap();

        Assertions.assertEquals(expected, actual);
    }
}
