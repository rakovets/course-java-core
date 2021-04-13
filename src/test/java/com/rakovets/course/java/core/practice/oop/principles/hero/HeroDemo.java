package com.rakovets.course.java.core.practice.oop.principles.hero;

public class HeroDemo {
    public static void main (String[] args) {
        Mag mag = new Mag("Aristo",500);
        Enemy enemy = new Enemy(200,50);
        mag.attackEnemy(enemy);
        mag.tookDamage(enemy);
        System.out.println(mag.getHealthHero());
        Hero mg = new Mag("grisio",500);
        mg.tookDamage(enemy);
        System.out.println(mag.getHealthHero());
        Enemy enn = new Undead(300,10);
        mag.tookDamage(enn);
    }
}
