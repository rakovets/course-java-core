package com.rakovets.course.java.core.practice.jcf_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("Test for text monitoring.")
class TextMonitoringTest {
    static TextMonitoring textMonitoring = new TextMonitoring();

    @BeforeAll
    static void init() {
        textMonitoring.researchText("Key VALUE Key Key Test! Value");
    }

    static Stream<Arguments> researchTextTestProviderArguments() {
        return Stream.of(
                Arguments.of("Key", 3),
                Arguments.of("VALUE", 1),
                Arguments.of("Test", 1),
                Arguments.of("Value", 1)
        );
    }

    @ParameterizedTest(name = "String {0}.")
    @MethodSource("researchTextTestProviderArguments")
    void researchTextTest(String key, int expected) {
        Integer actual = textMonitoring.getMap().get(key);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getCountUniqueWordsTestProviderArguments() {
        return Stream.of(
                Arguments.of("Key VALUE Key Key Test! Value", 4),
                Arguments.of("Key", 1),
                Arguments.of(" ", 0)
        );
    }

    @ParameterizedTest(name = "String {0}.")

    @MethodSource("getCountUniqueWordsTestProviderArguments")
    void getCountUniqueWordsTest(String text, int expected) {
        int actual;

        textMonitoring.researchText(text);
        actual = textMonitoring.getCountUniqueWords();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getFrequencyWordTestProviderArguments() {
        return Stream.of(
                Arguments.of(3, "Key"),
                Arguments.of(1, "VALUE"),
                Arguments.of(1, "Test"),
                Arguments.of(1, "Value")
        );
    }

    @ParameterizedTest
    @MethodSource("getFrequencyWordTestProviderArguments")
    void getFrequencyWordTest(int expected, String text) {
        int actual;

        actual = textMonitoring.getFrequencyWord(text);

        Assertions.assertEquals(expected, actual);
    }
}
