package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    Hero archer = new Archer("Archer", 100);
    Enemy witch = new Witch(100);

    @Test
    void attackEnemyTest() {
        int actual = archer.attackEnemy(witch);
        Assertions.assertEquals(80, actual);
    }

    @Test
    void isAliveTest() {
        boolean actual = archer.isAlive();
        Assertions.assertEquals(true, actual);
    }

    @Test
    void takeDamageTest() {
        int actual = archer.takeDamage(35);
        Assertions.assertEquals(65, actual);
    }
}
