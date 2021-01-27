package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MageTest {

    @Test
    void Mage() {
        Mage librarian = new Mage("Iezekiel", 100);
        Assertions.assertEquals(100, librarian.getHealth());
    }

    @Test
    void setHealth() {
        Mage librarian = new Mage("Iezekiel", 100);
        librarian.setHealth(150);
        Assertions.assertEquals(150, librarian.getHealth());
        librarian.setHealth(-150);
        Assertions.assertEquals(-150, librarian.getHealth());
        librarian.setHealth(0);
        Assertions.assertEquals(0, librarian.getHealth());
    }

    @Test
    void getName() {
        Mage librarian = new Mage("Iezekiel", 100);
        Assertions.assertEquals("Iezekiel", librarian.getName());
    }

    @Test
    void getHealh() {
        Mage librarian = new Mage("Iezekiel", 100);
        Assertions.assertEquals(100, librarian.getHealth());
    }

    @Test
    void attackEnemy() {
        Mage librarian = new Mage("Iezekiel", 100);
        Ork nob = new Ork(60);
        librarian.attackEnemy(nob);
        int actualInt = nob.getHealth();
        Assertions.assertEquals(45, actualInt);
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
        Mage librarian = new Mage("Iezekiel", 100);
        librarian.takeDamage(damage);
        int actualInt = librarian.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void fireBlast() {
        Mage librarian = new Mage("Iezekiel", 100);
        Zombue zom1 = new Zombue(100);
        Zombue zom2 = new Zombue(20);
        Zombue zom3 = new Zombue(100);
        librarian.fireBlast(zom1, zom2, zom3);
        int actualInt1 = zom1.getHealth();
        int actualInt2 = zom2.getHealth();
        int actualInt3 = zom3.getHealth();
        Assertions.assertEquals(80, actualInt1);
        Assertions.assertEquals(80, actualInt1);
        Assertions.assertEquals(80, actualInt1);
    }

}
