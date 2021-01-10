package com.rakovets.course.javabasics.practice.string;

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
 */
@DisplayName("Money")
@SuppressWarnings("unused")
class Task02Test {
    @ParameterizedTest(name = "Report: {0}")
    @CsvFileSource(resources = "/practice/string/task02-tests.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Get list for money")
    void getArrayMoneyFromReportTest(String report, String arrayMoney, String sumMoney) {
        double[] expected = ArrayUtil.parseToDouble(arrayMoney, " ");

        double[] actual = Task02.getArrayMoneyFromReport(report);

        assertArrayEquals(actual, expected);
    }

    @ParameterizedTest(name = "Report: {0}")
    @CsvFileSource(resources = "/practice/string/task02-tests.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Get sum for money")
    void getSumMoneyFromReportTest(String report, String arrayMoney, String sumMoney) {
        double expected = Double.parseDouble(sumMoney);

        double actual = Task02.getSumMoneyFromReport(report);

        assertEquals(actual, expected);
    }
}
