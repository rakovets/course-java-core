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

   static Stream<Arguments> provideArgumentsForUnion() {
       return Stream.of(
               Arguments.of("", "", ""),
               Arguments.of("123", "", "123"),
               Arguments.of("", "123","123"),
               Arguments.of("123", "456", "123456")
       );
   }

   static Stream<Arguments> provideArgumentsForIndexSearch() {
       return Stream.of(
               Arguments.of("Welcome", 'e', "1"),
               Arguments.of("Hello Java", ' ', "5"),
               Arguments.of("Minsk", 'j',"-1"),
               Arguments.of("Java", 'j', "-1")
       );
   }

   static Stream<Arguments> provideArgumentsCompareTwoString() {
       return Stream.of(
               Arguments.of("Hello Java","Hello Java", true),
               Arguments.of("Welcome", "welcome", false),
               Arguments.of(" Minsk","Minsk ", false),
               Arguments.of("+375 29 999", "+375 29 999", true)
       );
   }

   static Stream<Arguments> provideArgumentsChangeString() {
       return Stream.of(
               Arguments.of(" Hello Java ","HELLO JAVA"),
               Arguments.of("Welcome", "WELCOME"),
               Arguments.of(" Minsk","MINSK"),
               Arguments.of(" a b c 1 ", "A B C 1")
       );
   }


    @ParameterizedTest(name = "Str1 - {0}, Str2 - {1}, Expected: {2}")
    @MethodSource("provideArgumentsForUnion")
    void unionTest(String str1, String str2, String expected) {
        String actual = stringUtil.union(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, char - {1}, Expected: {2}")
    @MethodSource("provideArgumentsForIndexSearch")
    void indexSearchTest(String str1, char symbol, int expected) {
        int actual = stringUtil.indexSearch(str1, symbol);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, Str2 - {1}, Expected: {2}")
    @MethodSource("provideArgumentsCompareTwoString")
    void compareTwoStringTest(String str1, String str2, boolean expected) {
       boolean actual = stringUtil.compareTwoString(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, Str2 - {1}, Expected: {2}")
    @MethodSource("provideArgumentsChangeString")
    void changeStringTest(String str1, String expected) {
        String actual = stringUtil.changeString(str1);
        Assertions.assertEquals(expected, actual);
    }



}
