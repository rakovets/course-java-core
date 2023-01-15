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
    @Test
    void equivalentToTest1() {
        StringUtil stringUtil = new StringUtil();
        String str1 = "However, Mexico's legislation is considered";
        String str2 = "However, Mexico's legislation is considered";

        boolean result = stringUtil.equivalentTo(str1, str2);
        Assertions.assertTrue(result);
    }
    @Test
    void equivalentToTest2() {
        StringUtil stringUtil = new StringUtil();
        String str1 = "However, Mexico's legislation is considered";
        String str2 = "However, Mexico's legislation is considered to";

        boolean result = stringUtil.equivalentTo(str1, str2);
        Assertions.assertFalse(result);
    }
    @Test
    void equivalentToTest3() {
        StringUtil stringUtil = new StringUtil();
        String str1 = null;
        String str2 = "However, Mexico's legislation is considered";

        boolean result = stringUtil.equivalentTo(str1, str2);
        Assertions.assertFalse(result);
    }
    @Test
    void equivalentToTest4() {
        StringUtil stringUtil = new StringUtil();
        String str1 = "However, Mexico's legislation is considered";
        String str2 = null;

        boolean result = stringUtil.equivalentTo(str1, str2);
        Assertions.assertFalse(result);
    }
    @Test
    void equivalentToTest5() {
        StringUtil stringUtil = new StringUtil();
        String str1 = "";
        String str2 = "";

        boolean result = stringUtil.equivalentTo(str1, str2);
        Assertions.assertTrue(result);
    }
    @Test
    void trimAndToUpperTest1() {
        StringUtil stringUtil = new StringUtil();
        String str1 = "   labour has outlined plans to reform the system should it win power   ";
        String wait = "LABOUR HAS OUTLINED PLANS TO REFORM THE SYSTEM SHOULD IT WIN POWER";

        String result = stringUtil.trimAndToUpper(str1);
        Assertions.assertEquals(wait, result);
    }
    @Test
    void trimAndToUpperTest2() {
        StringUtil stringUtil = new StringUtil();
        String str1 = "";

        String result = stringUtil.trimAndToUpper(str1);
        Assertions.assertEquals("", result);
    }
    @Test
    void trimAndToUpperTest3() {
        StringUtil stringUtil = new StringUtil();
        String str1 = null;

        String result = stringUtil.trimAndToUpper(str1);
        Assertions.assertEquals("", result);
    }
}
