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
class Task02Test extends StandardOutputTest {
    static Stream<Arguments> testArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"13", "false"},
                        String.format("1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8%1$s9%1$s10%1$s11%1$s12%1$s13", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"9", "false"},
                        String.format("1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8%1$s9", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"13", "true"},
                        String.format("%1$s1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8%1$s9%1$s10%1$s11%1$s12", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"9", "true"},
                        String.format("%1$s1%1$s2%1$s3%1$s4%1$s5%1$s6%1$s7%1$s8", System.lineSeparator())
                )
        );
    }

    @ParameterizedTest(name = "Count rows and is table header: {0}")
    @MethodSource("testArgumentsProvider")
    @DisplayName("Generator rows of table (improve)")
    void test(String[] position, String expected) {
        Task02.main(position);
        assertEquals(expected.trim(), getStandardOutputContent());
    }
}