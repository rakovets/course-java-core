package com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Enemy;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        attackTemplate(0);
        enemy.takeDamage(10);
    }

    @Override
    public String skills(int skill) {
        String[] skillsList = new String[5];
        skillsList[0] = "Атака";
        skillsList[1] = "Удар щитом";
        skillsList[2] = "Рассекающий удар";
        skillsList[3] = "Защита";
        skillsList[4] = "Подробнее";
        return skillsList[skill];
    }

    @Override
    public void skillDescription() {
        System.out.println("Атака - герой атакует врага обычной атакой.\n" +
                "Удар щитом - герой атакует врага щитом (20 урона).\n" +
                "Рассекающий удар - герой рассекает врага (15 урона).\n" +
                "Защита - герой становится в защитную позу и с шансом 50% может уклониться от атаки.\n");
    }

    @Override
    public void skillList() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".|" + skills(i-1) + "| ");
        }
    }

    public void warriorShield(Enemy enemy) {
        attackTemplate(1);
        enemy.takeDamage(20);
    }

    public void cleavingBlow(Enemy enemy) {
        attackTemplate(2);
        enemy.takeDamage(15);
    }

    public boolean defend(Enemy enemy) {
        attackTemplate(3);
        return random(1, 2) == 1;
    }

    public void attackTemplate(int numberOfTemplate) {
        String[] templateList = new String[4];
        templateList[0] = "---" + getName() + " атакует врага и наносит 10 урона---";
        templateList[1] = "---" + getName() + " ударяет щитом и наносит 20 урона---";
        templateList[2] = "---" + getName() + " рассекает врага и наносит 15 урона---";
        templateList[3] = "---" + getName() + " становится в защиту---";
        System.out.println(templateList[numberOfTemplate]);
    }
}
