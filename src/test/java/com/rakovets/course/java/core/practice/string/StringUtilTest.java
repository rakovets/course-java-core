package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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

   // task 6. Метод заменяет в строке все сочетания символов ":(" на ":)".
    // В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForReplaceSadEmoji() {
        return Stream.of(
                Arguments.of(":)", ":("),
                Arguments.of(null, null),
                Arguments.of("Happy day :)", "Happy day :("),
                Arguments.of("(::::)(((", "(::::(((("),
                Arguments.of(";( :-( v:)v : (", ";( :-( v:(v : (")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReplaceSadEmoji")
    void replaceSadEmoji(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.replaceSadEmoji(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 7. Метод возвращает булинное значение true, если параметр строки начинает и заканчивается с параметра слова.
    // В случае строки или слова равным null возвращает false. Метод учитывает регистр параметров.
    static Stream<Arguments> provideArgumentsForDoesStringStartsAndEndsWithWord() {
        return Stream.of(
                Arguments.of(true, "Hello", "Hello"),
                Arguments.of(true, "King is dead. Hail the King", "King"),
                Arguments.of(false, " King is dead. Hail the King ", " King"),
                Arguments.of(false, null, "King"),
                Arguments.of(false, "King", null),
                Arguments.of(false, "King", "king")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDoesStringStartsAndEndsWithWord")
    void doesStringStartsAndEndsWithWord(boolean expectedBoolean, String str1, String str2) {
        // GIVEN

        // WHEN
        boolean actualBoolean = StringUtil.doesStringStartsAndEndsWithWord(str1, str2);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 8. Метод возвращает количество гласных букв в заданной строке (для английского языка).
    // В случае строки равной null возвращает -1.
    static Stream<Arguments> provideArgumentsForGetNumberOfVowels() {
        return Stream.of(
                Arguments.of(2, "Hello"),
                Arguments.of(15, "King Arthur was a great warrior defending England."),
                Arguments.of(0, "С русским языком не работаем"),
                Arguments.of(-1, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetNumberOfVowels")
    void getNumberOfVowels(int expectedInt, String str1) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.getNumberOfVowels(str1);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task 9. Метод возвращает количество всех точек, запятых и восклицательных знаков в строке.
    // В случае строки равной null возвращает -1.
    static Stream<Arguments> provideArgumentsForGetNumberOfPunctuationMarks() {
        return Stream.of(
                Arguments.of(0, "Hello"),
                Arguments.of(7, "Wait!!! I suggest we keep it between ourselves, shall we? I beg you... "),
                Arguments.of(2, "Для кириллицы тоже ок, круто же!"),
                Arguments.of(-1, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetNumberOfPunctuationMarks")
    void getNumberOfPunctuationMarks(int expectedInt, String str1) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.getNumberOfPunctuationMarks(str1);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //task 10. Метод возвращает булинное значение того, является ли введённая строка палиндромом.
    // В случае строки равной null возвращает false.
    static Stream<Arguments> provideArgumentsForIsPalindrome() {
        return Stream.of(
                Arguments.of(true, "Rotator"),
                Arguments.of(true, "No lemon - no melon"),
                Arguments.of(false, "King"),
                Arguments.of(false, null),
                Arguments.of(true, "Eva, can I see bees in a cave?")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPalindrome")
    void isPalindrome(boolean expectedBoolean, String str1) {
        // GIVEN

        // WHEN
        boolean actualBoolean = StringUtil.isPalindrome(str1);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 11. Метод разбивает строку на равные части по n символов возвращает массив из этих частей
    // В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForSplitByIndex() {
        return Stream.of(
                Arguments.of(new String []{"123","456", "789", "0"}, "1234567890", 3),
                Arguments.of(new String []{"abcde","fghij", "klmno", "pqrst", "uvwxy","z"}, "abcdefghijklmnopqrstuvwxyz", 5),
                Arguments.of(new String []{"H","e", "l", "l", "o"}, "Hello", 1),
                Arguments.of(new String []{"Several"}, "Several", 7),
                Arguments.of(null, null, 1),
                Arguments.of(null, "Hello", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSplitByIndex")
    void splitByIndex(String[] expectedString, String str1, int n) {
        // GIVEN

        // WHEN
        String[] actualString = StringUtil.splitByIndex(str1, n);

        // THAT
        assertArrayEquals(expectedString, actualString);
    }

    //task 12. Метод возвращает количество слов в тексте.
    // В случае строки равной null возвращает -1.
    static Stream<Arguments> provideArgumentsForGetNumberOfWords() {
        return Stream.of(
                Arguments.of(1, "  Hello "),
                Arguments.of(13, "Wait!!! I suggest we keep it between ourselves, shall we? I beg you... "),
                Arguments.of(2, "  Sam, * - : +  look! "),
                Arguments.of(-1, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetNumberOfWords")
    void getNumberOfWords(int expectedInt, String str1) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.getNumberOfWords(str1);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task 13. Метод возвращает инициалы в формате Ф.И.О при заданной строке с именем, фамилией и отчеством.
    // В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForGetInitials() {
        return Stream.of(
                Arguments.of("G.A.S", "Anastasia Gawriljuk Sergeevna"),
                Arguments.of(null, null),
                Arguments.of("G.S.V", "sergei grinkevich vitaljevich")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetInitials")
    void getInitials(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getInitials(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 14. Метод возвращает строку, которая содержит все имеющиеся в тексте цифры.
    // В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForGetOnlyDigits() {
        return Stream.of(
                Arguments.of("", "Sasuke"),
                Arguments.of(null, null),
                Arguments.of("375298974562", "tel: +37529 8974562; "),
                Arguments.of("301236", "ЕKkjd  3e0n}! @12#e3 els?6")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetOnlyDigits")
    void getOnlyDigits(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getOnlyDigits(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
}
