package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    Hero archer = new Archer("Archer", 100);
    Enemy ghost = new Ghost(100);

    @Test
    void testAttackEnemy() {
        double expected = 85;
        double actual = archer.attackEnemy(ghost);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsAlive() {
        boolean expected = true;
        boolean actual = archer.isAlive();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTakeDamage() {
        double expected = 50;
        double actual = archer.takeDamage(50);
        Assertions.assertEquals(expected, actual);
    }
}
