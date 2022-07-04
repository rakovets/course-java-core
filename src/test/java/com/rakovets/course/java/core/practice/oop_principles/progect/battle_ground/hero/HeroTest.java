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
    Vampire vampire = new Vampire(0);
    Werewolf werewolf = new Werewolf(0, 0);
    Zombie zombie = new Zombie(0);
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
        hero.setHealth(health);

        int actual = hero.takingDamage(damage);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageVampireProviderArguments() {
        return Stream.of(
                Arguments.of(100, 75),
                Arguments.of(0, 0),
                Arguments.of(50, 25),
                Arguments.of(25, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageVampireProviderArguments")
    void heroTakingDamageVampire(int health, int expected) {
        hero.setHealth(health);

        int actual = hero.takingDamage(vampire.getDAMAGE_VAMPIRE());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageByAWerewolfDayProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(0, 0),
                Arguments.of(50, 30),
                Arguments.of(25, 5),
                Arguments.of(10, 0),
                Arguments.of(20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageByAWerewolfDayProviderArguments")
    void heroTakingDamageByAWerewolfDay(int health, int expected) {
        hero.setHealth(health);

        int actual = hero.takingDamage(werewolf.getDAMAGE_WEREWOLF());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageByAWerewolfNightProviderArguments() {
        return Stream.of(
                Arguments.of(100, 60),
                Arguments.of(0, 0),
                Arguments.of(50, 10),
                Arguments.of(25, 0),
                Arguments.of(10, 0),
                Arguments.of(40, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageByAWerewolfNightProviderArguments")
    void heroTakingDamageByAWerewolfNight(int health, int expected) {
        hero.setHealth(health);

        int actual = hero.takingDamage(werewolf.getDAMAGE_WEREWOLF_NIGHT());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> heroTakingDamageByAZombieProviderArguments() {
        return Stream.of(
                Arguments.of(100, 88),
                Arguments.of(0, 0),
                Arguments.of(50, 38),
                Arguments.of(12, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("heroTakingDamageByAZombieProviderArguments")
    void heroTakingDamageByAZombie(int health, int expected) {
        hero.setHealth(health);

        int actual = hero.takingDamage(zombie.getDAMAGE_ZOMBIE());

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
        hero.setHealth(health);

        boolean actual = hero.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
