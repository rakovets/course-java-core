package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTests {
    Archer archer = new Archer("Bob");
    Enemy enemy = new Enemy(250);

    @Test
    public void testArcher(){
        Assertions.assertEquals("Bob", archer.getName());
    }

    @Test
    public void testArcherAttackEnemy() {
        archer.attackEnemy();
        System.out.println("Archer attacks enemy");
    }

    @Test
    public void testArcherattackEnemyAndDamage() {
        archer.attackEnemy(enemy);
        Assertions.assertEquals(230, enemy.getHealth());
    }

    @Test
    public void testSetHealth(){
        archer.setHealth(10);
        Assertions.assertEquals(10, archer.getHealth());
    }

    @Test
    public void testTakeDamage() {
        archer.takeDamage(20);
        Assertions.assertEquals(180, archer.getHealth());
    }

    @Test
    public void testIsAlive() {
        archer.setHealth(0);
        Assertions.assertEquals(false, archer.isAlive());
    }

    @Test
    public void testEnemyAttackArcher() {
        enemy.attackHeroes(archer);
        Assertions.assertEquals(190, archer.getHealth());
    }

}
