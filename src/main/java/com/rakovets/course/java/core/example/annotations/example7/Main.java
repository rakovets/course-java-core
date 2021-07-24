package com.rakovets.course.java.core.example.annotations.example7;

@Game(name = "Крикет", day = "воскресенье")
@Game(day = "четверг")
@Game(name = "Хоккей", day = "понедельник")
public class Main {
    public static void main(String[] args) {
        Games games = Main.class.getAnnotation(Games.class);

        for (Game game : games.value()) {
            System.out.println(game.name() + " в " + game.day());
        }
    }
}
