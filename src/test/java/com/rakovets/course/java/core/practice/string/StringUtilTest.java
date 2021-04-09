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

        static Stream<Arguments> provideArgumentsForStringEquals() {
            return Stream.of(
                    Arguments.of("Hello World", "Hello World", true),
                    Arguments.of(" ", " ", true),
                    Arguments.of("", "", true),
                    Arguments.of("Hello World", "HelloWorld", false),
                    Arguments.of("", " ", false),
                    Arguments.of("Java", "java", false)
            );
        }

        static Stream<Arguments> provideArgumentsForStringTrim() {
            return Stream.of(
                    Arguments.of("  Hello World  ", "Hello World"),
                    Arguments.of("  Hello  World  ", "Hello  World"),
                    Arguments.of("   ", "")
            );
        }

        static Stream<Arguments> provideArgumentsSubString() {
            return Stream.of(
                    Arguments.of("Hello World", 0, 5, "Hello"),
                    Arguments.of("Hello World", 0, 6, "Hello "),
                    Arguments.of("Hello World", 3, 8, "lo Wo"),
                    Arguments.of("Hello  ", 0, 6, "Hello "),
                    Arguments.of("", 0, 0, ""),
                    Arguments.of("    ", 0, 4, "    ")
            );
        }

        static Stream<Arguments> provideArgumentsForReplaceSymbol() {
            return Stream.of(
                    Arguments.of("Hello World", "l", "b", "Hebbo Worbd"),
                    Arguments.of("Hello World", " ", "/", "Hello/World"),
                    Arguments.of("Hello World", " ", "", "HelloWorld"),
                    Arguments.of(":( :( :( :(", "(", ")", ":) :) :) :)")
            );
        }

        static Stream<Arguments> provideArgumentsForStartEndWord() {
            return Stream.of(
                    Arguments.of("Hello World Hello", "Hello", true),
                    Arguments.of("Java", "Java", true),
                    Arguments.of("_Java_", "_", true),
                    Arguments.of("Java", "java", false),
                    Arguments.of("Hello World hello", "Hello", false),
                    Arguments.of("", " ", false)
            );
        }

        static Stream<Arguments> provideArgumentsForVowel() {
            return Stream.of(
                    Arguments.of("Helloo world", 3),
                    Arguments.of("HEllO wOrld", 3),
                    Arguments.of("AbcdefghIjklmnopqrstUvwxyz", 5),
                    Arguments.of("", 0),
                    Arguments.of("!%$", 0)
            );
        }

        static Stream<Arguments> provideArgumentsForPunctuationMark() {
            return Stream.of(
                    Arguments.of(",.!?", 1),
                    Arguments.of("What`s up?", 1),
                    Arguments.of("", 0),
                    Arguments.of(" ", 0),
                    Arguments.of("!%$", 1)
            );
        }

        static Stream<Arguments> provideArgumentsForPalindrome() {
            return Stream.of(
                    Arguments.of("deed", true),
                    Arguments.of("Do geese see God", true),
                    Arguments.of("1991", true),
                    Arguments.of("Hello world", false),
                    Arguments.of("Java", false)
            );
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForGlue")
        void glueTest(String str1, String str2, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.glue(str1, str2);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForSymbolIndex")
        void symbolIndexTest(String x, String text, int expected) {
            StringUtil string = new StringUtil();
            int actual = string.symbolIndex(x, text);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForStringEquals")
        void stringEqualsTest(String str1, String str2, boolean expected) {
            StringUtil string = new StringUtil();
            boolean actual = string.stringEquals(str1, str2);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForStringTrim")
        void stringTrimTest(String str, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.stringTrim(str);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsSubString")
        void subStringTest(String str, int beginIndex, int endIndex, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.subString(str, beginIndex, endIndex);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForReplaceSymbol")
        void replaceSymbolTest(String str, String oldSymbol, String newSymbol, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.replaceSymbol(str, oldSymbol, newSymbol);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForStartEndWord")
        void startEndWordTest(String str, String word, boolean expected) {
            StringUtil string = new StringUtil();
            boolean actual = string.startEndWord(str, word);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForVowel")
        void vowelTest(String str, int expected) {
            StringUtil string = new StringUtil();
            int actual = string.vowel(str);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForPunctuationMark")
        void punctuationMarkTest(String str, int expected) {
            StringUtil string = new StringUtil();
            int actual = string.punctuationMark(str);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForPalindrome")
        void palindromeTest(String str, boolean expected) {
            StringUtil string = new StringUtil();
            boolean actual = string.palindrome(str);

            assertEquals(expected, actual);
        }

}
