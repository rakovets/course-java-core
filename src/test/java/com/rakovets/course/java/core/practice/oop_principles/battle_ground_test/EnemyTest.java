package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Undead;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnemyTest {
    @Test
    public void takeDamageTest() {
        Enemy enemy = new Undead(400);

        int damage = 20;
        int expectHealth = 380;
        enemy.takeDamage(damage);

        Assertions.assertEquals(expectHealth, enemy.getHealth());
    }

    @Test
    public void takeDamageTest2() {
        Enemy enemy = new Undead(300);

        int damage = 40;
        int expectHealth = 260;
        enemy.takeDamage(damage);

        Assertions.assertEquals(expectHealth, enemy.getHealth());
    }

    @Test
    public void takeDamageTest3() {
        Enemy enemy = new Undead(200);

        int damage = 140;
        int expectHealth = 60;
        enemy.takeDamage(damage);

        Assertions.assertEquals(expectHealth, enemy.getHealth());
    }

    @Test
    public void issAliveTest1() {
        Enemy enemy = new Undead(0);
        Assertions.assertEquals(false, enemy.isAlive());
    }

    @Test
    public void issAliveTest2() {
        Enemy enemy = new Undead(1);
        Assertions.assertEquals(true, enemy.isAlive());
    }
}
