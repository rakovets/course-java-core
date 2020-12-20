package com.rakovets.course.javabasics.practice.loops;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task05Test extends StandardOutputTest {
    static Stream<Arguments> testArgumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"10000", "5.0", "500"}, "-1"),
                Arguments.of(new String[]{"10000", "5.0", "917"}, "17"),
                Arguments.of(new String[]{"10000", "5.0", "700"}, "-1"),
                Arguments.of(new String[]{"10000", "5.0", "740"}, "24"),
                Arguments.of(new String[]{"10000", "-5.0", "1000"}, "8"),
                Arguments.of(new String[]{"10000", "5.0", "1550"}, "8")
        );
    }

    @ParameterizedTest(name = "Raid Boss info and damage od party: {0}")
    @MethodSource("testArgumentsProvider")
    @DisplayName("Raid Boss campaign")
    void test(String[] position, String expected) {
        Task05.main(position);
        assertEquals(expected, getStandardOutputContentWithTrim());
    }
}
