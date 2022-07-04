package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Vampire;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Werewolf;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MageTest {
    Mag mag = new Mag("", 0);
    Vampire vampire = new Vampire(0);
    Werewolf werewolf = new Werewolf(0, 0);
    Zombie zombie = new Zombie(0);
    Enemy enemy = new Enemy(0) {
        @Override
        protected void attackHero(Hero hero) {
            hero.attackEnemy(enemy);
        }
    };

    static Stream<Arguments> magAttackEnemyProvideArguments() {
        return Stream.of(
                Arguments.of(100, 83),
                Arguments.of(50, 33),
                Arguments.of(0, 0),
                Arguments.of(20, 3),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackEnemyProvideArguments")
    void magAttackEnemy(int health, int expected) {
        enemy.setHealth(health);

        mag.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magAttackVampireProvideArguments() {
        return Stream.of(
                Arguments.of(100, 98),
                Arguments.of(50, 48),
                Arguments.of(0, 0),
                Arguments.of(4, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackVampireProvideArguments")
    void magAttackVampire(int health, int expected) {
        vampire.setHealth(health);

        mag.attackEnemy(vampire);
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magAttackWerewolfProvideArguments() {
        return Stream.of(
                Arguments.of(100, 0, 83),
                Arguments.of(100, 1, 83),
                Arguments.of(100, 6, 83),
                Arguments.of(100, 12, 83),
                Arguments.of(50, 4, 33),
                Arguments.of(0, 1, 0),
                Arguments.of(20, 7, 3),
                Arguments.of(10, 8, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackWerewolfProvideArguments")
    void magAttackWerewolf(int health, int time, int expected) {
        werewolf.setHealth(health);
        werewolf.setTime(time);

        mag.attackEnemy(werewolf);
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magAttackZombieProvideArguments() {
        return Stream.of(
                Arguments.of(100, 83),
                Arguments.of(50, 33),
                Arguments.of(0, 0),
                Arguments.of(18, 1),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magAttackZombieProvideArguments")
    void magAttackZombie(int health, int expected) {
        zombie.setHealth(health);

        mag.attackEnemy(zombie);
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80, 45),
                Arguments.of(0, 10, 0),
                Arguments.of(50, 20, 55),
                Arguments.of(4, 3, 26)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageProviderArguments")
    void magTakingDamage(int health, int damage, int expected) {
        mag.setHealth(health);

        int actual = mag.takingDamage(damage);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByAVampireProviderArguments() {
        return Stream.of(
                Arguments.of(100, 100),
                Arguments.of(0, 0),
                Arguments.of(45, 45),
                Arguments.of(25, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByAVampireProviderArguments")
    void magTakingDamageByAVampire(int health, int expected) {
        mag.setHealth(health);

        int actual = mag.takingDamage(vampire.getDAMAGE_VAMPIRE());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByAWerewolfDayProviderArguments() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(50, 55),
                Arguments.of(25, 30),
                Arguments.of(10, 0),
                Arguments.of(20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByAWerewolfDayProviderArguments")
    void magTakingDamageByAWerewolfDay(int health, int expected) {
        mag.setHealth(health);

        int actual = mag.takingDamage(werewolf.getDAMAGE_WEREWOLF());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByAWerewolfNightProviderArguments() {
        return Stream.of(
                Arguments.of(100, 85),
                Arguments.of(0, 0),
                Arguments.of(50, 35),
                Arguments.of(25, 0),
                Arguments.of(10, 0),
                Arguments.of(40, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByAWerewolfNightProviderArguments")
    void magTakingDamageByAWerewolfNight(int health, int expected) {
        mag.setHealth(health);

        int actual = mag.takingDamage(werewolf.getDAMAGE_WEREWOLF_NIGHT());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> magTakingDamageByAZombieProviderArguments() {
        return Stream.of(
                Arguments.of(100, 113),
                Arguments.of(0, 0),
                Arguments.of(50, 63),
                Arguments.of(12, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("magTakingDamageByAZombieProviderArguments")
    void magTakingDamageByAZombie(int health, int expected) {
        mag.setHealth(health);

        int actual = mag.takingDamage(zombie.getDAMAGE_ZOMBIE());

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
        mag.setHealth(health);

        boolean actual = mag.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
