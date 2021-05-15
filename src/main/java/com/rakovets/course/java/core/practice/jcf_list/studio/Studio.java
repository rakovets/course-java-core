package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.List;

public class Studio {
    private List<Actor> actors;

      public static List<Actor> fire(List<Actor> actors) {
        int index = 0;
        double maxFee = 0.0;
        for(Actor actor : actors) {
            if (actor.getFee() >= maxFee) {
                maxFee = actor.getFee();
                index = actors.indexOf(actor);
            }
        }
        actors.remove(index);
        return actors;
    }
}
