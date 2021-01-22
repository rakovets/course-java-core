package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {

    // task 1. Метод возвращает строку, которая является результатом склеивания двух строк.
    // В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForGetStringConcat() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", ""),
                Arguments.of(null, "Hello", null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetStringConcat")
    void getStringConcat(String expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getStringConcat(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 2. Метод возвращает индекс символа x (x – символ вводимый пользователем) в строке.
    // Если такого символа нет, то возвращает значение -1. В случае не инициализированной строки или символа возвращает -1.
    static Stream<Arguments> provideArgumentsForGetIndexOf() {
        return Stream.of(
                Arguments.of(4, "Hello", 'o'),
                Arguments.of(-1, "", 'x'),
                Arguments.of(12, "Genjutsu-no-kamae", 'k'),
                Arguments.of(-1, null, 'b'),
                Arguments.of(-1, "Shinobi", 'u'),
                Arguments.of(2, "120", "0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetIndexOf")
    void getIndexOf(int expectedInt, String str1, char x) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.getIndexOf(str1, x);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task 3. Метод возвращает булинное значение равенства строк, учитывая регистр.
    // В случае строки равной null возвращает false.
    static Stream<Arguments> provideArgumentsForIsStringsEquals() {
        return Stream.of(
                Arguments.of(true, "Hello", "Hello"),
                Arguments.of(false, "Kakashi", "Sasuke"),
                Arguments.of(false, "Genjutsu", ""),
                Arguments.of(false, null, "Sasuke"),
                Arguments.of(false, null, null),
                Arguments.of(false, "Sasuke", "sasuke")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsStringsEquals")
    void isStringsEquals(boolean expectedBoolean, String str1, String str2) {
        // GIVEN

        // WHEN
        boolean actualBoolean = StringUtil.isStringsEquals(str1, str2);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 4. Метод возвращает значение строки прописными буквами без пробелов в начале и конце значения.
    // В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForGetTrimmedUpperCase() {
        return Stream.of(
                Arguments.of("SAKURA", " sakura "),
                Arguments.of(null, null),
                Arguments.of("SAKURA", "sAkUrA     "),
                Arguments.of("SAKURA IS USEFUL", "   sakura is useful")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTrimmedUpperCase")
    void getTrimmedUpperCase(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getTrimmedUpperCase(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 5. Метод возвращает подстроку, начиная с 10 символа (index 9) длинной не более 23 символов.
    // Если строка меньше десяти символов возвращает пустую строку. В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForGetSubstringFromTen() {
        return Stream.of(
                Arguments.of("", "sakura"),
                Arguments.of(null, null),
                Arguments.of("u", "Orochimaru"),
                Arguments.of("u-sama is one of a lege", "Orochimaru-sama is one of a lege"),
                Arguments.of("u-sama is one of a lege", "Orochimaru-sama is one of a legendary sannins")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetSubstringFromTen")
    void getSubstringFromTen(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getSubstringFromTen(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

}
