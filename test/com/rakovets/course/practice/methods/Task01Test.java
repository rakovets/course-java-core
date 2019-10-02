package com.rakovets.course.practice.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task01Test {
    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(15, 5, 1, true),
                Arguments.of(15, 5, 5, true),
                Arguments.of(15, 5, 6, false),
                Arguments.of(15, 5, 13, false)
        );
    }

    @ParameterizedTest(name = "Size team: {0}. Top size: {1}. Position player bu damage: {2}")
    @MethodSource("testProvider")
    @DisplayName("Position player")
    void test(int sizeTeam, int sizeTop, int positionPlayerByDamage, boolean expected) {
        assertEquals(Task01.isTopPlayer(sizeTeam, sizeTop, positionPlayerByDamage), expected);
        int i=5;
        System.out.println(i);
    }
}