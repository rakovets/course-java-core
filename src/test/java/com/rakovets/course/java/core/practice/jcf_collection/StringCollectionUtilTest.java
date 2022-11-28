package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringCollectionUtilTest {
    StringCollectionUtil stringCollectionUtil;

    @BeforeEach
    public void printWords() {
        List<String> words = new ArrayList<>(List.of("This", "is", "lots", "of", "fun", "for", "Java", "programmers"));
        stringCollectionUtil = new StringCollectionUtil(words);
    }

    static Stream<Arguments> provideArgsForResetWordsByLength() {
        return Stream.of(
                Arguments.of(List.of("*", "is", "*", "of", "fun", "for", "*", "programmers"), 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForResetWordsByLength")
    public void testResetWordsByLength(List<String> expected, int wordLength) {
        List<String> actual = stringCollectionUtil.resetWordsByLength(wordLength);

        Assertions.assertEquals(expected, actual);
        }

    static Stream<Arguments> provideArgsForRemoveWordsByLength() {
        return Stream.of(
                Arguments.of(List.of("is", "of", "fun", "for", "programmers"), 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForRemoveWordsByLength")
    public void testRemoveWordsByLength(List<String> expected, int wordLength) {
        List<String> actual = stringCollectionUtil.removeWordsByLength(wordLength);

        Assertions.assertEquals(expected, actual);
    }
}
