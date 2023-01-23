package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WolfTest {
    private static Wolf wolf;
    private static Archer archer;

    @BeforeEach
    void init() {
        wolf = new Wolf(80);
        archer = new Archer("Legolas");
    }

    @Test
    void attackHeroTest1() {
        wolf.attackHero(archer);

        Assertions.assertEquals(93, archer.getHealth());
    }

    @Test
    void attackHeroTest2() {
        wolf.attackHero(archer);
        wolf.attackHero(archer);

        Assertions.assertEquals(86, archer.getHealth());
    }

    @Test
    void howlTest() {
        Wolf summonedWolf = wolf.howl();

        Assertions.assertTrue(summonedWolf.isAlive());
    }

    @Test
    void isAliveTest1() {
        archer.attackEnemy(wolf);

        Assertions.assertTrue(wolf.isAlive());
    }

    @Test
    void isAliveTest2() {
        for (int i = 0; i < 4; i++) {
            archer.attackEnemy(wolf);
        }

        Assertions.assertFalse(wolf.isAlive());
    }
}
