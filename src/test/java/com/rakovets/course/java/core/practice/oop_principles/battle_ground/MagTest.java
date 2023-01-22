package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {
    Hero mag = new Mag("Mag", 100);
    Enemy vampire = new Vampire(100);

    @Test
    void attackEnemyTest() {
        int actual = mag.attackEnemy(vampire);
        Assertions.assertEquals(50, actual);
    }

    @Test
    void isAliveTest() {
        boolean actual = mag.isAlive();
        Assertions.assertEquals(true, actual);
    }

    @Test
    void takeDamageTest() {
        int actual = mag.takeDamage(25);
        Assertions.assertEquals(75, actual);
    }
}
