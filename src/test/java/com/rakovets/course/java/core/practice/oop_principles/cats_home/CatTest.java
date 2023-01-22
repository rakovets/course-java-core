package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class CatTest {
    private Cat cat;

    @BeforeEach
    public void instanceCat() {
        cat = new Cat();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/catConstructor.csv", numLinesToSkip = 1)
    public void catConstructorTest(String expectedResult, String fieldName, String inputFieldValue) {
        cat = new Cat(inputFieldValue);

        String fieldValue = getValueFromPrivateField(fieldName);

        Assertions.assertEquals(expectedResult, fieldValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_cat/mew.csv", numLinesToSkip = 1)
    public void mewTest(String expectedResult) {
        String voiceCat = cat.mew();

        Assertions.assertEquals(expectedResult, voiceCat);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_cat/mewForPerson.csv", numLinesToSkip = 1)
    public void mewForPersonTest(int expectedHappiness, int actualHappiness, String expectedVoice) {
        Person person = new Person(actualHappiness);

        String actualVoice = cat.mew(person);
        int actualResult = person.getHappiness();

        Assertions.assertEquals(expectedHappiness, actualResult);
        Assertions.assertEquals(expectedVoice, actualVoice);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_cat/purr.csv", numLinesToSkip = 1)
    public void purrTest(String expectedResult) {
        String voiceCat = cat.purr();

        Assertions.assertEquals(expectedResult, voiceCat);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_cat/purrForPerson.csv", numLinesToSkip = 1)
    public void purrForPersonTest(int expectedHappiness, int actualHappiness, String expectedVoice) {
        Person person = new Person(actualHappiness);

        String actualVoice = cat.purr(person);
        int actualResult = person.getHappiness();

        Assertions.assertEquals(expectedHappiness, actualResult);
        Assertions.assertEquals(expectedVoice, actualVoice);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_cat/getName.csv", numLinesToSkip = 1)
    public void getNameTest(String expectedResult, String catName) {
        cat = new Cat(catName);

        String actualName = cat.getName();

        Assertions.assertEquals(expectedResult, actualName);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_cat/getName.csv", numLinesToSkip = 1)
    public void setNameTest(String expectedResult, String inputCatName) {
        cat = new Cat(inputCatName);

        String actualName = cat.getName();

        Assertions.assertEquals(expectedResult, actualName);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_cat/setName.csv", numLinesToSkip = 1)
    public void setNameTest(String expectedResult, String actualCatName, String inputCatName) {
        cat = new Cat(actualCatName);

        cat.setName(inputCatName);
        String resultCatName = cat.getName();

        Assertions.assertEquals(expectedResult, resultCatName);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Cat.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(cat).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
