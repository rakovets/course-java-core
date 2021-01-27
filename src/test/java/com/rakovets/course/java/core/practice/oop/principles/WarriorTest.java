package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

        @Test
        void attackEnemy() {
            assertEquals("Warrior attack enemy", new Warrior("Warrior", 200).attackEnemy());
        }

        @Test
        void takeDamage() {
            assertEquals(-25, new Warrior("Warrior", 200).takeDamage(25));
        }
    }
