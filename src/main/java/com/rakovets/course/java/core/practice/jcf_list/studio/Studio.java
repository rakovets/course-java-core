package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> actors) {
        int indexActorMaxFee = 0;
        for (int i = 1; i < actors.size(); i++) {
            indexActorMaxFee = (actors.get(indexActorMaxFee).getFee() - actors.get(i).getFee()) < 0
                    ? i
                    : indexActorMaxFee;
        }
        actors.remove(indexActorMaxFee);
    }
}
