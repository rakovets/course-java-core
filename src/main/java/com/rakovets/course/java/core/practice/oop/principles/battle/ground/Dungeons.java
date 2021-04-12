package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Dungeons {

    public String dungeonsList(int dungeonNumber) {
        String[] list = new String[3];
        list[0] = "Кладбище";
        list[1] = "Недоступно";
        list[2] = "Недоступно";
        return list[dungeonNumber];
    }

    public void dungeonList() {
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + ".|" + dungeonsList(i-1) + "| ");
        }
    }
}
