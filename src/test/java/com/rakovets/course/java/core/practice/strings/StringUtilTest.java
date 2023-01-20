package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

public class StringUtilTest {
    StringUtil stringUtil;
    @BeforeEach
    public void instanceStringUtil() {
        stringUtil = new StringUtil();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/concatTwoValues.csv", numLinesToSkip = 1)
    public void concatTwoValuesTest(String expectedResult, String firstValue, String secondValue) {
        String actualResult = stringUtil.concatTwoValues(firstValue, secondValue);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/getCharIndexFromText.csv", numLinesToSkip = 1)
    public void getCharIndexFromTextTest(int expectedResult, String text, char character) {
        int actualResult = stringUtil.getCharIndexFromText(text, character);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/isTwoStringValuesEqual.csv", numLinesToSkip = 1)
    public void isTwoStringValuesEqualTest(boolean expectedResult, String firstValue, String secondValue) {
        boolean actualResult = stringUtil.isTwoStringValuesEqual(firstValue, secondValue);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/stringValueTrim.csv", numLinesToSkip = 1)
    public void stringValueTrimTest(String expectedResult, String text) {
        String actualResult = stringUtil.stringValueTrim(text);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/getSubstringFromStringValue.csv", numLinesToSkip = 1)
    public void getSubstringFromStringValueTest(String expectedResult, String text, char startIndex, char finishIndex) {
        String actualResult = stringUtil.getSubstringFromStringValue(text, startIndex, finishIndex);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/replaceSadToCarefulEmoji.csv", numLinesToSkip = 1)
    public void replaceSadToCarefulEmojiTest(String expectedResult, String stringWithEmoji) {
        String actualResult = stringUtil.replaceSadToCarefulEmoji(stringWithEmoji);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/isWordStartsAndEndsString.csv", numLinesToSkip = 1)
    public void isWordStartsAndEndsStringTest(boolean expectedResult, String text, String word) {
        boolean actualResult = stringUtil.isWordStartsAndEndsString(text, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/amountVowelsInString.csv", numLinesToSkip = 1)
    public void amountVowelsInStringTest(int expectedResult, String text) {
        int actualResult = stringUtil.amountVowelsInString(text);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/amountSpecialCharacterInString.csv", numLinesToSkip = 1)
    public void amountSpecialCharacterInStringTest(int expectedResult, String text) {
        int actualResult = stringUtil.amountSpecialCharacterInString(text);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/isPalindromeString.csv", numLinesToSkip = 1)
    public void isPalindromeStringTest(boolean expectedResult, String text) {
        boolean actualResult = stringUtil.isPalindromeString(text);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cutStringToEqualParts.csv", numLinesToSkip = 1)
    public void cutStringToEqualPartsTest(String expectedResult, String text, int partLength) {
        String[] actualResult = stringUtil.cutStringToEqualParts(text, partLength);
        String[] expectedArray = expectedResult.split("\\|");
        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(actualResult));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/countWordsInText.csv", numLinesToSkip = 1)
    public void countWordsInTextTest(int expectedResult, String text) {
        int actualResult = stringUtil.countWordsInText(text);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/getNameInitials.csv", numLinesToSkip = 1)
    public void getNameInitialsTest(String expectedResult, String text) {
        String actualResult = stringUtil.getNameInitials(text);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/getAllNumbersFromText.csv", numLinesToSkip = 1)
    public void getAllNumbersFromTextTest(String expectedResult, String text) {
        String actualResult = stringUtil.getAllNumbersFromText(text);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
