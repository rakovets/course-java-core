package com.rakovets.course.javabasics.example.generics.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Studio {
    private ArrayList<Actor> actors;

    public Studio(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void fire() {
        actors.sort(fee);
        actors.remove(0);
    }

    public static Comparator<? super Actor> fee = new Comparator<Actor>() {
        public int compare(Actor actor1, Actor actor2) {
            return (int)(actor2.getFee() - actor1.getFee());
        }
    };

}