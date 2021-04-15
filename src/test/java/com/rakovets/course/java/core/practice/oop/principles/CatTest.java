package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.Cat;
import com.rakovets.course.java.core.practice.oop.principles.Siamese;
import com.rakovets.course.java.core.practice.oop.principles.Sphynx;
import com.rakovets.course.java.core.practice.oop.principles.Persian;
import com.rakovets.course.java.core.practice.oop.principles.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatTest {

    static Stream<Arguments> ProviderArgumentsForCat() {
        return Stream.of(
                Arguments.of("Varya", "Varya muurrr meow"),
                Arguments.of("Tiger", "Tiger muurrr meow"),
                Arguments.of("Leon", "Leon muurrr meow"),
                Arguments.of("Murka", "Murka muurrr meow")
        );
    }

    @ParameterizedTest
    @MethodSource("ProviderArgumentsForCat")
    void catTest(String str1, String expected) {
        Cat cat = new Cat(str1);
        String actual = cat.getName() + " " + cat.catPurr() + " " + cat.catSayMew();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProviderArgumentsForCatPerson() {
        return Stream.of(
                Arguments.of("Varya", 50, "Owner has 40 percent happiness"),
                Arguments.of("Tiger", 40, "Owner has 30 percent happiness"),
                Arguments.of("Leon", 10, "Owner has 0 percent happiness"),
                Arguments.of("Murka", 200, "Owner has 190 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, hapiness = {1}, Expected: {2}")
    @MethodSource("ProviderArgumentsForCatPerson")
    void catTest(String str1, int happiness, String expected) {
        Cat cat = new Cat(str1);
        Person person = new Person(happiness);
        cat.catSayMew(person);
        String actual = "Owner has " + person.getHappiness() + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}
