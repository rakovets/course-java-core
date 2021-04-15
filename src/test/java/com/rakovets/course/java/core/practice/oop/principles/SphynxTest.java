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

public class SphynxTest {

    static Stream<Arguments> ProviderArgumentsForSphynx() {
        return Stream.of(
                Arguments.of("Varya", "Varya mur-mur me me me"),
                Arguments.of("Tiger", "Tiger mur-mur me me me"),
                Arguments.of("Leon", "Leon mur-mur me me me"),
                Arguments.of("Murka", "Murka mur-mur me me me")
        );
    }

    @ParameterizedTest
    @MethodSource("ProviderArgumentsForSphynx")
    void sphynxTest(String str1, String expected) {
        Sphynx sphynx = new Sphynx(str1);
        String actual = sphynx.getName() + " " + sphynx.catPurr() + " " + sphynx.catSayMew();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProviderArgumentsForSphynxPerson() {
        return Stream.of(
                Arguments.of("Varya", 50, "Owner has 20 percent happiness"),
                Arguments.of("Tiger", 40, "Owner has 10 percent happiness"),
                Arguments.of("Leon", 10, "Owner has -20 percent happiness"),
                Arguments.of("Murka", 200, "Owner has 170 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, hapiness = {1}, Expected: {2}")
    @MethodSource("ProviderArgumentsForSphynxPerson")
    void SphynxTest(String str1, int happiness, String expected) {
        Sphynx sphynx = new Sphynx(str1);
        Person person = new Person(happiness);
        sphynx.catSayMew(person);
        String actual = "Owner has " + person.getHappiness() + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}
