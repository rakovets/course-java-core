package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GhostTest {
    Hero warrior = new Warrior("Warrior", 100);
    Enemy ghost = new Ghost(100);

    @Test
    void attackHeroTest() {
        int actual = ghost.attackHero(warrior);
        Assertions.assertEquals(80, actual);
    }

    @Test
    void isAliveTest() {
        boolean actual = ghost.isAlive();
        Assertions.assertEquals(true, actual);
    }

    @Test
    void takeDamageTest() {
        int actual = ghost.takeDamage(45);
        Assertions.assertEquals(55, actual);
    }
}
