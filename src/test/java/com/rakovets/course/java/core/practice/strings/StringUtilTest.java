package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StringUtilTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/concatTwoValues.csv", numLinesToSkip = 1)
    void concatTwoValuesTest(String expectedResult, String firstValue, String secondValue) {
        String actualResult = StringUtil.concatTwoValues(firstValue, secondValue);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/getCharIndexFromText.csv", numLinesToSkip = 1)
    void getCharIndexFromTextTest(int expectedResult, String text, char character) {
        int actualResult = StringUtil.getCharIndexFromText(text, character);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
