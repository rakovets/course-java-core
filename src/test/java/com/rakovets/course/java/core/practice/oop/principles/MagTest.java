package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagTest {

    @Test
    void attackEnemy() {
        assertEquals("Mag attack enemy", new Mag("Mag", 100).attackEnemy());
    }

    @Test
    void takeDamage() {
        assertEquals(-50, new Mag("Mag", 100).takeDamage(50));
    }

    @Test
    void addHealth() {
        assertEquals(100, new Mag("Mag", -50).addHealth());
    }
}
