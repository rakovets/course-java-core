package com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes;

public class SelectHeroClass {
    public Object selectClass(int choice, String name) {
        String text = "Неверный ввод или локация недоступна";
        Object hero;
        if (choice == 1) {
            hero = new Warrior(name, 100);
            return hero;
        } else if (choice == 2) {
            hero = new Archer(name, 100);
            return hero;
        } else if (choice == 3) {
            hero = new Mag(name, 100);
            return hero;
        }
        return text;
    }
}
