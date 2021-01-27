package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ZombueTest {

    @Test
    void Zombue() {
        Zombue zom = new Zombue( 100);
        Assertions.assertEquals(100, zom.getHealth());
    }

    @Test
    void setHealth() {
            Zombue zom = new Zombue(100);
            zom.setHealth(150);
            Assertions.assertEquals(150, zom.getHealth());
            zom.setHealth(-150);
            Assertions.assertEquals(-150, zom.getHealth());
            zom.setHealth(0);
            Assertions.assertEquals(0, zom.getHealth());
    }

    @Test
    void getHealh() {
        Zombue zom = new Zombue(100);
        Assertions.assertEquals(100, zom.getHealth());
    }

    @Test
    void attackHero() {
        Zombue zom = new Zombue(100);
        Mage librarian = new Mage("Iezekiel", 60);
        zom.attackHero(librarian);
        int actualInt = librarian.getHealth();
        Assertions.assertEquals(50, actualInt);
    }

    @Test
    void resurrection() {
        Zombue zom = new Zombue(0);
        zom.resurrection();
        Assertions.assertEquals(20, zom.getHealth());
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
        Zombue zom = new Zombue(100);
        zom.takeDamage(damage);
        int actualInt = zom.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

}



