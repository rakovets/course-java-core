package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.word_monitoring.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

public class TestTextMonitoring {
    TextMonitoring textMonitoring = new TextMonitoring();

    static Stream<Arguments> provideArgumentsForGetCountUniqueWords() {
        return Stream.of(Arguments.of("Returns a stream consisting of the results of replacing", 8),
                Arguments.of("Returns a stream consisting of the", 6),
                Arguments.of("Returns of the results of replacing", 5));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetCountUniqueWords")
    void getCountUniqueWords(String text, int expected) {
        textMonitoring.researchText(text);

        int actual = textMonitoring.getCountUniqueWords();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWords() {
        return Stream.of(Arguments.of("Returns a stream consisting of", true,
                        Map.of("Returns", 1, "a", 1, "stream", 1, "consisting", 1, "of", 1)),
                Arguments.of("Returns a stream consisting of", false,
                        Map.of("of", 1, "consisting", 1, "stream", 1, "a", 1, "Returns", 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFrequencyWords")
    void getFrequencyWords(String text, boolean is, Map<String, Integer> expected) {
        textMonitoring.researchText(text);

        Map<String, Integer> actual = textMonitoring.getFrequencyWords(is);

        Assertions.assertEquals(expected, actual);
    }
}
