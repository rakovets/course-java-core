package com.rakovets.course.java.core.example.annotations.example7;

@Game(name = "Крикет",  day = "воскресенье")
@Game(day = "вторник")
@Game(name = "Хоккей",   day = "пятница")
public class Main2 {
    public static void main(String[] args) {
        Game[] arrayGames = Main2.class.getAnnotationsByType(Game.class);
        for(Game game : arrayGames) {
            System.out.println(game.name() + " в " + game.day());
        }
    }
}
