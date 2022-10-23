package com.rakovets.course.java.core.practice.jcf_list;

import java.util.List;

public class Studio {
    private final List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        int maxFee = 0;
        int numberActor = 0;

        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getFee() > maxFee) {
                maxFee = actors.get(i).getFee();
                numberActor = i;
            }
        }
        actors.remove(numberActor);
        return actors;
    }

    @Override
    public String toString() {
        StringBuilder listOfActors = new StringBuilder();
        for (Actor candidates : actors) {
            listOfActors.append(candidates.toString()).append("\n");
        }
        return listOfActors.toString();
    }

    public void getActor(Actor actor) {
        this.actors.add(actor);
    }
}
