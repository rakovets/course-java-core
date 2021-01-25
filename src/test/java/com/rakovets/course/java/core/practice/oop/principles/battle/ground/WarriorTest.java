package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorTest {

    @Test
    void attackEnemy() {
        assertEquals("Warrior is attacking enemy", new Warrior("Warrior", 200).attackEnemy());
    }

    @Test
    void takeDamage() {
        assertEquals(-25, new Warrior("Warrior", 200).takeDamage(25));
    }
}
