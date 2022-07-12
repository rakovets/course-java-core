package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class Studio {
    ArrayList<Actor> actors = new ArrayList<>();
    Comparator<Actor> byFee = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            Integer firstFee = a1.getFee();
            Integer secondFee = a2.getFee();
            return firstFee.compareTo(secondFee);
        }
    };

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public ArrayList<Actor> fire(ArrayList<Actor> actors) {
        actors.sort(byFee);
        ListIterator<Actor> listIterator = actors.listIterator();
        listIterator.previous();
        listIterator.remove();
        return actors;
    }

}

