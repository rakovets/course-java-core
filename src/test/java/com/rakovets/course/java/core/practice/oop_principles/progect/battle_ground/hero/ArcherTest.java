package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Vampire;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Werewolf;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArcherTest {
    Archer archer = new Archer("", 0, 0);
    Vampire vampire = new Vampire(0, 0);
    Werewolf werewolf = new Werewolf(0, 0, 0);
    Zombie zombie = new Zombie(0, 0);
    static Enemy enemy;

    @BeforeAll
    static void beforeAll() {
        enemy = new Enemy(0, 0) {
            @Override
            protected void attackHero(Hero hero) {
                hero.takeDamage(getDamageEnemy());
            }
        };
    }

    static Stream<Arguments> archerAttackEnemyProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 20, 30),
                Arguments.of(0, 0, 0),
                Arguments.of(20, 20, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackEnemyProvideArguments")
    void archerAttackEnemy(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.attackEnemy(enemy);
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackEnemyBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 60),
                Arguments.of(50, 20, 10),
                Arguments.of(0, 20, 0),
                Arguments.of(40, 20, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackEnemyBoostedShotProvideArguments")
    void archerAttackEnemyBoostedShot(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.boostedShot(enemy);
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackVampireProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 95),
                Arguments.of(50, 20, 45),
                Arguments.of(0, 0, 0),
                Arguments.of(4, 20, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackVampireProvideArguments")
    void archerAttackVampire(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.attackEnemy(vampire);
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackVampireBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 75),
                Arguments.of(50, 20, 25),
                Arguments.of(0, 0, 0),
                Arguments.of(40, 20, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackVampireBoostedShotProvideArguments")
    void archerAttackVampireBoostedShot(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.boostedShot(vampire);
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackWerewolfProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 20, 30),
                Arguments.of(0, 0, 0),
                Arguments.of(20, 20, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackWerewolfProvideArguments")
    void archerAttackWerewolf(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.attackEnemy(werewolf);
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackWerewolfBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 60),
                Arguments.of(50, 20, 10),
                Arguments.of(0, 0, 0),
                Arguments.of(40, 20, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackWerewolfBoostedShotProvideArguments")
    void archerAttackWerewolfBoostedShot(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.boostedShot(werewolf);
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackZombieProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 20, 30),
                Arguments.of(0, 0, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackZombieProvideArguments")
    void archerAttackZombie(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.attackEnemy(zombie);
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackZombieBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 20, 60),
                Arguments.of(50, 20, 10),
                Arguments.of(0, 0, 0),
                Arguments.of(10, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackZombieBoostedShotProvideArguments")
    void archerAttackZombieBoostedShot(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        archer.setDamageHero(damage);

        archer.boostedShot(zombie);
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80, 20),
                Arguments.of(0, 10, 0),
                Arguments.of(50, 20, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("archerTakingDamageProviderArguments")
    void archerTakingDamage(int health, int damage, int expected) {
        archer.setHealthHero(health);

        archer.takeDamage(damage);
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByAVampireProviderArguments() {
        return Stream.of(
                Arguments.of(100, 25, 75),
                Arguments.of(0, 0, 0),
                Arguments.of(50, 25, 25),
                Arguments.of(25, 25, 0),
                Arguments.of(10, 25, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerTakingDamageByAVampireProviderArguments")
    void archerTakingDamageByAVampire(int health, int damage, int expected) {
        archer.setHealthHero(health);
        vampire.setDamageEnemy(damage);

        archer.takeDamage(vampire.getDamageEnemy());
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByAWerewolfDayProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(0, 0, 0),
                Arguments.of(50, 20, 30),
                Arguments.of(25, 20, 5),
                Arguments.of(10, 20, 0),
                Arguments.of(20, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerTakingDamageByAWerewolfDayProviderArguments")
    void archerTakingDamageByAWerewolfDay(int health, int damage, int expected) {
        archer.setHealthHero(health);
        werewolf.setDamageEnemy(damage);

        archer.takeDamage(werewolf.getDamageEnemy());
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByWerewolfProviderArguments() {
        return Stream.of(
                Arguments.of(100, 2, 20, 60),
                Arguments.of(100, 0, 20, 80),
                Arguments.of(100, 1, 20, 60),
                Arguments.of(0, 1, 20, 0),
                Arguments.of(40, 1, 20, 0),
                Arguments.of(20, 12, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerTakingDamageByWerewolfProviderArguments")
    void archerTakingDamageByWerewolf(int health, int time, int damage, int expected) {
        archer.setHealthHero(health);
        werewolf.setTime(time);
        werewolf.setDamageEnemy(damage);

        werewolf.attackHero(archer);
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByAZombieProviderArguments() {
        return Stream.of(
                Arguments.of(100, 12, 88),
                Arguments.of(0, 0, 0),
                Arguments.of(50, 12, 38),
                Arguments.of(12, 12, 0),
                Arguments.of(10, 12, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerTakingDamageByAZombieProviderArguments")
    void archerTakingDamageByAZombie(int health, int damage, int expected) {
        archer.setHealthHero(health);
        zombie.setDamageEnemy(damage);

        archer.takeDamage(zombie.getDamageEnemy());
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("archerIsAliveProviderArguments")
    void archerIsAlive(int health, boolean expected) {
        archer.setHealthHero(health);

        boolean actual = archer.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
