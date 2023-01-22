package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void instancePerson() {
        person = new Person();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/personConstructor.csv", numLinesToSkip = 1)
    public void personConstructorTest(int expectedResult, String fieldName, int inputFieldValue) {
        person = new Person(inputFieldValue);

        int fieldValue = getValueFromPrivateField(fieldName);

        Assertions.assertEquals(expectedResult, fieldValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_person/changeHappiness.csv", numLinesToSkip = 1)
    public void changeHappinessTest(int expectedResult, int actualHappiness, int inputHappiness) {
        person = new Person(actualHappiness);

        person.changeHappiness(inputHappiness);
        int resultHappiness = person.getHappiness();

        Assertions.assertEquals(expectedResult, resultHappiness);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_person/getHappiness.csv", numLinesToSkip = 1)
    public void getHappinessTest(int expectedResult, int actualHappiness) {
        person = new Person(actualHappiness);

        int resultHappiness = person.getHappiness();

        Assertions.assertEquals(expectedResult, resultHappiness);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_person/setHappiness.csv", numLinesToSkip = 1)
    public void setHappinessTest(int expectedResult, int actualHappiness, int inputHappiness) {
        person = new Person(actualHappiness);

        person.setHappiness(inputHappiness);
        int resultCatName = person.getHappiness();

        Assertions.assertEquals(expectedResult, resultCatName);
    }

    private int getValueFromPrivateField(String fieldName) {
        int fieldValue = 0;
        try {
            Field privateClassField = Person.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = Integer.parseInt(privateClassField.get(person).toString());
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
