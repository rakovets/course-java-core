package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void glueTest1() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue("abc", "def");

        Assertions.assertEquals("abcdef", actual);
    }

    @Test
    void glueTest2() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue("123", "456");

        Assertions.assertEquals("123456", actual);
    }

    @Test
    void glueTest3() {
        StringUtil stringUtil = new StringUtil();

        String actual = stringUtil.glue("   a", "   b");

        Assertions.assertEquals("   a   b", actual);
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
    void characterAtIndexTest1() {
        StringUtil stringUtil = new StringUtil();
    }
}
