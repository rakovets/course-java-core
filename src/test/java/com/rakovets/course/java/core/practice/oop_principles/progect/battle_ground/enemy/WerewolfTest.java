package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WerewolfTest {
    Werewolf werewolf = new Werewolf(0, 0);
    Archer archer = new Archer("", 0);

    static Stream<Arguments> werewolfAttackArcherProvideArguments() {
        return Stream.of(
                Arguments.of(100, 5, 60),
                Arguments.of(50, 12, 30),
                Arguments.of(0, 0, 0),
                Arguments.of(100, 1, 60),
                Arguments.of(40, 4, 0),
                Arguments.of(100, 6, 60),
                Arguments.of(100, 7, 80),
                Arguments.of(100, 0, 80)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfAttackArcherProvideArguments")
    void werewolfAttackArcher(int health, int time, int expected) {
        archer.setHealth(health);
        werewolf.setTime(time);

        werewolf.attackEnemy(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfIsAliveProviderArguments")
    void werewolfIsAlive(int health, boolean expected) {
        werewolf.setHealth(health);

        boolean actual = werewolf.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 70, 0),
                Arguments.of(0, 40, 0),
                Arguments.of(10, 5, 5),
                Arguments.of(500, 350, 150),
                Arguments.of(50, 15, 35)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageProviderArguments")
    void werewolfTakingDamage(int health, int damage, int expected) {
        werewolf.setHealth(health);

        werewolf.takingDamage(damage);
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
