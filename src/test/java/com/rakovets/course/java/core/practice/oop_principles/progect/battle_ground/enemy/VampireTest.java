package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Mag;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class VampireTest {
    Vampire vampire = new Vampire(0);
    Archer archer = new Archer("", 0);
    Mag mag = new Mag("", 0);
    Warrior warrior = new Warrior("", 0);
    Hero hero = new Hero("", 0) {
        @Override
        protected void attackEnemy(Enemy enemy) {
            enemy.takingDamage(0);
        }
    };

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

        vampire.attackHero(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireAttackHeroProvideArguments() {
        return Stream.of(
                Arguments.of(100, 75),
                Arguments.of(50, 25),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireAttackHeroProvideArguments")
    void vampireAttackHero(int health, int expected) {
        hero.setHealth(health);

        vampire.attackHero(hero);
        int actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireAttackMagProvideArguments() {
        return Stream.of(
                Arguments.of(450, 425),
                Arguments.of(50, 50),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireAttackMagProvideArguments")
    void vampireAttackMag(int health, int expected) {
        mag.setHealth(health);

        vampire.attackHero(mag);
        int actual = mag.getHealth();

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

    static Stream<Arguments> vampireTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 95),
                Arguments.of(50, 45),
                Arguments.of(0, 0),
                Arguments.of(10, 0),
                Arguments.of(500, 495),
                Arguments.of(50, 45)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageArcherProviderArguments")
    void vampireTakingDamageArcher(int health, int expected) {
        vampire.setHealth(health);

        vampire.takingDamage(archer.getDamageArcher());
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 75),
                Arguments.of(50, 25),
                Arguments.of(0, 0),
                Arguments.of(10, 0),
                Arguments.of(500, 475),
                Arguments.of(50, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageArcherBoostShotProviderArguments")
    void vampireTakingDamageArcherBoostShot(int health, int expected) {
        vampire.setHealth(health);

        vampire.takingDamage(archer.getBoostShot());
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageMagProviderArguments() {
        return Stream.of(
                Arguments.of(100, 98),
                Arguments.of(50, 48),
                Arguments.of(0, 0),
                Arguments.of(10, 0),
                Arguments.of(500, 498),
                Arguments.of(50, 48)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageMagProviderArguments")
    void vampireTakingDamageMag(int health, int expected) {
        vampire.setHealth(health);

        vampire.takingDamage(mag.getDamageMag());
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 91),
                Arguments.of(50, 41),
                Arguments.of(0, 0),
                Arguments.of(10, 0),
                Arguments.of(500, 491),
                Arguments.of(50, 41)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageWarriorProviderArguments")
    void vampireTakingDamageWarrior(int health, int expected) {
        vampire.setHealth(health);

        vampire.takingDamage(warrior.getDamageWarrior());
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }


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
}
