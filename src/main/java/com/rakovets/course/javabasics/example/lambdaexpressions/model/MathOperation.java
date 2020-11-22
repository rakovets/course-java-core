package com.rakovets.course.javabasics.example.lambdaexpressions.model;

public enum MathOperation {
    ADDITIONAL((x, y) -> x + y),
    SUBTRACT((n1, n2) -> n1 - n2),
    MULTI((n1, n2) -> n1 * n2),
    DIVISION((n1, n2) -> n1 / n2);

    private final IntBinaryOperation intBinaryOperation;

    MathOperation(IntBinaryOperation intBinaryOperation) {
        this.intBinaryOperation = intBinaryOperation;
    }

    public int operate(int x, int y) {
        return this.intBinaryOperation.operate(x, y);
    }
}
