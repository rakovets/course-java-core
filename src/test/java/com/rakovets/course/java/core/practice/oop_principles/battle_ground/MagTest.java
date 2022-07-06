package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {
    Hero mag = new Mag("Hero", 100);
    Enemy hellHound = new HellHound(100);

    @Test
    void testAttackEnemy() {
        double expected = 90;
        double actual = mag.attackEnemy(hellHound);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsAlive() {
        boolean expected = true;
        boolean actual = mag.isAlive();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTakeDamage() {
        double expected = 40;
        double actual = mag.takeDamage(60);
        Assertions.assertEquals(expected, actual);
    }

}
