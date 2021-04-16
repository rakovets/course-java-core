package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_cat;

import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Cat;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Persian;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersianTest {

    static Stream<Arguments> provideArgumentsPersian() {
        return Stream.of(
                Arguments.of("Jan", "Jan can say maaw-maaw", "Jan can do murr-murr-murr"),
                Arguments.of("Danko", "Danko can say maaw-maaw", "Danko can do murr-murr-murr"),
                Arguments.of("Zefs", "Zefs can say maaw-maaw", "Zefs can do murr-murr-murr"),
                Arguments.of("Daniel", "Daniel can say maaw-maaw", "Daniel can do murr-murr-murr")
        );
    }

    static Stream<Arguments> provideArgumentsPersianDoMewForPerson() {
        return Stream.of(
                Arguments.of("Aleksey", 10.0, 100.0, "Aleksey has 89.0 percent happiness"),
                Arguments.of("Nikolay", -20.0, 80.0, "Nikolay has 58.0 percent happiness"),
                Arguments.of("Svetlana", -100, 150.0, "Svetlana has 40.0 percent happiness"),
                Arguments.of("Liza", 0.0, 100.0, "Liza has 100.0 percent happiness")
        );
    }

    static Stream<Arguments> provideArgumentsPersianDoPurrForPerson() {
        return Stream.of(
                Arguments.of("Aleksey", 10.0, 100.0, "Aleksey has 115.0 percent happiness"),
                Arguments.of("Nikolay", -20.0, 80.0, "Nikolay has 110.0 percent happiness"),
                Arguments.of("Svetlana", -100, 150.0, "Svetlana has 300.0 percent happiness"),
                Arguments.of("Liza", 0.0, 100.0, "Liza has 100.0 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsPersian")
    void persianTest(String str1, String expected1, String expected2) {
        Cat cat = new Persian(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }

    @ParameterizedTest(name = "Person - {0}, percent = {1}, happiness = {2}, Expected: {3}")
    @MethodSource("provideArgumentsPersianDoMewForPerson")
    void mewPersianTest(String str1, double percent, double happiness, String expected) {
        Persian persian = new Persian();
        Person person = new Person(str1, happiness);
        person.setPercentHappiness((-1) * Math.abs(percent));
        String actual = person.getNamePerson() + " has " + persian.mew(person) + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Person - {0}, percent = {1}, happiness = {2}, Expected: {3}")
    @MethodSource("provideArgumentsPersianDoPurrForPerson")
    void purrPersianTest(String str1, double percent, double happiness, String expected) {
        Persian persian = new Persian();
        Person person = new Person(str1, happiness);
        person.setPercentHappiness(Math.abs(percent));
        String actual = person.getNamePerson() + " has " + persian.purr(person) + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}
