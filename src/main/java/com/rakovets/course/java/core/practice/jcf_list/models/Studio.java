package com.rakovets.course.java.core.practice.jcf_list.models;

import java.util.List;
import java.util.ListIterator;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        ListIterator<Actor> listIterator = actors.listIterator();
        double maxFee = 0;
        while (listIterator.hasNext()) {
            if (listIterator.next().getFee() > maxFee) {
                maxFee = listIterator.previous().getFee();
            }
        }
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().getFee() == maxFee) {
                listIterator.remove();
            }
        }
        return actors;
    }

    @Override
    public String toString() {
        ListIterator<Actor> listIterator = actors.listIterator();
        String actorList = "[";
        while (listIterator.hasNext()) {
            actorList += listIterator.next().toString() + "; ";
        }
        String actorListToPrint = actorList.trim();
        actorListToPrint += "]";
        return actorListToPrint;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
