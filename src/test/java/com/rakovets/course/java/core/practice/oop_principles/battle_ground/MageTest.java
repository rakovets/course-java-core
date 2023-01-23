package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MageTest {
    private static Mage mage;
    private static Enemy murloc;
    private static Enemy wolf;
    private static Enemy zombie;

    @BeforeEach
    void init() {
        mage = new Mage("Gendalf");
        murloc = new Murloc(80);
        wolf = new Wolf(70);
        zombie = new Zombie(90);
    }

    @Test
    void attackEnemyTest() {
        mage.attackEnemy(murloc);
        int result = murloc.getHealth();

        Assertions.assertEquals(55, result);
    }

    @Test
    void fireStormTestOneTarget() {
        mage.fireStorm(murloc);

        Assertions.assertFalse(murloc.isAlive());
    }

    @Test
    void fireStormTestTwoTargets() {
        mage.fireStorm(murloc, wolf);

        Assertions.assertFalse(murloc.isAlive());
        Assertions.assertFalse(wolf.isAlive());
    }

    @Test
    void fireStormTestManyTargets() {
        mage.fireStorm(murloc, wolf, zombie);

        Assertions.assertFalse(murloc.isAlive());
        Assertions.assertFalse(wolf.isAlive());
        Assertions.assertTrue(zombie.isAlive());
        Assertions.assertEquals(10, zombie.getHealth());
    }

    @Test
    void isAliveTest1() {
        zombie.attackHero(mage);

        Assertions.assertTrue(mage.isAlive());
    }

    @Test
    void isAliveTest2() {
        for (int i = 0; i < 10; i++) {
            zombie.attackHero(mage);
        }

        Assertions.assertFalse(mage.isAlive());
    }
}
