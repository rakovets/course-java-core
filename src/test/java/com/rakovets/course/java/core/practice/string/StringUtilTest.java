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

   @ParameterizedTest(name = "Str1 - {0}, Str2 - {1}, Expected: {2}")
   @MethodSource("provideArgumentsForUnion")

   static Stream<Arguments> provideArgumentsForIndexSearch () {
       return Stream.of(
               Arguments.of("Welcome", 'e', "1"),
               Arguments.of("Hello Java", ' ', "5"),
               Arguments.of("Minsk", 'j',"-1"),
               Arguments.of("Java", 'j', "-1")
       );
   }

    @ParameterizedTest(name = "Str1 - {0}, char - {1}, Expected: {2}")
    @MethodSource("provideArgumentsForIndexSearch")

    void union(String str1, String str2, String expected) {
        String actual = stringUtil.union(str1, str2);
        Assertions.assertEquals(expected, actual);

    void indexSearch(String str3, char symbol, int expected) {
        int actual2 = stringUtil.indexSearch(str3, symbol);
        Assertions.assertEquals(expected, actual2);
    }






}
