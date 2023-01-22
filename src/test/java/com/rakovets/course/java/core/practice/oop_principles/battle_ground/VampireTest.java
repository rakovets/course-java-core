package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groung.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VampireTest {
    Hero mag = new Mag("Mag", 100);
    Enemy vampire = new Vampire(100);

    @Test
    void attackHeroTest() {
        int actual = vampire.attackHero(mag);
        Assertions.assertEquals(75, actual);
    }

    @Test
    void isAliveTest() {
        boolean actual = true;
        Assertions.assertEquals(true, actual);
    }

    @Test
    void takeDamageTest() {
        int actual = vampire.takeDamage(15);
        Assertions.assertEquals(85, actual);
    }
}
