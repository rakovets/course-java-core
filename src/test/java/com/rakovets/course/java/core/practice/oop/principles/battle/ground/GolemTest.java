package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GolemTest {
    @Test
    void Ork() {
        Golem golem = new Golem( 100);
        Assertions.assertEquals(100, golem.getHealth());
    }

    @Test
    void setHealth() {
        Golem golem = new Golem(100);
        golem.setHealth(150);
        Assertions.assertEquals(150, golem.getHealth());
        golem.setHealth(-150);
        Assertions.assertEquals(-150, golem.getHealth());
        golem.setHealth(0);
        Assertions.assertEquals(0, golem.getHealth());
    }

    @Test
    void getHealh() {
        Golem golem = new Golem(100);
        Assertions.assertEquals(100, golem.getHealth());
    }

    @Test
    void attackHero() {
        Golem golem = new Golem(100);
        Mage librarian = new Mage("Iezekiel", 60);
        golem.attackHero(librarian);
        int actualInt = librarian.getHealth();
        Assertions.assertEquals(40, actualInt);
    }

    @Test
    static Stream<Arguments> takeDamageProvidedArguments() {
        return Stream.of(
                Arguments.of(75,  50),
                Arguments.of(79, 42),
                Arguments.of(50, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("takeDamageProvidedArguments")
    void takeDamage(int expectedInt, int damage) {
        Golem golem = new Golem(100);
        golem.takeDamage(damage);
        int actualInt = golem.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }
   }
