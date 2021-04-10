package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
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

        static Stream<Arguments> provideArgumentsForVowel() { // !!! need fix !!!
            return Stream.of(
                    Arguments.of("Helloo world", 3),
                    Arguments.of("HEllO wOrld", 3),
                    Arguments.of("AbcdefghIjklmnopqrstUvwxyz", 5),
                    Arguments.of("", 0),
                    Arguments.of("!%$", 0)
            );
        }

        static Stream<Arguments> provideArgumentsForPunctuationMark() { // !!! need fix !!!
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

        static Stream<Arguments> provideArgumentsForSubstringArray() {
            return Stream.of(
                    Arguments.of("Hello World", 0, new String[]{"Hello World"}),
                    Arguments.of("Hello World", 1, new String[]{"H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"}),
                    Arguments.of("Hello World", 2, new String[]{"He", "ll", "o" , "Wo", "rl", "d"}),
                    Arguments.of("Hello World", 3, new String[]{"Hel", "lo" , "Wor", "ld"}),
                    Arguments.of("Hello World", 4, new String[]{"Hell", "o Wo", "rld"}),
                    Arguments.of("Hello World", 5, new String[]{"Hello",  "Worl", "d"})
            );
        }

        /*static Stream<Arguments> provideArgumentsForAmountWords() {
            return Stream.of(
                    Arguments.of("", 0),
                    Arguments.of(" ", 0),
                    Arguments.of("Hello", 1),
                    Arguments.of("Hello world", 2),
                    Arguments.of("Where  are    you    from?", 4)
            );
        }*/

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForGlue")
        void glueTest(String firstText, String secondText, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.glue(firstText, secondText);

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
        void stringEqualsTest(String firstText, String secondText, boolean expected) {
            StringUtil string = new StringUtil();
            boolean actual = string.stringEquals(firstText, secondText);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForStringTrim")
        void stringTrimTest(String text, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.stringTrim(text);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsSubString")
        void subStringTest(String text, int beginIndex, int endIndex, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.subString(text, beginIndex, endIndex);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForReplaceSymbol")
        void replaceSymbolTest(String text, String oldSymbol, String newSymbol, String expected) {
            StringUtil string = new StringUtil();
            String actual = string.replaceSymbol(text, oldSymbol, newSymbol);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForStartEndWord")
        void startEndWordTest(String text, String word, boolean expected) {
            StringUtil string = new StringUtil();
            boolean actual = string.startEndWord(text, word);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForVowel")
        void vowelTest(String text, int expected) {
            StringUtil string = new StringUtil();
            int actual = string.vowel(text);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForPunctuationMark")
        void punctuationMarkTest(String text, int expected) {
            StringUtil string = new StringUtil();
            int actual = string.punctuationMark(text);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForPalindrome")
        void palindromeTest(String text, boolean expected) {
            StringUtil string = new StringUtil();
            boolean actual = string.palindrome(text);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForSubstringArray")
        void substringArrayTest(String text, int n, String[] expected) {
            StringUtil string = new StringUtil();
            String[] actual = string.substringArray(text, n);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "Str1 {0}. Position player bu damage: {1}")
        @MethodSource("provideArgumentsForAmountWords")
        void palindromeTest(String text, int expected) {
            StringUtil string = new StringUtil();
            int actual = string.amountWords(text);

            assertEquals(expected, actual);
        }

}
