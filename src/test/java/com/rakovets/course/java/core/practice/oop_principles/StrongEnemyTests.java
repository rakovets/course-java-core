package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongEnemyTests {
    StrongEnemy strongEnemy = new StrongEnemy(100);
    Warrior warrior = new Warrior("Jack");

    @Test
    public void testDoubleHit() {
        warrior.setHealth(30);
        strongEnemy.doubleHit(warrior);
        Assertions.assertEquals(10, warrior.getHealth());
    }
}
