package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Ghoul;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GhoulTest {
    Ghoul ghoul = new Ghoul(600);
    Archer archer = new Archer("Archer", 500);

    static Stream<Arguments> provideArgumentsSetAndGetHealthMethods() {
        return Stream.of(
                Arguments.of(300, "Ghoul HP: 300"),
                Arguments.of(500, "Ghoul HP: 500"),
                Arguments.of(120, "Ghoul HP: 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSetAndGetHealthMethods")
    void testSetAndGetHealthMethods(int health, String expected) {
        ghoul.setHealth(health);
        String actual = "Ghoul HP: " + ghoul.getHealth();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(600, "State HP archer after attack Ghoul: 425 of 600"),
                Arguments.of(400, "State HP archer after attack Ghoul: 225 of 400"),
                Arguments.of(200, "State HP archer after attack Ghoul: 25 of 200")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemyMethod")
    void testAttackEnemyMethod(int health, String expected) {
        archer.setHealth(health);
        String actual = "State HP archer after attack Ghoul: " + ghoul.attackHero(archer) + " of " + health;
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTakeDamageAndIsAliveMethods() {
        return Stream.of(
                Arguments.of(250, "Ghoul lose 250 hp Ghoul alive? true"),
                Arguments.of(450, "Ghoul lose 450 hp Ghoul alive? true"),
                Arguments.of(650, "Ghoul lose 650 hp Ghoul alive? false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTakeDamageAndIsAliveMethods")
    void testTakeDamageAndIsAliveMethods(int damage, String expected) {
        ghoul.takeDamage(damage);
        String actual = "Ghoul lose " + damage + " hp" + " Ghoul alive? " + ghoul.isAlive();
        Assertions.assertEquals(expected, actual);
    }
}
