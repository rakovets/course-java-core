package com.rakovets.course.java.core.practice.strings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    @Test
    void glue() {
        // GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        // WHEN
        String actual1 = stringUtil.glue("Face", "Book");
        String actual2 = stringUtil.glue("20", "22");
        String actual3 = stringUtil.glue("Oct", "ober");
        //THEN
        Assertions.assertEquals("FaceBook", actual1);
        Assertions.assertEquals("2022", actual2);
        Assertions.assertEquals("October", actual3);
    }

    @Test
    void index() {
        // GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        // WHEN
        int actual1 = stringUtil.index("FaceBook", 'c');
        int actual2 = stringUtil.index("2022", '0');
        int actual3 = stringUtil.index("October", 'd');
        //THEN
        Assertions.assertEquals(2, actual1);
        Assertions.assertEquals(1, actual2);
        Assertions.assertEquals(-1, actual3);
    }

    @Test
    void equality() {
        // GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        // WHEN
        boolean actual1 = stringUtil.equality("FaceBook", "Facebook");
        boolean actual2 = stringUtil.equality("FaceBook", "FaceBook");
        boolean actual3 = stringUtil.equality("2022", "2021");
        //THEN
        Assertions.assertFalse(actual1);
        Assertions.assertTrue(actual2);
        Assertions.assertFalse(actual3);
    }

    @Test
    void editText() {
        // GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.spaces(" Hi Nick! ");
        String actual2 = stringUtil.spaces("YoUR name ");
        String actual3 = stringUtil.spaces(" YOur sUrname");
        //THEN
        Assertions.assertEquals("hi nick!", actual1);
        Assertions.assertEquals("your name", actual2);
        Assertions.assertEquals("your surname", actual3);
    }

    @Test
    void substring() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.extraction("Worldwide", 'W', 'w');
        String actual2 = stringUtil.extraction("Surname ", 'n', ' ');
        String actual3 = stringUtil.extraction("123", '1', '3');
        //THEN
        Assertions.assertEquals("World", actual1);
        Assertions.assertEquals("name", actual2);
        Assertions.assertEquals("12", actual3);
    }

    @Test
    void smiles() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.smiles(":(");
        //THEN
        Assertions.assertEquals(":)", actual1);
    }

    @Test
    void checkText() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        boolean actual1 = stringUtil.checkText("It was cold", "cold");
        boolean actual2 = stringUtil.checkText("Signature here. Signature", "Signature");
        boolean actual3 = stringUtil.checkText("Start with your example", "Start");
        //THEN
        Assertions.assertEquals(false, actual1);
        Assertions.assertEquals(true, actual2);
        Assertions.assertEquals(false, actual3);
    }

    @Test
    void vowels() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        int actual1 = stringUtil.amountVowels("It was cold");
        int actual2 = stringUtil.amountVowels("Signature here");
        int actual3 = stringUtil.amountVowels("Start with your example");
        //THEN
        Assertions.assertEquals(3, actual1);
        Assertions.assertEquals(6, actual2);
        Assertions.assertEquals(8, actual3);
    }

    @Test
    void amountPunctuation() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        int actual1 = stringUtil.amountPunctuation("It was cold - it was October!");
        int actual2 = stringUtil.amountPunctuation("Signature here, please");
        int actual3 = stringUtil.amountPunctuation("Start with your example, please!");
        //THEN
        Assertions.assertEquals(2, actual1);
        Assertions.assertEquals(1, actual2);
        Assertions.assertEquals(2, actual3);
    }

    @Test
    void palindrome() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        boolean actual1 = stringUtil.palindrome("tenet");
        boolean actual2 = stringUtil.palindrome("book");
        boolean actual3 = stringUtil.palindrome("Do geese see God?");
        //THEN
        Assertions.assertEquals(true, actual1);
        Assertions.assertEquals(false, actual2);
        Assertions.assertEquals(true, actual3);
    }

    static Stream<Arguments> splitString() {
        return Stream.of(
                Arguments.of("String", 2, new String[]{"St", "ri", "ng"}),
                Arguments.of("String", 3, new String[]{"Str", "ing"})
        );
    }

    @ParameterizedTest
    @MethodSource("splitString")
    void testGetArrayOfPartsOfString(String str, int n, String[] expected) {
        String[] actual = stringUtil.splitString(str, n);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void wordsCount() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        int actual1 = stringUtil.wordsCount("Do geese see God?");
        int actual2 = stringUtil.wordsCount("My name is Nikita");
        int actual3 = stringUtil.wordsCount("I live in a big city called Krasnoyarsk");
        //THEN
        Assertions.assertEquals(4, actual1);
        Assertions.assertEquals(4, actual2);
        Assertions.assertEquals(8, actual3);
    }

    @Test
    void initials() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.initials("Nikita Egorov");
        String actual2 = stringUtil.initials("nikita egorov");
        //THEN
        Assertions.assertEquals("NE", actual1);
        Assertions.assertEquals("NE", actual2);
    }

    @Test
    void numbersFromText() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.numbersFromText("You have 5 friends online now");
        String actual2 = stringUtil.numbersFromText("My address - Kurchatova 10, ap. 59");
        String actual3 = stringUtil.numbersFromText("It is 9 o'clock");
        //THEN
        Assertions.assertEquals("5", actual1);
        Assertions.assertEquals("1059", actual2);
        Assertions.assertEquals("9", actual3);
    }
}

