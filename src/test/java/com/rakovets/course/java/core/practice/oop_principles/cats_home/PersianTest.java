package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class PersianTest {
    private Persian persian;

    @BeforeEach
    public void instancePersian() {
        persian = new Persian();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/catConstructor.csv", numLinesToSkip = 1)
    public void persianConstructorTest(String expectedResult, String fieldName, String inputFieldValue) {
        persian = new Persian(inputFieldValue);

        String fieldValue = getValueFromPrivateField(fieldName);

        Assertions.assertEquals(expectedResult, fieldValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_persian/mew.csv", numLinesToSkip = 1)
    public void mewTest(String expectedResult) {
        String voiceCat = persian.mew();

        Assertions.assertEquals(expectedResult, voiceCat);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_persian/mewForPerson.csv", numLinesToSkip = 1)
    public void mewForPersonTest(int expectedHappiness, int actualHappiness, String expectedVoice) {
        Person person = new Person(actualHappiness);

        String actualVoice = persian.mew(person);
        int actualResult = person.getHappiness();

        Assertions.assertEquals(expectedHappiness, actualResult);
        Assertions.assertEquals(expectedVoice, actualVoice);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_persian/purr.csv", numLinesToSkip = 1)
    public void purrTest(String expectedResult) {
        String voiceCat = persian.purr();

        Assertions.assertEquals(expectedResult, voiceCat);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_persian/purrForPerson.csv", numLinesToSkip = 1)
    public void purrForPersonTest(int expectedHappiness, int actualHappiness, String expectedVoice) {
        Person person = new Person(actualHappiness);

        String actualVoice = persian.purr(person);
        int actualResult = person.getHappiness();

        Assertions.assertEquals(expectedHappiness, actualResult);
        Assertions.assertEquals(expectedVoice, actualVoice);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Cat.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(persian).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
