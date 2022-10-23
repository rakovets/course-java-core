package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.words_monitoring.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.stream.Stream;

public class TextMonitoringTest {
    TextMonitoring monitoring = new TextMonitoring();

    static Stream<Arguments> provideArgumentsForResearchTextMethod() {
        return Stream.of(
                Arguments.of("Twinkle, twinkle, little star, " +
                                        "How I wonder what you are. " +
                                        "Up above the world so high, " +
                                        "Like a diamond in the sky.",
                                "{sky=1, a=1, twinkle=1, star=1, in=1, I=1, " +
                                "Twinkle=1, the=2, How=1, high=1, diamond=1, " +
                                "what=1, world=1, Like=1, are=1, above=1, wonder=1, " +
                                "Up=1, so=1, you=1, little=1}"),
                Arguments.of("I love my cat. " +
                                        "It is warm and fat. " +
                                        "My cat is grey. " +
                                        "It likes to play.",
                                "{love=1, play=1, I=1, is=2, It=2, my=1, My=1, grey=1, " +
                                "warm=1, and=1, cat=2, fat=1, to=1, likes=1}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForResearchTextMethod")
    void testResearchTextMethod(String text, String expected) {
        Map<String, Integer> actual = monitoring.researchText(text);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetCountUniqueWords() {
        return Stream.of(
                Arguments.of("Twinkle, twinkle, little star, " +
                                        "How I wonder what you are. " +
                                        "Up above the world so high, " +
                                         "Like a diamond in the sky.", 21),
                Arguments.of("I love my cat. " +
                                        "It is warm and fat. " +
                                        "My cat is grey. " +
                                        "It likes to play.", 14)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetCountUniqueWords")
    void testGetCountUniqueWords(String text, int expected) {
        int actual = monitoring.getCountUniqueWords(text);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetUniqueWords() {
        return Stream.of(
                Arguments.of("Twinkle, twinkle, little star, " +
                                        "How I wonder what you are. " +
                                        "Up above the world so high, " +
                                        "Like a diamond in the sky.",
                                "[sky, a, twinkle, star, in, I, Twinkle, " +
                                "the, How, high, diamond, what, world, Like, " +
                                "are, above, wonder, Up, so, you, little]"),
                Arguments.of("I love my cat. " +
                                        "It is warm and fat. " +
                                        "My cat is grey. " +
                                        "It likes to play.",
                                    "[love, play, I, is, It, my, " +
                                    "My, grey, warm, and, cat, fat, " +
                                    "to, likes]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetUniqueWords")
    void testGetUniqueWords(String text, String expected) {
        Set<String> actual = monitoring.getUniqueWords(text);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWord() {
        return Stream.of(
                Arguments.of("Twinkle, twinkle, little star, " +
                                        "How I wonder what you are. " +
                                        "Up above the world so high, " +
                                        "Like a diamond in the sky.",
                                        "rainbow", 0),
                Arguments.of("I love my cat. " +
                                        "It is warm and fat. " +
                                        "My cat is grey. " +
                                        "It likes to play.",
                                        "cat", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFrequencyWord")
    void testGetFrequencyWord(String text, String word, int expected) {
        int actual = monitoring.getFrequencyWord(text, word);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWords() {
        return Stream.of(
                Arguments.of("Twinkle, twinkle, little star, " +
                                "How I wonder what you are. " +
                                "Up above the world so high, " +
                                "Like a diamond in the sky.",
                                true, "{How=1, I=1, Like=1, Twinkle=1, Up=1, " +
                                "a=1, above=1, are=1, diamond=1, high=1, in=1, " +
                                "little=1, sky=1, so=1, star=1, the=2, twinkle=1, " +
                                "what=1, wonder=1, world=1, you=1}"),
                Arguments.of("Twinkle, twinkle, little star, " +
                                "How I wonder what you are. " +
                                "Up above the world so high, " +
                                "Like a diamond in the sky.",
                                false, "{you=1, world=1, wonder=1, what=1, twinkle=1, " +
                                "the=2, star=1, so=1, sky=1, little=1, in=1, high=1, " +
                                "diamond=1, are=1, above=1, a=1, Up=1, Twinkle=1, Like=1, " +
                                "I=1, How=1}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFrequencyWords")
    void testGetFrequencyWords(String text, boolean isAscendingFrequency, String expected) {
        NavigableMap actual = monitoring.getFrequencyWords(text, isAscendingFrequency);

        Assertions.assertEquals(expected, actual.toString());
    }
}
