package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Ghost;
import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_groung.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    Hero warrior = new Warrior("Warrior", 100);
    Enemy ghost = new Ghost(100);

    @Test
    void attackEnemyTest() {
        int actual = warrior.attackEnemy(ghost);
        Assertions.assertEquals(70, actual);
    }

    @Test
    void isAliveTest() {
        boolean actual = warrior.isAlive();
        Assertions.assertEquals(true, actual);
    }

    @Test
    void takeDamageTest() {
        int actual = warrior.takeDamage(25);
        Assertions.assertEquals(75, actual);
    }
}
