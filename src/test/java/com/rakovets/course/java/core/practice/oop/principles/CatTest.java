package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatTest {

    static Stream<Arguments> provideArgumentsCat() {
        return Stream.of(
                Arguments.of("Barsik", "Barsik can say mew-mew", "Barsik can do purr-purr-purr"),
                Arguments.of("Vaska", "Vaska can say mew-mew", "Vaska can do purr-purr-purr"),
                Arguments.of("Pirat", "Pirat can say mew-mew", "Pirat can do purr-purr-purr"),
                Arguments.of("Murzik", "Murzik can say mew-mew", "Murzik can do purr-purr-purr")
        );
    }

    static Stream<Arguments> provideArgumentsCatDoMewForPerson() {
        return Stream.of(
                Arguments.of("Aleksey", 20.0, 80.0, "Aleksey has 60.0 percent happiness"),
                Arguments.of("Nikolay", 30.0, 90.5, "Nikolay has 60.5 percent happiness"),
                Arguments.of("Svetlana", -10.5, 20, "Svetlana has 9.5 percent happiness"),
                Arguments.of("Liza", 0.0, 100.0, "Liza has 100.0 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsCat")
    void catTest(String str1, String expected1, String expected2) {
        Cat cat = new Cat(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }

    @ParameterizedTest(name = "Person - {0}, percent = {1}, happiness = {2}, Expected: {3}")
    @MethodSource("provideArgumentsCatDoMewForPerson")
    void catTest(String str1, double percent, double happiness, String expected) {
        Cat cat = new Cat();
        Person person = new Person(str1, happiness);
        person.setPercentHappiness((-1) * Math.abs(percent));
        String actual = person.getNamePerson() + " has " + cat.mew(person) + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}

