package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HellHoundTest {
    Hero mag = new Mag("Hero", 100);
    Enemy hellHound = new HellHound(100);

    @Test
    void testAttackHero() {
        double expected = 90;
        double actual = hellHound.attackHero(mag);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsAlive() {
        boolean expected = true;
        boolean actual = hellHound.isAlive();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTakeDamage() {
        double expected = 60;
        double actual = hellHound.takeDamage(40);
        Assertions.assertEquals(expected, actual);
    }
}
