package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WitchTest {
    Hero archer = new Archer("Archer", 100);
    Enemy witch = new Witch(100);

    @Test
    void attackHero() {
        int actual = witch.attackHero(archer);
        Assertions.assertEquals(65, actual);
    }

    @Test
    void isAlive() {
        boolean actual = witch.isAlive();
        Assertions.assertEquals(true, actual);
    }

    @Test
    void takeDamageTest() {
        int actual = witch.takeDamage(20);
        Assertions.assertEquals(80, actual);
    }
}
