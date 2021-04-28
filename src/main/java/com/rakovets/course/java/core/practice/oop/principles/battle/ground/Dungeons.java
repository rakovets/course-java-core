package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Skeleton;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Slug;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Wolf;

public class Dungeons {
    public String showDungeonsList(int dungeonNumber) {
        String[] list = new String[] {"Кладбище", "Лес", "Поляна"};
        return list[dungeonNumber];
    }

    public void showDungeonsList() {
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + ".|" + showDungeonsList(i-1) + "| ");
        }
    }

    public Object selectDungeon(int choice) throws Exception {
        Object enemy;
        if (choice == 1) {
            enemy = new Skeleton("Скелет", 100);
            return enemy;
        } else if (choice == 2) {
            enemy = new Wolf("Волк", 100);
            return enemy;
        } else if (choice == 3) {
            enemy = new Slug("Слизень", 100);
            return enemy;
        } else {
            throw new Exception("Неверный ввод");
        }
    }
}
