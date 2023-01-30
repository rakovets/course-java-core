package com.rakovets.course.java.core.practice.exception_handling.task4;

import com.rakovets.course.java.core.practice.exception_handling.task4.exceptions.CustomException;

public class PersonAgeValidationDemo {
    public static void main(String[] args) {
        PersonAgeValidation personAgeValidation = new PersonAgeValidation();
        CustomException exception = new CustomException("CustomException has been caught!");

        try {
            personAgeValidation.isAgeValid(20);
        } catch (CustomException customException) {
            System.out.println(exception.getMessage());
        }
    }
}
