package com.rakovets.course.java.core.practice.strings;



import com.rakovets.course.java.core.example.generics.model.restrict.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    //Task01
    @Test
    void testConcatination() {
        String actual = stringUtil.getConcatinatedString("First", "Test");
        Assertions.assertEquals("FirstTest", actual);
    }
    @Test
    void testConcatinationNotNull() {
        String actual = stringUtil.getConcatinatedString("", "");
        Assertions.assertEquals("", actual);
    }
    //Task02
    @Test
    void testGetIndexOfSymbol() {
        int actual = stringUtil.getIndexOfSymbol("Test Input", "I");
        Assertions.assertEquals(5, actual);
    }
    @Test
    void testEmptyString() {
        int actual = stringUtil.getIndexOfSymbol("Test Input", "T");
        Assertions.assertEquals(0, actual);
    }
    //Task03
    @Test
    void testIsEqualsStringTrue() {
        boolean actual = stringUtil.isEquals("Test", "Test");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testIsEqualsStringFalse() {
        boolean actual = stringUtil.isEquals("test", "Test");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    //Task04
    @Test
    void testGetTrimmedUpperCaseString() {
        String actual = stringUtil.getTrimmedStringInUpperCase(" Test ");
        String expected = "TEST";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testGetTrimmedUpperCaseStringWithSpaceInTheEnd() {
        String actual = stringUtil.getTrimmedStringInUpperCase("Test string ");
        String expected = "TEST STRING";
        Assertions.assertEquals(expected, actual);
    }
    //Task05
    @Test
    void testGetSubstringInSymbolRange() {
        String actual = stringUtil.getSubstringInSymbolRange("Test String", "T", " ");
        Assertions.assertEquals("Test", actual);
    }
    @Test
    void testGetEmptySubstringInSymbolRange() {
        String actual = stringUtil.getSubstringInSymbolRange(" ", " ", " ");
        Assertions.assertEquals("", actual);
    }
    //Test06
    @Test
    void testInvertedEmoji() {
        String actual = stringUtil.getInvertedEmoji(":)");
        Assertions.assertEquals(":(", actual);
    }
    @Test
    void testInvertedEmojiWithManyBraces() {
        String actual = stringUtil.getInvertedEmoji(":)))))");
        Assertions.assertEquals(":(((((", actual);
    }
    //Test07
    @Test
    void testIsBeginningTrue(){
        Boolean actual = stringUtil.isBeginning("Test string","Test");
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testIsBeginningFalse() {
        Boolean actual = stringUtil.isBeginning("Test string","test");
        Boolean expexted = false;
        Assertions.assertEquals(expexted, actual);
    }
    //Test08
    @Test
    void testGetAmountOfVowels() {
        int actual = stringUtil.getAmountOfVowels("VOWEEEELS");
        Assertions.assertEquals(5,actual);
    }
    @Test
    void testGetZeroAmountOfVowels() {
        int actual = stringUtil.getAmountOfVowels("Tst");
        Assertions.assertEquals(0,actual);
    }
    //Test09
    @Test
    void testGetSymbolsAmount() {
        int actual = stringUtil.getAmountOfSymbols(".,!?");
        Assertions.assertEquals(4,actual);
    }
    @Test
    void testGetDotsA() {
        int actual = stringUtil.getAmountOfSymbols(".....");
        Assertions.assertEquals(5,actual);
    }
    //Test09
    @Test
    void isWordPolindromeTrue() {
        boolean actual = stringUtil.isPalindrome("Stressed desserts");
        boolean expexted = true;
        Assertions.assertEquals(expexted,actual);
    }
    @Test
    void isWordPolindromeFalse() {
        boolean actual = stringUtil.isPalindrome("Stressed dessert");
        boolean expexted = false;
        Assertions.assertEquals(expexted,actual);
    }

}
