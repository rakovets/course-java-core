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

        Assertions.assertFalse(equality);
    }

    @Test
    void checkEqualTest2() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual("", "world");

        Assertions.assertFalse(equality);
    }

    @Test
    void checkEqualTest3() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual(null, "world");

        Assertions.assertFalse(equality);
    }

    @Test
    void checkEqualTest4() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual("world", null);

        Assertions.assertFalse(equality);
    }

    @Test
    void checkEqualTest5() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual("world", "world");

        Assertions.assertTrue(equality);
    }

    @Test
    void checkEqualTest6() {

        StringUtil stringUtil = new StringUtil();

        boolean equality = stringUtil.checkEqual(null, null);

        Assertions.assertFalse(equality);
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

    @Test
    void returnWithReplacementTest1() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.returnWithReplacement(":( Hello World! :(", '(', ')');

        Assertions.assertEquals(":) Hello World! :)", string);
    }

    @Test
    void returnWithReplacementTest2() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.returnWithReplacement(null, '(', ')');

        Assertions.assertEquals("String is empty", string);
    }

    @Test
    void returnWithReplacementTest3() {

        StringUtil stringUtil = new StringUtil();

        String string = stringUtil.returnWithReplacement(":) (: Hello World! :) (:", '(', ')');

        Assertions.assertEquals(":) ): Hello World! :) ):", string);
    }

    @Test
    void checkWordMatchesWithStartEndTest1() {

        StringUtil stringUtil = new StringUtil();

        boolean matches = stringUtil.checkWordMatchesWithStartEnd("Hello world", "world");

        Assertions.assertFalse(matches);
    }

    @Test
    void checkWordMatchesWithStartEndTest2() {

        StringUtil stringUtil = new StringUtil();

        boolean matches = stringUtil.checkWordMatchesWithStartEnd("World! Hello World", "World");

        Assertions.assertTrue(matches);
    }

    @Test
    void checkWordMatchesWithStartEndTest3() {

        StringUtil stringUtil = new StringUtil();

        boolean matches = stringUtil.checkWordMatchesWithStartEnd(null, "World");

        Assertions.assertFalse(matches);
    }

    @Test
    void checkWordMatchesWithStartEndTest4() {

        StringUtil stringUtil = new StringUtil();

        boolean matches = stringUtil.checkWordMatchesWithStartEnd("Hello", null);

        Assertions.assertFalse(matches);
    }

    @Test
    void checkWordMatchesWithStartEndTest5() {

        StringUtil stringUtil = new StringUtil();

        boolean matches = stringUtil.checkWordMatchesWithStartEnd("", "");

        Assertions.assertTrue(matches);
    }

    @Test
    void checkWordMatchesWithStartEndTest6() {

        StringUtil stringUtil = new StringUtil();

        boolean matches = stringUtil.checkWordMatchesWithStartEnd(null, null);

        Assertions.assertFalse(matches);
    }

    @Test
    void countNumberOfVowelsTest1() {

        StringUtil stringUtil = new StringUtil();

        int totalVowerls = stringUtil.countNumberOfVowels("Hello World");

        Assertions.assertEquals(3, totalVowerls);
    }

    @Test
    void countNumberOfVowelsTest2() {

        StringUtil stringUtil = new StringUtil();

        int totalVowerls = stringUtil.countNumberOfVowels("");

        Assertions.assertEquals(0, totalVowerls);
    }

    @Test
    void countNumberOfVowelsTest3() {

        StringUtil stringUtil = new StringUtil();

        int totalVowerls = stringUtil.countNumberOfVowels(null);

        Assertions.assertEquals(0, totalVowerls);
    }

    @Test
    void countTotalNumberPunctuationMarksTest1() {

        StringUtil stringUtil = new StringUtil();

        int TotalNumberPunctuationMarks = stringUtil.countTotalNumberPunctuationMarks(null);

        Assertions.assertEquals(0, TotalNumberPunctuationMarks);
    }

    @Test
    void countTotalNumberPunctuationMarksTest2() {

        StringUtil stringUtil = new StringUtil();

        int TotalNumberPunctuationMarks = stringUtil.countTotalNumberPunctuationMarks("");

        Assertions.assertEquals(0, TotalNumberPunctuationMarks);
    }

    @Test
    void countTotalNumberPunctuationMarksTest3() {

        StringUtil stringUtil = new StringUtil();

        int TotalNumberPunctuationMarks = stringUtil.countTotalNumberPunctuationMarks("World! Hello World!");

        Assertions.assertEquals(2, TotalNumberPunctuationMarks);
    }

    @Test
    void checkPalindromeTest1() {

        StringUtil stringUtil = new StringUtil();

        boolean checkPalindrome = stringUtil.checkPalindrome("deed de ed");

        Assertions.assertTrue(checkPalindrome);
    }

    @Test
    void checkPalindromeTest2() {

        StringUtil stringUtil = new StringUtil();

        boolean checkPalindrome = stringUtil.checkPalindrome("А Роза Упала На Лапу Азора");

        Assertions.assertTrue(checkPalindrome);
    }

    @Test
    void checkPalindromeTest3() {

        StringUtil stringUtil = new StringUtil();

        boolean checkPalindrome = stringUtil.checkPalindrome("Hello World!");

        Assertions.assertFalse(checkPalindrome);
    }

    @Test
    void checkPalindromeTest4() {

        StringUtil stringUtil = new StringUtil();

        boolean checkPalindrome = stringUtil.checkPalindrome("");

        Assertions.assertFalse(checkPalindrome);
    }

    @Test
    void checkPalindromeTest5() {

        StringUtil stringUtil = new StringUtil();

        boolean checkPalindrome = stringUtil.checkPalindrome(null);

        Assertions.assertFalse(checkPalindrome);
    }

    @Test
    void divideIntoEqualPartsTest1() {

        StringUtil stringUtil = new StringUtil();
        String text = "hhheeelllooo";
        int step = 3;

        String[] result = stringUtil.divideIntoEqualParts(text, step);
        String[] outPut = {"hhh", "eee", "lll", "ooo"};

        Assertions.assertArrayEquals(outPut, result);
    }

    @Test
    void divideIntoEqualPartsTest2() {

        StringUtil stringUtil = new StringUtil();
        String text = null;
        int step = 3;

        String[] result = stringUtil.divideIntoEqualParts(text, step);
        String[] outPut = {"not correct"};

        Assertions.assertArrayEquals(outPut, result);
    }

    @Test
    void divideIntoEqualPartsTest3() {

        StringUtil stringUtil = new StringUtil();
        String text = "";
        int step = 3;

        String[] result = stringUtil.divideIntoEqualParts(text, step);
        String[] outPut = {"not correct"};

        Assertions.assertArrayEquals(outPut, result);
    }

    @Test
    void divideIntoEqualPartsTest4() {

        StringUtil stringUtil = new StringUtil();
        String text = "hhheeelllooo";
        int step = 0;

        String[] result = stringUtil.divideIntoEqualParts(text, step);
        String[] outPut = {"not correct"};

        Assertions.assertArrayEquals(outPut, result);
    }

    @Test
    void divideIntoEqualPartsTest5() {

        StringUtil stringUtil = new StringUtil();
        String text = "hhheeelllooo";
        int step = 20;

        String[] result = stringUtil.divideIntoEqualParts(text, step);
        String[] outPut = {"not correct"};

        Assertions.assertArrayEquals(outPut, result);
    }

    @Test
    void sumWordsTest1() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords("Hello! Hello wold!");

        Assertions.assertEquals(3, text);
    }

    @Test
    void sumWordsTest2() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords(null);

        Assertions.assertEquals(0, text);
    }

    @Test
    void sumWordsTest3() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords("");

        Assertions.assertEquals(0, text);
    }

    @Test
    void sumWordsTest4() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords(" word");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsTest5() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords("word ");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsTest6() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords(" words with spaces ");

        Assertions.assertEquals(3, text);
    }

    @Test
    void sumWordsTest7() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords("words   with    many spaces");

        Assertions.assertEquals(4, text);
    }

    @Test
    void sumWordsTest8() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords(" ");

        Assertions.assertEquals(0, text);
    }

    @Test
    void sumWordsTest9() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWords("a");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsVersion1Test1() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1("Hello! Hello World!");

        Assertions.assertEquals(3, text);
    }

    @Test
    void sumWordsVersion1Test2() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1(null);

        Assertions.assertEquals(0, text);
    }

    @Test
    void sumWordsVersion1Test3() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1("");

        Assertions.assertEquals(0, text);
    }

    @Test
    void sumWordsVersion1Test4() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1("    ");

        Assertions.assertEquals(0, text);
    }

    @Test
    void sumWordsVersion1Test5() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1(" word");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsVersion1Test6() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1("word ");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsVersion1Test7() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1(" a");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsVersion1Test8() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1("a ");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsVersion1Test9() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1("     aaa aaaa    ");

        Assertions.assertEquals(2, text);
    }

    @Test
    void sumWordsVersion1Test10() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1("a");

        Assertions.assertEquals(1, text);
    }

    @Test
    void sumWordsVersion1Test11() {

        StringUtil stringUtil = new StringUtil();

        int text = stringUtil.sumWordsVersion1(" ");

        Assertions.assertEquals(0, text);
    }

    @Test
    void getInitialsTest1() {

        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.getInitials(null);

        Assertions.assertEquals("String is empty", result);
    }

    @Test
    void getInitialsTest2() {

        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.getInitials("");

        Assertions.assertEquals("String is empty", result);
    }

    @Test
    void getInitialsTest3() {

        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.getInitials(" ");

        Assertions.assertEquals("String is empty", result);
    }

    @Test
    void getInitialsTest4() {

        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.getInitials("Any oNE");

        Assertions.assertEquals("AO", result);
    }

    @Test
    void getInitialsTest5() {

        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.getInitials("  any   one   ");

        Assertions.assertEquals("AO", result);
    }

    @Test
    void getInitialsTest6() {

        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.getInitials("  any   one   ");

        Assertions.assertEquals("AO", result);
    }

    @Test
    void getInitialsTest7() {

        StringUtil stringUtil = new StringUtil();

        String result = stringUtil.getInitials("  ANY   ONE   ");

        Assertions.assertEquals("AO", result);
    }

    @Test
    void getTotalDigitsTest1() {

        StringUtil stringUtil = new StringUtil();

        String TotalDigits = stringUtil.getTotalDigits(null);

        Assertions.assertEquals("String is empty", TotalDigits);
    }

    @Test
    void getTotalDigitsTest2() {

        StringUtil stringUtil = new StringUtil();

        String TotalDigits = stringUtil.getTotalDigits("");

        Assertions.assertEquals("String is empty", TotalDigits);
    }

    @Test
    void getTotalDigitsTest3() {

        StringUtil stringUtil = new StringUtil();

        String TotalDigits = stringUtil.getTotalDigits(" ");

        Assertions.assertEquals("String is empty", TotalDigits);
    }

    @Test
    void getTotalDigitsTest4() {

        StringUtil stringUtil = new StringUtil();

        String TotalDigits = stringUtil.getTotalDigits("Hello World!");

        Assertions.assertEquals("", TotalDigits);
    }

    @Test
    void getTotalDigitsTest5() {

        StringUtil stringUtil = new StringUtil();

        String TotalDigits = stringUtil.getTotalDigits(" 4");

        Assertions.assertEquals("4", TotalDigits);
    }

    @Test
    void getTotalDigitsTest6() {

        StringUtil stringUtil = new StringUtil();

        String TotalDigits = stringUtil.getTotalDigits("4 ");

        Assertions.assertEquals("4", TotalDigits);
    }

    @Test
    void getTotalDigitsTest7() {

        StringUtil stringUtil = new StringUtil();

        String TotalDigits = stringUtil.getTotalDigits("1290 on 1390 5min ");

        Assertions.assertEquals("129013905", TotalDigits);
    }


    /*

    @Test
    void NAME_METHOD+Test+NUMBER() {

        StringUtil stringUtil = new StringUtil();

        TYPE VARIABLE = stringUtil.NAME_METHOD(INCOMING_DATA);

        Assertions.assertEquals(OUTPUT DATA, VARIABLE);
    }

     */
}
