package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Mag extends Hero {

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        attackTemplate(0);
        enemy.takeDamage(35);
    }

    @Override
    public String skills(int skill) {
        String[] skillsList = new String[5];
        skillsList[0] = "Атака";
        skillsList[1] = "Дыхание дракона";
        skillsList[2] = "Ядовитый туман";
        skillsList[3] = "Защита";
        skillsList[4] = "Подробнее";
        return skillsList[skill];
    }

    @Override
    public void skillDescription() {
        System.out.println("Атака - герой атакует врага обычной атакой.\n" +
                "Дыхание дракона - используя посох, герой выпускает большой сгусток огня (Урон 50).\n" +
                "Ядовитый туман - герой вызвает ядовитое облако, которое наносит урон каждый ход (2 урона за ход).\n" +
                "Защита - герой становится в защитную позу и с шансом 50% может уклонится от атаки\n");
    }

    @Override
    public void skillList() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".|" + skills(i-1) + "| ");
        }
    }

    public void dragonFire(Enemy enemy) {
        attackTemplate(1);
        enemy.takeDamage(50);
    }

    public void poisonFog(Enemy enemy) {
        attackTemplate(2);
        enemy.takeDamage(20);
    }

    public boolean defend(Enemy enemy) {
        attackTemplate(3);
        return random(1, 2) == 1;
    }

    public void attackTemplate(int numberOfTemplate) {
        String[] templateList = new String[4];
        templateList[0] = "---Герой атакует врага и наносит 10 урона---";
        templateList[1] = "---Герой герой выпускает большой сгусток огня и наносит 50 урона---";
        templateList[2] = "---Герой вызвал ядовитый туман и нанёс 20 урона---";
        templateList[3] = "---Герой становится в защиту---";
        System.out.println(templateList[numberOfTemplate]);
    }
}
