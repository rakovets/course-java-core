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
    Werewolf werewolf = new Werewolf(0, 0, 0);
    Archer archer = new Archer("", 0, 0);
    Mag mag = new Mag("", 0, 0);
    Warrior warrior = new Warrior("", 0, 0);
    static Hero hero;

    @BeforeAll
    static void beforeAll() {
        hero = new Hero("", 0, 0) {
            @Override
            protected void attackEnemy(Enemy enemy) {
                enemy.takeDamage(getDamageHero());
            }
        };
    }

    static Stream<Arguments> werewolfAttackArcherProvideArguments() {
        return Stream.of(
                Arguments.of(100, 5, 20, 60),
                Arguments.of(50, 12, 20, 30),
                Arguments.of(0, 0, 0, 0),
                Arguments.of(100, 1, 20, 60),
                Arguments.of(40, 4, 20, 0),
                Arguments.of(100, 6, 20, 60),
                Arguments.of(100, 7, 20, 80),
                Arguments.of(100, 0, 20, 80)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfAttackArcherProvideArguments")
    void werewolfAttackArcher(int health, int time, int damage, int expected) {
        archer.setHealthHero(health);
        werewolf.setTime(time);
        werewolf.setDamageEnemy(damage);

        werewolf.attackHero(archer);
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfAttackHeroProvideArguments() {
        return Stream.of(
                Arguments.of(100, 5, 20, 60),
                Arguments.of(50, 12, 20, 30),
                Arguments.of(0, 0, 0, 0),
                Arguments.of(100, 1, 20, 60),
                Arguments.of(40, 4, 20, 0),
                Arguments.of(100, 6, 20, 60),
                Arguments.of(100, 7, 20, 80),
                Arguments.of(100, 0, 20, 80)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfAttackHeroProvideArguments")
    void werewolfAttackHero(int health, int time, int damage, int expected) {
        hero.setHealthHero(health);
        werewolf.setTime(time);
        werewolf.setDamageEnemy(damage);

        werewolf.attackHero(hero);
        int actual = hero.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfAttackMagProvideArguments() {
        return Stream.of(
                Arguments.of(100, 5, 20, 85),
                Arguments.of(50, 12, 20, 50),
                Arguments.of(0, 0, 20, 0),
                Arguments.of(450, 6, 20, 410),
                Arguments.of(450, 7, 20, 430)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfAttackMagProvideArguments")
    void werewolfAttackMag(int health, int time, int damage, int expected) {
        mag.setHealthHero(health);
        werewolf.setTime(time);
        werewolf.setDamageEnemy(damage);

        werewolf.attackHero(mag);
        int actual = mag.getHealthHero();

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
        werewolf.setHealthEnemy(health);

        werewolf.takeDamage(damage);
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 20, 30),
                Arguments.of(10, 20, 0),
                Arguments.of(500, 20, 480),
                Arguments.of(20, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageArcherProviderArguments")
    void werewolfTakingDamageArcher(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        archer.setDamageHero(damage);

        werewolf.takeDamage(archer.getDamageHero());
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 60),
                Arguments.of(50, 20, 10),
                Arguments.of(10, 20, 0),
                Arguments.of(500, 20, 460),
                Arguments.of(20, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageArcherBoostShotProviderArguments")
    void werewolfTakingDamageArcherBoostShot(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        archer.setDamageHero(damage);

        werewolf.takeDamage(archer.boostedShot());
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageMagProviderArguments() {
        return Stream.of(
                Arguments.of(100, 17, 83),
                Arguments.of(50, 17, 33),
                Arguments.of(10, 17, 0),
                Arguments.of(500, 17, 483),
                Arguments.of(20, 17, 3),
                Arguments.of(17, 17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageMagProviderArguments")
    void werewolfTakingDamageMag(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        mag.setDamageHero(damage);

        werewolf.takeDamage(mag.getDamageHero());
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> werewolfTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 24, 76),
                Arguments.of(50, 24, 26),
                Arguments.of(10, 24, 0),
                Arguments.of(500, 24, 476),
                Arguments.of(24, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("werewolfTakingDamageWarriorProviderArguments")
    void werewolfTakingDamageWarrior(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        werewolf.takeDamage(warrior.getDamageHero());
        int actual = werewolf.getHealthEnemy();

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
        werewolf.setHealthEnemy(health);

        boolean actual = werewolf.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
