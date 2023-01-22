package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTest {
    @Test
    public void takeDamageTest() {
        Hero hero = new Mag("Antonidas", 200);

        int damage = 50;
        hero.takeDamage(damage);

        Assertions.assertEquals(150, hero.getHealth());
    }

    @Test
    public void takeDamageTest2() {
        Hero hero = new Mag("Antonidas", 340);

        int damage = 50;
        hero.takeDamage(damage);

        Assertions.assertEquals(290, hero.getHealth());
    }

    @Test
    public void takeDamageTest3() {
        Hero hero = new Mag("Antonidas", 110);

        int damage = 50;
        hero.takeDamage(damage);

        Assertions.assertEquals(60, hero.getHealth());
    }

    @Test
    public void issAliveTest1() {
        Hero hero = new Mag("Antonidas", 0);

        Assertions.assertFalse(hero.isAlive());
    }

    @Test
    public void issAliveTest2() {
        Hero hero = new Mag("Antonidas", 10);

        Assertions.assertTrue(hero.isAlive());
    }
}
