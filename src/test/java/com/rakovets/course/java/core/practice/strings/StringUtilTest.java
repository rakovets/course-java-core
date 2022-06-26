package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.channels.AsynchronousServerSocketChannel;

public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();

    //Task01
    void testUnion(String input1, String input2, String expected) {
        String actual = stringUtil.union(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingMethodUnion() {
        testUnion("hello", "world", "helloworld");
    }

    //Task02
    void testFindingIndexOfSymbol(String string, char symbol, int expected) {
        int actual = stringUtil.findIndexOfSymbol(string, symbol);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingMethodFindingIndexOfSymbol() {
        testFindingIndexOfSymbol("Six", 'x', 2);
        testFindingIndexOfSymbol("Six", 'a', -1);
    }

    //Task03
    void testMakeToUppercase(String string, String expected) {
        String actual = stringUtil.makeToUppercase(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingMethodCompare() {
        testCompare("One", "One", true);
        testCompare("One", "Zero", false);
    }

    //Task04
    void testCompare(String input1, String input2, boolean expected) {
        boolean actual = stringUtil.compare(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingMakeToUppercase() {
        testMakeToUppercase(" HellO ", "HELLO");
    }

    //Task05
    void testMakeNewString(String string, int beginIndex, int endIndex, String expected) {
        String actual = stringUtil.makeNewString(string, beginIndex, endIndex);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingMakeNewString() {
        testMakeNewString("Umbrella", 2, 6, "brel");
    }

    //Task06
    void testMakeFunnyEmoji(String string, String expected) {
        String actual = stringUtil.makeFunnyEmoji(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingMakeFunnyString() {
        testMakeFunnyEmoji("Goodbuy:(", "Goodbuy:)");
    }

    //Task07
    void testIsEndAndStartWithWord(String string, String word, boolean expected) {
        boolean actual = stringUtil.isEndAndStartWithWord(string, word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingIsEndAndStartWithWord() {
        testIsEndAndStartWithWord("HIwolrdHI", "HI", true);
        testIsEndAndStartWithWord("HIworldBUY", "HI", false);
    }

    //Task08
    void testCheckEnglishLetters(String string, boolean expected) {
        boolean actual = stringUtil.checkEnglishLetters(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCheckEnglishLetters() {
        testCheckEnglishLetters("Привет Josh", true);
        testCheckEnglishLetters("Привет Джош", false);
    }

    //Task09
    void testGetCountPunctuationMarks(String string, int expected) {
        int actual = stringUtil.getCountPunctuationMarks(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetCountPunctuationMarks() {
        testGetCountPunctuationMarks("Hello, how are you?", 2);
    }

    //Task10
    void testIsPalindrome(String string, boolean expected) {
        boolean actual = stringUtil.isPalindrome(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingIsPalindrome() {
        testIsPalindrome("Do geese see God?", true);
    }

    //Task11
    void testSplitStringIntoParts(String string, int countSymbolsInParts, String[] expected) {
        String actual[] = stringUtil.splitStringIntoParts(string, 2);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testingSplitStringIntoParts() {
        testSplitStringIntoParts("Four", 2, new String[]{"Fo", "ur"});
    }

    //Task12
    void testGetCountOfWord(String string, int expected) {
        int actual = stringUtil.getCountOfWord(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetCountOfWord() {
        testGetCountOfWord("Hello world, today   are great day!", 6);
    }

    //Task13
    void testGetInitials(String string, String expected) {
        String actual = stringUtil.getInitials(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetInitials() {
        testGetInitials("Yegor Kharitonchik", "YK");
    }

    //Task14
    void testGetStringWithAllDigits(String string, String expected) {
        String actual = stringUtil.getStringWithAllDigits(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetStringWithAllDigits() {
        testGetStringWithAllDigits("My telephone 1459087236", "My telephone 1459087236");
    }

    //Task15
    void testGetDifferentLetters(String firstString, String secondString, String expected) {
        String actual = stringUtil.getDifferentLetters(firstString, secondString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetDifferentLetters() {
        testGetDifferentLetters("information", "motivation", "ntvfr");
    }

    //Task16
    void testIsElemetsSame(String[] firstArray, String[] secondArray, boolean expected) {
        boolean actual = stringUtil.isElemetsSame(firstArray, secondArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingIsElementsSame() {
        testIsElemetsSame(new String[]{"1", "2", "3"}, new String[]{"2", "3", "1"}, true);
    }

    //Task18

    void testMakeShorter(String string, String expected) {
        String actual = stringUtil.makeShorter(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingMakeShorter() {
        testMakeShorter("aaabbcdeef", "abcdef");
    }

    //Task02
    void testCalculateLatinDates(String string, String expected) {
        String actual = stringUtil.calculateLatinDates(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCalculateLatinDates() {
        testCalculateLatinDates("CM", "900");
    }
}
