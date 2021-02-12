package com.rakovets.course.java.core.practice.jcf.list;

import java.util.ArrayList;
import java.util.List;

public class DemoStudio {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Al", "Pachino", 1000, 80));
        actors.add(new Actor("Keanu", "Reeves", 900, 56));
        actors.add(new Actor("Tom", "Hardy", 800, 43));
        actors.add(new Actor("Benedict ", "Cumberbatch", 700, 44));

        Studio belarusFilm = new Studio(actors);
        belarusFilm.fire(actors);
        belarusFilm.sortByLastName(actors);
        belarusFilm.sortByAge(actors);
        belarusFilm.sortByFee(actors);
        belarusFilm.sortByLastNameAndAge(actors);
        belarusFilm.sortByFeeAndLastName(actors);

        printActors(actors);
    }

    public static void printActors(List<Actor> actors) {
        for (Actor act: actors) {
            System.out.println(act.toString());
        }
    }
}
