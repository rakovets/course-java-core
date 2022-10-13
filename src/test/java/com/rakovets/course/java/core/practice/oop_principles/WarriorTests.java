package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTests {
    Warrior warrior = new Warrior("Alex");
    Enemy enemy = new Enemy(150);

    @Test
    public void testWarrior() {
        Assertions.assertEquals("Alex", warrior.getName());
    }

    @Test
    public void testWarriorAttackEnemy() {
        Assertions.assertEquals("Warrior attacks enemy but missed", warrior.attackEnemy());
    }

    @Test
    public void testWarriorAttackEnemyAndDamage() {
        warrior.attackEnemy(enemy);
        Assertions.assertEquals(140, enemy.getHealth());
    }
}
