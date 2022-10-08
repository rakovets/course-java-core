package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Orcs;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Undead;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Witch;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBattleGround {
    @Test
    public void testIsAliveMag() {
        Hero harry = new Mag("Harry Potter", 78);

        Assertions.assertTrue(harry.isAlive());
    }

    @Test
    public void testIsDeadMag() {
        Hero volde = new Mag("Voldemort", 0);

        Assertions.assertFalse(volde.isAlive());
    }

    @Test
    public void testMagAttackOrcs() {
        Enemy orc = new Orcs(89);
        Hero volde = new Mag("Voldemort", 100);

        volde.attackEnemy(orc);

        Assertions.assertEquals(66.5, orc.getHealth());
    }

    @Test
    public void testOrcsAttackMag() {
        Enemy orc = new Orcs(90);
        Hero volde = new Mag("Voldemort", 80);

        orc.attackHero(volde);

        Assertions.assertEquals(67.0, volde.getHealth());
        Assertions.assertEquals(95.2, orc.getHealth());
    }

    @Test
    public void testIsAliveWarrior() {
        Hero superman = new Warrior("Superman", 97);

        Assertions.assertTrue(superman.isAlive());
    }

    @Test
    public void testIsDeadWarrior() {
        Hero superman = new Warrior("Superman", 0);

        Assertions.assertFalse(superman.isAlive());
    }

    @Test
    public void testWarriorAttackWitch() {
        Enemy witch = new Witch(78);
        Hero superman = new Warrior("Superman", 100);

        superman.attackEnemy(witch);

        Assertions.assertEquals(28.599999999999994, witch.getHealth());
    }

    @Test
    public void testWitchAttackWarrior() {
        Enemy witch = new Witch(88);
        Hero superman = new Warrior("Superman", 105);

        witch.attackHero(superman);

        Assertions.assertEquals(98.0, superman.getHealth());
    }

    @Test
    public void testIsAliveArcher() {
        Hero piter = new Archer("Piter Pan", 67);

        Assertions.assertTrue(piter.isAlive());
    }

    @Test
    public void testIsDeadArcher() {
        Hero piter = new Archer("Piter Pan", 0);

        Assertions.assertFalse(piter.isAlive());
    }

    @Test
    public void testArcherAttackUndead() {
        Enemy undead = new Undead(88);
        Hero piter = new Archer("Piter Pan", 53);

        piter.attackEnemy(undead);

        Assertions.assertEquals(64, undead.getHealth());
    }

    @Test
    public void testUndeadAttackArcher() {
        Enemy undead = new Undead(120);
        Hero piter = new Archer("Piter Pan", 90);

        undead.attackHero(piter);

        Assertions.assertEquals(80.0, piter.getHealth());
        Assertions.assertEquals(122.0, undead.getHealth());
    }

    @Test
    public void testIsAliveOrcs() {
        Enemy zluka = new Orcs(87);

        Assertions.assertTrue(zluka.isAlive());
    }

    @Test
    public void testIsDeadOrcs() {
        Enemy zluka = new Orcs(0);

        Assertions.assertFalse(zluka.isAlive());
    }

    @Test
    public void testIsAliveUndead() {
        Enemy byaka = new Undead(89);

        Assertions.assertTrue(byaka.isAlive());
    }

    @Test
    public void testIsDeadUndead() {
        Enemy byaka = new Undead(0);

        Assertions.assertFalse(byaka.isAlive());
    }

    @Test
    public void testIsAliveWitch() {
        Enemy roza = new Witch(78);

        Assertions.assertTrue(roza.isAlive());
    }

    @Test
    public void testIsDeadWitch() {
        Enemy roza = new Witch(0);

        Assertions.assertFalse(roza.isAlive());
    }

    @Test
    public void testArcherAttackZombie() {
        Enemy zombie = new Zombie(100);
        Hero piter = new Archer("Piter Pan", 59);

        piter.attackEnemy(zombie);

        Assertions.assertEquals(20, zombie.getHealth());
    }

    @Test
    public void testArcherAttackZombieTwoLife() {
        Enemy zombie = new Zombie(10);
        Hero piter = new Archer("Piter Pan", 59);

        piter.attackEnemy(zombie);

        Assertions.assertEquals(10, zombie.getHealth());
    }

    @Test
    public void testZombieAttackArcher() {
        Enemy zombie = new Zombie(120);
        Hero piter = new Archer("Piter Pan", 90);

        zombie.attackHero(piter);

        Assertions.assertEquals(84.0, piter.getHealth());
    }
}
