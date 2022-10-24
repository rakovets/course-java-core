package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.words_monitoring.TextMonitoring;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextMonitoringTest {
    static Stream<Arguments> provideArgumentsForGetCountUniqueWords() {
        return Stream.of(
                Arguments.of("This is this program to monitor this program", 6),
                Arguments.of("this is this program to monitor this program", 5),
                Arguments.of("This is program to monitor", 5),
                Arguments.of("   ", 0),
                Arguments.of("program program program", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetCountUniqueWords")
    void getCountUniqueWords(String text, int expected) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);

        int actual = textMonitoring.getCountUniqueWords();

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetUniqueWords() {
        return Stream.of(
                Arguments.of("This is this program to monitor this program", Set.of("This", "is", "this", "program", "to", "monitor")),
                Arguments.of("this is this program to monitor this program", Set.of("this", "is", "program", "to", "monitor")),
                Arguments.of("This is program to monitor", Set.of("This", "is", "program", "to", "monitor")),
                Arguments.of("program program program", Set.of("program"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetUniqueWords")
    void getUniqueWords(String text, Set<String> expected) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);

        Set<String> actual = textMonitoring.getUniqueWords();

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWord() {
        return Stream.of(
                Arguments.of("This is this program to monitor this program", "this", 2),
                Arguments.of("this is this program to monitor this program", "this", 3),
                Arguments.of("This is program to monitor", "is", 1),
                Arguments.of("program program program", "program", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFrequencyWord")
    void getFrequencyWord(String text, String word, int expected) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);

        int actual = textMonitoring.getFrequencyWord(word);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWordInOrder() {
        return Stream.of(
                Arguments.of("This is this program to monitor this program", true, "{This=1, is=1, monitor=1, to=1, this=2, program=2}"),
                Arguments.of("this is this program to monitor this program", false, "{this=3, program=2, is=1, monitor=1, to=1}"),
                Arguments.of("This is program to monitor", true, "{This=1, is=1, monitor=1, program=1, to=1}"),
                Arguments.of("program program program", false, "{program=3}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFrequencyWordInOrder")
    void getFrequencyWordInOrder(String text, boolean isAscendingFrequency, String expected) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);

        String actual = textMonitoring.getFrequencyWords(isAscendingFrequency).toString();

        assertEquals(expected, actual);
    }
}
