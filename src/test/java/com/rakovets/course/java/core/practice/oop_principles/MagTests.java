package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTests {
    Mag mag = new Mag("Jonh");
    Enemy enemy = new Enemy(200);

    @Test
    public void testMag() {
        Assertions.assertEquals("Jonh", mag.getName());
    }

    @Test
    public void testMagAttackEnemy() {
        Assertions.assertEquals("Mag attacks enemy but missed", mag.attackEnemy());
    }

    @Test
    public void testMagAttackEnemyAndDamage() {
        mag.attackEnemy(enemy);
        Assertions.assertEquals(185, enemy.getHealth());
    }
}
