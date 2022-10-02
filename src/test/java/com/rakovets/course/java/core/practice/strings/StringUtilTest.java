package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void testGlue() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.glue("123", "456");
        //THEN
        Assertions.assertEquals("123456", actual);
    }

    @Test
    void testGlueFirstStringIsEmpty() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.glue("", "456");
        //THEN
        Assertions.assertEquals("456", actual);
    }

    @Test
    void testGlueSecondStringIsEmpty() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.glue("123", "");
        //THEN
        Assertions.assertEquals("123", actual);
    }

    @Test
    void testGlueFirstStringIsNull() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.glue(null, "456");
        //THEN
        Assertions.assertEquals("null456", actual);
    }

    @Test
    void testGlueSecondStringIsNull() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.glue("123", null);
        //THEN
        Assertions.assertEquals("123null", actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testIndexSearch() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        int actual = stringUtil.indexSearch("Mutter", "u");
        //THEN
        Assertions.assertEquals(1, actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testSameStrings() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        boolean actual = stringUtil.sameStrings("Bread", "Bread");
        //THEN
        Assertions.assertTrue(actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testModifiedString() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.modifiedString(" Bread  ");
        //THEN
        Assertions.assertEquals("bread", actual);
    }

    @Test
    void testModifiedString1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.modifiedString(" SnoW       ");
        //THEN
        Assertions.assertEquals("snow", actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testSubString() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.subString("com.rakovets.course.java.core.practice.strings", 2, 7);
        //THEN
        Assertions.assertEquals("m.rak", actual);
    }

    @Test
    void testSubString1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.subString("I found out that I have a huge family", 1, 15);
        //THEN
        Assertions.assertEquals(" found out tha", actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testGetSmile() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.getSmile(":():))):(:)):((:):():)(:)(");
        //THEN
        Assertions.assertEquals(":)):))):):)):)(:):)):)(:)(", actual);
    }

    @Test
    void testGetSmile1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.getSmile(":(summer :()())::((::is:):finish((:)(snow");
        //THEN
        Assertions.assertEquals(":)summer :))())::)(::is:):finish((:)(snow", actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testGetStartEndAboutWord() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        boolean actual = stringUtil.getStartEndAboutWord("I love my daughter I", "I");
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void testGetStartEndAboutWord1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        boolean actual = stringUtil.getStartEndAboutWord("I love my daughter ", "I");
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void testGetStartEndAboutWord2() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        boolean actual = stringUtil.getStartEndAboutWord("bzsjfjasjkakabz", "bz");
        //THEN
        Assertions.assertTrue(actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testGetNumberOfVowelsInAWord() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        int actual = stringUtil.getNumberOfVowelsInAWord("Rakovets course-java-corePublic");
        //THEN
        Assertions.assertEquals(12, actual);
    }

    @Test
    void testGetNumberOfVowelsInAWord1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        int actual = stringUtil.getNumberOfVowelsInAWord("Java – Method toLowerCase() - ProgLang");
        //THEN
        Assertions.assertEquals(11, actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testGetNumberOfPunctuationMarks() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        int actual = stringUtil.getNumberOfPunctuationMarks("They teach us to be kind, clever, polite, hardworking, friendly.");
        //THEN
        Assertions.assertEquals(5, actual);
    }

    @Test
    void testGetNumberOfPunctuationMarks1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        int actual = stringUtil.getNumberOfPunctuationMarks("They !teach us to? be! kind, clever, polite, hardworking, friendly.");
        //THEN
        Assertions.assertEquals(8, actual);
    }

    @Test
    void testGetNumberOfPunctuationMarks2() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        int actual = stringUtil.getNumberOfPunctuationMarks("null");
        //THEN
        Assertions.assertEquals(0, actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testGetIsPalindrome() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        boolean actual = stringUtil.getIsPalindrome("null");
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void testGetIsPalindrome1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        boolean actual = stringUtil.getIsPalindrome("Do geese see God!");
        //THEN
        Assertions.assertTrue(actual);
    }

    /////////////////////////////////////////////////////////////////////////
    @Test
    void testGetBreakAString() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String[] actual = stringUtil.getBreakAString("Do geese see God!", 2);
        //THEN
        Assertions.assertArrayEquals(new String[]{"Do", " g", "ee", "se", " s", "ee", " G", "od", "!"}, actual);
    }

    @Test
    void testGetBreakAString1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String[] actual = stringUtil.getBreakAString("", 3);
        //THEN
        Assertions.assertArrayEquals(new String[]{}, actual);
    }

    @Test
    void testGetBreakAString2() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String[] actual = stringUtil.getBreakAString("abcdefgw", 2);
        //THEN
        Assertions.assertArrayEquals(new String[]{"ab", "cd", "ef", "gw"}, actual);
    }
    /////////////////////////////////////////////////////////////////////////

    @Test
    void testGetNumberOfWords() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String[] actual = stringUtil.getNumberOfWords("Давай поговорим о методе String split");
        //THEN
        Assertions.assertArrayEquals(new String[]{"Давай", "поговорим", "о", "методе", "String", "split"}, actual);
    }

    @Test
    void testGetNumberOfWords1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String[] actual = stringUtil.getNumberOfWords("Давай   поговорим о    методе");
        //THEN
        Assertions.assertArrayEquals(new String[]{"Давай", "поговорим", "о", "методе"}, actual);
    }

    @Test
    void testGetNumberOfWords2() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String[] actual = stringUtil.getNumberOfWords("  ");
        //THEN
        Assertions.assertArrayEquals(new String[]{""}, actual);
    }
    /////////////////////////////////////////////////////////////////////////

    @Test
    void testGetInitials() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.getInitials("Aleksashov Oleg");
        //THEN
        Assertions.assertEquals("AO", actual);
    }

    @Test
    void testGetInitials1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.getInitials("aleksashov oleg");
        //THEN
        Assertions.assertEquals("AO", actual);
    }
    /////////////////////////////////////////////////////////////////////////
    @Test
    void testGetAllDigit() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.getAllDigit("ale19ksa06shov88oleg");
        //THEN
        Assertions.assertEquals("190688", actual);
    }

    @Test
    void testGetAllDigit1() {
        //GIVEN
        StringUtil stringUtil = new StringUtil();
        //WHEN
        String actual = stringUtil.getAllDigit("Alice is at home");
        //THEN
        Assertions.assertEquals("", actual);
    }
}

