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

        Archer bard = new Archer("Bard");
        Assertions.assertEquals("Bard", bard.getName());
        Assertions.assertEquals(100, bard.getHealth());

        Archer dowahkiin = new Archer("Dowahkiin", 1);
        Assertions.assertEquals(100, dowahkiin.getHealth());
    }

    @Test
    void setHealth() {
        Archer legolas = new Archer("Legolas", 750);
        legolas.setHealth(-100);
        Assertions.assertEquals(750, legolas.getHealth());

        legolas.setHealth(200);
        Assertions.assertEquals(200, legolas.getHealth());

        legolas.setHealth(0);
        Assertions.assertEquals(0, legolas.getHealth());
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
    void attackEnemy() {
        Archer legolas = new Archer("Legolas", 750);
        legolas.setHealth(0);
        Wolf akela = new Wolf(300);
        legolas.attackEnemy(akela);
        int actualIntArcherIsDead = akela.getHealth();

        Assertions.assertEquals(300, actualIntArcherIsDead);

        legolas.setHealth(500);
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
    void attackFatalShot() {
        Archer legolas = new Archer("Legolas", 750);
        legolas.setHealth(0);
        Wolf akela = new Wolf(300);
        legolas.attackEnemy(akela);
        int actualIntArcherIsDead = akela.getHealth();

        Assertions.assertEquals(300, actualIntArcherIsDead);

        legolas.setHealth(500);
        akela.setHealth(0);
        legolas.attackEnemy(akela);
        int actualIntWolfIsDead = akela.getHealth();

        Assertions.assertEquals(0, actualIntWolfIsDead);
    }

    @Test
    void attackWallOfArrows() {
        Archer legolas = new Archer("Legolas", 750);
        Hydra wrath = new Hydra(1000);
        Wolf akela = new Wolf(300);
        Angel castiel = new Angel(3000);

        legolas.attackWallOfArrows(wrath, akela, castiel);
        int actualIntHydra = wrath.getHealth();
        int actualIntWolf = akela.getHealth();
        int actualIntAngel = castiel.getHealth();

        Assertions.assertEquals(999, actualIntHydra);
        Assertions.assertEquals(295, actualIntWolf);
        Assertions.assertEquals(3000, actualIntAngel);

        legolas.attackWallOfArrows(wrath, akela);
        int actualIntHydraSecondShot = wrath.getHealth();
        int actualIntWolfSecondShot = akela.getHealth();

        Assertions.assertEquals(997, actualIntHydraSecondShot);
        Assertions.assertEquals(288, actualIntWolfSecondShot);

        legolas.setHealth(0);
        legolas.attackWallOfArrows(wrath,akela,castiel);
        int actualIntHydraArcherIsDead = wrath.getHealth();
        int actualIntWolfArcherIsDead = akela.getHealth();
        int actualIntAngelArcherIsDead = castiel.getHealth();

        Assertions.assertEquals(997, actualIntHydraArcherIsDead);
        Assertions.assertEquals(288, actualIntWolfArcherIsDead);
        Assertions.assertEquals(3000, actualIntAngelArcherIsDead);

        legolas.setHealth(500);
        akela.setHealth(0);
        legolas.attackWallOfArrows(wrath, akela);
        int actualIntHydraEnemyIsDead = wrath.getHealth();
        int actualIntWolfEnemyIsDead = akela.getHealth();

        Assertions.assertEquals(997, actualIntHydraEnemyIsDead);
        Assertions.assertEquals(0, actualIntWolfEnemyIsDead);
    }
}
