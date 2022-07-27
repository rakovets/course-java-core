package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {
    MultiplicationTable multiplicationTable = new MultiplicationTable();

   @Test
    public void test () {
        multiplicationTable.getMultiplicationTableInOneColumn(1,10);
    }

    @Test
    public void test1 () {
        multiplicationTable.getMultiplicationTableInFiveColumns(1,10,5);
    }

}
