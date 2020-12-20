package com.rakovets.course.javabasics.practice.strings;

import com.rakovets.course.javabasics.util.ArrayUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Task02.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task02Test {
    @ParameterizedTest(name = "Report: {0}")
    @CsvFileSource(resources = "/string/task02-tests.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Get list for money")
    void getArrayMoneyFromReportTest(String report, String arrayMoney) {
        assertArrayEquals(Task02.getArrayMoneyFromReport(report), ArrayUtil.parseToDouble(arrayMoney, " "));
    }

    @ParameterizedTest(name = "Report: {0}")
    @CsvFileSource(resources = "/string/task02-tests.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Get sum for money")
    void getSumMoneyFromReportTest(String report, String arrayMoney, String sumMoney) {
        assertEquals(Task02.getSumMoneyFromReport(report), Double.valueOf(sumMoney));
    }
}