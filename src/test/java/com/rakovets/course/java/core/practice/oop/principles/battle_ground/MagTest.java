package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MagTest {
    @Test
    void Mag() {
        Mag gandalf = new Mag("Gandalf", 500);

        Assertions.assertEquals(500, gandalf.getHealth());
        Assertions.assertEquals("Gandalf", gandalf.getName());
    }

    @Test
    void MagName() {
        Mag alatar = new Mag("Alatar");

        Assertions.assertEquals("Alatar", alatar.getName());
        Assertions.assertEquals(100, alatar.getHealth());
    }

    @Test
    void setHealth() {
        Mag gandalf = new Mag("Gandalf", 500);

        gandalf.setHealth(200);

        Assertions.assertEquals(200, gandalf.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(460, 20),
                Arguments.of(0, 250),
                Arguments.of(0, 1500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Mag gandalf = new Mag("Gandalf", 500);

        gandalf.takeDamage(damage);
        int actualInt = gandalf.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(260, new Orc(300)),
                Arguments.of(492, new Golem(500)),
                Arguments.of(0, new Necromant(5)),
                Arguments.of(2980, new Necromant(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemy")
    void attackEnemy(int expectedInt, Enemy enemy) {
        Mag gandalf = new Mag("Gandalf", 500);

        gandalf.attackEnemy(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForUseFireBall() {
        return Stream.of(
                Arguments.of(0, new Orc(300)),
                Arguments.of(0, new Golem(500)),
                Arguments.of(0, new Necromant(5))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForUseFireBall")
    void curseEnemy(int expectedInt, Enemy enemy) {
        Mag gandalf = new Mag("Gandalf", 500);

        gandalf.useFireBall(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void resurrectHero() {
        Mag gandalf = new Mag("Gandalf", 500);
        Warrior aragorn = new Warrior("Aragorn");

        aragorn.setHealth(0);
        gandalf.resurrectHero(aragorn);
        int actualInt = aragorn.getHealth();

        Assertions.assertEquals(100, actualInt);
    }
}
