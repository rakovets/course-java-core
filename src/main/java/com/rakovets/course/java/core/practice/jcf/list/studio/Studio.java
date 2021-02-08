package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> act) {
        Actor forFire = act.get(0);
        int indexForHire = 0;

        for (int x = 0; x < act.size(); x++) {
            if (forFire.compareTo(act.get(x)) < 0) {
                forFire = act.get(x);
                indexForHire = x;
            }
        }
        act.remove(indexForHire);
    }

    public void printActorList() {
        for (Actor a : this.getActors()) {
            System.out.println(a);
        }
        System.out.print("\n");
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
