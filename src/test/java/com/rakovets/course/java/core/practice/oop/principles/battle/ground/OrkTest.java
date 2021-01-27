package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class OrkTest {

    @Test
    void Ork() {
        Ork ork = new Ork( 100);
        Assertions.assertEquals(100, ork.getHealth());
    }

    @Test
    void setHealth() {
        Ork ork = new Ork(100);
        ork.setHealth(150);
        Assertions.assertEquals(150, ork.getHealth());
        ork.setHealth(-150);
        Assertions.assertEquals(-150, ork.getHealth());
        ork.setHealth(0);
        Assertions.assertEquals(0, ork.getHealth());
    }

    @Test
    void getHealh() {
        Ork ork = new Ork(100);
        Assertions.assertEquals(100, ork.getHealth());
    }

    @Test
    void attackHero() {
        Ork ork = new Ork(100);
        Mage librarian = new Mage("Iezekiel", 60);
        ork.attackHero(librarian);
        int actualInt = librarian.getHealth();
        Assertions.assertEquals(30, actualInt);
    }

    @Test
    void lastBlow() {
        Ork ork = new Ork(0);
        Mage librarian = new Mage("Iezekiel", 60);
        ork.lastBlow(librarian);
        Assertions.assertEquals(30, librarian.getHealth());
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
        Ork ork = new Ork(100);
        ork.takeDamage(damage);
        int actualInt = ork.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }
}

