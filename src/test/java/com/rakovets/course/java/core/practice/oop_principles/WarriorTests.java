package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTests {
    Warrior warrior = new Warrior("Alex");

    @Test
    public void testWarrior() {
        Assertions.assertEquals("Alex", warrior.getName());
    }

    @Test
    public void testWarriorAttackEnemy() {
        warrior.attackEnemy();
        System.out.println("Warrior attacks enemy");
    }
}
