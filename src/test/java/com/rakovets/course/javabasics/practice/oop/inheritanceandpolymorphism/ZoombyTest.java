package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Warrior;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Zoomby;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ZoombyTest {

    @Test
    void isAliveTest() {
        Warrior hero = new Warrior("Vasya");
        Zoomby enemy = new Zoomby(50);
        hero.attackEnemy(enemy);
        Assertions.assertFalse(enemy.isAlive(enemy.getHealth()));
         }
}
