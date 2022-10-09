package com.rakovets.course.java.core.practice.oop_principles.battle_ground;


import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Werewolf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WerewolfTest {
    Werewolf werewolf = new Werewolf(550);
    Mag mag = new Mag("Mag", 500);

    static Stream<Arguments> provideArgumentsSetAndGetHealthMethods() {
        return Stream.of(
                Arguments.of(300, "Werewolf HP: 300"),
                Arguments.of(500, "Werewolf HP: 500"),
                Arguments.of(120, "Werewolf HP: 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSetAndGetHealthMethods")
    void testSetAndGetHealthMethods(int health, String expected) {
        werewolf.setHealth(health);
        String actual = "Werewolf HP: " + werewolf.getHealth();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(600, "State HP mag after attack Werewolf: 430 of 600"),
                Arguments.of(400, "State HP mag after attack Werewolf: 230 of 400"),
                Arguments.of(200, "State HP mag after attack Werewolf: 30 of 200")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemyMethod")
    void testAttackEnemyMethod(int health, String expected) {
        mag.setHealth(health);
        String actual = "State HP mag after attack Werewolf: " + werewolf.attackHero(mag) + " of " + health;
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTakeDamageAndIsAliveMethods() {
        return Stream.of(
                Arguments.of(250, "Werewolf lose 250 hp Werewolf alive? true"),
                Arguments.of(450, "Werewolf lose 450 hp Werewolf alive? true"),
                Arguments.of(650, "Werewolf lose 650 hp Werewolf alive? false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTakeDamageAndIsAliveMethods")
    void testTakeDamageAndIsAliveMethods(int damage, String expected) {
        werewolf.takeDamage(damage);
        String actual = "Werewolf lose " + damage + " hp" + " Werewolf alive? " + werewolf.isAlive();
        Assertions.assertEquals(expected, actual);
    }
}
