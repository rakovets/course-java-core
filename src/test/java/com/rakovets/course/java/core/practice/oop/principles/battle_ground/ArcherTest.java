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
    void ArcherOnlyName() {
        Archer bard = new Archer("Bard");

        Assertions.assertEquals("Bard", bard.getName());
        Assertions.assertEquals(100, bard.getHealth());
    }

    @Test
    void ArcherHealthUnderHundred() {
        Archer dowahkiin = new Archer("Dowahkiin", 1);

        Assertions.assertEquals(100, dowahkiin.getHealth());
    }

    @Test
    void setHealth() {
        Archer legolas = new Archer("Legolas", 750);

        legolas.setHealth(200);

        Assertions.assertEquals(200, legolas.getHealth());
    }

    @Test
    void setHealthWithNegativNumber() {
        Archer legolas = new Archer("Legolas", 750);

        legolas.setHealth(-100);

        Assertions.assertEquals(750, legolas.getHealth());
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
                Arguments.of(285, new Wolf(300)),
                Arguments.of(495, new Hydra(500)),
                Arguments.of(0, new Wolf(5)),
                Arguments.of(3000, new Angel(3000))
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

    @Test
    void attackEnemyIfArcherIsDead() {
        Archer legolas = new Archer("Legolas", 750);
        Wolf akela = new Wolf(300);

        legolas.setHealth(0);
        legolas.attackEnemy(akela);
        int actualIntArcherIsDead = akela.getHealth();

        Assertions.assertEquals(300, actualIntArcherIsDead);
    }

    @Test
    void attackEnemyIfEnemyIsDead() {
        Archer legolas = new Archer("Legolas", 750);
        Wolf akela = new Wolf(300);

        akela.setHealth(0);
        legolas.attackEnemy(akela);
        int actualIntWolfIsDead = akela.getHealth();

        Assertions.assertEquals(0, actualIntWolfIsDead);
    }

    static Stream<Arguments> provideArgumentsForAttackFatalShot() {
        return Stream.of(
                Arguments.of(0, new Wolf(300)),
                Arguments.of(0, new Hydra(500)),
                Arguments.of(0, new Wolf(5)),
                Arguments.of(0, new Angel(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackFatalShot")
    void attackFatalShot(int expectedInt, Enemy enemy) {
        Archer legolas = new Archer("Legolas", 750);

        legolas.attackFatalShot(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void attackFatalShotIfArcherIsDead() {
        Archer legolas = new Archer("Legolas", 750);
        Wolf akela = new Wolf(300);

        legolas.setHealth(0);
        legolas.attackEnemy(akela);
        int actualIntArcherIsDead = akela.getHealth();

        Assertions.assertEquals(300, actualIntArcherIsDead);
    }

    @Test
    void attackFatalShotIfEnemyIsDead() {
        Archer legolas = new Archer("Legolas", 750);
        Wolf akela = new Wolf(300);

        akela.setHealth(0);
        legolas.attackEnemy(akela);
        int actualIntWolfIsDead = akela.getHealth();

        Assertions.assertEquals(0, actualIntWolfIsDead);
    }

    @Test
    void attackWallOfArrowsTrippleDamage() {
        Archer legolas = new Archer("Legolas", 750);
        Wolf akela = new Wolf(300);

        legolas.attackWallOfArrows(akela, akela, akela);
        int actualInt = akela.getHealth();

        Assertions.assertEquals(285, actualInt);
    }

    @Test
    void attackWallOfArrowsDoubleDamage() {
        Archer legolas = new Archer("Legolas", 750);
        Wolf akela = new Wolf(300);

        legolas.attackWallOfArrows(akela, akela);
        int actualInt = akela.getHealth();

        Assertions.assertEquals(286, actualInt);
    }

    @Test
    void attackWallOfArrowsArcherIsDead() {
        Archer legolas = new Archer("Legolas", 750);
        Wolf akela = new Wolf(300);

        legolas.setHealth(0);
        legolas.attackWallOfArrows(akela, akela, akela);
        int actualInt = akela.getHealth();

        Assertions.assertEquals(300, actualInt);
    }

    @Test
    void attackWallOfArrowsEnemyIsDead() {
        Archer legolas = new Archer("Legolas", 750);
        Hydra wrath = new Hydra(1000);
        Wolf akela = new Wolf(300);

        akela.setHealth(0);
        legolas.attackWallOfArrows(wrath, akela);
        int actualIntHydraEnemyIsDead = wrath.getHealth();
        int actualIntWolfEnemyIsDead = akela.getHealth();

        Assertions.assertEquals(1000, actualIntHydraEnemyIsDead);
        Assertions.assertEquals(0, actualIntWolfEnemyIsDead);
    }
}
