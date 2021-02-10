package com.rakovets.course.java.core.practice.jcf.list.Studio;

import java.util.ArrayList;
import java.util.List;

class StudioDemo {
    public static void main(String[] args) {

        List<Actor> actors = new ArrayList<>();
        Studio studio = new Studio(actors);
        actors.add(new Actor("Chris", "Evans", 150000, 40));
        actors.add(new Actor("Robert", "Downey", 200000, 55));
        actors.add(new Actor("Jennifer", "Lawrence", 500000, 31));

        System.out.println("Before firing:");
        for (Actor actor : actors)
        System.out.println(actor);

        studio.fire();

        System.out.println("After firing:");
        for (Actor actor : actors)
        System.out.println(actor);
    }
}
