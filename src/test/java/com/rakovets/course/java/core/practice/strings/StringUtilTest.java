package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void glueTest1() {
        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.glue("basil", "Aka");
        Assertions.assertEquals("basilAka", result);
    }
    @Test
    void glueTest2() {
        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.glue("", "");
        Assertions.assertEquals("", result);
    }
    @Test
    void glueTest3() {
        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.glue("basil", null);
        Assertions.assertEquals("", result);
    }
    @Test
    void glueTest4() {
        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.glue(null, "Aka");
        Assertions.assertEquals("", result);
    }
    @Test
    void glueTest5() {
        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.glue(null, null);
        Assertions.assertEquals("", result);
    }
    @Test
    void finedIndexXTest1() {
        StringUtil stringUtil = new StringUtil();
        String test = "labour has outlined plans to reform the system should it win power";

        int result = stringUtil.finedIndexX(test);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void finedIndexXTest2() {
        StringUtil stringUtil = new StringUtil();
        String test = "Mexico tightens ban on smoking in public places";

        int result = stringUtil.finedIndexX(test);
        Assertions.assertEquals(2, result);
    }
    @Test
    void finedIndexXTest3() {
        StringUtil stringUtil = new StringUtil();
        String test = "";

        int result = stringUtil.finedIndexX(test);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void finedIndexXTest4() {
        StringUtil stringUtil = new StringUtil();
        String test = null;

        int result = stringUtil.finedIndexX(test);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void finedIndexXTest5() {
        StringUtil stringUtil = new StringUtil();
        String test = "However, Mexico's legislation is considered to " +
                "be the most robust and wide-ranging in the Americas.";

        int result = stringUtil.finedIndexX(test);
        Assertions.assertEquals(11, result);
    }
}
