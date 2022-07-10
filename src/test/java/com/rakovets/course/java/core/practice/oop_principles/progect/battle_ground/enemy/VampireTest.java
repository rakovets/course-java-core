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

public class VampireTest {
    Vampire vampire = new Vampire(0, 0);
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

    static Stream<Arguments> vampireAttackArcherProvideArguments() {
        return Stream.of(
                Arguments.of(100, 25, 75),
                Arguments.of(50, 25, 25),
                Arguments.of(0, 25, 0),
                Arguments.of(25, 25, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireAttackArcherProvideArguments")
    void vampireAttackArcher(int health, int damage, int expected) {
        archer.setHealthHero(health);
        vampire.setDamageEnemy(damage);

        vampire.attackHero(archer);
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireAttackHeroProvideArguments() {
        return Stream.of(
                Arguments.of(100, 25, 75),
                Arguments.of(50, 25, 25),
                Arguments.of(0, 25, 0),
                Arguments.of(25, 25, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireAttackHeroProvideArguments")
    void vampireAttackHero(int health, int damage, int expected) {
        hero.setHealthHero(health);
        vampire.setDamageEnemy(damage);

        vampire.attackHero(hero);
        int actual = hero.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireAttackMagProvideArguments() {
        return Stream.of(
                Arguments.of(450, 25, 425),
                Arguments.of(50, 25, 50),
                Arguments.of(0, 25, 0),
                Arguments.of(1, 110, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireAttackMagProvideArguments")
    void vampireAttackMag(int health, int damage, int expected) {
        mag.setHealthHero(health);
        vampire.setDamageEnemy(damage);

        vampire.attackHero(mag);
        int actual = mag.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100,1,100),
                Arguments.of(100, 20, 95),
                Arguments.of(50, 70, 0),
                Arguments.of(0, 40, 0),
                Arguments.of(10, 5, 10),
                Arguments.of(500, 350, 165),
                Arguments.of(50, 15, 50)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageProviderArguments")
    void vampireTakingDamage(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);

        vampire.takeDamage(damage);
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 95),
                Arguments.of(50, 20, 45),
                Arguments.of(0, 0, 0),
                Arguments.of(10, 20, 0),
                Arguments.of(500, 20, 495),
                Arguments.of(50, 20, 45)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageArcherProviderArguments")
    void vampireTakingDamageArcher(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        archer.setDamageHero(damage);

        vampire.takeDamage(archer.getDamageHero());
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 75),
                Arguments.of(50, 20, 25),
                Arguments.of(0, 20, 0),
                Arguments.of(10, 20, 0),
                Arguments.of(500, 20, 475),
                Arguments.of(50, 20, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageArcherBoostShotProviderArguments")
    void vampireTakingDamageArcherBoostShot(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.boostedShot(vampire);
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageMagProviderArguments() {
        return Stream.of(
                Arguments.of(100, 17, 98),
                Arguments.of(0, 0, 0),
                Arguments.of(10, 17, 0),
                Arguments.of(500, 17, 498),
                Arguments.of(50, 17, 48)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageMagProviderArguments")
    void vampireTakingDamageMag(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        mag.setDamageHero(damage);

        vampire.takeDamage(mag.getDamageHero());
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> vampireTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 24, 91),
                Arguments.of(50, 24, 41),
                Arguments.of(0, 0, 0),
                Arguments.of(10, 24, 0),
                Arguments.of(500, 24, 491),
                Arguments.of(50, 24, 41)
        );
    }

    @ParameterizedTest
    @MethodSource("vampireTakingDamageWarriorProviderArguments")
    void vampireTakingDamageWarrior(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        vampire.takeDamage(warrior.getDamageHero());
        int actual = vampire.getHealthEnemy();

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
        vampire.setHealthEnemy(health);

        boolean actual = vampire.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
