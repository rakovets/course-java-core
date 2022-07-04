package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ZombieTest {
    Zombie zombie = new Zombie(0);
    Archer archer = new Archer("", 0);

    static Stream<Arguments> zombieIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieIsAliveProviderArguments")
    void zombieIsAlive(int health, boolean expected) {
        zombie.setHealth(health);

        boolean actual = zombie.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieAttackArcherArcherProvideArguments() {
        return Stream.of(
                Arguments.of(100, 88),
                Arguments.of(50, 38),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieAttackArcherArcherProvideArguments")
    void zombieAttackArcher(int health, int expected) {
        archer.setHealth(health);

        zombie.attackEnemy(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageProviderArguments() {
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
    @MethodSource("zombieTakingDamageProviderArguments")
    void zombieTakingDamage(int health, int damage, int expected) {
        zombie.setHealth(health);

        zombie.takingDamage(damage);
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(50, 30),
                Arguments.of(0, 0),
                Arguments.of(25, 5),
                Arguments.of(500, 480),
                Arguments.of(2, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageArcherProviderArguments")
    void zombieTakingDamageArcher(int health, int expected) {
        zombie.setHealth(health);

        zombie.takingDamage(archer.getDAMAGES_ARCHER());
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
