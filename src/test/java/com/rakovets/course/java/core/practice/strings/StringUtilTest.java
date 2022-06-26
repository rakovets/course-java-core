package com.rakovets.course.java.core.practice.strings;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    /**
     * Test arguments for Task 1.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveConcatProvideArgument")
    void receiveConcatTest(String expected, String firstString, String secondString) {
        String actual = StringUtil.receiveConcat(firstString, secondString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 2.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveIndexOfProviderArguments")
    void receiveIndexOfTest(int expected, String firstString, char symbol) {
        int actual = StringUtil.receiveIndexOf(firstString, symbol);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 3.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveEqualsProviderArguments")
    void receiveEqualsTest(boolean expected, String firstString, String secondString) {
        boolean actual = StringUtil.receiveEquals(firstString, secondString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 4.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveTrimAndToUpperCaseProviderArguments")
    void receiveTrimAndToUpperCaseTest(String expected, String firstString) {
        String actual = StringUtil.receiverTrimAndToUpperCase(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 5.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveSubstringProviderArguments")
    void receiveSubstringTest(String expected, String firstString, int nSymbol, int mSymbol) {
        String actual = StringUtil.receiveSubstring(firstString, nSymbol, mSymbol);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 6.
     * <p>
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
     * Test method for Task 6.
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveReplaceProviderArguments")
    void receiveReplaceTest(String expected, String firstString, String oldString, String newString) {
        String actual = StringUtil.receiveReplace(firstString, oldString, newString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 7.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveStartWithAndEndWithProviderArguments")
    void receiveStartWithAndEndWithTest(boolean expected, String text, String word) {
        boolean actual = StringUtil.receiveStartWithAndEndWith(text, word);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 8.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveTheNumberOfEnglishVowelsProviderArguments")
    void receiveTheNumberOfEnglishVowelsTest(int expected, String firstString) {
        int actual = StringUtil.receiveTheNumberOfEnglishVowels(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 9.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receivePunctuationMarksProviderArguments")
    void receivePunctuationMarksTest(int expected, String firstString) {
        int actual = StringUtil.receivePunctuationMarks(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 10.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receivePalindromeProviderArguments")
    void receivePalindromeTest(boolean expected, String firstString) {
        boolean actual = StringUtil.receivePalindrome(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 11.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveSplitProviderArguments")
    void receiveSplitTest(String[] expected, String firstString, int n) {
        String[] actual = StringUtil.receiveSplit(firstString, n);

        Assertions.assertArrayEquals(expected, actual);
    }

    /**
     * Test arguments for Task 12.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveTheNumberOfWordsInATextProviderArguments")
    void receiveTheNumberOfWordsInATextTest(int expected, String firstString) {
        int actual = StringUtil.receiveTheNumberOfWordsInAText(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 13.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveInitialsProviderArguments")
    void receiveInitialsTest(String expected, String firstString) {
        String actual = StringUtil.receiveInitials(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 14.
     * <p>
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveAllNumbersFromTextProviderArguments")
    void receiveAllNumbersFromTextTest(String expected, String firstString) {
        String actual = StringUtil.receiveAllNumbersFromText(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 15*.
     * <p>
     * Testing different argument values for task 15*.
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveDifferentSymbolsProviderArguments")
    void receiveDifferentSymbolsTest(String expected, String firstString, String secondString) {
        String actual = StringUtil.receiveDifferentSymbols(firstString, secondString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 16*.
     * <p>
     * Testing different argument values for task 16*.
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
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveArrayEqualsProviderArguments")
    void receiveArrayEqualsTest(boolean expected, String[] firstArray, String[] secondArray) {
        boolean actual = StringUtil.receiveArrayEquals(firstArray, secondArray);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test method for Task 17*.
     * <p>
     * Performs job testing based on arguments.
     */
    public static void main(String[] args) {
        String firstString = "Java";
        String secondString = "Java";

        System.out.println("\nTest 1:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 0));
        System.out.println("\nTest 2:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 12));
        System.out.println("\nTest 3:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 123));
        System.out.println("\nTest 4:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 1_234));
        System.out.println("\nTest 5:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 12_345));
        System.out.println("\nTest 6:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 123_456));
        System.out.println("\nTest 7:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 1_234_567));
        System.out.println("\nTest 8:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 12_345_678));
        System.out.println("\nTest 9:\nConcatenation rate: "
                + StringUtil.receiveExecutionSpeed(firstString, secondString, 124_567_890));
    }

    /**
     * Test arguments for Task 18*.
     * <p>
     * Testing different argument values for task 18*.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveStringWithoutRepeatingCharactersProviderArguments() {
        return Stream.of(
                Arguments.of("abcdef", "aaabbcdeef"),
                Arguments.of("12345789", "1122334455778899"),
                Arguments.of("", ""),
                Arguments.of("123 123", "123 111222333")
        );
    }

    /**
     * Test method for Task 18*.
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveStringWithoutRepeatingCharactersProviderArguments")
    void receiveStringWithoutRepeatingCharactersTest(String expected, String firstString) {
        String actual = StringUtil.receiveStringWithoutRepeatingCharacters(firstString);

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test arguments for Task 19**.
     * <p>
     * Testing different argument values for task 19**.
     *
     * @return test result.
     */
    static @NotNull Stream<Arguments> receiveConversionToArabicNumeralsProviderArguments() {
        return Stream.of(
                Arguments.of("3999", "MMMCMXCIX"),
                Arguments.of("2022", "MMXXII"),
                Arguments.of("398", "CCCXCVIII"),
                Arguments.of("1", "I"),
                Arguments.of("45", "xLv"),
                Arguments.of("900", "CM")
        );
    }

    /**
     * Test method for Task 19**.
     * <p>
     * Performs job testing based on arguments.
     */
    @ParameterizedTest
    @MethodSource("receiveConversionToArabicNumeralsProviderArguments")
    void receiveConversionToArabicNumeralsTest(String expected, String firstString) {
        String actual = StringUtil.receiveConversionToArabicNumerals(firstString);

        Assertions.assertEquals(expected, actual);
    }
}
