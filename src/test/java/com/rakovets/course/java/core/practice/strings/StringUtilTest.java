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
    void FindSymbolIndexTest1() {

        StringUtil stringUtil = new StringUtil();

        int result = stringUtil.FindSymbolIndex("Hello world", 'x');

        Assertions.assertEquals(-1, result);
    }

    @Test
    void FindSymbolIndexTest2() {

        StringUtil stringUtil = new StringUtil();

        int result = stringUtil.FindSymbolIndex("Hello world", 'H');

        Assertions.assertEquals(0, result);
    }

    @Test
    void FindSymbolIndexTest3() {

        StringUtil stringUtil = new StringUtil();

        int result = stringUtil.FindSymbolIndex("Hello world", 'h');

        Assertions.assertEquals(-1, result);
    }

    @Test
    void FindSymbolIndexTest4() {

        StringUtil stringUtil = new StringUtil();

        int result = stringUtil.FindSymbolIndex("Hello world", 'l');

        Assertions.assertEquals(2, result);
    }

    @Test
    void FindSymbolIndexTest5() {

        StringUtil stringUtil = new StringUtil();

        int result = stringUtil.FindSymbolIndex("", 'x');

        Assertions.assertEquals(-1, result);
    }

    @Test
    void FindSymbolIndexTest6() {

        StringUtil stringUtil = new StringUtil();

        int result = stringUtil.FindSymbolIndex(null, 'x');

        Assertions.assertEquals(-1, result);
    }

    @Test
    void FindSymbolIndexTest7() {

        StringUtil stringUtil = new StringUtil();

        int result = stringUtil.FindSymbolIndex("Hello world", ' ');

        Assertions.assertEquals(5, result);
    }
}
