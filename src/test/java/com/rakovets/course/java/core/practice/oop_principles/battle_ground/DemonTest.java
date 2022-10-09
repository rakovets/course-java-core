package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Demon;
import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DemonTest {
    Demon demon = new Demon(650);
    Warrior warrior = new Warrior("Warrior", 500);

    static Stream<Arguments> provideArgumentsSetAndGetHealthMethods() {
        return Stream.of(
                Arguments.of(300, "Demon HP: 300"),
                Arguments.of(500, "Demon HP: 500"),
                Arguments.of(120, "Demon HP: 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSetAndGetHealthMethods")
    void testSetAndGetHealthMethods(int health, String expected) {
        demon.setHealth(health);
        String actual = "Demon HP: " + demon.getHealth();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(600, "State HP warrior after attack Demon: 424 of 600"),
                Arguments.of(400, "State HP warrior after attack Demon: 224 of 400"),
                Arguments.of(200, "State HP warrior after attack Demon: 24 of 200")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemyMethod")
    void testAttackEnemyMethod(int health, String expected) {
        warrior.setHealth(health);
        String actual = "State HP warrior after attack Demon: " + demon.attackHero(warrior) + " of " + health;
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTakeDamageAndIsAliveMethods() {
        return Stream.of(
                Arguments.of(250, "Demon lose 250 hp Demon alive? true"),
                Arguments.of(450, "Demon lose 450 hp Demon alive? true"),
                Arguments.of(650, "Demon lose 650 hp Demon alive? false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTakeDamageAndIsAliveMethods")
    void testTakeDamageAndIsAliveMethods(int damage, String expected) {
        demon.takeDamage(damage);
        String actual = "Demon lose " + damage + " hp" + " Demon alive? " + demon.isAlive();
        Assertions.assertEquals(expected, actual);
    }
}
