package com.rakovets.course.java.core.practice.oop_principles.TestBattleGround;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Archer;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTest {

    @Test
    public void testConstructor1() {
        Hero hero = new Archer("Archer");
        Assertions.assertEquals("Archer", hero.getName());
    }

    @Test
    public void testConstructor2() {
        Hero hero = new Archer("Archer", 100);
        Assertions.assertEquals("Archer", hero.getName());
        Assertions.assertEquals(100, hero.getHealth());
    }
}
