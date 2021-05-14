package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.List;
import java.util.stream.Stream;

public class MathUtilityDemo {
    public static void main(String[] args) {
        System.out.println("This is collection of random numbers:");
        int numberOfRandomNumbers = 10;
        List<Integer> numbers = MathUtility.getCollectionOfRandomNumbers(numberOfRandomNumbers);
        Stream<Integer> numbersStream = numbers.stream();
        numbersStream.forEach(x -> System.out.println(x));

        long numberOfEvenNumbers = MathUtility.getNumberOfEvenNumbers(numbers);
        System.out.printf("\nNumber of even numbers equals: %d", numberOfEvenNumbers);

        long numberOfOddNumbers = MathUtility.getNumberOfOddNumbers(numbers);
        System.out.printf("\nNumber of odd numbers equals: %d", numberOfOddNumbers);

        long numberOfNumbersEqualsZero = MathUtility.getNumberOfNumbersEqualsZero(numbers);
        System.out.printf("\nNumber of numbers equals zero: %d", numberOfNumbersEqualsZero);

        int digital = 555;
        long numberOfNumbersEqualsSomeMeaning = MathUtility.getNumberOfNumbersEqualsSomeMeaning(numbers, digital);
        System.out.printf("\nNumber of numbers equals some meaning: %d", numberOfNumbersEqualsSomeMeaning);
    }
}
