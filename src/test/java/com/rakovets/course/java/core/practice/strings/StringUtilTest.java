package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void glueTextTest1() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glueText("abc", "def");

        Assertions.assertEquals("abcdef", actual);
    }

    @Test
    void glueTextTest2() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glueText("123", "456");

        Assertions.assertEquals("123456", actual);
    }

    @Test
    void glueTextTest3() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glueText("   a", "   b");

        Assertions.assertEquals("   a   b", actual);
    }

    @Test
    void glueTextTest4() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glueText("", "");

        Assertions.assertEquals("", actual);
    }

    @Test
    void glueTextTest5() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glueText(null, null);

        Assertions.assertNull(actual);
    }

    @Test
    void characterAtIndexTest1() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.indexOfChar('i', "police");

        Assertions.assertEquals(actual, 3);
    }

    @Test
    void characterAtIndexTest2() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.indexOfChar('w', "police");

        Assertions.assertEquals(actual, -1);
    }

    @Test
    void characterAtIndexTest3() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.indexOfChar('w', "");

        Assertions.assertEquals(actual, -1);
    }

    @Test
    void characterAtIndexTest4() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.indexOfChar('w', null);

        Assertions.assertEquals(actual, -1);
    }

    @Test
    void equalsStringsTest1() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings("police", "police");

        Assertions.assertTrue(actual);
    }

    @Test
    void equalsStringsTest2() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings("policeman", "police");

        Assertions.assertFalse(actual);
    }

    @Test
    void equalsStringsTest3() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings("", "");

        Assertions.assertTrue(actual);
    }

    @Test
    void equalsStringsTest4() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings(null, "police");

        Assertions.assertFalse(actual);
    }

    @Test
    void equalsStringsTest5() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings(null, null);

        Assertions.assertTrue(actual);
    }

    @Test
    void trimSpacesTest1() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.trimSpaces(" man");

        Assertions.assertEquals(actual, "man");
    }

    @Test
    void trimSpacesTest2() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.trimSpaces("man ");

        Assertions.assertEquals(actual, "man");
    }

    @Test
    void trimSpacesTest3() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.trimSpaces(" man ");

        Assertions.assertEquals(actual, "man");
    }

    @Test
    void trimSpacesTest4() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.trimSpaces(null);

        Assertions.assertNull(actual);
    }

    @Test
    void symbolsExtractionTest1() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.symbolsExtraction('c', 'e', "abcdefg");

        Assertions.assertEquals(actual, "cde");
    }

    @Test
    void symbolsExtractionTest2() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.symbolsExtraction('u', 'P', "Open up! Police!");

        Assertions.assertEquals(actual, "up! P");
    }

    @Test
    void emojiReplacementTest1(){
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.emojiReplacement(":(:(");

        Assertions.assertEquals(actual, ":):)");
    }

    @Test
    void emojiReplacementTest2(){
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.emojiReplacement(":( :(");

        Assertions.assertEquals(actual, ":) :)");
    }

    @Test
    void emojiReplacementTest3(){
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.emojiReplacement(":(((((:(");

        Assertions.assertEquals(actual, ":)((((:)");
    }

    @Test
    void startsAndEndsWithWordTest1() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.startsAndEndsWithWord("alfa beta alfa", "alfa");

        Assertions.assertTrue(actual);
    }

    @Test
    void startsAndEndsWithWordTest2() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.startsAndEndsWithWord("alfa beta omega", "alfa");

        Assertions.assertFalse(actual);
    }

    @Test
    void startsAndEndsWithWordTest3() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.startsAndEndsWithWord("alfA beTa AlFa", "alfa");

        Assertions.assertTrue(actual);
    }

    @Test
    void startsAndEndsWithWordTest4() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.startsAndEndsWithWord("omega beta alfa", "alfa");

        Assertions.assertFalse(actual);
    }

    @Test
    void startsAndEndsWithWordTest5() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.startsAndEndsWithWord("alfa beta alfa", "ALFA");

        Assertions.assertTrue(actual);
    }

    @Test
    void vowelsCountTest1() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.vowelsCount("policeman");

        Assertions.assertEquals(actual,4);
    }

    @Test
    void vowelsCountTest2() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.vowelsCount("Zzzz");

        Assertions.assertEquals(actual,0);
    }

    @Test
    void vowelsCountTest3() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.vowelsCount("POLICEMAN");

        Assertions.assertEquals(actual,4);
    }

    @Test
    void punctuationMarksCountTest1() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.punctuationMarksCount("FBI! Open up!");

        Assertions.assertEquals(actual, 2);
    }

    @Test
    void punctuationMarksCountTest2() {
        StringUtil stringUtil = new StringUtil();

        int actual = stringUtil.punctuationMarksCount("FBI! Open up! Is this true? Yes, open the door.");

        Assertions.assertEquals(actual, 5);
    }

    @Test
    void IsPalindromeTest1() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.IsPalindrome("radar");

        Assertions.assertTrue(actual);
    }

    @Test
    void IsPalindromeTest2() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.IsPalindrome("Anna");

        Assertions.assertTrue(actual);
    }

    @Test
    void IsPalindromeTest3() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.IsPalindrome("orange");

        Assertions.assertFalse(actual);
    }

    @Test
    void nGetArrayTest1() {
        StringUtil stringUtil = new StringUtil();

        String[] actual = stringUtil.nGetArray(5, "I am proud");
        String[] expected = new String[2];
        expected[0] = "I am ";
        expected[1] = "proud";

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void nGetArrayTest2() {
        StringUtil stringUtil = new StringUtil();

        String[] actual = stringUtil.nGetArray(1, "abc");
        String[] expected = new String[3];
        expected[0] = "a";
        expected[1] = "b";
        expected[2] = "c";

        Assertions.assertArrayEquals(expected, actual);
    }
}
