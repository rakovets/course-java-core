package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UndeadTest {
    static Undead undead;

    @BeforeAll
    static void init() {
        undead = new Undead(200);
    }

    @Test
    public void attackHeroTest1() {
        Warrior warrior = new Warrior("Arthas", 250);

        undead.attackHero(warrior);

        Assertions.assertEquals(236, warrior.getHealth());
    }

    @Test
    public void attackHeroTest2() {
        Warrior warrior = new Warrior("Arthas", 200);

        undead.attackHero(warrior);

        Assertions.assertEquals(186, warrior.getHealth());
    }

    @Test
    public void attackHeroTest3() {
        Warrior warrior = new Warrior("Arthas", 130);

        undead.attackHero(warrior);

        Assertions.assertEquals(116, warrior.getHealth());
    }

    @Test
    public void resurrectionTest1() {
        Undead undead = new Undead(0);

        undead.resurrection();

        Assertions.assertEquals(50, undead.getHealth());
    }

    @Test
    public void resurrectionTest2() {
        Undead undead = new Undead(10);

        undead.resurrection();

        Assertions.assertEquals(10, undead.getHealth());
    }
}
