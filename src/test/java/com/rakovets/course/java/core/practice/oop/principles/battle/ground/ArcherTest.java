package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArcherTest {

    @Test
    void attackEnemy() {
        assertEquals("Archer is attacking enemy", new Archer("Archer", 500).attackEnemy());
    }

    @Test
    void takeDamage() {
        assertEquals(-100, new Archer("Archer", 500).takeDamage(100));
    }

    @Test
    void addHealth() {
        assertEquals(450, new Archer("Archer", -50).addHealth());
    }
}
