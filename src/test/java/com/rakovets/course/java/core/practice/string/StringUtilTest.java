package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
        static Stream<Arguments> glue() {
            return Stream.of(
                    Arguments.of("1", "", "1"),
                    Arguments.of("", "5", "5"),
                    Arguments.of("245", "312", "245312"),
                    Arguments.of("", "", "")
            );
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("glue")
        void glueTest(String str1, String str2, String expected) {
            StringUtil string = new StringUtil();
            string.glue(str1, str2);
        }

}
