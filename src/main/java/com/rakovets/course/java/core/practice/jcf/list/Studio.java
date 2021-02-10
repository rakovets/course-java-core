package com.rakovets.course.java.core.practice.jcf.list;

import java.util.List;

public class Studio {
    List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public static List<Actor> fire(List<Actor> listOfActors) {
        int index = 0;
        int maxFee = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getFee() > maxFee) {
                maxFee = listOfActors.get(i).getFee();
                index = i;
            }
        }
        listOfActors.remove(index);
        return listOfActors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
