package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_cat;

import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Cat;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Person;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SphynxTest {

    static Stream<Arguments> provideArgumentsSphynx() {
        return Stream.of(
                Arguments.of("Lastik", "Lastik can say mjay-mjay", "Lastik can do mrr-mrr-mrr"),
                Arguments.of("Tomas", "Tomas can say mjay-mjay", "Tomas can do mrr-mrr-mrr"),
                Arguments.of("Morgan", "Morgan can say mjay-mjay", "Morgan can do mrr-mrr-mrr"),
                Arguments.of("Murzik", "Murzik can say mjay-mjay", "Murzik can do mrr-mrr-mrr")
        );
    }

    static Stream<Arguments> provideArgumentsSphynxDoMewForPerson() {
        return Stream.of(
                Arguments.of("Aleksey", 10.0, 100.0, "Aleksey has 85.0 percent happiness"),
                Arguments.of("Nikolay", -20.0, 80.0, "Nikolay has 50.0 percent happiness"),
                Arguments.of("Svetlana", -100, 150.0, "Svetlana has 0.0 percent happiness"),
                Arguments.of("Liza", 0.0, 100.0, "Liza has 100.0 percent happiness")
        );
    }

    static Stream<Arguments> provideArgumentsSphynxDoPurrForPerson() {
        return Stream.of(
                Arguments.of("Aleksey", 10.0, 100.0, "Aleksey has 108.0 percent happiness"),
                Arguments.of("Nikolay", -20.0, 80.0, "Nikolay has 96.0 percent happiness"),
                Arguments.of("Svetlana", -100, 150.0, "Svetlana has 230.0 percent happiness"),
                Arguments.of("Liza", 0.0, 100.0, "Liza has 100.0 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsSphynx")
    void sphynxTest(String str1, String expected1, String expected2) {
        Cat cat = new Sphynx(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }

    @ParameterizedTest(name = "Person - {0}, percent = {1}, happiness = {2}, Expected: {3}")
    @MethodSource("provideArgumentsSphynxDoMewForPerson")
    void mewSphynxTest(String str1, double percent, double happiness, String expected) {
        Sphynx sphynx = new Sphynx();
        Person person = new Person(str1, happiness);
        person.setPercentHappiness((-1) * Math.abs(percent));
        String actual = person.getNamePerson() + " has " + sphynx.mew(person) + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Person - {0}, percent = {1}, happiness = {2}, Expected: {3}")
    @MethodSource("provideArgumentsSphynxDoPurrForPerson")
    void purrSphynxTest(String str1, double percent, double happiness, String expected) {
        Sphynx sphynx = new Sphynx();
        Person person = new Person(str1, happiness);
        person.setPercentHappiness(Math.abs(percent));
        String actual = person.getNamePerson() + " has " + sphynx.purr(person) + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}
