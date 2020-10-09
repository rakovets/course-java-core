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
class Task01Test extends StandardOutputTest {
    static Stream<Arguments> testArgumentsProvider() {
        return Stream.of(
                Arguments.of("13", String.format("1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8%1$s9%1$s10%1$s11%1$s12%1$s13", System.lineSeparator())),
                Arguments.of("9", String.format("1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8%1$s9", System.lineSeparator())),
                Arguments.of("12", String.format("1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8%1$s9%1$s10%1$s11%1$s12", System.lineSeparator())),
                Arguments.of("8", String.format("1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8", System.lineSeparator()))
        );
    }

    @ParameterizedTest(name = "Count rows: {0}")
    @MethodSource("testArgumentsProvider")
    @DisplayName("Generator rows of table")
    void test(String position, String expected) {
        Task01.main(new String[]{position});
        assertEquals(expected, getStandardOutputContent());
    }
}