package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Mag;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WerewolfTest {
    Werewolf werewolf = new Werewolf(0, 0);
    Archer archer = new Archer("", 0);
    Mag mag = new Mag("", 0);
    Warrior warrior = new Warrior("", 0);
    static Hero hero;

    @BeforeAll
    static void beforeAll() {
        hero = new Hero("", 0) {
            @Override
            protected void attackEnemy(Enemy enemy) {
                enemy.takingDamage(0);
            }
        };
    }

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

        werewolf.attackHero(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfAttackHeroProvideArguments() {
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
    @MethodSource("werewolfAttackHeroProvideArguments")
    void werewolfAttackHero(int health, int time, int expected) {
        hero.setHealth(health);
        werewolf.setTime(time);

        werewolf.attackHero(hero);
        int actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfAttackMagProvideArguments() {
        return Stream.of(
                Arguments.of(100, 5, 85),
                Arguments.of(50, 12, 55),
                Arguments.of(0, 0, 0),
                Arguments.of(450, 6, 410),
                Arguments.of(450, 7, 430)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfAttackMagProvideArguments")
    void werewolfAttackMag(int health, int time, int expected) {
        mag.setHealth(health);
        werewolf.setTime(time);

        werewolf.attackHero(mag);
        int actual = mag.getHealth();

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

    static Stream<Arguments> werewolfTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(50, 30),
                Arguments.of(10, 0),
                Arguments.of(500, 480),
                Arguments.of(20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageArcherProviderArguments")
    void werewolfTakingDamageArcher(int health, int expected) {
        werewolf.setHealth(health);

        werewolf.takingDamage(archer.getDamageArcher());
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 60),
                Arguments.of(50, 10),
                Arguments.of(10, 0),
                Arguments.of(500, 460),
                Arguments.of(20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageArcherBoostShotProviderArguments")
    void werewolfTakingDamageArcherBoostShot(int health, int expected) {
        werewolf.setHealth(health);

        werewolf.takingDamage(archer.getBoostShot());
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageMagProviderArguments() {
        return Stream.of(
                Arguments.of(100, 83),
                Arguments.of(50, 33),
                Arguments.of(10, 0),
                Arguments.of(500, 483),
                Arguments.of(20, 3),
                Arguments.of(17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageMagProviderArguments")
    void werewolfTakingDamageMag(int health, int expected) {
        werewolf.setHealth(health);

        werewolf.takingDamage(mag.getDamageMag());
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 76),
                Arguments.of(50, 26),
                Arguments.of(10, 0),
                Arguments.of(500, 476),
                Arguments.of(20, 0),
                Arguments.of(24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageWarriorProviderArguments")
    void werewolfTakingDamageWarrior(int health, int expected) {
        werewolf.setHealth(health);

        werewolf.takingDamage(warrior.getDamageWarrior());
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> secondGuiseProviderArguments() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(0, false),
                Arguments.of(6, true),
                Arguments.of(7, false),
                Arguments.of(25, false),
                Arguments.of(12, false)
        );
    }

    @ParameterizedTest
    @MethodSource("secondGuiseProviderArguments")
    void secondGuise(int time, boolean expected) {
        werewolf.setTime(time);

        boolean actual = werewolf.secondGuise(time);

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
}
