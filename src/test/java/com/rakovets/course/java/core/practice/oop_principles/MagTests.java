package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTests {
    Mag mag = new Mag("Jonh");

    @Test
    public void testMag(){
        Assertions.assertEquals("Jonh", mag.getName());
    }

    @Test
    public void testMagAttackEnemy() {
        mag.attackEnemy();
        System.out.println("Mag attacks enemy");
    }
}
