package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NecromantTest {
    @Test
    void Necromant() {
        Assertions.assertEquals(1000, new Necromant(1000).getHealth());
    }

    @Test
    void setHealth() {
        Necromant saruman = new Necromant(1000);

        saruman.setHealth(500);

        Assertions.assertEquals(500, saruman.getHealth());
    }

    @Test
    void getHealth() {
        Necromant saruman = new Necromant(1000);

        Assertions.assertEquals(1000, saruman.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(1000, 20),
                Arguments.of(0, 2500),
                Arguments.of(980, 40)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Necromant saruman = new Necromant(1000);

        saruman.takeDamage(damage);
        int actualInt = saruman.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(285, new Warrior("Gimli", 300)),
                Arguments.of(240, new Mag("Gandalf", 300)),
                Arguments.of(270, new Archer("Legolas", 300))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void attackHero(int expectedInt, Hero hero) {
        Necromant saruman = new Necromant(1000);

        saruman.attackHero(hero);
        int actualInt = hero.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void resurrectEnemy() {
        Necromant saruman = new Necromant(1000);
        Golem wrath = new Golem(300);

        wrath.setHealth(0);
        saruman.resurrectEnemy(wrath);
        int actualInt = wrath.getHealth();

        Assertions.assertEquals(30, actualInt);
    }
}
