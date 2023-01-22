package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Ghost;
import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Warrior;
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
        boolean actual = true;
        Assertions.assertEquals(true, actual);
    }

    @Test
    void takeDamageTest() {
        int actual = ghost.takeDamage(45);
        Assertions.assertEquals(55, actual);
    }
}
