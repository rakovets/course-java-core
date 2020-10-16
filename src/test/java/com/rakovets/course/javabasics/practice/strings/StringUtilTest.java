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
        Assertions.assertEquals(7, stringUtTest.getStringIndex("Coffe is the best", "S"));
        Assertions.assertEquals(-1, stringUtTest.getStringIndex("LIvE in BelArus is ...", "Z"));
    }
    @Test
    void getStringUpperAndTrimTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("HELLO", stringUtTest.getStringUpperAndTrim(" Hello "));
        Assertions.assertEquals("BELARUS", stringUtTest.getStringUpperAndTrim("BelarUs "));
        Assertions.assertEquals("ЦОЙ ЖИВ", stringUtTest.getStringUpperAndTrim("Цой жив "));
        Assertions.assertEquals("BRUTTO", stringUtTest.getStringUpperAndTrim("   brUtto  "));

    }

}
