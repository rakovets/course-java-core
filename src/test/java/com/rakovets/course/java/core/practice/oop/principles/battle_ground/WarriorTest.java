package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WarriorTest {
    @Test
    void Warrior() {
        Warrior gimli = new Warrior("Gimli", 1000);

        Assertions.assertEquals(1000, gimli.getHealth());
        Assertions.assertEquals("Gimli", gimli.getName());
    }

    @Test
    void WarriorName() {
        Warrior aragorn = new Warrior("Aragorn");

        Assertions.assertEquals("Aragorn", aragorn.getName());
        Assertions.assertEquals(100, aragorn.getHealth());
    }

    @Test
    void setHealth() {
        Warrior gimli = new Warrior("Gimli", 1000);

        gimli.setHealth(0);

        Assertions.assertEquals(0, gimli.getHealth());
    }

    @Test
    void getName() {
        Warrior aragorn = new Warrior("Aragorn", 1000);

        Assertions.assertEquals("Aragorn", aragorn.getName());
    }

    @Test
    void getHealth() {
        Warrior aragorn = new Warrior("Aragorn", 1000);

        Assertions.assertEquals(1000, aragorn.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(0, 3000),
                Arguments.of(0, 2000),
                Arguments.of(250, 1500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Warrior aragorn = new Warrior("Aragorn", 1000);

        aragorn.takeDamage(damage);
        int actualInt = aragorn.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(275, new Orc(300)),
                Arguments.of(495, new Golem(500)),
                Arguments.of(0, new Orc(5)),
                Arguments.of(2988, new Necromant(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemy")
    void attackEnemy(int expectedInt, Enemy enemy) {
        Warrior aragorn = new Warrior("Aragorn", 1000);

        aragorn.attackEnemy(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void healDamage() {
        Warrior aragorn = new Warrior("Aragorn", 120);

        aragorn.healDamage(20);

        Assertions.assertEquals(140, aragorn.getHealth());
    }
}
