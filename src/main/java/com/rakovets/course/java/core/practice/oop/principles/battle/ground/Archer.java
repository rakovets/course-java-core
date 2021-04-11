package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

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
                "Выстрел в голову - герой стреляет в голову и наносит 30 урона.\n" +
                "Защита - герой становится в защитную позу и с шансом 50% может уклонится от атаки\n");
    }

    @Override
    public void skillList() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".|" + skills(i-1) + "| ");
        }
    }

    public void randomShot(Enemy enemy) {
        attackTemplate(1);
        int randomDamage = random(1,50);
        enemy.takeDamage(randomDamage);
    }

    public void headShot(Enemy enemy) {
        attackTemplate(2);
        enemy.takeDamage(30);
    }

    public boolean defend(Enemy enemy) {
        attackTemplate(3);
        return random(1, 2) == 1;
    }

    public void attackTemplate(int numberOfTemplate) {
        String[] templateList = new String[4];
        templateList[0] = "---Герой атакует врага и наносит 10 урона---";
        templateList[1] = "---Герой выпускает шальной выстрел и наносит---";
        templateList[2] = "---Герой стреляет в голову и наносит 30 урона---";
        templateList[3] = "---Герой становится в защиту---";
        System.out.println(templateList[numberOfTemplate]);
    }
}
