package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class SiameseTest {
    private Siamese siamese;

    @BeforeEach
    public void instanceSiamese() {
        siamese = new Siamese();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/catConstructor.csv", numLinesToSkip = 1)
    public void siameseConstructorTest(String expectedResult, String fieldName, String inputFieldValue) {
        siamese = new Siamese(inputFieldValue);

        String fieldValue = getValueFromPrivateField(fieldName);

        Assertions.assertEquals(expectedResult, fieldValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_siamese/mew.csv", numLinesToSkip = 1)
    public void mewTest(String expectedResult) {
        String voiceCat = siamese.mew();

        Assertions.assertEquals(expectedResult, voiceCat);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_siamese/mewForPerson.csv", numLinesToSkip = 1)
    public void mewForPersonTest(int expectedHappiness, int actualHappiness, String expectedVoice) {
        Person person = new Person(actualHappiness);

        String actualVoice = siamese.mew(person);
        int actualResult = person.getHappiness();

        Assertions.assertEquals(expectedHappiness, actualResult);
        Assertions.assertEquals(expectedVoice, actualVoice);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_siamese/purr.csv", numLinesToSkip = 1)
    public void purrTest(String expectedResult) {
        String voiceCat = siamese.purr();

        Assertions.assertEquals(expectedResult, voiceCat);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/cats_home/class_siamese/purrForPerson.csv", numLinesToSkip = 1)
    public void purrForPersonTest(int expectedHappiness, int actualHappiness, String expectedVoice) {
        Person person = new Person(actualHappiness);

        String actualVoice = siamese.purr(person);
        int actualResult = person.getHappiness();

        Assertions.assertEquals(expectedHappiness, actualResult);
        Assertions.assertEquals(expectedVoice, actualVoice);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Cat.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(siamese).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
