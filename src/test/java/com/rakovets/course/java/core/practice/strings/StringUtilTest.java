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
    }

    @Test
    void testStringComparisonNegative() {
        testStringComparison("Holiday", "holiday", false);
    }

    void testStringComparison(String input1, String input2, boolean expected) {
        boolean actual = stringUtil.stringComparison(input1, input2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDeleteWhiteSpacesAndMakeUpperCasePositive() {
        testDeleteWhiteSpacesAndMakeUpperCase(" jdk23_java ", "JDK23_JAVA");
    }

    void testDeleteWhiteSpacesAndMakeUpperCase(String input, String expected) {
        String actual = stringUtil.deleteWhiteSpacesAndMakeUpperCase(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCutPartStringRandom() {
        testCutPartString("Wellcome", 2, 4, "ll");
        testCutPartString("testCutPartStringRandom", 5, 10, "utPar");
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

}
