package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Mag extends Hero{

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        System.out.println(getName() + "uaaaaa...");
        enemy.takeDamage(200);;
    }

    public  void megaFireBall(Enemy enemy, int damage) {
        System.out.println(getName() + "Ща поджарю жепку");
        enemy.takeDamage(1500);
    }
}
