package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
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

   static Stream<Arguments> provideArgumentsForUnion () {
       return Stream.of(
               Arguments.of("", "", ""),
               Arguments.of("123", "", "123"),
               Arguments.of("", "123","123"),
               Arguments.of("123", "456", "123456")
       );
   }

   @ParameterizedTest(name = "Str1 - '{0}', Str2 '{1}', Expected: '{2}'")
   @MethodSource("provideArgumentsForUnion")
    void unionTest(String str1, String str2, String expected) {

        String actual = stringUtil.union(str1, str2);

        Assertions.assertEquals(expected, actual);
    }
}
