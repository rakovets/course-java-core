import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {

    // task-1 test
    static Stream<Arguments> getConcatProviderArguments() {
        return Stream.of(
                Arguments.of("LearnJava", "Learn", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Learn", "Learn", "")
        );
    }

    @ParameterizedTest
    @MethodSource("getConcatProviderArguments")

    void getStingConcat(String expectedString, String str1, String str2) {
        String actualString = StringUtil.getStingConcat(str1, str2);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task-2 test
    static Stream<Arguments> getIndexOfProviderArguments() {
        return Stream.of(
                Arguments.of(5, "hello world", " "),
                Arguments.of(4,"belarus", "r"),
                Arguments.of(-1,"void", "s"),
                Arguments.of(-1, null, 'b'),
                Arguments.of(-1, "yellow", 'u'),
                Arguments.of(2, "45618915618", "6")
        );
    }

    @ParameterizedTest
    @MethodSource("getIndexOfProviderArguments")

    void getIndexOf(int expectedInt, String str, char x) {
        int actualInt = StringUtil.getIndexOf(str, x);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task-3 test

    static  Stream<Arguments> getEqualsStringProviderArguments() {
        return Stream.of(
                Arguments.of("true", "hello", "hello"),
                Arguments.of("false", "HELLO", "hello"),
                Arguments.of("false", "Hello", "hello"),
                Arguments.of("false", "Hello", "HeLLO"),
                Arguments.of("true", "Hello", "Hello"),
                Arguments.of("false", "", "hello"),
                Arguments.of("true", "1234", "1234"),
                Arguments.of("false", "123", "321")
        );
    }

    @ParameterizedTest
    @MethodSource("getEqualsStringProviderArguments")

    void getEqualsString(boolean expectedBoolean, String str1, String str2) {
        boolean actualBoolean = StringUtil.isEqualsString(str1, str2);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    //task-4 test

    static  Stream<Arguments> getTrimAndUpperCaseStringProviderArguments() {
        return Stream.of(
                Arguments.of("HELLO", " hello "),
                Arguments.of("HELLO", " HELLO "),
                Arguments.of("HELLO", " Hello"),
                Arguments.of("HELLO", "hello"),
                Arguments.of("HELLO", "HEllO"),
                Arguments.of("HELLO", "Hello ")

        );
    }

    @ParameterizedTest
    @MethodSource("getTrimAndUpperCaseStringProviderArguments")

    void getTrimAndUpperCaseString(String expectedString, String str) {
        String actualString = StringUtil.getTrimAndUpperCaseString(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task-5 test

    static Stream<Arguments> getSubstringProviderArguments() {
        return Stream.of(
                Arguments.of("people in Belarus", " how many people in Belarus"),
                Arguments.of("people", " how many people"),
                Arguments.of("0", "01234567890")
        );
    }

    @ParameterizedTest
    @MethodSource("getSubstringProviderArguments")
    void getSubstring(String expectedString, String str) {
        String actualString = StringUtil.getSubstring(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task-6 test

    static Stream<Arguments> getReplaceProviderArguments() {
        return Stream.of(
                Arguments.of(":)", ":("),
                Arguments.of("how:) many:) people:) in:) Belarus:)", "how:( many:( people:( in:( Belarus:("),
                Arguments.of("how many people in Belarus", "how many people in Belarus")
        );
    }

    @ParameterizedTest
    @MethodSource("getReplaceProviderArguments")
    void getReplace(String expectedString, String str) {
        String actualString = StringUtil.getReplace(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task-7 test

    static Stream<Arguments> isFirstAndLastWorldProviderArguments() {
        return Stream.of(
                Arguments.of("true", "string starts with a given string", "string"),
                Arguments.of("true", "STRING starts with a given string", "string"),
                Arguments.of("false", "starts with a given string", "starts"),
                Arguments.of("false", " string starts with a given string", "string"),
                Arguments.of("true", "1string starts with a given string1", "1"),
                Arguments.of("true", " string starts with a given string ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("isFirstAndLastWorldProviderArguments")
    void isFirstAndLastWorld(boolean expectedBoolean, String str, String word) {
        boolean actualBoolean = StringUtil.isFirstAndLastWorld(str, word);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    //task-8 test

    static Stream<Arguments> getVowelsLettersProviderArguments() {
        return Stream.of(
                Arguments.of("7", "Write a Java method"),
                Arguments.of("7", "WRITE A JAVA method"),
                Arguments.of("0", "GMT")
        );
    }

    @ParameterizedTest
    @MethodSource("getVowelsLettersProviderArguments")
    void getVowelsLetters(int expectedInt, String str) {
        int actualInt = StringUtil.getVowelsLetters(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //task-9 test

    static Stream<Arguments> getPunctuationMarksProviderArguments() {
        return Stream.of(
                Arguments.of("7", "Write a Java method!,...!,"),
                Arguments.of("0", "This is not typical sentence ")
        );
    }

    @ParameterizedTest
    @MethodSource("getPunctuationMarksProviderArguments")
    void getPunctuationMarks(int expectedInt, String str) {
        int actualInt = StringUtil.getPunctuationMarks(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //task-10 test

    static Stream<Arguments> isPalindromProviderArguments() {
        return Stream.of(
                Arguments.of("true", "civic"),
                Arguments.of("true", "Civic"),
                Arguments.of("false", "palindrome")
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindromProviderArguments")
    void isPalindrom(boolean expectedBoolean, String str) {
        boolean actualBoolean = StringUtil.isPalindrom(str);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    //task-11 test

    static  Stream<Arguments> getSplitStringProviderArguments() {
        return Stream.of(
                Arguments.of("[String, string]", "Stringstring", "2"),
                Arguments.of("[string , string]", "string string", "2"),
                Arguments.of("[one , one , five]", "one one five", "3"),
                Arguments.of("[one, one, fiv, e]", "oneonefive", "3")
        );
    }

    @ParameterizedTest
    @MethodSource("getSplitStringProviderArguments")

    void getSplitString(String expectedString, String str, int n) {
        String actualString = StringUtil.getSplitString(str, n);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task-12 test

    static Stream<Arguments> getCountWordProviderArguments() {
        return Stream.of(
                Arguments.of("6", "This solution uses the regular expression"),
                Arguments.of("5", "See The      Complete Java MasterClass"),
                Arguments.of("1", "See    ")
        );
    }

    @ParameterizedTest
    @MethodSource("getCountWordProviderArguments")
    void getCountWord(int expectedInt, String str) {
        int actualInt = StringUtil.getCountWord(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //task-13 test

    static Stream<Arguments> getInitialsProviderArguments() {
        return Stream.of(
                Arguments.of("T.V.A.", "Tush", "Vlad", "Alex"),
                Arguments.of("T.V.A.", "tush", "vlad", "alex")
        );
    }

    @ParameterizedTest
    @MethodSource("getInitialsProviderArguments")
    void getInitials(String expectedString, String surname, String name, String patronymic) {
        String actualString = StringUtil.getInitials(surname, name, patronymic);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task-14 test

    static Stream<Arguments> getNumeralProviderArguments() {
        return Stream.of(
                Arguments.of("11", "In11this article"),
                Arguments.of("211105612", "2Extract1 1digits10 from56 string1 -2 StringUtils Java")
        );
    }

    @ParameterizedTest
    @MethodSource("getNumeralProviderArguments")
    void getNumeral(String expectedString, String str) {
        String actualString = StringUtil.getNumeral(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task-18 test

    static Stream<Arguments> getReplacedIdenticalCharactersProviderArguments() {
        return Stream.of(
                Arguments.of("abcdef", "aaabbcdeef"),
                Arguments.of("246", "2222244444666"),
                Arguments.of("1a", "11111aaaaaaaaa")
        );
    }

    @ParameterizedTest
    @MethodSource("getReplacedIdenticalCharactersProviderArguments")
    void getReplacedIdenticalCharacters(String expectedString, String str) {
        String actualString = StringUtil.getReplacedIdenticalCharacters(str);
        Assertions.assertEquals(expectedString, actualString);
    }

}
