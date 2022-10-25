package com.rakovets.course.java.core.practice.jcf_map;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.*;
import java.util.stream.Stream;

public class TestMonitoring {
    TextMonitoring textMonitoring = new TextMonitoring();

    static Stream<Arguments> CountUniqueWordsArguments() {
        return Stream.of(
                Arguments.of("Sun sun. My cat line... Cat cat, dog cat Sun & dog! Hi sun? fine!!! AND sun YoU)", 11),
                Arguments.of("Cat cat Dog Dog  Dog HI hi HI hi ooo oooo oooo", 7)
        );
    }

    @ParameterizedTest
    @MethodSource("CountUniqueWordsArguments")
    public void getCountUniqueWords(String line, int expected) {
        Map<String, Integer> map = textMonitoring.researchText(line);

        int actual = textMonitoring.getCountUniqueWords(map);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> UniqueWordsArguments() {
        return Stream.of(
                Arguments.of("Sun sun. My cat line... Cat cat, dog cat Sun & dog! Hi sun? fine!!! AND sun YoU)",
                        Set.of("Hi", "fine", "line", "cat", "Cat", "AND", "My", "Sun", "sun", "dog", "YoU"),
                        Arguments.of("Cat cat Dog Dog  Dog HI hi HI hi ooo oooo oooo",
                                Set.of("HI", "hi", "oooo", "Cat", "cat", "Dog", "ooo")
                        )));
    }

    @ParameterizedTest
    @MethodSource("UniqueWordsArguments")
    public void getUniqueWords(String line, Set<String> expected) {
        Map<String, Integer> map = textMonitoring.researchText(line);

        Set<String> actual = textMonitoring.getUniqueWords(map);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> FrequencyWordArguments() {
        return Stream.of(
                Arguments.of("Sun sun. My cat line... Cat cat, dog cat Sun & dog! Hi sun? fine!!! AND sun YoU)", 3));
    }

    @ParameterizedTest
    @MethodSource("FrequencyWordArguments")
    public void getFrequencyWord(String line, int expected) {
        Map<String, Integer> map = textMonitoring.researchText(line);

        int actual = textMonitoring.getFrequencyWord(map, "cat");

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> FrequencyWordsArgumentsTrue() {
        return Stream.of(
                Arguments.of("Sun. My cat line... Cat cat, dog cat Sun & dog! Hi? fine!!! AND YoU)",
                        new TreeMap<String, Integer>(Map.of("AND", 1, "Cat", 1, "Hi", 1, "My", 1, "Sun", 2, "YoU", 1, "cat", 3, "dog", 2, "fine", 1, "line", 1))//, "sun", 3))
                ));
    }

    @ParameterizedTest
    @MethodSource("FrequencyWordsArgumentsTrue")
    public void getFrequencyWordsTrue(String line, NavigableMap<String, Integer> expected) {
        Map<String, Integer> map = textMonitoring.researchText(line);

        NavigableMap<String, Integer> actual = textMonitoring.getFrequencyWords(map, true);

        Assertions.assertEquals(expected, actual);
    }
}
