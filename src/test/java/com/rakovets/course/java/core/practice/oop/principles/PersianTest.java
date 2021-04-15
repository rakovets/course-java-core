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

public class PersianTest {

    static Stream<Arguments> ProviderArgumentsForPersian() {
        return Stream.of(
                Arguments.of("Varya", "Varya MUURRR MEOW"),
                Arguments.of("Tiger", "Tiger MUURRR MEOW"),
                Arguments.of("Leon", "Leon MUURRR MEOW"),
                Arguments.of("Murka", "Murka MUURRR MEOW")
        );
    }

    @ParameterizedTest
    @MethodSource("ProviderArgumentsForPersian")
    void persianTest(String str1, String expected) {
        Persian persian = new Persian(str1);
        String actual = persian.getName() + " " + persian.catPurr() + " " + persian.catSayMew();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProviderArgumentsForPersianPerson() {
        return Stream.of(
                Arguments.of("Varya", 50, "Owner has 35 percent happiness"),
                Arguments.of("Tiger", 40, "Owner has 25 percent happiness"),
                Arguments.of("Leon", 10, "Owner has -5 percent happiness"),
                Arguments.of("Murka", 200, "Owner has 185 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, hapiness = {1}, Expected: {2}")
    @MethodSource("ProviderArgumentsForPersianPerson")
    void persianTest(String str1, int happiness, String expected) {
        Persian persian = new Persian(str1);
        Person person = new Person(happiness);
        persian.catSayMew(person);
        String actual = "Owner has " + person.getHappiness() + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}
