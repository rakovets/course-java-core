package com.rakovets.course.java.core.practice.oop.principles.cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersianTest {

    @Test
    void purr() {
        Persian tom = new Persian("Tom");
        String expectedString = "Purr-purr-purr";
        String actualString = tom.purr();
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void mew() {
        Persian tom = new Persian("Tom");
        String expectedString = "Mew-mew-mew";
        String actualString = tom.mew();
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> mewTestPersian() {
        return Stream.of(
                Arguments.of(85, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewTestPersian")
    void mewTest(int expectedInt, Person tom) {
        Persian pushok = new Persian("Tom");
        pushok.mew(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> purTestPersian() {
        return Stream.of(
                Arguments.of(115, new Person(100) )
        );
    }

    @ParameterizedTest
    @MethodSource("purTestPersian")
    void purTest(int expectedInt, Person tom) {
        Persian pushok = new Persian("Tom");
        pushok.purr(tom);
        int actaulInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actaulInt);
    }
}
