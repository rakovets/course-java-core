package com.rakovets.course.java.core.practice.oop.principles.battle_ground;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class OrcTest {
    @Test
    void Orc() {
        Assertions.assertEquals(100, new Orc(100).getHealth());
    }

    @Test
    void setHealth() {
        Orc goro = new Orc(100);

        goro.setHealth(200);

        Assertions.assertEquals(200, goro.getHealth());
    }

    @Test
    void getHealth() {
        Orc goro = new Orc(100);

        Assertions.assertEquals(100, goro.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(80, 20),
                Arguments.of(0, 150),
                Arguments.of(0, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Orc goro = new Orc(100);

        goro.takeDamage(damage);
        int actualInt = goro.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(290, new Orc( 100)),
                Arguments.of(270, new Orc(34))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void attackHero(int expectedInt, Orc orc) {
        Archer legolas = new Archer("Legolas", 300);

        orc.attackHero(legolas);
        int actualInt = legolas.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void healDamage()  {
        Orc goro = new Orc(10);

        goro.healDamage();

        Assertions.assertEquals(30, goro.getHealth());
    }
}
