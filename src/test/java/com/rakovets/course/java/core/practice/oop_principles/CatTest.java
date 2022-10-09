package com.rakovets.course.java.core.practice.oop_principles;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CatTest {
    Cat cat = new Cat("Persian");
    Person user = new Person( 80);

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(15, 65)

        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMew")
    void testMew(Person user) {
        //Given

        //When
        int actual = user.changeHappiness(user.percentHappiness);

        //Then
        Assertions.assertEquals(user.changeHappiness(user.percentHappiness), actual);
    }
}
