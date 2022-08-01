package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {
    private final MultiplicationTable multiplicationTable = new MultiplicationTable();

    @Test
    public void testGetMultiplicationTableInOneColumn() {
        String expected = "1 * 1 = 1\n" +
                "1 * 2 = 2\n" +
                "2 * 1 = 2\n" +
                "2 * 2 = 4\n";

        String actual = multiplicationTable.getMultiplicationTableInOneColumn(1, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTableInOneColumnSecondLessThanFirst() {
        String expected = "";

        String actual = multiplicationTable.getMultiplicationTableInOneColumn(2, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTableInOneColumnNegative() {
        String expected = "-1 * -1 = 1\n" +
                "-1 * 0 = 0\n" +
                "-1 * 1 = -1\n" +
                "0 * -1 = 0\n" +
                "0 * 0 = 0\n" +
                "0 * 1 = 0\n" +
                "1 * -1 = -1\n" +
                "1 * 0 = 0\n" +
                "1 * 1 = 1\n";

        String actual = multiplicationTable.getMultiplicationTableInOneColumn(-1, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTableInColumns() {
        String expected = "1 * 1 = 1\t1 * 2 = 2\t\n" +
                "2 * 1 = 2\t2 * 2 = 4\t\n";
        String actual = multiplicationTable.getMultiplicationTableByColumns(1, 2, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTableInColumnsNegative() {
        String expected = "-3 * -3 = 9\t-3 * -2 = 6\t-3 * -1 = 3\t\n" +
                "-2 * -3 = 6\t-2 * -2 = 4\t-2 * -1 = 2\t\n" +
                "-1 * -3 = 3\t-1 * -2 = 2\t-1 * -1 = 1\t\n";
        String actual = multiplicationTable.getMultiplicationTableByColumns(-3, -1, 3);

        Assertions.assertEquals(expected, actual);
    }
}
