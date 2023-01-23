package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    private static Warrior warrior;
    private static Enemy murloc1;
    private static Enemy murloc2;
    private int result;

    @BeforeEach
    void init() {
        warrior = new Warrior("Leroy Jenkins");
        murloc1 = new Murloc(80);
        murloc2 = new Murloc(70);
    }

    @Test
    void attackEnemyTest() {
        warrior.attackEnemy(murloc1);
        result = murloc1.getHealth();

        Assertions.assertEquals(60, result);
    }

    @Test
    void bladeFuryTestOneTarget() {
        warrior.bladeFury(murloc1);
        result = murloc1.getHealth();

        Assertions.assertEquals(55, result);
    }

    @Test
    void bladeFuryTestTwoTargets() {
        warrior.bladeFury(murloc1, murloc2);
        result = murloc1.getHealth() + murloc2.getHealth();

        Assertions.assertEquals(100, result);
    }

    @Test
    void isAliveTest1() {
        murloc1.attackHero(warrior);

        Assertions.assertTrue(warrior.isAlive());
    }

    @Test
    void isAliveTest2() {
        for (int i = 0; i < 14; i++) {
            murloc1.attackHero(warrior);
        }

        Assertions.assertFalse(warrior.isAlive());
    }
}
