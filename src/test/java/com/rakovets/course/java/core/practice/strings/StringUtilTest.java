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

    @Test
    void extractSubstringFromNtoMTest1() {
        StringUtil stringUtil = new StringUtil();
        String str = "labour has outlined plans to reform the system should it win power";
        String expectedResult = "bour";

        String result = stringUtil.extractSubstringFromNtoM(str, 3, 6);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest2() {
        StringUtil stringUtil = new StringUtil();
        String str = "labour has outlined plans to reform the system should it win power";
        String expectedResult = "lined ";

        String result = stringUtil.extractSubstringFromNtoM(str, 15, 20);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest3() {
        StringUtil stringUtil = new StringUtil();
        String str = "labour has outlined plans to reform the system should it win power";
        String expectedResult = "has o";

        String result = stringUtil.extractSubstringFromNtoM(str, 8, 12);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest4() {
        StringUtil stringUtil = new StringUtil();
        String str = "";
        String expectedResult = "";

        String result = stringUtil.extractSubstringFromNtoM(str, 8, 12);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest5() {
        StringUtil stringUtil = new StringUtil();
        String str = null;
        String expectedResult = "";

        String result = stringUtil.extractSubstringFromNtoM(str, 8, 12);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void dontSadSmileTest1() {
        StringUtil stringUtil = new StringUtil();
        String str = "granny died :(:(:(";
        String expectedResult = "granny died :):):)";

        String result = stringUtil.dontSadSmile(str);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void dontSadSmileTest2() {
        StringUtil stringUtil = new StringUtil();
        String str = ":(:(:( I have lost your cat :(:(:(";
        String expectedResult = ":):):) I have lost your cat :):):)";

        String result = stringUtil.dontSadSmile(str);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void dontSadSmileTest3() {
        StringUtil stringUtil = new StringUtil();
        String str = "No, :( the scream's :( killed Sidney :(:(:(";
        String expectedResult = "No, :) the scream's :) killed Sidney :):):)";

        String result = stringUtil.dontSadSmile(str);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void finedFistWordInStringTest1() {
        StringUtil stringUtil = new StringUtil();
        String str = "However, Mexico's legislation is considered";
        String start = "However";

        boolean result = stringUtil.finedFistWordInString(str, start);
        Assertions.assertTrue(result);
    }

    @Test
    void finedFistWordInStringTest2() {
        StringUtil stringUtil = new StringUtil();
        String str = "labour has outlined plans to reform the system should it win power";
        String start = "labour has";

        boolean result = stringUtil.finedFistWordInString(str, start);
        Assertions.assertTrue(result);
    }

    @Test
    void finedFistWordInStringTest3() {
        StringUtil stringUtil = new StringUtil();
        String str = "However, Mexico's legislation is considered";
        String start = "legislation";

        boolean result = stringUtil.finedFistWordInString(str, start);
        Assertions.assertFalse(result);
    }

    @Test
    void finedFistWordInStringTest4() {
        StringUtil stringUtil = new StringUtil();
        String str = "";
        String start = "legislation";

        boolean result = stringUtil.finedFistWordInString(str, start);
        Assertions.assertFalse(result);
    }

    @Test
    void finedFistWordInStringTest5() {
        StringUtil stringUtil = new StringUtil();
        String str = null;
        String start = "legislation";

        boolean result = stringUtil.finedFistWordInString(str, start);
        Assertions.assertFalse(result);
    }

    @Test
    void countVowelsTest1() {
        StringUtil stringUtil = new StringUtil();
        String str = "labour has outlined plans";
        int result = stringUtil.countVowels(str);
        Assertions.assertEquals(9, result);
    }

    @Test
    void countVowelsTest2() {
        StringUtil stringUtil = new StringUtil();
        String str = "";
        int result = stringUtil.countVowels(str);
        Assertions.assertEquals(0, result);
    }

    @Test
    void countVowelsTest3() {
        StringUtil stringUtil = new StringUtil();
        String str = null;
        int result = stringUtil.countVowels(str);
        Assertions.assertEquals(0, result);
    }

    @Test
    void countVowelsTest4() {
        StringUtil stringUtil = new StringUtil();
        String str = "However, Mexico's legislation is considered";
        int result = stringUtil.countVowels(str);
        Assertions.assertEquals(16, result);
    }
    @Test
    void countPunctuationMarksTest1() {
        StringUtil stringUtil = new StringUtil();
        String str = "However, Mexico's legislation is considered!";
        int result = stringUtil.countPunctuationMarks(str);
        Assertions.assertEquals(2, result);
    }
    @Test
    void countPunctuationMarksTest2() {
        StringUtil stringUtil = new StringUtil();
        String str = "Mont Blanc, western Europe's highest mountain at 4,810 " +
                "metres (nearly 16,000 feet), attracts 20,000 hikers and skiers every year.";
        int result = stringUtil.countPunctuationMarks(str);
        Assertions.assertEquals(6, result);
    }
    @Test
    void countPunctuationMarksTest3() {
        StringUtil stringUtil = new StringUtil();
        String str = ",,,,,22222!!!!!11111,,,,,8888.....";
        int result = stringUtil.countPunctuationMarks(str);
        Assertions.assertEquals(20, result);
    }
}
