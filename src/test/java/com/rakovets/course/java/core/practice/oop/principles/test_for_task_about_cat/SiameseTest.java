package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_cat;

import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Cat;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Person;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiameseTest {

    static Stream<Arguments> provideArgumentsSiamese() {
        return Stream.of(
                Arguments.of("Archi", "Archi can say mey-mey", "Archi can do prr-prr-prr"),
                Arguments.of("Vegas", "Vegas can say mey-mey", "Vegas can do prr-prr-prr"),
                Arguments.of("Grey", "Grey can say mey-mey", "Grey can do prr-prr-prr"),
                Arguments.of("Dollar", "Dollar can say mey-mey", "Dollar can do prr-prr-prr")
        );
    }

    static Stream<Arguments> provideArgumentsSiameseDoMewForPerson() {
        return Stream.of(
                Arguments.of("Aleksey", 10.0, 100.0, "Aleksey has 88.0 percent happiness"),
                Arguments.of("Nikolay", -20.0, 80.0, "Nikolay has 56.0 percent happiness"),
                Arguments.of("Svetlana", -100, 150.0, "Svetlana has 30.0 percent happiness"),
                Arguments.of("Liza", 0.0, 100.0, "Liza has 100.0 percent happiness")
        );
    }

    static Stream<Arguments> provideArgumentsSiameseDoPurrForPerson() {
        return Stream.of(
                Arguments.of("Aleksey", 10.0, 100.0, "Aleksey has 112.0 percent happiness"),
                Arguments.of("Nikolay", -20.0, 80.0, "Nikolay has 104.0 percent happiness"),
                Arguments.of("Svetlana", -100, 150.0, "Svetlana has 270.0 percent happiness"),
                Arguments.of("Liza", 0.0, 100.0, "Liza has 100.0 percent happiness")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsSiamese")
    void siameseTest(String str1, String expected1, String expected2) {
        Cat cat = new Siamese(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }

    @ParameterizedTest(name = "Person - {0}, percent = {1}, happiness = {2}, Expected: {3}")
    @MethodSource("provideArgumentsSiameseDoMewForPerson")
    void mewSiameseTest(String str1, double percent, double happiness, String expected) {
        Siamese siamese = new Siamese();
        Person person = new Person(str1, happiness);
        person.setPercentHappiness((-1) * Math.abs(percent));
        String actual = person.getNamePerson() + " has " + siamese.mew(person) + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Person - {0}, percent = {1}, happiness = {2}, Expected: {3}")
    @MethodSource("provideArgumentsSiameseDoPurrForPerson")
    void purrSiameseTest(String str1, double percent, double happiness, String expected) {
        Siamese siamese = new Siamese();
        Person person = new Person(str1, happiness);
        person.setPercentHappiness(Math.abs(percent));
        String actual = person.getNamePerson() + " has " +siamese.purr(person) + " percent happiness";
        Assertions.assertEquals(expected, actual);
    }
}
