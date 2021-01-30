package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArcherTest {

    @Test
    void Archer() {
        Archer scout = new Archer("Telion", 100);

        Assertions.assertEquals(100, scout.getHealth());
    }

    @Test
    static Stream<Arguments> setHealthProvidedArguments() {
        return Stream.of(
                Arguments.of(150,  150),
                Arguments.of(-150, -150),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("setHealthProvidedArguments")
    void setHealth(int expectedInt, int health) {
        Archer scout = new Archer("Telion", 100);

        scout.setHealth(health);
        int actualInt = scout.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void getName() {
        Archer scout = new Archer("Telion", 100);

        Assertions.assertEquals("Telion", scout.getName());
    }

    @Test
    void getHealh() {
        Archer scout = new Archer("Telion", 100);

        Assertions.assertEquals(100, scout.getHealth());
    }

    @Test
    void attackEnemy() {
        Archer scout = new Archer("Telion", 100);
        Ork nob = new Ork(60);

        scout.attackEnemy(nob);
        int actualInt = nob.getHealth();

        Assertions.assertEquals(50, actualInt);
    }

    @Test
    static Stream<Arguments> takeDamageProvidedArguments() {
        return Stream.of(
                Arguments.of(50,  50),
                Arguments.of(58, 42),
                Arguments.of(0, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("takeDamageProvidedArguments")
    void takeDamage(int expectedInt, int damage) {
        Archer scout = new Archer("Telion", 100);

        scout.takeDamage(damage);
        int actualInt = scout.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void arrowByArrow() {
        Archer scout = new Archer("Telion", 100);
        Golem golem = new Golem(50);

        scout.arrowByArrow(golem);
        int actualInt = golem.getHealth();

        Assertions.assertEquals(35, actualInt);
    }
}
