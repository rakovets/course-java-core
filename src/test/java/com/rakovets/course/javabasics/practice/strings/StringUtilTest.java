package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    void getConcatStringsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("Hello World", stringUtTest.getConcatStrings("Hello", "World"));
        Assertions.assertEquals("Welcome to Hell", stringUtTest.getConcatStrings("Welcome to", "Hell"));
        Assertions.assertEquals("BLARUS IS LIVING", stringUtTest.getConcatStrings("BLARUS", "IS LIVING"));
    }

    @Test
    void getStringEqualTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(true, stringUtTest.getStringEqual("Hello", "Hello"));
        Assertions.assertEquals(false, stringUtTest.getStringEqual("Hello ", "Hello"));
        Assertions.assertEquals(false, stringUtTest.getStringEqual("Hello", "hello"));
        Assertions.assertEquals(false, stringUtTest.getStringEqual("HELLO", "Hello"));
    }

    @Test
    void StringEqualTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(-1, stringUtTest.getStringIndex("Hello", "z"));
        Assertions.assertEquals(7,  stringUtTest.getStringIndex("Coffe is the best", "S"));
        Assertions.assertEquals(-1, stringUtTest.getStringIndex("LIvE in BelArus is ...", "Z"));
    }

    @Test
    void getStringUpperAndTrimTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("HELLO", stringUtTest.getStringUpperAndTrim(" Hello "));
        Assertions.assertEquals("BELARUS", stringUtTest.getStringUpperAndTrim("BelarUs     "));
        Assertions.assertEquals("ЦОЙ ЖИВ", stringUtTest.getStringUpperAndTrim("Цой жив "));
        Assertions.assertEquals("BRUTTO", stringUtTest.getStringUpperAndTrim("   brUtto  "));
    }

    @Test
    void getStringSubstringTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("ия нашей страны", stringUtTest.getStringSubstring("Приватизация нашей страны"));
        Assertions.assertEquals("12345678901234567890123", stringUtTest.getStringSubstring("1234567890123456789012345678901234567890"));
        Assertions.assertEquals("1234567890", stringUtTest.getStringSubstring("12345678901234567890"));
        Assertions.assertEquals("<10", stringUtTest.getStringSubstring("123456789"));
    }

    @Test
    void getStringReplace() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("Hello :)", stringUtTest.getStringReplace("Hello :("));
        Assertions.assertEquals("Hello :)(", stringUtTest.getStringReplace("Hello :(("));
        Assertions.assertEquals(":): Hello :)", stringUtTest.getStringReplace(":(: Hello :("));
    }

    @Test
    void getStringCompareTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(true, stringUtTest.getStringCompare("live is live", "live"));
        Assertions.assertEquals(false, stringUtTest.getStringCompare("Live is good!", "Live"));
        Assertions.assertEquals(false, stringUtTest.getStringCompare("The Best of The Best", "Best"));
        Assertions.assertEquals(false, stringUtTest.getStringCompare(" Live is live ", "live"));
    }

    @Test
    void getStringNumbersOfVowelsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(5, stringUtTest.getStringNumbersOfVowels("live is live"));
        Assertions.assertEquals(6, stringUtTest.getStringNumbersOfVowels("Belarus Is Living"));
    }

    @Test
    void getStringNumbersOfSimbolsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(2, stringUtTest.getStringNumbersOfSimbols("live is live!!"));
        Assertions.assertEquals(3, stringUtTest.getStringNumbersOfSimbols("Belarus, Is Living.."));
        Assertions.assertEquals(5, stringUtTest.getStringNumbersOfSimbols("!!live, .. s live"));
    }

    @Test
    void getStringReversTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("ALLA", stringUtTest.getStringRevers("ALLA"));
        Assertions.assertEquals("level", stringUtTest.getStringRevers("level"));
        Assertions.assertEquals("sagas", stringUtTest.getStringRevers("sagas"));
    }

    @Test
    void getStringArraysNumbersTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertArrayEquals(new String[]{"1234", "5678", "90"}, stringUtTest.getStringArraysNumbers("1234567890", 4));
        Assertions.assertArrayEquals(new String[]{"00", "00", "00", "00", "00", "00", "00", "00"}, stringUtTest.getStringArraysNumbers("0000000000000000", 2));
    }

    @Test
    void getStringNubersWordsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(6, stringUtTest.getStringNumbersOfWords("We are waiting for the Changes!"));
        Assertions.assertEquals(4, stringUtTest.getStringNumbersOfWords(" Hello Hello   Hello  Hello "));
    }

    @Test
    void getAbriviatureTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertArrayEquals(new String[]{"Z.","D.","I"}, stringUtTest.getAbbreviation("Zmachinskiy dzmitry Ivanovich"));
        Assertions.assertArrayEquals(new String[]{"I.","O.","B"}, stringUtTest.getAbbreviation("ivanov Oleg bedrosovich"));
    }

    @Test
    void getStringNumbersTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("235670", stringUtTest.getStringNumbers("dsfjslfj23lk5lk67llk0"));
        Assertions.assertEquals("32083839", stringUtTest.getStringNumbers("32the United08 /3839 states"));

    }
}
