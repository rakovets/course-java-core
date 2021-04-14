package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Skeleton;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Slug;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Wolf;

public class Dungeons {

    public String dungeonsList(int dungeonNumber) {
        String[] list = new String[3];
        list[0] = "Кладбище";
        list[1] = "Лес";
        list[2] = "Поляна";
        return list[dungeonNumber];
    }

    public void dungeonList() {
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + ".|" + dungeonsList(i-1) + "| ");
        }
    }

    public Object selectDungeon(int choice) {
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
        }
        enemy = "Неверный ввод или локация недоступна";
        return enemy;
    }
}
