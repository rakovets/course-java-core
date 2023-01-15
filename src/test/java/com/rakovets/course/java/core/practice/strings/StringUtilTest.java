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

        Assertions.assertEquals(null, actual);
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

        Assertions.assertEquals(actual, true);
    }

    @Test
    void equalsStringsTest2() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings("policeman", "police");

        Assertions.assertEquals(actual, false);
    }

    @Test
    void equalsStringsTest3() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings("", "");

        Assertions.assertEquals(actual, true);
    }

    @Test
    void equalsStringsTest4() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings(null, "police");

        Assertions.assertEquals(actual, false);
    }

    @Test
    void equalsStringsTest5() {
        StringUtil stringUtil = new StringUtil();

        boolean actual = stringUtil.equalsStrings(null, null);

        Assertions.assertEquals(actual, true);
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

        Assertions.assertEquals(actual, null);
    }
}
