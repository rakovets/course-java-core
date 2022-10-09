package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Werewolf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MagTest {
    Mag mag = new Mag("Merlin", 400);
    Werewolf werewolf = new Werewolf(0);

    static Stream<Arguments> provideArgumentsGetNameSetAndGetHealthMethods() {
        return Stream.of(
                Arguments.of(300, "Merlin HP: 300"),
                Arguments.of(500, "Merlin HP: 500"),
                Arguments.of(120, "Merlin HP: 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNameSetAndGetHealthMethods")
    void testGetNameSetAndGetHealthMethods(int health, String expected) {
        mag.setHealth(health);
        String actual = mag.getName() + " HP: " + mag.getHealth();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(600, "State HP werewolf after attack Merlin : 428 of 600"),
                Arguments.of(400, "State HP werewolf after attack Merlin : 228 of 400"),
                Arguments.of(200, "State HP werewolf after attack Merlin : 28 of 200")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemyMethod")
    void testAttackEnemyMethod(int health, String expected) {
        werewolf.setHealth(health);
        String actual = "State HP werewolf after attack " + mag.getName() + " : " + mag.attackEnemy(werewolf) + " of " + health;
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTakeDamageAndIsAliveMethods() {
        return Stream.of(
                Arguments.of(150, "Merlin lose 150 hp Hero alive? true"),
                Arguments.of(350, "Merlin lose 350 hp Hero alive? true"),
                Arguments.of(550, "Merlin lose 550 hp Hero alive? false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTakeDamageAndIsAliveMethods")
    void testTakeDamageAndIsAliveMethods(int damage, String expected) {
        mag.takeDamage(damage);
        String actual = mag.getName() + " lose " + damage + " hp" + " Hero alive? " + mag.isAlive();
        Assertions.assertEquals(expected, actual);
    }
}
