package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTests {
    Hero hero = new Hero("Peter");

    @Test
    public void testHero() {
        Assertions.assertEquals("Peter", hero.getName());
    }

    @Test
    public void testHeroAttackEnemy() {
        hero.attackEnemy();
        System.out.println("Hero attacks enemy");
    }
}
