package com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Enemy;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super (name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        attackTemplate(0);
        enemy.takeDamage(20);
    }

    @Override
    public String skills(int skill) {
        String[] skillsList = new String[5];
        skillsList[0] = "Атака";
        skillsList[1] = "Шальной выстрел";
        skillsList[2] = "Выстрел в голову";
        skillsList[3] = "Защита";
        skillsList[4] = "Подробнее";
        return skillsList[skill];
    }

    @Override
    public void skillDescription() {
        System.out.println("Атака - герой атакует врага обычной атакой.\n" +
                "Шальной выстрел - герой атакует врага и наносит случайный урон (Урон 1 - 50 HP).\n" +
                "Выстрел в голову - герой стреляет в голову (Урон 30 HP).\n" +
                "Защита - герой становится в защитную позу и с шансом 50% может уклониться от атаки.\n");
    }

    @Override
    public void skillList() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".|" + skills(i-1) + "| ");
        }
    }

    @Override
    public void firstSkill(Enemy enemy) {
        attackTemplate(1);
        int randomDamage = random(1,50);
        enemy.takeDamage(randomDamage);
    }

    @Override
    public void secondSkill(Enemy enemy) {
        attackTemplate(2);
        enemy.takeDamage(30);
    }

    @Override
    public boolean defendSkill(Enemy enemy) {
        attackTemplate(3);
        return random(1, 2) == 1;
    }

    public void attackTemplate(int numberOfTemplate) {
        String[] templateList = new String[4];
        templateList[0] = "---" + getName() + " атакует врага и наносит 10 урона---";
        templateList[1] = "---" + getName() + " выпускает шальной выстрел и наносит---";
        templateList[2] = "---" + getName() + " стреляет в голову и наносит 30 урона---";
        templateList[3] = "---" + getName() + " становится в защиту---";
        System.out.println(templateList[numberOfTemplate]);
    }
}
