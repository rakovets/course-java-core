package com.rakovets.course.java.core.practice.oop_principles;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BattleGroundTest {
    Archer archer = new Archer("Archer", 100);
    Mag mag = new Mag("Mag", 100);
    Warrior warrior = new Warrior("Warrior", 100);
    Zombie zombie = new Zombie("Zombie", 100);
    Vampire vampire = new Vampire("Vampire", 100);
    Ghost ghost = new Ghost("Gost", 100);

    @Test
    public void testHeroArcher() {
        //WHEN
        zombie.attackHero(archer);
        double actual = archer.getHealth();

        //THEN
        Assertions.assertEquals(90, actual);
    }
    @Test
    public void testHeroMag() {
        //WHEN
        vampire.attackHero(mag);
        double actual = mag.getHealth();

        //THEN
        Assertions.assertEquals(60, actual);
    }
    @Test
    public void testHeroWarrior() {
        //WHEN
        ghost.attackHero(warrior);
        double actual = warrior.getHealth();

        //THEN
        Assertions.assertEquals(70, actual);
    }
    @Test
    public void testEnemyZombie() {
        //WHEN
        mag.attackEnemy(zombie);
        double actual = zombie.getHealth();

        //THEN
        Assertions.assertEquals(50, actual);
    }
    @Test
    public void testEnemyVampire() {
        //WHEN
        warrior.attackEnemy(vampire);
        double actual = vampire.getHealth();

        //THEN
        Assertions.assertEquals(100, actual);
    }
    @Test
    public void testEnemyGhost() {
        //WHEN
        archer.attackEnemy(ghost);
        double actual = ghost.getHealth();

        //THEN
        Assertions.assertEquals(85, actual);
    }
    @Test
    public void testMagAttackGTwoLife() {
        //GIVEN
        Zombie zombie1 = new Zombie("Zombak", 20);
        //WHEN
        mag.attackEnemy(zombie1);
        double actual = zombie1.getHealth();

        //THEN
        Assertions.assertEquals(70, actual);
    }
}

