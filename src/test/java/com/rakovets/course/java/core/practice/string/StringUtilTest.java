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
               Arguments.of(" Minsk", "MINSK"),
               Arguments.of(" a b c 1 ", "A B C 1")
       );
   }

   static Stream<Arguments> provideArgumentsRetrievalNewString() {
       return Stream.of(
               Arguments.of("Hello world", 1, 5, "Hello"),
               Arguments.of("Welcome to summer", 8, 11, " to "),
               Arguments.of("Minsk 2021", 7, 10, "2021"),
               Arguments.of("SunSet", 1, 6, "SunSet")
       );
   }

   static Stream<Arguments> provideArgumentsReplaceEmoji() {
       return Stream.of(
               Arguments.of("Welcome:(", "Welcome:)"),
               Arguments.of(":( Hello", ":) Hello"),
               Arguments.of("Minsk :)","Minsk :)"),
               Arguments.of(":(", ":)")
       );
   }

   static Stream<Arguments> provideArgumentsStartAndFinishWithWord() {
       return Stream.of(
               Arguments.of("good home - good", "good", true),
               Arguments.of(" Java ", " ", true),
               Arguments.of("my world", "my", false),
               Arguments.of("Home home", "home", false)
       );
   }

   static Stream<Arguments> provideArgumentsFindingNumberOfEnglishVowels() {
       return Stream.of(
               Arguments.of("Welcome Java", 5),
               Arguments.of("Upper AXE", 4),
               Arguments.of("JDK 2021", 0),
               Arguments.of("aEuIoY", 6)
       );
   }

   static Stream<Arguments> provideArgumentsNumberOfPunctuationMarks() {
       return Stream.of(
               Arguments.of("Welcome Java!", 1),
               Arguments.of("Minsk, Moscow!", 2),
               Arguments.of("!JDK11.02!", 3),
               Arguments.of("Hello world", 0)
       );
   }

   static Stream<Arguments> provideArgumentsToCheckPalindrome() {
       return Stream.of(
               Arguments.of("deed!", true),
               Arguments.of("1991", true),
               Arguments.of("Do geese see God?", true),
               Arguments.of("Hello world", false)
       );
   }

   static Stream<Arguments> provideArgumentsStringInArray() {
       return Stream.of(
               Arguments.of("Java Some Minsk", 5, new String[]{"Java ", "Some ", "Minsk"}),
               Arguments.of("1991", 1, new String[] {"1", "9", "9", "1"}),
               Arguments.of("1  !2  !3  !", 4, new String[] {"1  !", "2  !", "3  !"}),
               Arguments.of("Hello Java", 2, new String[] {"He", "ll", "o ", "Ja", "va"})
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

    @ParameterizedTest(name = "Str1 - {0}, Str2 - {1}")
    @MethodSource("provideArgumentsChangeString")
    void changeStringTest(String str1, String expected) {
        String actual = stringUtil.changeString(str1);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, n = {1}, m = {2}, Expected: {3}")
    @MethodSource("provideArgumentsRetrievalNewString")
    void retrievalNewStringTest(String str1, int n, int m, String expected) {
        String actual = stringUtil.retrievalNewString(str1, n, m);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, Expected: {1}")
    @MethodSource("provideArgumentsReplaceEmoji")
    void replaceEmojiTest(String str1, String expected){
        String actual = stringUtil.replaceEmoji(str1);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Text - {0}, word - {1}, Expected: {2}")
    @MethodSource("provideArgumentsStartAndFinishWithWord")
    void startAndFinishWithWordTest (String text, String word, Boolean expected) {
        boolean actual = stringUtil.startAndFinishWithWord(text, word);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, Expected: {1}")
    @MethodSource("provideArgumentsFindingNumberOfEnglishVowels")
    void findingNumberOfEnglishVowelsTest(String str1, int expected) {
        int actual = stringUtil.findingNumberOfEnglishVowels(str1);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, Expected: {1}")
    @MethodSource("provideArgumentsNumberOfPunctuationMarks")
    void numberOfPunctuationMarksTest(String str1, int expected) {
        int actual = stringUtil.numberOfPunctuationMarks(str1);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, Expected: {1}")
    @MethodSource("provideArgumentsToCheckPalindrome")
    void toCheckPalindromeTest(String str1, boolean expected) {
        boolean actual = stringUtil.toCheckPalindrome(str1);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Str1 - {0}, n = {1}, Expected: {2}")
    @MethodSource("provideArgumentsStringInArray")
    void stringInArrayTest(String str1, int n, String[] expected) {
        String[] actual = stringUtil.stringInArray(str1, n);
        Assertions.assertArrayEquals(expected, actual);
    }



}
