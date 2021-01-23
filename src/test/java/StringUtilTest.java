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
}



