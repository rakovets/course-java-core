package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import com.rakovets.course.java.core.practice.oop.principles.cats.home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WarriorTest {

    @Test
    void Warrior() {
        Warrior master = new Warrior("Lazarus", 100);

        Assertions.assertEquals(100, master.getHealth());
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
        Warrior master = new Warrior("Telion", 100);

        master.setHealth(health);
        int actualInt = master.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void getName() {
        Warrior master = new Warrior("Lazarus", 100);

        Assertions.assertEquals("Lazarus", master.getName());
    }

    @Test
    void getHealh() {
        Warrior master = new Warrior("Lazarus", 100);

        Assertions.assertEquals(100, master.getHealth());
    }

    @Test
    void attackEnemy() {
       Warrior master = new Warrior("Lazarus", 100);
       Ork nob = new Ork(60);
       master.attackEnemy(nob);

       int actualInt = nob.getHealth();

       Assertions.assertEquals(35, actualInt);
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
        Warrior master = new Warrior("Lazarus", 100);
        master.takeDamage(damage);

        int actualInt = master.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void useShield() {
        Warrior master = new Warrior("Lazarus", 100);

        Assertions.assertEquals(100, master.getHealth());
    }

    static Stream<Arguments> useShieldProvidedArguments() {
        return Stream.of(
                Arguments.of(70,  50),
                Arguments.of(78, 42),
                Arguments.of(20, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("useShieldProvidedArguments")
    void useShield(int expectedInt, int damage) {
        Warrior master = new Warrior("Lazarus", 100);
        master.useShield(damage);

        int actualInt = master.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }
}
