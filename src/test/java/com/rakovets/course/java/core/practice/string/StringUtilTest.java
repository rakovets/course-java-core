package com.rakovets.course.java.core.practice.string;

import com.sun.jdi.connect.Connector;
import jdk.jfr.MemoryAddress;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    static StringUtil stringUtil;

    @BeforeAll
    static void beforeAll() {
        stringUtil = new StringUtil();
    }

    static Stream<Arguments> provideArgumentsForGlue() {
        return Stream.of(
                Arguments.of("2", "1", "21"));
    }

    @ParameterizedTest(name = "Text1 - ''{0}'', Text2 ''{1}'', Expected: ''{2}''")

    @MethodSource("provideArgumentsForGlue")
    void glueText(String str1, String str2, String expected) {

    }
}
