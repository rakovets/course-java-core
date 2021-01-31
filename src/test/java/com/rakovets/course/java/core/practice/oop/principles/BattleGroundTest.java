package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BattleGroundTest {

    static Stream<Arguments> getPlay() {
        return Stream.of(
                Arguments.of(new int[]{100, 40}, new Mag("Mag"), new Ghost(100)),
                Arguments.of(new int[]{55, 70}, new Warrior("Warrior"), new Zombie(100)),
                Arguments.of(new int[]{85, 10}, new Archer("Archer"), new Skeleton(100))
        );
    }

    @ParameterizedTest
    @MethodSource("getPlay")
    void startBattleGroundTest(int[] expected, Hero hero, Enemy enemy) {
        for (int i = 0; i < 3; i++) {
            hero.attackEnemy(enemy);
            enemy.attackHero(hero);
        }
        Assertions.assertArrayEquals(expected, new int[]{hero.getHealthHero(), enemy.getHealth()});
    }

    static Stream<Arguments> getPlayed() {
        return Stream.of(
                Arguments.of(new int[]{100, 0}, new Mag("Mag"), new Ghost(100)),
                Arguments.of(new int[]{0, 30}, new Warrior("Warrior"), new Zombie(100)),
                Arguments.of(new int[]{85, 0}, new Archer("Archer"), new Skeleton(100))
        );
    }

    @ParameterizedTest
    @MethodSource("getPlayed")
    void startBattleGroundTest2(int[] expected, Hero hero, Enemy enemy) {
        while (enemy.isAlive() && hero.isAlive()) {
            if (hero.isAlive()) {
                hero.attackEnemy(enemy);
            }
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
        }

        Assertions.assertArrayEquals(expected, new int[]{hero.getHealthHero(), enemy.getHealth()});

    }
}
