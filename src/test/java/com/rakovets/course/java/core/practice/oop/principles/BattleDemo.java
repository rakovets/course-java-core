package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.SelectHeroClass;

public class BattleDemo {
    public static void main(String[] args) {
        SelectHeroClass selectHeroClass = new SelectHeroClass(0);
        System.out.println("Выберите класс героя\n1.Воин 2.Лучник 3.Маг");
        selectHeroClass.inputChoice();

        if (selectHeroClass.getInputChoice() == 1) {
            selectHeroClass.selectWarrior();
        } else if (selectHeroClass.getInputChoice() == 2) {
            selectHeroClass.selectArcher();
        } else if (selectHeroClass.getInputChoice() == 3) {
            selectHeroClass.selectMag();
        } else {
            System.out.println("Неверный ввод");
        }
    }
}
