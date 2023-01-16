package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void stringGlueTest() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringGlue("123","456");
        Assertions.assertEquals("123456", actual);
    }

    @Test
    void stringGlueTest2() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringGlue("","");
        Assertions.assertEquals("", actual);
    }

    @Test
    void stringGlueTest3() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringGlue(null,null);
        Assertions.assertEquals("", actual);
    }

    @Test
    void stringGlueTest4() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringGlue(null,"null");
        Assertions.assertEquals("", actual);
    }

    @Test
    void indexOfCharTest() {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.indexOfChar("Hello World. Count all letter o", 'e');
        Assertions.assertEquals(1, actual);
    }

    @Test
    void indexOfCharTest1() {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.indexOfChar("Hello World!", 'k');
        Assertions.assertEquals(-1, actual);
    }

    @Test
    void stringEqualsTest1() {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.stringEquals("Hello","Hello");
        Assertions.assertEquals(true,actual);
    }

    @Test
    void stringEqualsTest2() {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.stringEquals("Hello","hello");
        Assertions.assertEquals(false,actual);
    }

    @Test
    void stringEqualsTest3() {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.stringEquals("","");
        Assertions.assertEquals(true,actual);
    }

    @Test
    void stringEqualsTest4() {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.stringEquals("","hello");
        Assertions.assertEquals(false,actual);
    }

    @Test
    void stringTrimTest() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringTrim(" Hello World! ");
        Assertions.assertEquals("hello world!", actual);
    }

    @Test
    void stringTrimTest1() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringTrim("hello World! ");
        Assertions.assertEquals("hello world!", actual);
    }

    @Test
    void stringTrimTest2() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringTrim("  ");
        Assertions.assertEquals("", actual);
    }

    @Test
    void stringSubstringTest1() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringSubstring("Welcome to the team, buddy!",3,6);
        Assertions.assertEquals("com",actual);
    }

    @Test
    void stringReplaceTest() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringReplace("Hello :( Today will be a good day :(");
        Assertions.assertEquals("Hello :) Today will be a good day :)", actual);
    }

    @Test
    void stringReplaceTest1() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringReplace("Hello :) Today will be a good day :)");
        Assertions.assertEquals("Hello :) Today will be a good day :)", actual);
    }

    @Test
    void stringReplaceTest2() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.stringReplace("");
        Assertions.assertEquals("", actual);
    }
    @Test
    void stringMatchesTest() {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.stringMatches("Text check text","text");
        Assertions.assertEquals(true,actual);
    }

    @Test
    void countCharTest() {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.countChar(" Hi, What you name? Как тебя зовут");
        Assertions.assertEquals(6,actual);
    }

    @Test
    void countCharTest2() {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.countChar("Как тебя зовут");
        Assertions.assertEquals(0,actual);
    }

    @Test
    void countCharTest3() {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.countChar("");
        Assertions.assertEquals(0,actual);
    }

    @Test
    void countPunctuationTest() {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.countPunctuation("Hi,what you name? My name is Ira!");
        Assertions.assertEquals(3,actual);
    }

    @Test
    void countPunctuatioTest1() {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.countPunctuation("Hi - what you name : My name is Ira");
        Assertions.assertEquals(0,actual);
    }

    @Test
    void isPalindromeTest() {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.isPalindrome("Do geese see God");
        Assertions.assertEquals(true,actual);
    }

    @Test
    void isPalindromeTest1() {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.isPalindrome("deed");
        Assertions.assertEquals(true,actual);
    }

    @Test
    void getInitialsTest() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getInitials("Irina Protasevich");
        Assertions.assertEquals("IP",actual);
    }

    @Test
    void getInitialsTest1() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getInitials("Irina Protasevich Mihailovna");
        Assertions.assertEquals("IP",actual);
    }

    @Test
    void getInitialsTest2() {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getInitials(null);
        Assertions.assertEquals("It's empty String",actual);
    }
}

