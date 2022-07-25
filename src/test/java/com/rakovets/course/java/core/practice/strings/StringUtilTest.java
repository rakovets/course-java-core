package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();

    @Test
    void testConcatWithTwoValues() {
        testConcat("123", "456", "123456");
    }

    @Test
    void testConcatWithOneValues() {
        testConcat("", "456", "456");
        testConcat("123", "", "123");
        testConcat(null, "456", "null456");
    }

    @Test
    void testConcatWithoutValues() {
        testConcat("", "", "");
    }

    void testConcat(String input1, String input2, String expected) {
        String actual = stringUtil.concat(input1, input2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIndexSymbolInStringPositive() {
        testIndexSymbolInString("Hard Work", "r", 2);
        testIndexSymbolInString("HaHahafff", "h", 4);
    }

    @Test
    void testIndexSymbolInStringNegative() {
        testIndexSymbolInString("Hard Work", "O", -1);
        testIndexSymbolInString("HaHahafff", "F", -1);
    }

    void testIndexSymbolInString(String input, String symbol, int expected) {
        int actual = stringUtil.indexSymbolInString(input, symbol);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStringComparisonPositive() {
        testStringComparison("holiday", "holiday", true);
        testStringComparison(" u i o ", " u i o ", true);
        testStringComparison(" ", " ", true);
        testStringComparison("", "", true);
        testStringComparison("* */", "* */", true);
    }

    @Test
    void testStringComparisonNegative() {
        testStringComparison("Holiday", "holiday", false);
        testStringComparison(" Holiday", "Holiday ", false);
        testStringComparison("Holiday ", " Holiday", false);
        testStringComparison("123 ", "123  ", false);
        testStringComparison("  12*", " 12*", false);
    }

    void testStringComparison(String input1, String input2, boolean expected) {
        boolean actual = stringUtil.stringComparison(input1, input2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDeleteWhiteSpacesAndMakeUpperCasePositive() {
        testDeleteWhiteSpacesAndMakeUpperCase(" jdk23_java ", "JDK23_JAVA");
        testDeleteWhiteSpacesAndMakeUpperCase("AaBBci ", "AABBCI");
        testDeleteWhiteSpacesAndMakeUpperCase("AaBB ci  ", "AABB CI");
        testDeleteWhiteSpacesAndMakeUpperCase("  Aa BBci ", "AA BBCI");
        testDeleteWhiteSpacesAndMakeUpperCase(" 12 5a ", "12 5A");
    }

    void testDeleteWhiteSpacesAndMakeUpperCase(String input, String expected) {
        String actual = stringUtil.deleteWhiteSpacesAndMakeUpperCase(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCutPartStringRandom() {
        testCutPartString("Wellcome", 2, 4, "ll");
        testCutPartString("testCutPartStringRandom", 5, 10, "utPar");
        testCutPartString(" We1 llcome", 0, 5, " We1 ");
        testCutPartString("By e !! ", 2, 8, " e !! ");
        testCutPartString("BY", 1, 2, "Y");
    }

    void testCutPartString(String input, int indexStart, int indexEnd, String expected) {
        String actual = stringUtil.cutPartString(input, indexStart, indexEnd);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReplaceEmodjiDanceRandom() {
        testReplaceEmodjiDance("WEL:(CoME:(!", ":(", ":)", "WEL:)CoME:)!");
        testReplaceEmodjiDance("WEL:))CoME):(!", ":(", ":)", "WEL:))CoME):)!");
    }

    void testReplaceEmodjiDance(String input, String emodjiOld, String emodjiNew, String expected) {
        String actual = stringUtil.replaceEmodjiDance(input, emodjiOld, emodjiNew);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCheckEqualBeginStringPositive() {
        testCheckEqualBeginString("Hello Java", "Hello", true);
        testCheckEqualBeginString(" Java vs Python", " Java ", true);
        testCheckEqualBeginString("1 1 * Hello Java", "1 1 * ", true);
        testCheckEqualBeginString("Hello", "Hello", true);
        testCheckEqualBeginString("", "", true);
        testCheckEqualBeginString(" ", "", true);
    }

    @Test
    void testCheckEqualBeginStringNegative() {
        testCheckEqualBeginString(" Hello Java", "Hello", false);
        testCheckEqualBeginString("Java vs Python", " Java ", false);
        testCheckEqualBeginString("1 1 * Hello Java", "1 1  ", false);
        testCheckEqualBeginString("Hello", "Hello ", false);
        testCheckEqualBeginString("", " ", false);
        testCheckEqualBeginString(" *", "*", false);
    }

    void testCheckEqualBeginString(String text, String word, boolean expected) {
        boolean actual = stringUtil.checkEqualBeginString(text, word);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNumberVowelLetterRandom() {
        testNumberVowelLetter(" Hello Java", 4);
        testNumberVowelLetter("Belarus BY", 4);
        testNumberVowelLetter(" BY Belarus BY ", 5);
        testNumberVowelLetter("Blrs BBB", 0);
        testNumberVowelLetter("", 0);
        testNumberVowelLetter("aAeEiIoOuUyY", 12);
    }

    void testNumberVowelLetter(String text, int expected) {
        int actual = stringUtil.numberVowelLetter(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNumberPunctuationMarkRandom() {
        testNumberPunctuationMark(" Hello Java!)", 1);
        testNumberPunctuationMark("Belarus, BY...", 4);
        testNumberPunctuationMark(" BY. Belarus. BY.@? ", 4);
        testNumberPunctuationMark("Blrs BBB", 0);
        testNumberPunctuationMark(" ", 0);
        testNumberPunctuationMark(" /.,? ? $;:! ", 5);
    }

    void testNumberPunctuationMark(String text, int expected) {
        int actual = stringUtil.numberPunctuationMark(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStringPalindromePositive() {
        testStringPalindrome("DeeD", true);
        testStringPalindrome("Deed", true);
        testStringPalindrome("1991 ", true);
        testStringPalindrome("Dos So s s o d ", true);
        testStringPalindrome(" gg O g    g ", true);
        testStringPalindrome(" 45 U 5 4 ", true);

    }

    @Test
    void testStringPalindromeNegative() {
        testStringPalindrome("DeeDd", false);
        testStringPalindrome("d Deed", false);
        testStringPalindrome("195691 ", false);
    }

    @Test
    void testStringPalindromeEmptyOrNull() {
        testStringPalindrome(" ", false);
        testStringPalindrome(null, false);
    }

    void testStringPalindrome(String text, boolean expected) {
        boolean actual = stringUtil.stringPalindrome(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSplitStringPartsRandom() {
        testSplitStringParts("Hello, my friend!", 3, new String[]
                {"Hel", "lo,", " my", " fr", "ien", "d!"});
        testSplitStringParts(" Hard to learn, easy in Java!", 5, new String[]
                {" Hard", " to l", "earn,", " easy", " in J", "ava!"});
    }

    void testSplitStringParts(String text, int n, String[] expected) {
        String[] actual = stringUtil.splitStringParts(text, n);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testNumberStringsTextRandom() {
        testNumberStringsText("Hello Java", 2);
        testNumberStringsText("  He    llo     Java    ", 3);
        testNumberStringsText("22 2    Hello  *  Java   ", 5);
        testNumberStringsText("", 0);
        testNumberStringsText(" ", 0);
        testNumberStringsText(null, 0);
    }

    void testNumberStringsText(String text, int expected) {
        int actual = stringUtil.numberStringsText(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testInitialsFirstLastNamesRandom() {
        testInitialsFirstLastNames("Salenkou Andrei", "SA");
        testInitialsFirstLastNames("salenkou andrei", "SA");
        testInitialsFirstLastNames(" Salenkou      Andrei", "SA");
        testInitialsFirstLastNames("   SaleNkou      andrei  ", "SA");
        testInitialsFirstLastNames("DmitRY  rakOVets", "DR");
    }

    void testInitialsFirstLastNames(String text, String expected) {
        String actual = stringUtil.initialsFirstLastNames(text);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReturnDigitsFromStringRandom() {
        testReturnDigitsFromString("12 Hello 55 Java 33", "125533");
        testReturnDigitsFromString("   1 2 Hello 5 5 Java 3 3  ", "125533");
        testReturnDigitsFromString("Hello Java", "");
    }

    void testReturnDigitsFromString(String text, String expected) {
        String actual = stringUtil.returnDigitsFromString(text);

        Assertions.assertEquals(expected, actual);
    }
}
