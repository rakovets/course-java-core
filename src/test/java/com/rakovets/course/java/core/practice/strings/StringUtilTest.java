package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    static StringUtil stringUtil;

    @BeforeAll
    static void init() {
        stringUtil = new StringUtil();
    }

    @Test
    void glueTest1() {
        String result = stringUtil.glue("basil", "Aka");

        Assertions.assertEquals("basilAka", result);
    }

    @Test
    void glueTest2() {
        String result = stringUtil.glue("", "");

        Assertions.assertEquals("", result);
    }

    @Test
    void glueTest3() {
        String result = stringUtil.glue("basil", null);

        Assertions.assertEquals("", result);
    }

    @Test
    void glueTest4() {
        String result = stringUtil.glue(null, "Aka");

        Assertions.assertEquals("", result);
    }

    @Test
    void glueTest5() {
        String result = stringUtil.glue(null, null);

        Assertions.assertEquals("", result);
    }

    @Test
    void finedIndexXTest1() {
        String test = "labour has outlined plans to reform the system should it win power";

        int result = stringUtil.finedIndexX(test, 'x');

        Assertions.assertEquals(-1, result);
    }

    @Test
    void finedIndexXTest2() {
        String test = "Mexico tightens ban on smoking in public places";

        int result = stringUtil.finedIndexX(test, 'x');

        Assertions.assertEquals(2, result);
    }

    @Test
    void finedIndexXTest3() {
        String test = "";

        int result = stringUtil.finedIndexX(test, 'x');

        Assertions.assertEquals(-1, result);
    }

    @Test
    void finedIndexXTest4() {
        String test = null;

        int result = stringUtil.finedIndexX(test, 'x');

        Assertions.assertEquals(-1, result);
    }

    @Test
    void finedIndexXTest5() {
        String test = "However, Mexico's legislation is considered to " +
                "be the most robust and wide-ranging in the Americas.";

        int result = stringUtil.finedIndexX(test, 'x');

        Assertions.assertEquals(11, result);
    }

    @Test
    void equivalentToTest1() {
        String str1 = "However, Mexico's legislation is considered";
        String str2 = "However, Mexico's legislation is considered";

        boolean result = stringUtil.equivalentTo(str1, str2);

        Assertions.assertTrue(result);
    }

    @Test
    void equivalentToTest2() {
        String str1 = "However, Mexico's legislation is considered";
        String str2 = "However, Mexico's legislation is considered to";

        boolean result = stringUtil.equivalentTo(str1, str2);

        Assertions.assertFalse(result);
    }

    @Test
    void equivalentToTest3() {
        String str1 = null;
        String str2 = "However, Mexico's legislation is considered";

        boolean result = stringUtil.equivalentTo(str1, str2);

        Assertions.assertFalse(result);
    }

    @Test
    void equivalentToTest4() {
        String str1 = "However, Mexico's legislation is considered";
        String str2 = null;

        boolean result = stringUtil.equivalentTo(str1, str2);

        Assertions.assertFalse(result);
    }

    @Test
    void equivalentToTest5() {
        String str1 = "";
        String str2 = "";

        boolean result = stringUtil.equivalentTo(str1, str2);

        Assertions.assertTrue(result);
    }

    @Test
    void trimAndToUpperTest1() {
        String str1 = "   labour has outlined plans to reform the system should it win power   ";
        String wait = "LABOUR HAS OUTLINED PLANS TO REFORM THE SYSTEM SHOULD IT WIN POWER";

        String result = stringUtil.trimAndToUpper(str1);

        Assertions.assertEquals(wait, result);
    }

    @Test
    void trimAndToUpperTest2() {
        String str1 = "";

        String result = stringUtil.trimAndToUpper(str1);

        Assertions.assertEquals("", result);
    }

    @Test
    void trimAndToUpperTest3() {
        String str1 = null;

        String result = stringUtil.trimAndToUpper(str1);

        Assertions.assertEquals("", result);
    }

    @Test
    void extractSubstringFromNtoMTest1() {
        String str = "labour has outlined plans to reform the system should it win power";
        String expectedResult = "bour";

        String result = stringUtil.extractSubstringFromNtoM(str, 3, 6);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest2() {
        String str = "labour has outlined plans to reform the system should it win power";
        String expectedResult = "lined ";

        String result = stringUtil.extractSubstringFromNtoM(str, 15, 20);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest3() {
        String str = "labour has outlined plans to reform the system should it win power";
        String expectedResult = "has o";

        String result = stringUtil.extractSubstringFromNtoM(str, 8, 12);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest4() {
        String str = "";
        String expectedResult = "";

        String result = stringUtil.extractSubstringFromNtoM(str, 8, 12);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void extractSubstringFromNtoMTest5() {
        String str = null;
        String expectedResult = "";

        String result = stringUtil.extractSubstringFromNtoM(str, 8, 12);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void dontSadSmileTest1() {
        String str = "granny died :(:(:(";
        String expectedResult = "granny died :):):)";

        String result = stringUtil.dontSadSmile(str);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void dontSadSmileTest2() {
        String str = ":(:(:( I have lost your cat :(:(:(";
        String expectedResult = ":):):) I have lost your cat :):):)";

        String result = stringUtil.dontSadSmile(str);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void dontSadSmileTest3() {
        String str = "No, :( the scream's :( killed Sidney :(:(:(";
        String expectedResult = "No, :) the scream's :) killed Sidney :):):)";

        String result = stringUtil.dontSadSmile(str);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void equalFistLastWordsTest1() {
        String text = "However Mexico's legislation is considered However";
        String word = "However";

        boolean result = stringUtil.equalFistLastWords(text, word);

        Assertions.assertTrue(result);
    }

    @Test
    void equalFistLastWordsTest2() {
        String text = "labour has outlined plans to reform the system should it win power LABOUR";
        String word = "labour";

        boolean result = stringUtil.equalFistLastWords(text, word);

        Assertions.assertTrue(result);
    }

    @Test
    void equalFistLastWordsTest3() {
        String text = "However, Mexico's legislation is considered";
        String word = "However";

        boolean result = stringUtil.equalFistLastWords(text, word);

        Assertions.assertFalse(result);
    }

    @Test
    void equalFistLastWordsTest4() {
        String text = "";
        String word = "legislation";

        boolean result = stringUtil.equalFistLastWords(text, word);

        Assertions.assertFalse(result);
    }

    @Test
    void equalFistLastWordsTest5() {
        String text = null;
        String word = "legislation";

        boolean result = stringUtil.equalFistLastWords(text, word);

        Assertions.assertFalse(result);
    }

    @Test
    void countVowelsTest1() {
        String str = "labour has outlined plans";

        int result = stringUtil.countVowels(str);

        Assertions.assertEquals(9, result);
    }

    @Test
    void countVowelsTest2() {
        String str = "";

        int result = stringUtil.countVowels(str);

        Assertions.assertEquals(0, result);
    }

    @Test
    void countVowelsTest3() {
        String str = null;

        int result = stringUtil.countVowels(str);

        Assertions.assertEquals(0, result);
    }

    @Test
    void countVowelsTest4() {
        String str = "However, Mexico's legislation is considered";

        int result = stringUtil.countVowels(str);

        Assertions.assertEquals(16, result);
    }

    @Test
    void countPunctuationMarksTest1() {
        String str = "However, Mexico's legislation is considered!";

        int result = stringUtil.countPunctuationMarks(str);

        Assertions.assertEquals(2, result);
    }

    @Test
    void countPunctuationMarksTest2() {
        String str = "Mont Blanc, western Europe's highest mountain at 4,810 " +
                "metres (nearly 16,000 feet), attracts 20,000 hikers and skiers every year.";

        int result = stringUtil.countPunctuationMarks(str);

        Assertions.assertEquals(6, result);
    }

    @Test
    void countPunctuationMarksTest3() {
        String str = ",,,,,22222!!!!!11111,,,,,8888.....";

        int result = stringUtil.countPunctuationMarks(str);

        Assertions.assertEquals(20, result);
    }

    @Test
    void isItPalindromeTest1() {
        String str = "Do geese see God";

        boolean result = stringUtil.isItPalindrome(str);

        Assertions.assertTrue(result);
    }

    @Test
    void isItPalindromeTest2() {
        String str = "1991";

        boolean result = stringUtil.isItPalindrome(str);


        Assertions.assertTrue(result);
    }

    @Test
    void isItPalindromeTest3() {
        String str = "deed";

        boolean result = stringUtil.isItPalindrome(str);


        Assertions.assertTrue(result);
    }

    @Test
    void isItPalindromeTest4() {
        String str = "Deeeeeeeesd";

        boolean result = stringUtil.isItPalindrome(str);

        Assertions.assertFalse(result);
    }

    @Test
    void countWordsTest1() {
        String str = "Mont Blanc, western Europe's highest mountain at 4,810";

        int result = stringUtil.countWords(str);

        Assertions.assertEquals(8, result);
    }

    @Test
    void countWordsTest2() {
        String str = "labour has outlined plans to reform the system should it win power";

        int result = stringUtil.countWords(str);

        Assertions.assertEquals(12, result);
    }

    @Test
    void countWordsTest3() {
        String str = "labour has outlined plans to reform the system should it win power   ";

        int result = stringUtil.countWords(str);

        Assertions.assertEquals(12, result);
    }

    @Test
    void getInitialsTest1() {
        String firstNameSecondName = "Arthas Menethil";

        String result = stringUtil.getInitials(firstNameSecondName);

        Assertions.assertEquals("AM", result);
    }

    @Test
    void getInitialsTest2() {
        String firstNameSecondName = "sarah kerrigan";

        String result = stringUtil.getInitials(firstNameSecondName);

        Assertions.assertEquals("SK", result);
    }

    @Test
    void getInitialsTest3() {
        String firstNameSecondName = "jim Raynor";

        String result = stringUtil.getInitials(firstNameSecondName);

        Assertions.assertEquals("JR", result);
    }

    @Test
    void getAllNumbers() {
        String textWithNumber = "Mont Blanc, western Europe's highest mountain at 4810";

        String result = stringUtil.getAllNumbers(textWithNumber);

        Assertions.assertEquals("4810", result);
    }

    @Test
    void getAllNumbers2() {
        String textWithNumber = "Mont12 Blanc, 34western Europe's780 highest mountain at 4810";

        String result = stringUtil.getAllNumbers(textWithNumber);

        Assertions.assertEquals("12347804810", result);
    }

    @Test
    void getAllNumbers3() {
        String textWithNumber = "11However, 888Mexico's legislation999 is considered66";

        String result = stringUtil.getAllNumbers(textWithNumber);

        Assertions.assertEquals("1188899966", result);
    }

    @Test
    void getSubstringsTest() {
        String str = "ttttjjjjkkkkllll";
        int numberSubstrings = 4;

        String[] result = stringUtil.getSubstrings(str, numberSubstrings);
        String[] expect = {"tttt", "jjjj", "kkkk", "llll"};

        Assertions.assertArrayEquals(expect, result);
    }

    @Test
    void getSubstringsTest2() {
        String str = "aaabbbsssrrrtttyyy";
        int numberSubstrings = 6;

        String[] result = stringUtil.getSubstrings(str, numberSubstrings);
        String[] expect = {"aaabbb", "sssrrr", "tttyyy"};

        Assertions.assertArrayEquals(expect, result);
    }

    @Test
    void getSubstringsTest3() {
        String str = "Hello I am Johnny ";
        int numberSubstrings = 6;

        String[] result = stringUtil.getSubstrings(str, numberSubstrings);
        String[] expect = {"Hello ", "I am J", "ohnny "};

        Assertions.assertArrayEquals(expect, result);
    }
}
