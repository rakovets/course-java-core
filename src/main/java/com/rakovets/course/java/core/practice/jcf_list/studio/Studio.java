package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;

import java.util.List;

public class Studio {
    List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;

    }

    public void fire(Studio listOfActors) {
        int index = 0;
        double maxFee = 0;
        for (int i = 0; i < listOfActors.actors.size(); i++) {
            if (listOfActors.actors.get(i).getFee() > maxFee) {
                maxFee = listOfActors.actors.get(i).getFee();
                index = i;
            }
        }
        listOfActors.actors.remove(index);
    }

    @Override
    public String toString() {
        return "Actors -"+actors;
    }
}
