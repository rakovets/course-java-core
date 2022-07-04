package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class VampireTest {
    Vampire vampire = new Vampire(0);
    Archer archer = new Archer("", 0);

    static Stream<Arguments> vampireIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireIsAliveProviderArguments")
    void vampireIsAlive(int health, boolean expected) {
        vampire.setHealth(health);

        boolean actual = vampire.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireAttackArcherProvideArguments() {
        return Stream.of(
                Arguments.of(100, 75),
                Arguments.of(50, 25),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireAttackArcherProvideArguments")
    void vampireAttackArcher(int health, int expected) {
        archer.setHealth(health);

        vampire.attackEnemy(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 95),
                Arguments.of(50, 70, 0),
                Arguments.of(0, 40, 0),
                Arguments.of(10, 5, 20),
                Arguments.of(500, 350, 165),
                Arguments.of(50, 15, 50)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageProviderArguments")
    void vampireTakingDamage(int health, int damage, int expected) {
        vampire.setHealth(health);

        vampire.takingDamage(damage);
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
