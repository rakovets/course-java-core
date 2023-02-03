package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        Studio studio = new Studio();
        List<Actor> actors = new ArrayList<>(List.of(
                new Actor("Brad", "Pitt", 55, 5000),
                new Actor("Nicolas", "Cage", 56, 400),
                new Actor("Jane", "Levy", 35, 3000),
                new Actor("Scarlett", "Johansson", 35, 4300),
                new Actor("Maryl", "Streep", 65, 6000)));

        studio.fire(actors);

        for (Actor p : actors) {
            System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge() + " " + p.getFee());
        }
    }
}



