package com.rakovets.course.java.core.practice.strings;

import com.rakovets.course.java.core.example.generics.model.restrict.A;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    /**
     * Test arguments for Task 1.
     * Testing different argument values for task 1.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveConcatProvideArgument() {
        return Stream.of(
                Arguments.of("123456", "123", "456"),
                Arguments.of("Welcome!", "", "Welcome!"),
                Arguments.of("Goodbye!", "Goodbye!", ""),
                Arguments.of("", "", "")
        );
    }

    /**
     * Test method for Task 1.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveConcatProvideArgument")
    void receiveConcat(String expected, String firstString, String secondString) {
        String actual = StringUtil.receiveConcat(firstString, secondString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 2.
     * Testing different argument values for task 2.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveIndexOfProviderArguments() {
        return Stream.of(
                Arguments.of(2, "Java", "v"),
                Arguments.of(1, "World", "o"),
                Arguments.of(0, "Bye", "B")
        );
    }

    /**
     * Test method for Task 2.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveIndexOfProviderArguments")
    void receiveIndexOf(int expected, String firstString, char symbol) {
        int actual = StringUtil.receiveIndexOf(firstString, symbol);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 3.
     * Testing different argument values for task 3.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveEqualsProviderArguments() {
        return Stream.of(
                Arguments.of("false", "JAVA", "Java"),
                Arguments.of("true", "Java", "Java"),
                Arguments.of("true", " ", " "),
                Arguments.of("false", "", " ")
        );
    }

    /**
     * Test method for Task 3.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveEqualsProviderArguments")
    void receiveEquals(boolean expected, String firstString, String secondString) {
        boolean actual = StringUtil.receiveEquals(firstString, secondString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 4.
     * Testing different argument values for task 4.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveTrimAndToUpperCaseProviderArguments() {
        return Stream.of(
                Arguments.of("JAVA", "Java "),
                Arguments.of("JAVA", "  JAva "),
                Arguments.of("", "     ")
        );
    }

    /**
     * Test method for Task 4.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveTrimAndToUpperCaseProviderArguments")
    void receiveTrimAndToUpperCase(String expected, String firstString) {
        String actual = StringUtil.receiverTrimAndToUpperCase(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 5.
     * Testing different argument values for task 5.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveSubstringProviderArguments() {
        return Stream.of(
                Arguments.of("I", "Is cream", 0, 1),
                Arguments.of("Light", "Lighthouse", 0, 5),
                Arguments.of("fish", "Jellyfish", 5, 9)
        );
    }

    /**
     * Test method for Task 5.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveSubstringProviderArguments")
    void receiveSubstring(String expected, String firstString, int nSymbol, int mSymbol) {
        String actual = StringUtil.receiveSubstring(firstString, nSymbol, mSymbol);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 6.
     * Testing different argument values for task 6.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveReplaceProviderArguments() {
        return Stream.of(
                Arguments.of("Hi:)", "Hi:(", "(", ")"),
                Arguments.of("Bye))", "Bye((", "(", ")"),
                Arguments.of(":) ;)", ":( ;(", "(", ")")
        );
    }

    /**
     * Test method for Task 5.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveReplaceProviderArguments")
    void receiveReplace(String expected, String firstString, String oldString, String newString) {
        String actual = StringUtil.receiveReplace(firstString, oldString, newString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 7.
     * Testing different argument values for task 7.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveStartWithAndEndWithProviderArguments() {
        return Stream.of(
                Arguments.of("true", "This is java", "This is java"),
                Arguments.of("false", "Java", "JavA"),
                Arguments.of("false", "Hi !", "Bye !")
        );
    }

    /**
     * Test method for Task 7.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveStartWithAndEndWithProviderArguments")
    void receiveStartWithAndEndWith(boolean expected, String text, String word) {
        boolean actual = StringUtil.receiveStartWithAndEndWith(text, word);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 8.
     * Testing different argument values for task 8.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveTheNumberOfEnglishVowelsProviderArguments() {
        return Stream.of(
                Arguments.of("2", "Java"),
                Arguments.of("0", "Brr"),
                Arguments.of("8", "aqwERtyUIop[]';LKjhGFdsAZxcVBnm,./1234567890-=.,Ga")
        );
    }

    /**
     * Test method for Task 8.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveTheNumberOfEnglishVowelsProviderArguments")
    void receiveTheNumberOfEnglishVowels(int expected, String firstString) {
        int actual = StringUtil.receiveTheNumberOfEnglishVowels(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 9.
     * Testing different argument values for task 9.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receivePunctuationMarksProviderArguments() {
        return Stream.of(
                Arguments.of("2", "Hello! Java!"),
                Arguments.of("0", "Java"),
                Arguments.of("3", "Hello. How are you doing? I am fine!"),
                Arguments.of("4", "! ? . , < > ; : - () \" [ ] {} + = * @ # $ % ^ & ")
        );
    }

    /**
     * Test method for Task 9.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receivePunctuationMarksProviderArguments")
    void receivePunctuationMarks(int expected, String firstString) {
        int actual = StringUtil.receivePunctuationMarks(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 10.
     * Testing different argument values for task 10.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receivePalindromeProviderArguments() {
        return Stream.of(
                Arguments.of("true", "deed"),
                Arguments.of("false", "fun"),
                Arguments.of("true", "1991"),
                Arguments.of("true", "777")
        );
    }

    /**
     * Test method for Task 10.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receivePalindromeProviderArguments")
    void receivePalindrome(boolean expected, String firstString) {
        boolean actual = StringUtil.receivePalindrome(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 11.
     * Testing different argument values for task 11.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveSplitProviderArguments() {
        return Stream.of(
                Arguments.of(new String[]{"Hel", "lo ", "wor", "ld!"}, "Hello world!", 3),
                Arguments.of(new String[]{"Hello world"}, "Hello world", 0),
                Arguments.of(new String[]{"Hello ", "Java"}, "Hello Java", 6)
        );
    }

    /**
     * Test method for Task 11.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveSplitProviderArguments")
    void receiveSplit(String[] expected, String firstString, int n) {
        String[] actual = StringUtil.receiveSplit(firstString, n);

        Assertions.assertArrayEquals(expected, actual);
    }

    /**
     * Test arguments for Task 12.
     * Testing different argument values for task 12.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveTheNumberOfWordsInATextProviderArguments() {
        return Stream.of(
                Arguments.of("3", "Hey!  My name..."),
                Arguments.of("1", "Java"),
                Arguments.of("0", "   ")
        );
    }

    /**
     * Test method for Task 12.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveTheNumberOfWordsInATextProviderArguments")
    void receiveTheNumberOfWordsInAText(int expected, String firstString) {
        int actual = StringUtil.receiveTheNumberOfWordsInAText(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 13.
     * Testing different argument values for task 13.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveInitialsProviderArguments() {
        return Stream.of(
                Arguments.of("AM", "Anastasia Melnikova"),
                Arguments.of("II", "Ivan Ivanov"),
                Arguments.of("HJ", "Hello Java!"),
                Arguments.of("AM", "Anastasia Melnikova Aleksandrovna")
        );
    }

    /**
     * Test method for Task 13.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveInitialsProviderArguments")
    void receiveInitials(String expected, String firstString) {
        String actual = StringUtil.receiveInitials(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 14.
     * Testing different argument values for task 14.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveAllNumbersFromTextProviderArguments() {
        return Stream.of(
                Arguments.of("25", "I am 25 years old."),
                Arguments.of("24062022", "Today 24 06 2022")
        );
    }

    /**
     * Test method for Task 14.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveAllNumbersFromTextProviderArguments")
    void receiveAllNumbersFromText(String expected, String firstString) {
        String actual = StringUtil.receiveAllNumbersFromText(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 15*.
     * Testing different argument values for task 15.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveDifferentSymbolsProviderArguments() {
        return Stream.of(
                Arguments.of("erenicul", "different", "difficult"),
                Arguments.of("acxe", "accept", "except"),
                Arguments.of("2138", "22176", "38726")
        );
    }

    /**
     * Test method for Task 15*.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveDifferentSymbolsProviderArguments")
    void receiveDifferentSymbols(String expected, String firstString, String secondString) {
        String actual = StringUtil.receiveDifferentSymbols(firstString, secondString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 16*.
     * Testing different argument values for task 16.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveArrayEqualsProviderArguments() {
        return Stream.of(
                Arguments.of(
                        "true",
                        new String[]{"9", "8", "7", "4", "5", "6", "1", "2", "3"},
                        new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}),
                Arguments.of("false", new String[]{"Java"}, new String[]{"Hey", "Java!"})
        );
    }

    /**
     * Test method for Task 16*.
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveArrayEqualsProviderArguments")
    void receiveArrayEquals(boolean expected, String[] firstArray, String[] secondArray) {
        boolean actual = StringUtil.receiveArrayEquals(firstArray, secondArray);

        Assertions.assertEquals(expected, actual);
    }
}
