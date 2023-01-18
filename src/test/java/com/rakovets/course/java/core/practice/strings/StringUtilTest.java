package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void glueTest1() {

        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue("123", "456");

        Assertions.assertEquals("123456", actual);
    }

    @Test
    void glueTest2() {

        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue(null, "456");

        Assertions.assertEquals("", actual);
    }

    @Test
    void glueTest3() {

        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue("123", null);

        Assertions.assertEquals("", actual);
    }

    @Test
    void glueTest4() {

        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue("", "");

        Assertions.assertEquals("", actual);
    }

    @Test
    void glueTest5() {

        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue(null, null);

        Assertions.assertEquals("", actual);
    }

    @Test
    void findSymbolIndexTest1() {

        StringUtil stringUtil = new StringUtil();

        int index = stringUtil.findSymbolIndex("Hello world", 'x');

        Assertions.assertEquals(-1, index);
    }

    @Test
    void findSymbolIndexTest2() {

        StringUtil stringUtil = new StringUtil();

        int index = stringUtil.findSymbolIndex("Hello world", 'H');

        Assertions.assertEquals(0, index);
    }

    @Test
    void findSymbolIndexTest3() {

        StringUtil stringUtil = new StringUtil();

        int index = stringUtil.findSymbolIndex("Hello world", 'h');

        Assertions.assertEquals(-1, index);
    }

    @Test
    void findSymbolIndexTest4() {

        StringUtil stringUtil = new StringUtil();

        int index = stringUtil.findSymbolIndex("Hello world", 'l');

        Assertions.assertEquals(2, index);
    }

    @Test
    void findSymbolIndexTest5() {

        StringUtil stringUtil = new StringUtil();

        int index = stringUtil.findSymbolIndex("", 'x');

        Assertions.assertEquals(-1, index);
    }

    @Test
    void findSymbolIndexTest6() {

        StringUtil stringUtil = new StringUtil();

        int index = stringUtil.findSymbolIndex(null, 'x');

        Assertions.assertEquals(-1, index);
    }

    @Test
    void findSymbolIndexTest7() {

        StringUtil stringUtil = new StringUtil();

        int index = stringUtil.findSymbolIndex("Hello world", ' ');

        Assertions.assertEquals(5, index);
    }

    @Test
    void checkEqualTest1() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual("Hello", "world");

        Assertions.assertEquals(false, equality);
    }

    @Test
    void checkEqualTest2() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual("", "world");

        Assertions.assertEquals(false, equality);
    }

    @Test
    void checkEqualTest3() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual(null, "world");

        Assertions.assertEquals(false, equality);
    }

    @Test
    void checkEqualTest4() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual("world", null);

        Assertions.assertEquals(false, equality);
    }

    @Test
    void checkEqualTest5() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual("world", "world");

        Assertions.assertEquals(true, equality);
    }

    @Test
    void checkEqualTest6() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual(null, null);

        Assertions.assertEquals(false, equality);
    }

    @Test
    void removeSpacesTest1() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.removeSpaces("   Hello World!  ");

        Assertions.assertEquals("Hello World!", string);
    }

    @Test
    void removeSpacesTest2() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.removeSpaces("     ");

        Assertions.assertEquals("", string);
    }

    @Test
    void removeSpacesTest3() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.removeSpaces("");

        Assertions.assertEquals("", string);
    }

    @Test
    void removeSpacesTest4() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.removeSpaces(null);

        Assertions.assertEquals("String is empty", string);
    }

    @Test
    void extractSubstringTest1() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring("Hello World!", 1, 6);

        Assertions.assertEquals("Hello", string);
    }

    @Test
    void extractSubstringTest2() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring(null, 1, 6);

        Assertions.assertEquals("String is empty", string);
    }

    @Test
    void extractSubstringTest3() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring("", 1, 6);

        Assertions.assertEquals("String is empty", string);
    }

    @Test
    void extractSubstringTest4() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring("Hello World!", 6, 1);

        Assertions.assertEquals("Invalid character number", string);
    }

    @Test
    void extractSubstringTest5() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring("Hello World!", 1, 61);

        Assertions.assertEquals("Invalid character number", string);
    }

    @Test
    void extractSubstringTest6() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring("Hello World!", 1, 12);

        Assertions.assertEquals("Hello World", string);
    }

    @Test
    void extractSubstringTest7() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring("Hello World!", 1, 2);

        Assertions.assertEquals("H", string);
    }

    @Test
    void extractSubstringTest8() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.extractSubstring("Hello World!", 1, 1);

        Assertions.assertEquals("Invalid character number", string);
    }
}
