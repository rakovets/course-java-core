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

class WarriorTest {
    static Enemy enemy;

    Warrior warrior = new Warrior("", 0, 0);
    Vampire vampire = new Vampire(0, 0);
    Werewolf werewolf = new Werewolf(0, 0, 0);
    Zombie zombie = new Zombie(0, 0);

    @BeforeAll
    static void beforeAll() {
        enemy = new Enemy(0, 0) {
            @Override
            protected void attackHero(Hero hero) {
                hero.takeDamage(getDamageEnemy());
            }
        };
    }

    static Stream<Arguments> warriorAttackEnemyProvideArguments() {
        return Stream.of(
                Arguments.of(100, 24, 76),
                Arguments.of(50, 24, 26),
                Arguments.of(0, 0, 0),
                Arguments.of(24, 24, 0),
                Arguments.of(10, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("warriorAttackEnemyProvideArguments")
    void archerAttackEnemy(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        warrior.attackEnemy(enemy);
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> warriorAttackVampireProvideArguments() {
        return Stream.of(
                Arguments.of(100, 24, 91),
                Arguments.of(50, 24, 41),
                Arguments.of(0, 0, 0),
                Arguments.of(4, 24, 0),
                Arguments.of(10, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("warriorAttackVampireProvideArguments")
    void warriorAttackVampire(int health, int damage, int expected) {
        vampire.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        warrior.attackEnemy(vampire);
        int actual = vampire.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> warriorAttackWerewolfProvideArguments() {
        return Stream.of(
                Arguments.of(100, 24, 76),
                Arguments.of(50, 24, 26),
                Arguments.of(0, 0, 0),
                Arguments.of(24, 24, 0),
                Arguments.of(10, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("warriorAttackWerewolfProvideArguments")
    void warriorAttackWerewolf(int health, int damage, int expected) {
        werewolf.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        warrior.attackEnemy(werewolf);
        int actual = werewolf.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> warriorAttackZombieProvideArguments() {
        return Stream.of(
                Arguments.of(100, 24, 76),
                Arguments.of(50, 24, 26),
                Arguments.of(0, 0, 0),
                Arguments.of(25, 24, 1),
                Arguments.of(10, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("warriorAttackZombieProvideArguments")
    void warriorAttackZombie(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        warrior.attackEnemy(zombie);
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> warriorIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("warriorIsAliveProviderArguments")
    void warriorIsAlive(int health, boolean expected) {
        warrior.setHealthHero(health);

        boolean actual = warrior.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
