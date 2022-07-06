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

public class HeroTest {
    Vampire vampire = new Vampire(0, 0);
    Werewolf werewolf = new Werewolf(0, 0, 0);
    Zombie zombie = new Zombie(0, 0);
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

    static Stream<Arguments> heroTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80, 20),
                Arguments.of(0, 10, 0),
                Arguments.of(50, 20, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageProviderArguments")
    void heroTakingDamage(int health, int damage, int expected) {
        hero.setHealthHero(health);

        int actual = hero.takeDamage(damage);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageVampireProviderArguments() {
        return Stream.of(
                Arguments.of(100, 25, 75),
                Arguments.of(0, 0, 0),
                Arguments.of(50, 25, 25),
                Arguments.of(25, 25, 0),
                Arguments.of(10, 25, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageVampireProviderArguments")
    void heroTakingDamageVampire(int health, int damage, int expected) {
        hero.setHealthHero(health);
        vampire.setDamageEnemy(damage);

        int actual = hero.takeDamage(vampire.getDamageEnemy());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageByAWerewolfDayProviderArguments() {
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
    @MethodSource("heroTakingDamageByAWerewolfDayProviderArguments")
    void heroTakingDamageByAWerewolfDay(int health, int damage, int expected) {
        hero.setHealthHero(health);
        werewolf.setDamageEnemy(damage);

        int actual = hero.takeDamage(werewolf.getDamageEnemy());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageByAWerewolfNightProviderArguments() {
        return Stream.of(
                Arguments.of(100, 40, 60),
                Arguments.of(0, 0, 0),
                Arguments.of(50, 40, 10),
                Arguments.of(25, 40, 0),
                Arguments.of(10, 40, 0),
                Arguments.of(40, 40, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageByAWerewolfNightProviderArguments")
    void heroTakingDamageByAWerewolfNight(int health, int damage, int expected) {
        hero.setHealthHero(health);
        werewolf.setDamageEnemy(damage);

        int actual = hero.takeDamage(werewolf.getDamageEnemy());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageByWerewolfProviderArguments() {
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
    @MethodSource("heroTakingDamageByWerewolfProviderArguments")
    void heroTakingDamageByWerewolf(int health, int time, int damage, int expected) {
        hero.setHealthHero(health);
        werewolf.setTime(time);
        werewolf.setDamageEnemy(damage);

        werewolf.attackHero(hero);
        int actual = hero.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageByAZombieProviderArguments() {
        return Stream.of(
                Arguments.of(100, 12, 88),
                Arguments.of(0, 0, 0),
                Arguments.of(50, 12, 38),
                Arguments.of(12, 12, 0),
                Arguments.of(10, 12, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageByAZombieProviderArguments")
    void heroTakingDamageByAZombie(int health, int damage, int expected) {
        hero.setHealthHero(health);
        zombie.setDamageEnemy(damage);

        int actual = hero.takeDamage(zombie.getDamageEnemy());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> isAliveHeroProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("isAliveHeroProviderArguments")
    void isAliveHero(int health, boolean expected) {
        hero.setHealthHero(health);

        boolean actual = hero.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
