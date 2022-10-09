package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_groud.Ghoul;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArcherTest {
    Archer archer = new Archer("Robin", 450);
    Ghoul ghoul = new Ghoul(0);

    static Stream<Arguments> provideArgumentsGetNameSetAndGetHealthMethods() {
        return Stream.of(
                Arguments.of(300, "Robin HP: 300"),
                Arguments.of(500, "Robin HP: 500"),
                Arguments.of(120, "Robin HP: 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNameSetAndGetHealthMethods")
    void testGetNameSetAndGetHealthMethods(int health, String expected) {
        archer.setHealth(health);
        String actual = archer.getName() + " HP: " + archer.getHealth();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(600, "State HP ghoul after attack Robin : 420 of 600"),
                Arguments.of(400, "State HP ghoul after attack Robin : 220 of 400"),
                Arguments.of(200, "State HP ghoul after attack Robin : 20 of 200")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemyMethod")
    void testAttackEnemyMethod(int health, String expected) {
        ghoul.setHealth(health);
        String actual = "State HP ghoul after attack " + archer.getName() + " : " + archer.attackEnemy(ghoul) + " of " + health;
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTakeDamageAndIsAliveMethods() {
        return Stream.of(
                Arguments.of(150, "Robin lose 150 hp Hero alive? true"),
                Arguments.of(350, "Robin lose 350 hp Hero alive? true"),
                Arguments.of(550, "Robin lose 550 hp Hero alive? false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTakeDamageAndIsAliveMethods")
    void testTakeDamageAndIsAliveMethods(int damage, String expected) {
        archer.takeDamage(damage);
        String actual = archer.getName() + " lose " + damage + " hp" + " Hero alive? " + archer.isAlive();
        Assertions.assertEquals(expected, actual);
    }
}
