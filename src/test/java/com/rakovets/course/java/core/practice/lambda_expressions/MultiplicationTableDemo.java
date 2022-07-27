package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

public class MultiplicationTableDemo {
    MultiplicationTable multiplicationTable = new MultiplicationTable();

   @Test
    public void demoGetMultiplicationTableInOneColumn () {
        multiplicationTable.getMultiplicationTableInOneColumn(1,10);
    }

    @Test
    public void demoGetMultiplicationTableInFiveColumns () {
        multiplicationTable.getMultiplicationTableInFiveColumns(1,10);
    }

}
