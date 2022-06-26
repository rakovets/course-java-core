package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();

    @Test
    void testConcatTwoNumbers() {
        String actual = stringUtil.concat("123", "456");
        Assertions.assertEquals("123456", actual);
    }

    @Test
    void testConcatWithNull() {
        String actual = stringUtil.concat("null", "456");
        Assertions.assertEquals(null + "456", actual);
    }

    @Test
    void testFindSymbolIndex() {
        int actual = stringUtil.findSymbolIndex("house", "u");
        Assertions.assertEquals(2, actual);
    }

    @Test
    void testFindWithNoSymbolIndex() {
        int actual = stringUtil.findSymbolIndex("house", "g");
        Assertions.assertEquals(-1, actual);
    }

    @Test
    void testIsEquals() {
        boolean actual = stringUtil.isEquals("house", "house");
        Assertions.assertTrue(actual);
    }

    @Test
    void testTrim() {
        String actual = stringUtil.trim(" HoUsE  ");
        Assertions.assertEquals("house", actual);
    }

    @Test
    void testSubString() {
        String actual = stringUtil.subString("I very love Java", "ve", "va");
        Assertions.assertEquals("very love Ja", actual);
    }

    @Test
    void testReplace() {
        String actual = stringUtil.replace("very very sad :( :(");
        Assertions.assertEquals("very very sad :) :)", actual);
    }

    @Test
    void startWithTest() {
        boolean actual = stringUtil.startWith("mega my text", "mega");
        Assertions.assertTrue(actual);
    }

    @Test
    void vovelsCountTest() {
        int actual = stringUtil.vovelsCount("very yummy");
        Assertions.assertEquals(2, actual);
    }

    @Test
    void charsCount() {
        int actual = stringUtil.charsCount("Том, в школе было не очень жарко?");
        Assertions.assertEquals(2, actual);
    }
}
