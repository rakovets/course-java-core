package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {
        static Stream<Arguments> provideArgumentsForGlue() {
            return Stream.of(
                    Arguments.of("1", "", "1"),
                    Arguments.of("", "5", "5"),
                    Arguments.of("245", "312", "245312"),
                    Arguments.of("", "", "")
            );
        }

        static Stream<Arguments> provideArgumentsForSymbolIndex() {
            return Stream.of(
                    Arguments.of("l", "Hello world", 2),
                    Arguments.of(" ", "Hello world", 5),
                    Arguments.of("", "Java", 0),
                    Arguments.of("b", "Java", -1),
                    Arguments.of("V", "jaVa", 2)
            );
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForSymbolIndex")
        void symbolIndexTest(String x, String text, int expected) {
            StringUtil string = new StringUtil();
            int actual = string.symbolIndex(x, text);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForGlue")
        void glueTest(String str1, String str2, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.glue(str1, str2);

            assertEquals(expected, actual);
        }

}
