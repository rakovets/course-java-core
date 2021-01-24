import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest<expectedString, actualString> {
    static class Str {
        static Stream<Arguments> concatProviderArguments() {
            return Stream.of(
                    Arguments.of("HelloJava", "Hello", "Java"),
                    Arguments.of("Java", "", "Java"),
                    Arguments.of("Hello", "Hello", "")
            );
        }

        @ParameterizedTest
        @MethodSource("concatProviderArguments")
        void concat(String expectedString, String str1, String str2) {
            // GIVEN

            // WHEN
            String actualString = str1.concat(str2);

            // THAT
            Assertions.assertEquals(expectedString, actualString);
        }
    }

    //Task 2 Test
    static Stream<Arguments> indexOfProviderArguments() {
        return Stream.of(
                Arguments.of("1", "Express", "x"),
                Arguments.of("-1", "Java", "x"),
                Arguments.of("3", "My xylophone", "x")
        );
    }

    @ParameterizedTest
    @MethodSource("indexOfProviderArguments")
    void indexOf(int expectedInt, String str, char x) {
        int actualInt = StringUtil.indexOf(str, x);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //Task 3 Test
    static Stream<Arguments> equalsProviderArguments() {
        return Stream.of(
                Arguments.of("true", "Hello Tanya", "Hello Tanya"),
                Arguments.of("false", "Hello", "Java"),
                Arguments.of("false", "Hello", "Dima"),
                Arguments.of("true", "BMW", "BMW")
        );
    }

    @ParameterizedTest
    @MethodSource("equalsProviderArguments")
    void equals(boolean expectedString, String str1, String str2) {
        boolean actualString = StringUtil.equals(str1, str2);
        Assertions.assertEquals(expectedString, actualString);
    }

    //Task 4 Test
    static Stream<Arguments> trimAndToUpperCaseProviderArguments() {
        return Stream.of(
                Arguments.of("CORGI", " Corgi "),
                Arguments.of("CORGI", "coRGI "),
                Arguments.of("CORGI", " CORGi"),
                Arguments.of("CORGI", "corgi")
        );
    }

    @ParameterizedTest
    @MethodSource("trimAndToUpperCaseProviderArguments")
    void trimToUpperCase(String expectedString, String str) {
        String actualString = StringUtil.trimAndToUpperCase(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //Task 5 Test
    static Stream<Arguments> substringProviderArguments() {
        return Stream.of(
                Arguments.of("d with Java", "Hello world with Java"),
                Arguments.of("you to buy a new car if", "I can hel you to buy a new car if you want"),
                Arguments.of(" you, Dad?", "Can I help you, Dad?"),
                Arguments.of("876543234567890", "2345678909876543234567890")

        );
    }

    @ParameterizedTest
    @MethodSource("substringProviderArguments")
    void substring(String expectedString, String str) {
        String actualString = StringUtil.substring(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //Task 6 Test
    static Stream<Arguments> replaceProviderArguments() {
        return Stream.of(
                Arguments.of("I like Java :)", "I like Java :("),
                Arguments.of(":) :) :) :)", ":( :( :( :("),
                Arguments.of("happy = :) :) :) :)", "happy = :( :( :( :("),
                Arguments.of("87654:)234567890", "87654:(234567890")

        );
    }

    @ParameterizedTest
    @MethodSource("replaceProviderArguments")
    void replace(String expectedString, String str) {
        String actualString = StringUtil.replace(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //Task 7 Test
    static Stream<Arguments> startsWithAndEndsWithProviderArguments() {
        return Stream.of(
                Arguments.of("false", "Hello world, hello", "Hello"),
                Arguments.of("false", "Hell word, hello", "Hello"),
                Arguments.of("true", "Hello, world. Hello", "Hello")

        );
    }

    @ParameterizedTest
    @MethodSource("startsWithAndEndsWithProviderArguments")
    void startsWithAndEndsWith(boolean expectedBoolean, String str, String word) {
        boolean actualSBoolean = StringUtil.startsWithAndEndsWith(str, word);
        Assertions.assertEquals(expectedBoolean, actualSBoolean);
    }

    //Task 8 Test
    static Stream<Arguments> vowelsProviderArguments() {
        return Stream.of(
                Arguments.of("7", "What a wonderful day!"),
                Arguments.of("4", "Hello... Java..."),
                Arguments.of("3", "Hello, world!!!!!!!!!!!!")

        );
    }

    @ParameterizedTest
    @MethodSource("vowelsProviderArguments")
    void vowels(int expectedInt, String str) {
        int actualInt = StringUtil.vowels(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }


    //Task 9 Test
    static Stream<Arguments> punctuationProviderArguments() {
        return Stream.of(
                Arguments.of("1", "What a wonderful day!"),
                Arguments.of("6", "Hello... Java..."),
                Arguments.of("13", "Hello, world!!!!!!!!!!!!")

        );
    }

    @ParameterizedTest
    @MethodSource("punctuationProviderArguments")
    void punctuation(int expectedInt, String str) {
        int actualInt = StringUtil.punctuation(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //Task 10 Test
    static Stream<Arguments> palindromeProviderArguments() {
        return Stream.of(
                Arguments.of("false", "What a wonderful day!"),
                Arguments.of("true", "I did, did I"),
                Arguments.of("true", "No lemon, no melon")

        );
    }

    @ParameterizedTest
    @MethodSource("palindromeProviderArguments")
    void palindrome(boolean expectedBoolean, String str) {
        boolean actualBoolean = StringUtil.palindrome(str);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // Task 12 Test
    static Stream<Arguments> numbersOfWordsProviderArguments() {
        return Stream.of(
                Arguments.of("4", "What a wonderful day!"),
                Arguments.of("2", "Hello... Java..."),
                Arguments.of("3", "Hello, amazing world!!!!!!!!!!!!")

        );
    }

    @ParameterizedTest
    @MethodSource("numbersOfWordsProviderArguments")
    void numbersOfWords(int expectedInt, String str) {
        int actualInt = StringUtil.numbersOfWords(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }
}




