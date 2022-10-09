package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Demon;
import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WarriorTest {
    Warrior warrior = new Warrior("Leonid", 500);
    Demon demon = new Demon(0);

    static Stream<Arguments> provideArgumentsGetNameSetAndGetHealthMethods() {
        return Stream.of(
                Arguments.of(300, "Leonid HP: 300"),
                Arguments.of(500, "Leonid HP: 500"),
                Arguments.of(120, "Leonid HP: 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNameSetAndGetHealthMethods")
    void testGetNameSetAndGetHealthMethods(int health, String expected) {
        warrior.setHealth(health);
        String actual = warrior.getName() + " HP: " + warrior.getHealth();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(600, "State HP demon after attack Leonid : 425 of 600"),
                Arguments.of(400, "State HP demon after attack Leonid : 225 of 400"),
                Arguments.of(200, "State HP demon after attack Leonid : 25 of 200")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemyMethod")
    void testAttackEnemyMethod(int health, String expected) {
        demon.setHealth(health);
        String actual = "State HP demon after attack " + warrior.getName() + " : " + warrior.attackEnemy(demon) + " of " + health;
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTakeDamageAndIsAliveMethods() {
        return Stream.of(
                Arguments.of(150, "Leonid lose 150 hp Hero alive? true"),
                Arguments.of(350, "Leonid lose 350 hp Hero alive? true"),
                Arguments.of(550, "Leonid lose 550 hp Hero alive? false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTakeDamageAndIsAliveMethods")
    void testTakeDamageAndIsAliveMethods(int damage, String expected) {
        warrior.takeDamage(damage);
        String actual = warrior.getName() + " lose " + damage + " hp" + " Hero alive? " + warrior.isAlive();
        Assertions.assertEquals(expected, actual);
    }
}
