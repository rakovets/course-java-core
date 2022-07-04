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

public class ArcherTest {
    Archer archer = new Archer("", 0);
    Vampire vampire = new Vampire(0);
    Werewolf werewolf = new Werewolf(0, 0);
    Zombie zombie = new Zombie(0);
    Enemy enemy = new Enemy(0) {
        @Override
        protected void attackEnemy(Hero hero) {
        }
    };

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
        archer.setHealth(health);

        boolean actual = archer.isAlive();

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
        archer.setHealth(health);

        int actual = archer.takingDamage(damage);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByAVampireProviderArguments() {
        return Stream.of(
                Arguments.of(100, 75),
                Arguments.of(0, 0),
                Arguments.of(50, 25),
                Arguments.of(25, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerTakingDamageByAVampireProviderArguments")
    void archerTakingDamageByAVampire(int health, int expected) {
        archer.setHealth(health);

        int actual = archer.takingDamage(vampire.getDAMAGE_VAMPIRE());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByAWerewolfDayProviderArguments() {
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
    @MethodSource("archerTakingDamageByAWerewolfDayProviderArguments")
    void archerTakingDamageByAWerewolfDay(int health, int expected) {
        archer.setHealth(health);

        int actual = archer.takingDamage(werewolf.getDAMAGE_WEREWOLF());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByAWerewolfNightProviderArguments() {
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
    @MethodSource("archerTakingDamageByAWerewolfNightProviderArguments")
    void archerTakingDamageByAWerewolfNight(int health, int expected) {
        archer.setHealth(health);

        int actual = archer.takingDamage(werewolf.getDAMAGE_WEREWOLF_NIGHT());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerTakingDamageByAZombieProviderArguments() {
        return Stream.of(
                Arguments.of(100, 88),
                Arguments.of(0, 0),
                Arguments.of(50, 38),
                Arguments.of(12, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerTakingDamageByAZombieProviderArguments")
    void archerTakingDamageByAZombie(int health, int expected) {
        archer.setHealth(health);

        int actual = archer.takingDamage(zombie.getDAMAGE_ZOMBIE());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackEnemyProvideArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(50, 30),
                Arguments.of(0, 0),
                Arguments.of(20, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackEnemyProvideArguments")
    void archerAttackEnemy(int health, int expected) {
        enemy.setHealth(health);

        archer.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackEnemyBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 60),
                Arguments.of(50, 10),
                Arguments.of(0, 0),
                Arguments.of(40, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackEnemyBoostedShotProvideArguments")
    void archerAttackEnemyBoostedShot(int health, int expected) {
        enemy.setHealth(health);

        archer.boostedShot(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackVampireProvideArguments() {
        return Stream.of(
                Arguments.of(100, 95),
                Arguments.of(50, 45),
                Arguments.of(0, 0),
                Arguments.of(4, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackVampireProvideArguments")
    void archerAttackVampire(int health, int expected) {
        vampire.setHealth(health);

        archer.attackEnemy(vampire);
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackVampireBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 75),
                Arguments.of(50, 25),
                Arguments.of(0, 0),
                Arguments.of(40, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackVampireBoostedShotProvideArguments")
    void archerAttackVampireBoostedShot(int health, int expected) {
        vampire.setHealth(health);

        archer.boostedShot(vampire);
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackWerewolfProvideArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(50, 30),
                Arguments.of(0, 0),
                Arguments.of(20, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackWerewolfProvideArguments")
    void archerAttackWerewolf(int health, int expected) {
        werewolf.setHealth(health);

        archer.attackEnemy(werewolf);
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackWerewolfBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 60),
                Arguments.of(50, 10),
                Arguments.of(0, 0),
                Arguments.of(40, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackWerewolfBoostedShotProvideArguments")
    void archerAttackWerewolfBoostedShot(int health, int expected) {
        werewolf.setHealth(health);

        archer.boostedShot(werewolf);
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackZombieProvideArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(50, 30),
                Arguments.of(0, 0),
                Arguments.of(20, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackZombieProvideArguments")
    void archerAttackZombie(int health, int expected) {
        zombie.setHealth(health);

        archer.attackEnemy(zombie);
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> archerAttackZombieBoostedShotProvideArguments() {
        return Stream.of(
                Arguments.of(100, 60),
                Arguments.of(50, 10),
                Arguments.of(0, 0),
                Arguments.of(40, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("archerAttackZombieBoostedShotProvideArguments")
    void archerAttackZombieBoostedShot(int health, int expected) {
        zombie.setHealth(health);

        archer.boostedShot(zombie);
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
