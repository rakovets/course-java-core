package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Undead;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UndeadTest {
    Undead undead = new Undead(200);


    @Test
    public void attackHeroTest1() {
        Warrior warrior = new Warrior("Arthas", 250);

        int extendHealth = 236;
        undead.attackHero(warrior);

        Assertions.assertEquals(extendHealth, warrior.getHealth());
    }

    @Test
    public void attackHeroTest2() {
        Warrior warrior = new Warrior("Arthas", 200);

        int extendHealth = 186;
        undead.attackHero(warrior);

        Assertions.assertEquals(extendHealth, warrior.getHealth());
    }

    @Test
    public void attackHeroTest3() {
        Warrior warrior = new Warrior("Arthas", 130);

        int extendHealth = 116;
        undead.attackHero(warrior);

        Assertions.assertEquals(extendHealth, warrior.getHealth());
    }

    @Test
    public void resurrectionTest1() {
        Undead undead = new Undead(0);
        undead.resurrection();

        int extendHealth = 50;

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }

    @Test
    public void resurrectionTest2() {
        Undead undead = new Undead(10);
        undead.resurrection();

        int extendHealth = 10;

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }
}
