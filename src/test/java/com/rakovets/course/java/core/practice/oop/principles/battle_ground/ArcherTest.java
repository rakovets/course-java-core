package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArcherTest {
    @Test
    void Archer() {
        Archer legolas = new Archer("Legolas", 750);

        Assertions.assertEquals(750, legolas.getHealth());
        Assertions.assertEquals("Legolas", legolas.getName());
    }
    @Test
    void ArcherName() {
        Archer bard = new Archer("Bard");

        Assertions.assertEquals("Bard", bard.getName());
        Assertions.assertEquals(100, bard.getHealth());
    }

    @Test
    void getName() {
        Archer legolas = new Archer("Legolas", 750);

        Assertions.assertEquals("Legolas",legolas.getName());
    }

    @Test
    void getHealth() {
        Archer legolas = new Archer("Legolas", 750);

        Assertions.assertEquals(750, legolas.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(0, 3000),
                Arguments.of(0, 750),
                Arguments.of(250, 500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Archer legolas = new Archer("Legolas", 750);

        legolas.takeDamage(damage);
        int actualInt = legolas.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(280, new Orc(300)),
                Arguments.of(496, new Golem(500)),
                Arguments.of(0, new Orc(5)),
                Arguments.of(3000, new Necromant(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemy")
    void attackEnemy(int expectedInt, Enemy enemy) {
        Archer legolas = new Archer("Legolas", 750);

        legolas.attackEnemy(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForUseDeathShotShot() {
        return Stream.of(
                Arguments.of(0, new Orc(300)),
                Arguments.of(0, new Golem(500)),
                Arguments.of(0, new Orc(5)),
                Arguments.of(0, new Necromant(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForUseDeathShotShot")
    void useDeathShot(int expectedInt, Enemy enemy) {
        Archer legolas = new Archer("Legolas", 750);

        legolas.useDeathShot(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void useRainOfArrowsThreeEnemy() {
        Archer legolas = new Archer("Legolas", 750);
        Orc goro = new Orc(300);

        legolas.useRainOfArrows(goro, goro, goro);
        int actualInt = goro.getHealth();

        Assertions.assertEquals(270, actualInt);
    }

    @Test
    void useRainOfArrowsTwoEnemy() {
        Archer legolas = new Archer("Legolas", 750);
        Orc goro = new Orc(300);

        legolas.useRainOfArrows(goro, goro);
        int actualInt = goro.getHealth();

        Assertions.assertEquals(270, actualInt);
    }
}
