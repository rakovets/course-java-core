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

public class SiameseTest {

    static Stream<Arguments> ProviderArgumentsForSiamese() {
        return Stream.of(
                Arguments.of("Varya", "Varya murr-murr-murr meow-meow"),
                Arguments.of("Tiger", "Tiger murr-murr-murr meow-meow"),
                Arguments.of("Leon", "Leon murr-murr-murr meow-meow"),
                Arguments.of("Murka", "Murka murr-murr-murr meow-meow")
        );
    }

    @ParameterizedTest
    @MethodSource("ProviderArgumentsForSiamese")
    void siameseTest(String str1, String expected) {
        Siamese siamese = new Siamese(str1);
        String actual = siamese.getName() + " " + siamese.catPurr() + " " + siamese.catSayMew();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProviderArgumentsForSiamesePerson() {
        return Stream.of(
                Arguments.of("Varya", 50, "Owner has 45 percent happiness"),
                Arguments.of("Tiger", 40, "Owner has 35 percent happiness"),
                Arguments.of("Leon", 10, "Owner has 5 percent happiness"),
                Arguments.of("Murka", 200, "Owner has 195 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, hapiness = {1}, Expected: {2}")
    @MethodSource("ProviderArgumentsForSiamesePerson")
    void siameseTest(String str1, int happiness, String expected) {
        Siamese siamese = new Siamese(str1);
        Person person = new Person(happiness);
        siamese.catSayMew(person);
        String actual = "Owner has " + person.getHappiness() + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}
