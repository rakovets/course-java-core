package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();
    String str;

    @Test
    void testConcatWithTwoValues() {
        verifyConcat("123", "456", "123456");
    }

    @Test
    void testConcatWithEmptyValue() {
        verifyConcat("Java", "", "Java");
    }

    @Test
    void testConcatWithBothNulls() {
        verifyConcat(null, null, null);
    }

    @Test
    void testConcatWithFirstNull() {
        verifyConcat("11", null, "11");
    }

    @Test
    void testConcatWithSecondNull() {
        verifyConcat(null, "12", "12");
    }

    void verifyConcat(String str1, String str2, String expected) {
        String actual = stringUtil.concat(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetIndexOfSymbolMiddle() {
        verifyGetIndexOfSymbol("Hello", 'l', 2);
    }

    @Test
    void testGetIndexOfSymbolBeginning() {
        verifyGetIndexOfSymbol("Java", 'J', 0);
    }

    @Test
    void testGetIndexOfSymbolEnd() {
        verifyGetIndexOfSymbol("Git", 't', 2);
    }

    @Test
    void testGetIndexNoSymbol() {
        verifyGetIndexOfSymbol("Java", 'e', -1);
    }

    @Test
    void testGetIndexNullString() {
        verifyGetIndexOfSymbol(null, 'e', -1);
    }

    void verifyGetIndexOfSymbol(String str, char symbol, int expected) {
        int actual = stringUtil.getIndexOfSymbol(str, symbol);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsEqual() {
        verifyIsEqual("Hello", "Hello", true);
    }

    @Test
    void testIsNotEqual() {
        verifyIsEqual("Java", "java", false);
    }

    @Test
    void testEqualBothNullStrings() {
        verifyIsEqual(null, null, true);
    }

    @Test
    void testEqualFirstNullString() {
        verifyIsEqual(null, "Java", false);
    }

    @Test
    void testEqualSecondNullString() {
        verifyIsEqual("Java", null, false);
    }

    void verifyIsEqual(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.isEqual(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTrimSpaceToLowerCaseLetters() {
        verifyGetTrimSpaceToLowerCase("   Hello    ", "hello");
    }

    @Test
    void testGetTrimSpaceToLowerCaseDigits() {
        verifyGetTrimSpaceToLowerCase("    15 45   ", "15 45");
    }

    @Test
    void testGetTrimSpaceToLowerCaseNoSpaces() {
        verifyGetTrimSpaceToLowerCase("1515", "1515");
    }

    @Test
    void testGetTrimSpaceToLowerCaseNull() {
        verifyGetTrimSpaceToLowerCase(null, null);
    }

    void verifyGetTrimSpaceToLowerCase(String str, String expected) {
        String actual = stringUtil.getTrimSpaceToLowerCase(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSubstring() {
        verifyGetSubstring("Hello Java", 'J', 'v', "Ja");
    }

    @Test
    void testGetSubstringNoFirstSymbol() {
        verifyGetSubstring("Git", '5', 't', "");
    }

    @Test
    void testGetSubstringNoSecondSymbol() {
        verifyGetSubstring("git", 'g', '4', "");
    }

    @Test
    void testGetSubstringNoSymbols() {
        verifyGetSubstring("Git", '3', '5', "");
    }

    void verifyGetSubstring(String str, char firstSymbol, char secondSymbol, String expected) {
        String actual = stringUtil.getSubstring(str, firstSymbol, secondSymbol);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReplace() {
        verifyReplace("Hello Java:(", ":(", ":)", "Hello Java:)");
    }

    @Test
    void testReplaceParenthesisCheck() {
        verifyReplace("Hello()))))):) Ja()va:((", ":(", ":)", "Hello()))))):) Ja()va:)(");
    }

    @Test
    void testReplaceNullNewValue() {
        verifyReplace("opp:(", ":(", null, "opp");
    }

    @Test
    void testReplaceNullOLdValue() {
        verifyReplace("opp:(", null, "5", "opp:(");
    }

    @Test
    void testReplaceNullString() {
        verifyReplace(null, "4", "5", null);
    }

    void verifyReplace(String str, String oldValue, String newValue, String expected) {
        String actual = stringUtil.replace(str, oldValue, newValue);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStartAndEndWithWordRegisterCheck() {
        verifyStartAndEndWithWord("Hello,Java,Hello", "hello", false);
    }

    @Test
    void testStartAndEndWithWord() {
        verifyStartAndEndWithWord("Hello,Java,Hello", "Hello", true);
    }

    @Test
    void testStartAndEndWithWordOnlyStart() {
        verifyStartAndEndWithWord("Hello,Java", "Hello", false);
    }

    @Test
    void testStartAndEndWithWordOnlyEnd() {
        verifyStartAndEndWithWord("Java, hello", "hello", false);
    }

    @Test
    void testStartAndEndWithWordNullText() {
        verifyStartAndEndWithWord(null, "hello", false);
    }

    @Test
    void testStartAndEndWithWordNullWord() {
        verifyStartAndEndWithWord("hello", null, false);
    }

    void verifyStartAndEndWithWord(String str1, String word, Boolean expected) {
        Boolean actual = stringUtil.isStartAndEndWithWord(str1, word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountVowels() {
        verifyCountVowels("Hello", 2);
    }

    @Test
    void testCountVowelsRegisterCheck() {
        verifyCountVowels("GIT is SOFTWARE for tracking changes", 10);
    }

    @Test
    void testCountVowelsNullString() {
        verifyCountVowels(null, 0);
    }

    void verifyCountVowels(String str, int expected) {
        int actual = stringUtil.countVowels(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPunctuationMarks() {
        verifyPunctuationMarks("Hello, Java!?.", 4);
    }

    @Test
    void testPunctuationMarksNullString() {
        verifyPunctuationMarks(null, 0);
    }

    void verifyPunctuationMarks(String str1, int expected) {
        int actual = stringUtil.countPunctuationMarks(str1);
        Assertions.assertEquals(expected, actual);
    }

    void testIsPalindrome(String str1, boolean expected) {
        boolean actual = stringUtil.isPalindrome(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsPalindrome() {
        testIsPalindrome("Deed", true);
    }

    @Test
    void testIsPalindromeNumbers() {
        testIsPalindrome("1991", true);
    }

    @Test
    void testIsNotPalindrome() {
        testIsPalindrome("Java", false);
    }

    @Test
    void testIsPalindromePunctuation() {
        testIsPalindrome("Do geese see God?", true);
    }

    @Test
    void testIsPalindromeSpecialSymbols() {
        testIsPalindrome("1991\n", true);
    }

    @Test
    void testIsPalindromeStringNull() {
        testIsPalindrome(null, false);
    }

    @Test
    void testSplitToArrayEvenAmount() {
        verifySplitToArray("Hello!", 2, new String[]{"He", "ll", "o!"});
    }


    @Test
    void testSplitToArrayOddAmount() {
        verifySplitToArray("Hello", 3, new String[]{"Hel", "lo"});
    }

    @Test
    void testSplitToArrayStringNull() {
        verifySplitToArray(null, 3, null);
    }

    void verifySplitToArray(String str1, int numberSymbolsInEveryNewArray, String[] expected) {
        String[] actual = stringUtil.splitToArray(str1, numberSymbolsInEveryNewArray);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testCountNumberWordsWhiteSpaces() {
        verifyCountNumberWords(" Hello    Java Java ", 3);
    }

    @Test
    void testCountNumberWordsPunctuation() {
        verifyCountNumberWords(" Hello,0 va Java Java! ", 5);
    }

    @Test
    void testCountNumberWordsSpecialSymbols() {
        verifyCountNumberWords(" Hello,0 \n Java Java! ", 4);
    }

    @Test
    void testCountNumberWordsStringNull() {
        verifyCountNumberWords(null, 0);
    }

    void verifyCountNumberWords(String str1, int expected) {
        int actual = stringUtil.countNumberWords(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetFirstCharacters() {
        verifyGetFirstCharactersInUpperCase("Alena Trafimovich", "AT");
    }

    @Test
    void testGetFirstCharactersLowerCase() {
        verifyGetFirstCharactersInUpperCase("alena  trafimovich-ivanova", "AT");
    }

    @Test
    void testGetFirstCharactersNullString() {
        verifyGetFirstCharactersInUpperCase(null, "");
    }

    void verifyGetFirstCharactersInUpperCase(String str1, String expected) {
        String actual = stringUtil.getFirstCharactersInUpperCase(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumbers() {
        verifyGetNumbers("Hello1234bye", "1234");
    }

    @Test
    void testGetNumbersNullString() {
        verifyGetNumbers(null, "");
    }

    void verifyGetNumbers(String str, String expected) {
        String actual = stringUtil.getNumbers(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetUniqueSymbols() {
        verifyGetUniqueSymbols("Jjava", "Hhava", "jh");
    }

    @Test
    void testGetUniqueSymbolsNumbers() {
        verifyGetUniqueSymbols("Jjava3258", "Hhava325", "j8h");
    }

    @Test
    void testGetUniqueSymbolsNumbersFirstNull() {
        verifyGetUniqueSymbols(null, "Git", "Git");
    }

    @Test
    void testGetUniqueSymbolsNumbersSecondNull() {
        verifyGetUniqueSymbols("Java", null, "Java");
    }

    @Test
    void testGetUniqueSymbolsNumbersBothNulls() {
        verifyGetUniqueSymbols(null, null, null);
    }

    void verifyGetUniqueSymbols(String str1, String str2, String expected) {
        String actual = stringUtil.getUniqueSymbols(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsArraySimilarDigitsNotIdentical() {
        verifyIsArraySimilar(new String[]{"3", "5", "6"}, new String[]{"1", "2", "6"}, false);
    }

    @Test
    void testIsArraySimilarNull() {
        verifyIsArraySimilar(new String[]{null, "6", "7"}, new String[]{"7", "6", "6"}, false);
    }

    @Test
    void testIsArraySimilarWords() {
        verifyIsArraySimilar(new String[]{"JOB", "JAVA"}, new String[]{"JAVA", "JOB"}, true);
    }

    @Test
    void testIsArraySimilarDigitsIdentical() {
        verifyIsArraySimilar(new String[]{"56", "28"}, new String[]{"28", "56"}, true);
    }

    void verifyIsArraySimilar(String[] array1, String[] array2, boolean expected) {
        boolean actual = stringUtil.isArraySimilar(array1, array2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSpeedOfAddition1() {
        System.out.println(stringUtil.getSpeedOfAddition("10", 10));
    }

    @Test
    void testGetSpeedOfAddition2() {
        System.out.println(stringUtil.getSpeedOfAddition("10", 15));
    }

    @Test
    void testGetSpeed3() {
        System.out.println(stringUtil.getSpeedOfAddition("10", 20));
    }

    @Test
    void testRemoveDuplicateLetters() {
        verifyRemoveDuplicateLetters("aaabbcdeef", "abcdef");
    }

    @Test
    void testRemoveDuplicateLettersDigits() {
        verifyRemoveDuplicateLetters("2552255", "2525");
    }

    @Test
    void testRemoveDuplicateNullString() {
        verifyRemoveDuplicateLetters(null, "");
    }

    void verifyRemoveDuplicateLetters(String str, String expected) {
        String actual = stringUtil.removeDuplicateLetters(str);
        Assertions.assertEquals(expected, actual);
    }
}
