package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void glueTest() {
    StringUtil stringUtil = new StringUtil();

    String actual1 = stringUtil.glue("abc", "def");
    String actual2 = stringUtil.glue("123", "456");
    String actual3 = stringUtil.glue("   a", "   b");
    String actual4 = stringUtil.glue("", "");
    String actual5 = stringUtil.glue(null, null);

    Assertions.assertEquals("abcdef", actual1);
    Assertions.assertEquals("123456", actual2);
    Assertions.assertEquals("   a   b", actual3);
    Assertions.assertEquals("", actual4);
    Assertions.assertEquals("", actual5);
    }

    @Test
    void characterAtIndexTest() {
        StringUtil stringUtil = new StringUtil();
        int a = 1;
        int b = 2;
        int c = 3;


    }
}
