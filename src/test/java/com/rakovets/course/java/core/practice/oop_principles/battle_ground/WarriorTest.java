package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    Hero warrior = new Warrior("Warrior", 100);
    Enemy skeleton = new Skeleton(100);

    @Test
    void testAttackEnemy() {
        double expected = 95;
        double actual = warrior.attackEnemy(skeleton);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsAlive() {
        boolean expected = true;
        boolean actual = warrior.isAlive();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTakeDamage() {
        double expected = 50;
        double actual = warrior.takeDamage(50);
        Assertions.assertEquals(expected, actual);
    }
}
