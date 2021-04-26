package com.rakovets.course.java.core.practice.jcf_list.project_studio;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> act) {
        Actor forFire = act.get(0);
        int indexForHire = 0;

        for (int i = 0; i < act.size(); i++) {
            if (forFire.compareTo(act.get(i)) < 0) {
                forFire = act.get(i);
                indexForHire = i;
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
}
