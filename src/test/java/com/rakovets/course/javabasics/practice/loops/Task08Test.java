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
class Task08Test extends StandardOutputTest {
    static Stream<Arguments> testArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"100.0", "5", "5", "20"},
                        String.format("5 - 100.0%1$s10 - 200.0%1$s15 - 300.0%1$s20 - 400.0%1$s25 - 500.0%1$s30 - 600.0%1$s35 - 700.0%1$s40 - 800.0%1$s45 - 900.0%1$s50 - 1000.0%1$s55 - 1100.0%1$s60 - 1200.0%1$s65 - 1300.0%1$s70 - 1400.0%1$s75 - 1500.0%1$s80 - 1600.0%1$s85 - 1700.0%1$s90 - 1800.0%1$s95 - 1900.0%1$s100 - 2000.0", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"10.0", "5", "1", "50"},
                        String.format("5 - 10.0%1$s6 - 12.0%1$s7 - 14.0%1$s8 - 16.0%1$s9 - 18.0%1$s10 - 20.0%1$s11 - 22.0%1$s12 - 24.0%1$s13 - 26.0%1$s14 - 28.0%1$s15 - 30.0%1$s16 - 32.0%1$s17 - 34.0%1$s18 - 36.0%1$s19 - 38.0%1$s20 - 40.0%1$s21 - 42.0%1$s22 - 44.0%1$s23 - 46.0%1$s24 - 48.0%1$s25 - 50.0%1$s26 - 52.0%1$s27 - 54.0%1$s28 - 56.0%1$s29 - 58.0%1$s30 - 60.0%1$s31 - 62.0%1$s32 - 64.0%1$s33 - 66.0%1$s34 - 68.0%1$s35 - 70.0%1$s36 - 72.0%1$s37 - 74.0%1$s38 - 76.0%1$s39 - 78.0%1$s40 - 80.0%1$s41 - 82.0%1$s42 - 84.0%1$s43 - 86.0%1$s44 - 88.0%1$s45 - 90.0%1$s46 - 92.0%1$s47 - 94.0%1$s48 - 96.0%1$s49 - 98.0%1$s50 - 100.0%1$s51 - 102.0%1$s52 - 104.0%1$s53 - 106.0%1$s54 - 108.0", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"1.15", "100", "1", "5"},
                        String.format("100 - 1.15%1$s101 - 1.1615%1$s102 - 1.1729999999999998%1$s103 - 1.1844999999999999%1$s104 - 1.196", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"10.0", "34", "1", "5"},
                        String.format("34 - 10.0%1$s35 - 10.294117647058824%1$s36 - 10.588235294117647%1$s37 - 10.882352941176471%1$s38 - 11.176470588235293", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"11.0", "5", "4", "8"},
                        String.format("5 - 11.0%1$s9 - 19.8%1$s13 - 28.6%1$s17 - 37.400000000000006%1$s21 - 46.2%1$s25 - 55.0%1$s29 - 63.800000000000004%1$s33 - 72.60000000000001", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"1.7", "5", "7", "3"},
                        String.format("5 - 1.7%1$s12 - 4.08%1$s19 - 6.46", System.lineSeparator())
                )
        );
    }

    @ParameterizedTest(name = "Price info: {0}")
    @MethodSource("testArgumentsProvider")
    @DisplayName("Hypermarket prices")
    void test(String[] position, String expected) {
        Task08.main(position);
        assertEquals(expected, getStandardOutputContentWithTrim());
    }
}