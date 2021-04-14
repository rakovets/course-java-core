package com.rakovets.course.java.core.practice.oop.principles.catTest;
import com.rakovets.course.java.core.practice.oop.principles.cat.Person;
import com.rakovets.course.java.core.practice.oop.principles.cat.Siamese;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SiameseTest {

    @Test
    void mewTest() {
        assertEquals("Mew-Mew", new Siamese("Siamese").mew());
    }

    static Stream<Arguments> mewPersonTest() {
        return Stream.of(
                Arguments.of(75, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewPersonTest")
    void mewPersonTest(int expected, Person person) {
        Siamese siamese = new Siamese("Siamese");
        siamese.mew(person);
        assertEquals(expected, person.getHappiness());
    }

    @Test
    void purrTest() {
        assertEquals("Purr-Purr", new Siamese("Siamese").purr());
    }

    static Stream<Arguments> purrPersonTest() {
        return Stream.of(
                Arguments.of(125, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("purrPersonTest")
    void purrPersonTest(int expected, Person person) {
        Siamese siamese = new Siamese("Siamese");
        siamese.purr(person);
        assertEquals(expected, person.getHappiness());
    }
}
