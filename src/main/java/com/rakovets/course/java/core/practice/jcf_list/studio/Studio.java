package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private List<Actor> actorsList;

    public Studio(List<Actor> actorsList) {
        this.actorsList = actorsList;
    }

    public List<Actor> getActorsList() {
        return actorsList;
    }

    public static List<Actor> fire(List<Actor> actorsList) {
        int indexMaxFee = 0;
        double maxFee = actorsList.get(0).getFee();
        for (int i = 0; i < actorsList.size(); i++) {
            if (actorsList.get(i).getFee() > maxFee) {
                indexMaxFee = i;
            }
        }
        actorsList.remove(indexMaxFee);
        return actorsList;
    }
}
