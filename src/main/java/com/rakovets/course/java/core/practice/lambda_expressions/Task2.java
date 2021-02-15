package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.BinaryOperation;

public class Task2 {
    BinaryOperation<Integer> addition = (x, y) -> x * y;
    Integer result = addition.operate(2, 5);

  /*  phoneStream
            .flatMap(p -> Stream.of(
            String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
            String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int) (p.getPrice() * 0.1))
            ))
            .forEach(s -> System.out.println(s)); */
}
