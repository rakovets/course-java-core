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
class Task09Test extends StandardOutputTest {
    static Stream<Arguments> testArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"100.0", "5", "5", "20", "1.0"},
                        String.format("5 - 100.0 with sell 0.0%%%1$s10 - 198.0 with sell 1.0%%%1$s15 - 294.0 with sell 2.0%%%1$s20 - 388.0 with sell 3.0%%%1$s25 - 480.0 with sell 4.0%%%1$s30 - 570.0 with sell 5.0%%%1$s35 - 658.0 with sell 6.0%%%1$s40 - 744.0 with sell 7.0%%%1$s45 - 828.0 with sell 8.0%%%1$s50 - 910.0 with sell 9.0%%%1$s55 - 990.0 with sell 10.0%%%1$s60 - 1068.0 with sell 11.0%%%1$s65 - 1144.0 with sell 12.0%%%1$s70 - 1218.0 with sell 13.0%%%1$s75 - 1290.0 with sell 14.0%%%1$s80 - 1360.0 with sell 15.0%%%1$s85 - 1428.0 with sell 16.0%%%1$s90 - 1494.0 with sell 17.0%%%1$s95 - 1558.0000000000002 with sell 18.0%%%1$s100 - 1620.0 with sell 19.0%%", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"10.0", "5", "1", "50", "1.0"},
                        String.format("5 - 10.0 with sell 0.0%%%1$s6 - 11.879999999999999 with sell 1.0%%%1$s7 - 13.719999999999999 with sell 2.0%%%1$s8 - 15.52 with sell 3.0%%%1$s9 - 17.28 with sell 4.0%%%1$s10 - 19.0 with sell 5.0%%%1$s11 - 20.68 with sell 6.0%%%1$s12 - 22.32 with sell 7.0%%%1$s13 - 23.92 with sell 8.0%%%1$s14 - 25.48 with sell 9.0%%%1$s15 - 27.0 with sell 10.0%%%1$s16 - 28.48 with sell 11.0%%%1$s17 - 29.92 with sell 12.0%%%1$s18 - 31.32 with sell 13.0%%%1$s19 - 32.68 with sell 14.0%%%1$s20 - 34.0 with sell 15.0%%%1$s21 - 35.28 with sell 16.0%%%1$s22 - 36.519999999999996 with sell 17.0%%%1$s23 - 37.720000000000006 with sell 18.0%%%1$s24 - 38.88 with sell 19.0%%%1$s25 - 40.0 with sell 20.0%%%1$s26 - 41.08 with sell 21.0%%%1$s27 - 42.120000000000005 with sell 22.0%%%1$s28 - 43.120000000000005 with sell 23.0%%%1$s29 - 44.08 with sell 24.0%%%1$s30 - 45.0 with sell 25.0%%%1$s31 - 45.88 with sell 26.0%%%1$s32 - 46.72 with sell 27.0%%%1$s33 - 47.519999999999996 with sell 28.0%%%1$s34 - 48.28 with sell 29.0%%%1$s35 - 49.0 with sell 30.0%%%1$s36 - 49.67999999999999 with sell 31.0%%%1$s37 - 50.31999999999999 with sell 32.0%%%1$s38 - 50.919999999999995 with sell 33.0%%%1$s39 - 51.48 with sell 34.0%%%1$s40 - 52.0 with sell 35.0%%%1$s41 - 52.480000000000004 with sell 36.0%%%1$s42 - 52.92 with sell 37.0%%%1$s43 - 53.32 with sell 38.0%%%1$s44 - 53.68 with sell 39.0%%%1$s45 - 54.0 with sell 40.0%%%1$s46 - 54.28000000000001 with sell 41.0%%%1$s47 - 54.52000000000001 with sell 42.0%%%1$s48 - 54.720000000000006 with sell 43.0%%%1$s49 - 54.88 with sell 44.0%%%1$s50 - 55.00000000000001 with sell 45.0%%%1$s51 - 55.080000000000005 with sell 46.0%%%1$s52 - 55.120000000000005 with sell 47.0%%%1$s53 - 55.120000000000005 with sell 48.0%%%1$s54 - 55.08 with sell 49.0%%", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"1.15", "100", "1", "5", "1.0"},
                        String.format("100 - 1.15 with sell 0.0%%%1$s101 - 1.149885 with sell 1.0%%%1$s102 - 1.1495399999999998 with sell 2.0%%%1$s103 - 1.1489649999999998 with sell 3.0%%%1$s104 - 1.1481599999999998 with sell 4.0%%", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"10.0", "34", "1", "5", "1.0"},
                        String.format("34 - 10.0 with sell 0.0%%%1$s35 - 10.191176470588236 with sell 1.0%%%1$s36 - 10.376470588235293 with sell 2.0%%%1$s37 - 10.555882352941177 with sell 3.0%%%1$s38 - 10.729411764705882 with sell 4.0%%", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"11.0", "5", "4", "8", "1.0"},
                        String.format("5 - 11.0 with sell 0.0%%%1$s9 - 19.602 with sell 1.0%%%1$s13 - 28.028000000000002 with sell 2.0%%%1$s17 - 36.278000000000006 with sell 3.0%%%1$s21 - 44.352000000000004 with sell 4.0%%%1$s25 - 52.25 with sell 5.0%%%1$s29 - 59.972 with sell 6.0%%%1$s33 - 67.518 with sell 7.0%%", System.lineSeparator())
                ),
                Arguments.of(
                        new String[]{"1.7", "5", "7", "3", "1.0"},
                        String.format("5 - 1.7 with sell 0.0%%%1$s12 - 4.0392 with sell 1.0%%%1$s19 - 6.3308 with sell 2.0%%", System.lineSeparator())
                )
        );
    }

    @ParameterizedTest(name = "Price info: {0}")
    @MethodSource("testArgumentsProvider")
    @DisplayName("Hypermarket prices with sell")
    void test(String[] position, String expected) {
        Task09.main(position);
        assertEquals(expected, getStandardOutputContentWithTrim());
    }
}