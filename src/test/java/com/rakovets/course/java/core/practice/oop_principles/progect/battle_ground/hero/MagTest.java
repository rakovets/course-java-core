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

public class MagTest {
    Mag mag = new Mag("", 0, 0);
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

    static Stream<Arguments> magAttackEnemyProvideArguments() {
        return Stream.of(
                Arguments.of(100, 17, 83),
                Arguments.of(50, 17, 33),
                Arguments.of(0, 0, 0),
                Arguments.of(20, 17, 3),
                Arguments.of(17, 17, 0),
                Arguments.of(10, 17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackEnemyProvideArguments")
    void magAttackEnemy(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        mag.setDamageHero(damage);

        mag.attackEnemy(enemy);
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magAttackVampireProvideArguments() {
        return Stream.of(
                Arguments.of(100, 17, 98),
                Arguments.of(50, 17, 48),
                Arguments.of(0, 0, 0),
                Arguments.of(4, 17, 0),
                Arguments.of(10, 17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackVampireProvideArguments")
    void magAttackVampire(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        mag.setDamageHero(damage);

        mag.attackEnemy(vampire);
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magAttackWerewolfProvideArguments() {
        return Stream.of(
                Arguments.of(100, 17, 83),
                Arguments.of(50, 17, 33),
                Arguments.of(0, 17, 0),
                Arguments.of(20, 17, 3),
                Arguments.of(10, 17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackWerewolfProvideArguments")
    void magAttackWerewolf(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        mag.setDamageHero(damage);

        mag.attackEnemy(werewolf);
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magAttackZombieProvideArguments() {
        return Stream.of(
                Arguments.of(100, 17, 83),
                Arguments.of(50, 17, 33),
                Arguments.of(0, 0, 0),
                Arguments.of(18, 17, 1),
                Arguments.of(10, 17, 0),
                Arguments.of(10, 0, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackZombieProvideArguments")
    void magAttackZombie(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        mag.setDamageHero(damage);

        mag.attackEnemy(zombie);
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(50, 20, 50),
                Arguments.of(100, 80, 45),
                Arguments.of(0, 10, 0),
                Arguments.of(4, 3, 4),
                Arguments.of(100, 75, 50)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageProviderArguments")
    void magTakingDamage(int health, int damage, int expected) {
        mag.setHealthHero(health);

        int actual = mag.takeDamage(damage);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByAVampireProviderArguments() {
        return Stream.of(
                Arguments.of(25, 25, 0),
                Arguments.of(100, 25, 100),
                Arguments.of(0, 0, 0),
                Arguments.of(45, 25, 45),
                Arguments.of(10, 25, 0),
                Arguments.of(450, 25, 425)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByAVampireProviderArguments")
    void magTakingDamageByAVampire(int health, int damage, int expected) {
        mag.setHealthHero(health);
        vampire.setDamageEnemy(damage);

        int actual = mag.takeDamage(vampire.getDamageEnemy());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByAWerewolfDayProviderArguments() {
        return Stream.of(
                Arguments.of(0, 20, 0),
                Arguments.of(50, 20, 50),
                Arguments.of(25, 20, 25),
                Arguments.of(10, 20, 0),
                Arguments.of(20, 20, 0),
                Arguments.of(450, 20, 430)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByAWerewolfDayProviderArguments")
    void magTakingDamageByAWerewolfDay(int health, int damage, int expected) {
        mag.setHealthHero(health);
        werewolf.setDamageEnemy(damage);

        int actual = mag.takeDamage(werewolf.getDamageEnemy());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByWerewolfProviderArguments() {
        return Stream.of(
                Arguments.of(100, 2, 20, 85),
                Arguments.of(100, 0, 20, 100),
                Arguments.of(100, 1, 20, 85),
                Arguments.of(0, 1, 20, 0),
                Arguments.of(40, 1, 20, 0),
                Arguments.of(20, 12, 20, 0),
                Arguments.of(450, 2, 20, 410),
                Arguments.of(450, 12, 20, 430)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByWerewolfProviderArguments")
    void magTakingDamageByWerewolf(int health, int time, int damage, int expected) {
        mag.setHealthHero(health);
        werewolf.setTime(time);
        werewolf.setDamageEnemy(damage);

        werewolf.attackHero(mag);
        int actual = mag.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByAZombieProviderArguments() {
        return Stream.of(
                Arguments.of(100, 12, 100),
                Arguments.of(0, 0, 0),
                Arguments.of(50, 12, 50),
                Arguments.of(12, 12, 0),
                Arguments.of(10, 10, 0),
                Arguments.of(450, 10, 440)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByAZombieProviderArguments")
    void magTakingDamageByAZombie(int health, int damage, int expected) {
        mag.setHealthHero(health);
        zombie.setDamageEnemy(damage);

        int actual = mag.takeDamage(zombie.getDamageEnemy());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> mageIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("mageIsAliveProviderArguments")
    void mageIsAlive(int health, boolean expected) {
        mag.setHealthHero(health);

        boolean actual = mag.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
