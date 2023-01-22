package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MageTest {
    static Mage mage;
    static Enemy murloc;
    static Enemy wolf;
    static Enemy zombie;
    int result;

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
        result = murloc.getHealth();

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
}
