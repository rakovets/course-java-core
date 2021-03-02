package com.rakovets.course.java.core.example.lambda_expressions.lambda.model;

public enum MathIntOperation {
    ADDITIONAL((x, y) -> x + y),
    SUBTRACT((n1, n2) -> n1 - n2),
    MULTI((n1, n2) -> n1 * n2),
    DIVISION((n1, n2) -> n1 / n2);

    private final BinaryOperation<Integer> binaryOperation;

    MathIntOperation(BinaryOperation<Integer> binaryOperation) {
        this.binaryOperation = binaryOperation;
    }

    public int operate(Integer x, Integer y) {
        return this.binaryOperation.operate(x, y);
    }
}
