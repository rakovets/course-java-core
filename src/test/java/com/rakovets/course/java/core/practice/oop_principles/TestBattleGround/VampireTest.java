package com.rakovets.course.java.core.practice.oop_principles.TestBattleGround;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Archer;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Hero;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Vampire;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VampireTest {

    @Test
    public void testConstructor() {
        Enemy vampire = new Vampire(100);
        Assertions.assertEquals(100, vampire.getHealth());
    }

    @Test
    public void testSetHealth() {
        Enemy vampire = new Vampire(100);
        vampire.setHealth(90);
        Assertions.assertEquals(90, vampire.getHealth());
    }

    @Test
    public void testTakeDamage() {
        Enemy vampire = new Vampire(100);
        vampire.takeDamage(45);
        Assertions.assertEquals(55, vampire.getHealth());
    }

    @Test
    public void testIsAlive() {
        Enemy vampire = new Vampire(100);
        Assertions.assertTrue(vampire.isAlive());
    }

    @Test
    public void testIsNotAlive() {
        Enemy vampire = new Vampire(-5);
        Assertions.assertFalse(vampire.isAlive());
    }

    @Test
    public void testAttackHero() {
        Enemy vampire = new Vampire(100);
        Hero archer = new Archer("Archer", 100);
        vampire.attackHero(archer);
        Assertions.assertEquals(95, archer.getHealth());
        Assertions.assertEquals(105, vampire.getHealth());
    }
}
